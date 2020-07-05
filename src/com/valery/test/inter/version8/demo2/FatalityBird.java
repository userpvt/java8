package com.valery.test.inter.version8.demo2;

public interface FatalityBird {

    default void speed(int i) {
        speed(60);
    }
}
