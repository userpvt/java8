package com.valery.test.inter.version8.demo;

public class Ostrich extends Bird implements SkillBird{
    public Ostrich(String name, String color) {
        super(name, color);
    }

    @Override
    public void fly(String s) {
        System.out.println("Я не умею летать, я быстро бегаю");
    }

    @Override
    public void eat() {
        System.out.println("Я питаюсь растениями и насекомыми");
    }
}
