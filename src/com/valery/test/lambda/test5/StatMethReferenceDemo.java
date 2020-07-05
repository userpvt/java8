package com.valery.test.lambda.test5;

public class StatMethReferenceDemo {
    public static void main(String[] args) {

        MyShow A = MyClass::show;
        MySum B = MyClass::sum;
        MyPrinter P = System.out::println;

        A.myshow();
        P.myprinter("Сумма чисел:" + B.mysum(10));
    }
}
