package com.valery.test.inter.version8.demo2;

public interface UltimateBird {

    default void speed(int i) {
        speed(65);
    }
}
