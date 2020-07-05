package com.valery.test.inter.version7.demo;

public class Bird implements SkillBird{

    private String name;
    private String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String iCanSwimming(String s) {
        System.out.println("Многие птицы умеют плавать");
        return s;
    }

    @Override
    public void fly() {
        System.out.println("Все птицы умеют летать");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
