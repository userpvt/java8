package com.valery.test.lambda.test2;

public class LambdaAndInterfacesDemo {
    public static void main(String[] args) {

        Alpha A = () -> System.out.println("Используем лямбда-выражение");
        A.showA();
        Bravo B = () -> System.out.println("Используем лямбда-выражение");
        B.showB();
        Charlie C = A::showA;
        C.showC();
    }
}
