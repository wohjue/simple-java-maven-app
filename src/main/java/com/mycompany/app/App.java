package com.mycompany.app;

/**
 * Hello world! from Me
 */
public class App {

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        message = message + "me";
        System.out.println("Hello World!");
    }
}
