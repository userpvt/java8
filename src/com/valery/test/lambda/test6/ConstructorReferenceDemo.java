package com.valery.test.lambda.test6;
//ссылка на конструктор ( команда создания нового объекта с помощью конструктора
public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        //использование ссылки на коструктор
        MyInterface ref = MyClass::new;
        MyClass obj = ref.create(100);
        obj.show();
        obj.setNumber(200);
        obj.show();
    }
}
