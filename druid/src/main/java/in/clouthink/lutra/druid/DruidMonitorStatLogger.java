package in.clouthink.lutra.druid;

import com.alibaba.druid.pool.DruidDataSourceStatLogger;
import com.alibaba.druid.pool.DruidDataSourceStatLoggerAdapter;
import com.alibaba.druid.pool.DruidDataSourceStatValue;
import in.clouthink.lutra.message.MessageProducer;

public class DruidMonitorStatLogger extends DruidDataSourceStatLoggerAdapter implements DruidDataSourceStatLogger {

    private MessageProducer messageProducer;

    public void log(DruidDataSourceStatValue statValue) {
        messageProducer.produce(statValue);
    }

    public MessageProducer getMessageProducer() {
        return messageProducer;
    }

    public void setMessageProducer(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

}
