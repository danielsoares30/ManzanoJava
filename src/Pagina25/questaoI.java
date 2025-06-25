package Pagina25;

import java.util.Scanner;

public class questaoI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		int valor2 = sc.nextInt();
		
		int diferenca = (valor1 - valor2);
		int resultado = (diferenca * diferenca);
		
		System.out.println("O resultado do quadrado da diferença entre os dois valores é: " + resultado);
	}

}
