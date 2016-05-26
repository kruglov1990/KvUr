package ru.levelp;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Андрей on 26.05.2016.
 */
public class KvadratnoeUravnenie {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("Введите значение переменной a:");
        double a = y.nextDouble();
        System.out.println("Введите значение переменной b:");
        double b = y.nextDouble();
        System.out.println("Введите значение переменной c:");
        double c = y.nextDouble();
        double x, x2;
        x = (-b-(Math.sqrt(b*b - 4*a*c))/2*a);
        x2 = (-b+(Math.sqrt(b*b - 4*a*c))/2*a);

        if ((b*b - 4*a*c)>0){
            System.out.println("2 корня");
            System.out.println("Первый корень: " +x);
            System.out.println("Второй корень: " +x2);
        } if ((b*b - 4*a*c)==0){
            System.out.println("1 корень: " + Math.abs(x));
        } else System.out.println("корней нет");

    }
}
