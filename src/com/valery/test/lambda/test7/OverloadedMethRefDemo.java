package com.valery.test.lambda.test7;
//ссылка на перегруженный метод
public class OverloadedMethRefDemo {
    public static void main(String[] args) {

        MyClass obj = new MyClass();
        Alpha A = obj::set;
        Bravo B = obj::set;
        B.one(100);
        System.out.println("Значения поля:" + obj.number);
        A.none();
        System.out.println("Значение поля:" + obj.number);
    }
}
