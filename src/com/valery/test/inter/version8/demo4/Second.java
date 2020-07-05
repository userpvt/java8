package com.valery.test.inter.version8.demo4;

public interface Second {

    default void hello() {
        System.out.println("Метод из Second");
    }
}
