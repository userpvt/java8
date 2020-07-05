package com.valery.test.inter.version7.demo;

public class RunnerDemoBird {
    public static void main(String[] args) {
        Bird duck = new Duck("Утка","Тёмно-зелёный","Травоядный");
        Bird penguin = new Penguin("Пингвин","Чёрно-белый",15);

        duck.fly();
        System.out.println(duck.iCanSwimming(duck.getName() + "," + duck.getColor()));
        penguin.fly();
        System.out.println(penguin.iCanSwimming(penguin.getName() + "," + penguin.getColor()));
    }
}
