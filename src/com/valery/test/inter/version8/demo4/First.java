package com.valery.test.inter.version8.demo4;

public interface First {

    default void hello() {
        System.out.println("Метод из First");
    }
}
