package Pagina25;

import java.util.Scanner;

public class questaoE {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor da prestação (R$)");
		double valor = sc.nextDouble();
		System.out.println("Digite a taxa de juros (em %)");
		double taxa = sc.nextDouble();
		System.out.println("Digite o tempo de atraso da prestação ( em meses)");
		int tempo = sc.nextInt();
		
		double preco = valor + (valor * taxa /100) * tempo;
		System.out.println("O valor total da prestação é: " + preco);
	}

}
