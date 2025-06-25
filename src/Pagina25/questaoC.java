package Pagina25;

import java.util.Scanner;

public class questaoC {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio da lata em (cm)");
		int raio = sc.nextInt();
		
		System.out.println("Digite a altura da lata em (cm)");
		int altura = sc.nextInt();
		
		double pi = 3.14;
		
		double volume = pi * (raio * raio) * altura;
		
		System.out.println("O volume da lata é: " + volume + " cm ³");
		
	}

}
