package com.valery.test.inter.version8.demo3;

public class UsingDefaultMethodsDemo {
    public static void main(String[] args) {

        //интерфейсная переменная
        Base ref;
        Alpha objA = new Alpha();

        objA.hello();
        objA.show("объектная переменная objA");
        //интерфейсной переменной присваивается ссылка на объект класса Alpha
        ref = objA;
        ref.show("интерфейсная переменная ref");

        Bravo objB = new Bravo();
        objB.hello();
        objB.show("объектная переменная objB");

        ref = objB;
        ref.show("интерфейсная переменная ref");

    }
}
