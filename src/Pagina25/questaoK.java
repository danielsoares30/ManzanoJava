package Pagina25;

import java.util.Scanner;

public class questaoK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da cotação do dolar: ");
		double cotacao = sc.nextDouble();
		System.out.println("Digite quantos reais você possui: ");
		double quantidadeReais = sc.nextDouble();
		
		double valorDolar = (cotacao * quantidadeReais);
		System.out.println("A conversão do dólar para real é: R$ " + valorDolar);
		

	}

}
