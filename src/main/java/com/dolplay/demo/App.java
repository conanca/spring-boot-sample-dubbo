package com.dolplay.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("context-provider-test.xml");
        appContext.start();
        while (true){
            Thread.sleep(5000);
            System.out.println("alive...");
        }
    }
}
