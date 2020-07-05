package com.valery.test.lambda.test6;

public class MyClass {

    private int number;

    public MyClass(int number) {
        this.number = number;
    }

    void show() {
        System.out.println("Значение поля:" + number);
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
