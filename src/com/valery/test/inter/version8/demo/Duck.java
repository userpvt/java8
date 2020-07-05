package com.valery.test.inter.version8.demo;

public class Duck extends Bird implements SkillBird {
    public Duck(String name, String color) {
        super(name, color);
    }


    @Override
    public void eat() {
        System.out.println("Я питаюсь насекомыми и батоном");
    }
}
