package in.clouthink.lutra.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther dz
 */
@Configuration
@EnableRabbit
public class RabbitAutoConfiguration {

    @Value("rabbitmq.queue.druid:druid-queue-name")
    private String druidStatQueueName;

    @Bean
    public Queue dockerhubQueue() {
        return new Queue(druidStatQueueName);
    }

    @Bean
    public RabbitmqMessageProducer RabbitmqMessageProducer() {
        return new RabbitmqMessageProducer(druidStatQueueName);
    }

}
