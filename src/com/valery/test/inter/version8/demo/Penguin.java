package com.valery.test.inter.version8.demo;

public class Penguin extends Bird implements SkillBird{
    public Penguin(String name, String color) {
        super(name, color);
    }

    @Override
    public void fly(String s) {
        System.out.println("Я не умею летать, я плаваю и ныряю");
    }

    @Override
    public void eat() {
        System.out.println("Я питаюсь рыбой и водорослями");
    }

    public String iCanRun(String s) {
        System.out.println("Я не умею бегать , я шагаю");
        return s;
    }
}
