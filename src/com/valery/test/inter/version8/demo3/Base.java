package com.valery.test.inter.version8.demo3;

public interface Base {

    default void show(String txt) {
        System.out.println("Интерфейс Base:"+ txt);
    }

    void hello();
}
