package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("En la ecuación x2 - A = 0");
        System.out.println("Introduzca un valor para A (Número entero)");
        int a = sc.nextInt();
        double x = (double) Math.sqrt(a);

        if (a<0) {
            System.out.println("La ecuación no tiene solución");
        }
        else if (a==0) {
            System.out.println("El resultado de la ecuación es x= 0");
        } else {
            System.out.println("El resultado de la ecuación es x= "+x);
            System.out.println("Y la segunda solución es x = "+-x);
        }

    }
}
