package com.learn.java.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /*
        * prior to java 8
        * */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside the runnable 1");
            }
        };

        new Thread(runnable).start();

        /*
        * Java 8 syntax
        * () -> { }
        * */

        Runnable runnableLambda = () -> {
            System.out.println("Inside the runnable Lambda");
        };

        new Thread(runnableLambda).start();

        Runnable runnableLambda1 = () -> System.out.println("Inside the runnable Lambda 2");

        new Thread(runnableLambda1).start();

        new Thread(() -> System.out.println("Inside the runnable lambda 3")).start();
    }

}
