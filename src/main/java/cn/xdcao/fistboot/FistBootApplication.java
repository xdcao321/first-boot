package cn.xdcao.fistboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


/**
 * @author xd.cao
 */
@Slf4j
@SpringBootApplication
public class FistBootApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(FistBootApplication.class, args);
        context.getEnvironment().getProperty("server.port");


    }

}
