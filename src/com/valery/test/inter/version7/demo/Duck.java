package com.valery.test.inter.version7.demo;

import java.util.Objects;

public class Duck extends Bird implements SkillBird{

    private String type = "Травоядный";

    public Duck(String name, String color) {
        super(name, color);
    }

    @Override
    public void fly() {
        System.out.println("Я умею летать");
    }

    @Override
    public String iCanSwimming(String s) {
        System.out.println("Я умею плавать, но не умею нырять");
        return s;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Duck(String name, String color, String type) {
        super(name, color);
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return Objects.equals(type, duck.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "Duck{" +
                "type='" + type + '\'' +
                '}';
    }
}
