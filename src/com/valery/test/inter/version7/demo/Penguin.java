package com.valery.test.inter.version7.demo;

public class Penguin extends Bird implements SkillBird{

    public Penguin(String name, String color) {
        super(name, color);
    }

    private int speed = 15;

    @Override
    public void fly() {
        System.out.println("Я не умею летать");
    }

    @Override
    public String iCanSwimming(String s) {
        System.out.println("Я умею плавать и нырять");
        return s;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Penguin(String name, String color, int speed) {
        super(name, color);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "speed=" + speed +
                '}';
    }
}
