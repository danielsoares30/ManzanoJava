package Pagina25;

import java.util.Scanner;

public class questaoA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus celsius:");
		double celsius = sc.nextDouble();
		
		double fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println("A conversão dessa temperatura em fahrenheit é: " + fahrenheit + " °F");
	}
}
