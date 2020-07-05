package com.valery.test.lambda.test1;
@FunctionalInterface
public interface MyNums {
    default void show(int n) {
        System.out.println("Аргумент: "+n);
        System.out.println("Результат: "+get(n));
    }
    int get(int n);
}
