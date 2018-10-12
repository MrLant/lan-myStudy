package com.lan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource({"classpath:config/dubbo-consumer.xml"})
public class myStudyConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(myStudyConsumerApplication.class,args);
    }
}
