package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numero1;
        double numero2;
        String operacion;

        double resultado = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la operación (+, -, *, /, %): ");
        operacion = scanner.nextLine();

        System.out.println("Ingrese el primer numero:");
        numero1 = scanner.nextDouble();

        System.out.println("ingrese el segundo numero:");
        numero2 = scanner.nextDouble();

     
        
        if (operacion == "+") {
            resultado = numero1 + numero2;

            if (operacion == "-") {
                resultado = numero1 - numero2;

                if (operacion == "*") {
                    resultado = numero1 + numero2;

                    if (operacion == "/") {
                        resultado = numero1 / numero2;

                        if (operacion == "%") {
                            resultado = numero1 % numero2;

                            if (operacion == "x") {
                                
                            }

                        }
                    }
                }
            }
        }

       

    }
}