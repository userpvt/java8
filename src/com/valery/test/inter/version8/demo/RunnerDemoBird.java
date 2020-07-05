package com.valery.test.inter.version8.demo;

public class RunnerDemoBird {
    public static void main(String[] args) {
        Bird duck = new Duck("Утка", "Тёмно-зелёный");
        Bird penguin = new Penguin("Пингвин", "Чёрно-белый");
        Bird ostrich = new Ostrich("Страус", "Тёмно-коричневый");

        duck.eat();
        penguin.eat();
        ostrich.eat();

        System.out.println(duck);
        duck.fly("работает default реализация интерфейса");
        duck.iCanRun("работает метод от супер класса Bird");

        System.out.println(penguin);
        penguin.fly("работает реализация класса Пингвин");
        penguin.iCanRun("переопределённый метод от супер класса Bird , с другой реализацией");

        System.out.println(ostrich);
        ostrich.fly("работает реализация клсса Страус");
        ostrich.iCanRun("работает метод от супер класса Bird");



    }
}
