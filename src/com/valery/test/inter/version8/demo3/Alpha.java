package com.valery.test.inter.version8.demo3;

public class Alpha implements Base{
    @Override
    public void show(String txt) {
        System.out.println("Класс Alpha:"+ txt);
    }

    @Override
    public void hello() {
        System.out.println("Объект класса Alpha");
    }
}
