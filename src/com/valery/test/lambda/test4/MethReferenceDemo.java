package com.valery.test.lambda.test4;
//ссылка на нестатический метод класса
public class MethReferenceDemo {
    public static void main(String[] args) {

        MyClass obj = new MyClass(100);
        System.out.println("Создан объект с полем 100");
        MyGetter A = MyClass::getNumber;
        MySetter B = MyClass::setNumber;
        System.out.println("Переменная А:" + A.myget(obj));
        System.out.println("Переменная obj:" + obj.getNumber());
        obj.setNumber(200);
        System.out.println("Полю присвоено значение 200");
        System.out.println("Переменная А: " + A.myget(obj));
        B.myset(obj,300);
        System.out.println("Выполнена команда B.myset(obj,300)");
        System.out.println("Переменная А:" + A.myget(obj));
        System.out.println("Переменная obj:" + obj.getNumber());
        obj = new MyClass(400);
        System.out.println("Создан объект с полем 400");
        System.out.println("Переменная A:" + A.myget(obj));
        System.out.println("Переменная obj:" + obj.getNumber());
        B.myset(obj,500);
        System.out.println("Выполнена команда B.myset(obj,500)");
        System.out.println("Переменная А:" + A.myget(obj));
        System.out.println("Переменная obj:" + obj.getNumber());
    }
}
