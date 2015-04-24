package com.xinhuanet.demo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    private static DemoService demoService;
    private static ClassPathXmlApplicationContext context;


    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        context = new ClassPathXmlApplicationContext("context-consumer.xml");
        demoService = context.getBean("demoService", DemoService.class);

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        context.close();
    }

    @Test
    public void testSay() {
        System.out.println("~~~~~~~~~~~~~~~~~~" + demoService.say());
    }

    @Test
    public void testCry() {
        demoService.cry("aaaa");
    }
}
