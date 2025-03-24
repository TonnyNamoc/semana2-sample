package edu.tecsup.Semana02;

import java.util.Scanner;


public class conversor {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Conversor de Soles a Dólares");
	        System.out.print("Ingresa la cantidad en soles: ");
	        double soles = scanner.nextDouble();

	        double tipoCambio = 3.8; // 1 dólar = 3.8 soles (puedes cambiarlo si quieres)
	        double dolares = soles / tipoCambio;

	        System.out.printf("%.2f soles equivalen a %.2f dólares\n", soles, dolares);

	        scanner.close();
	    }
}
