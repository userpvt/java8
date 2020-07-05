package com.valery.test.inter.version8.demo2;

public class Bird implements FatalityBird, UltimateBird {

    private String name;
    private String color;
    private int age;
    private double weight;

    public Bird() {

    }

    public void eat (double weight) {
        if (weight > 50.0) {
            System.out.println("Эта очень крупная птица");
        } else {
            System.out.println("Средняя пташка");
        }
    }

    @Override
    public void speed(int i) {
        speed(40);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Bird(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
}
