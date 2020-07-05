package com.valery.test.lambda.test1;

public class UsingLambdaDemo {
    public static void main(String[] args) {

        MyNums A = (int n)->{
            int k,s = 0;
            for (k = 1; k <= n; k++) {
                s += k;
            }
            return s;
        };
        System.out.println("Используем лямбда-выражение:");
        A.show(10);
        System.out.println("Проверка: "+ A.get(10));
        MyNums B = A;
        System.out.println("Новоле лямбда-выражение:");
        A = n -> n * n;
        System.out.println("Вызов метода show() из A:");
        A.show(10);
        System.out.println("Вызов метода show() из B:");
        B.show(10);
    }
}
