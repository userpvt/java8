package com.valery.test.lambda.test5;

public class MyClass {

    static void show() {
        System.out.println("Метод класса MyClass");
    }

    static int sum(int n) {
        int k,s = 0;
        for (k = 1; k <= n; k++) {
            s += k;
        }
        return s;
    }
}
