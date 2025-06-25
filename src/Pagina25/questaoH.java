package Pagina25;

import java.util.Scanner;

public class questaoH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento da caixa");
		double comprimento = sc.nextDouble();
		System.out.println("Digite a altura da caixa");
		double altura = sc.nextDouble();
		System.out.println("Digite a largura da caixa");
		double largura = sc.nextDouble();
		
		double volume = (comprimento * altura * largura);
		System.out.println("O volume da caixa é: " + volume + "m³");
	}

}
