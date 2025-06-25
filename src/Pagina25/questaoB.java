package Pagina25;

import java.util.Scanner;

public class questaoB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		double celsius = (fahrenheit - 32) * (5 / 9);
		
		System.out.println("A conversão dessa temperatura em fahrenheit para celsius é: " + celsius + " °C");
		
		
	}

}
