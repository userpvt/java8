package com.valery.test.inter.version8.demo;

public class Bird implements SkillBird{

    private String name;
    private String color;

    public String iCanRun(String s) {
        System.out.println("Все птицы умеют бегать");
        return s;
    }

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
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

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Все птицы умеют есть");
    }
}
