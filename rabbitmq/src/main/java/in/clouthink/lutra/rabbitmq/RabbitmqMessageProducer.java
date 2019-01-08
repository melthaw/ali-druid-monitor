package in.clouthink.lutra.rabbitmq;

import com.alibaba.druid.pool.DruidDataSourceStatValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.clouthink.lutra.message.MessageProducer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.core.MessagePropertiesBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class RabbitmqMessageProducer implements MessageProducer {

    private static final Log logger = LogFactory.getLog(RabbitmqMessageProducer.class);

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    private String queueName;

    public RabbitmqMessageProducer(String queueName) {
        this.queueName = queueName;
    }

    @Override
    public void produce(DruidDataSourceStatValue statValue) {
        if (statValue.getSqlList() != null || statValue.getSqlList().isEmpty()) {
            return;
        }

        try {
            Message amqpMessage = MessageBuilder.withBody(objectMapper.writeValueAsBytes(statValue.getSqlList()))
                                                .andProperties(MessagePropertiesBuilder.newInstance()
                                                                                       .setContentType(
                                                                                               MessageProperties.CONTENT_TYPE_JSON)
                                                                                       .build())
                                                .build();

            rabbitTemplate.convertAndSend(this.queueName,
                                          amqpMessage);
        } catch (JsonProcessingException e) {
            logger.error("Serialize message failed", e);
        } catch (AmqpException e) {
            logger.error("Sending message failed", e);
        }
    }

}
