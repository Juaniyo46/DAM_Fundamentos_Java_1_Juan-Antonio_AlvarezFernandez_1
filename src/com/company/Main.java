package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En este ejercicio el usuario introducirá dos número y el programa dirá si son iguales o no");

        //Pedimos al usuario que introduzca el primer número
        System.out.println("Introduzca el primer número");
        //Guardamos en la variable el primer valor
        double num1 = sc.nextDouble();
        //Pedimos al usuario que introduzca el segundo número
        System.out.println("Introduzca el segundo número");
        // Guardamos en la variable num2 el valor introducido
        double num2 = sc.nextDouble();

        //Se hacen las comparaciones para indicar si es igual o no
        if (num1==num2) {
            System.out.println("Los números introducidos son iguales");
        } else
            System.out.println("Los números introducidos no son iguales");
        }

}
