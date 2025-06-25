package Pagina25;

import java.util.Scanner;

public class questaoJ {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da cotação do real: ");
		double cotacao = sc.nextDouble();
		System.out.println("Digite quantos dólares você possui: ");
		double quantidadeDolares = sc.nextDouble();
		
		double valorReais = (cotacao * quantidadeDolares);
		System.out.println("A conversão do dólar para real é: R$ " + valorReais);
		

	}

}
