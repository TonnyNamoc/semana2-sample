package edu.tecsup.Semana02;

import java.util.Scanner;
/**
 * Hello world!
 */
public class App {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Bienvenido a la calculadora básica");
	        System.out.print("Ingresa el primer número: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Ingresa el segundo número: ");
	        double num2 = scanner.nextDouble();

	        System.out.print("Elige una operación (+, -, *, /): ");
	        String operacion = scanner.next();

	        double resultado = 0;
	        boolean operacionValida = true;

	        switch (operacion) {
	            case "+":
	                resultado = num1 + num2;
	                break;
	            case "-":
	                resultado = num1 - num2;
	                break;
	            case "*":
	                resultado = num1 * num2;
	                break;
	            case "/":
	                if (num2 != 0) {
	                    resultado = num1 / num2;
	                } else {
	                    System.out.println("No se puede dividir por cero.");
	                    operacionValida = false;
	                }
	                break;
	            default:
	                System.out.println("Operación no válida.");
	                operacionValida = false;
	                break;
	        }

	        if (operacionValida) {
	            System.out.println("Resultado: " + resultado);
	        }

	        scanner.close();
	    }
}
