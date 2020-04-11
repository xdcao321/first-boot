package cn.xdcao.firstboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;


/**
 * @author xd.cao
 */
@Slf4j
/*
  暂时没有配mybatis 禁止datasource自动装配办法：
  */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class FistBootApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(FistBootApplication.class, args);
        String port = context.getEnvironment().getProperty("server.port");
        log.info("####info - port:##### {}" , port);

    }

}
