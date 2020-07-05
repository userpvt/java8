package com.valery.test.lambda.test3;
//ссылка на метод и конструктор
public class ObjMethReferenceDemo {
    public static void main(String[] args) {

        MyClass obj = new MyClass(100);
        System.out.println("Создан объект с полем 100");
        MyGetter A = obj::getNumber;
        MySetter B = obj::setNumber;
        System.out.println("Переменная А: " + A.myget());
        System.out.println("Переменная obj:" + obj.getNumber());
        obj.setNumber(200);
        System.out.println("Полю присвоено знанчение 200");
        System.out.println("Перемаенная А:" + A.myget());
        B.myset(300);
        System.out.println("Выполнена команда B.myset(300)");
        System.out.println("Переменная А:" + A.myget());
        System.out.println("Переменная obj:" + obj.getNumber());
        obj = new MyClass(400);
        System.out.println("Создан объект с полем 400");
        System.out.println("Переменная А:" + A.myget());
        System.out.println("Переменная obj:" + obj.getNumber());
        B.myset(500);
        System.out.println("Выполнена команда B.myset(500)");
        System.out.println("Переменная A:" + A.myget());
        System.out.println("Переменная obj:" + obj.getNumber());
    }
}
