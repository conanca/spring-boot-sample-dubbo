package com.dolplay.demo;

/**
 * Created by conanca on 15-4-22.
 */
public class DemoServiceImpl implements DemoService{
    public int say() {
        System.out.println("~~~~~~~~~~~~~~~~~~~say~~~~~~~~~~~~~~~~~~~~~~");
        return 1024;
    }

    public void cry(String word) {
        System.out.println("~~~~~~~~~~~~~~~~~~~cry~~~~~~~~~~~~~~~~~~~~~~"+word);
    }

}
