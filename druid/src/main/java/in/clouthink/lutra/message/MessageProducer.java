package in.clouthink.lutra.message;

import com.alibaba.druid.pool.DruidDataSourceStatValue;

public interface MessageProducer {

    void produce(DruidDataSourceStatValue statValue);

}
