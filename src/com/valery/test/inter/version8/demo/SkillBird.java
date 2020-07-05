package com.valery.test.inter.version8.demo;

public interface SkillBird {

    default void fly(String s) {
        System.out.println("Все птицы умеют летать");
    }

    void eat();
}
