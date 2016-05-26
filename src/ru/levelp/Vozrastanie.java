package ru.levelp;

import java.util.Scanner;

/**
 * Created by Андрей on 26.05.2016.
 */
public class Vozrastanie {
    public static void main(String[] args) {
        Scanner chisla = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = chisla.nextInt();
        System.out.println("Введите второе число:");
        int b = chisla.nextInt();
        System.out.println("Введите третье число:");
        int c = chisla.nextInt();

        if(a>b){
            if (b>c) {
                System.out.println(a + " " + b + " " + c);
            } else  System.out.println(a + " " + c + " " + b);
        } else if (a>c){
            System.out.println(b + " " + a + " " + c);
        } else System.out.println(b + " " + c + " " + a);

        if (c>b){
            if (b>a) System.out.println(c + " " + b + " " + a);
            else System.out.println(c + " " + a + " " + b);
        }
    }
}
