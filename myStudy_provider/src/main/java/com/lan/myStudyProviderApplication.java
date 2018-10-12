package com.lan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class myStudyProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(myStudyProviderApplication.class,args);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
