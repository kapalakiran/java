package org.java.streams;

interface Runnable{
    public void run();

}
public class Java8_LambdaExpression {

    public static void main(String[] args) {
        int speed=100;

        // new approach (lambda expression) to implement
        Runnable r=()->{
            System.out.println("Running at the speed of "+speed);
        };
        r.run();
    }
}
