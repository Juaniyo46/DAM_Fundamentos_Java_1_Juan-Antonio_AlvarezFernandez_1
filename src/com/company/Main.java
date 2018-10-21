package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En este ejercicio el usuario introducirá un numero (positivo o negativo) y el programa dira si es positivo o negativo");
        System.out.println("Introduzca un número");

        //iniciamos la variable r que corresponde al radio
        double num = sc.nextDouble();

        if (num>=0) {
            System.out.println("El número introducido es positivo");
        } else if (num<0) {
            System.out.println("El número introducido es negativo");
        }


    }
}
