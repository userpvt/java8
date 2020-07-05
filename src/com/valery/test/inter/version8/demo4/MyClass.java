package com.valery.test.inter.version8.demo4;

public class MyClass implements First,Second {

    public void hello() {
        First.super.hello();
        Second.super.hello();
    }
}
