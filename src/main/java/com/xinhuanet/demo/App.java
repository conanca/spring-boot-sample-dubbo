package com.xinhuanet.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("context-provider.xml");
        appContext.start();
        System.in.read();
    }
}
