package pagina41;

import java.util.Scanner;

public class questaoF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor");
		int valor3 = sc.nextInt();
		
		if (valor1 == valor2 || valor2 == valor3 || valor1 == valor3) {
			System.out.println("Você colocou um número duas vezes ou mais, os números não podem ser iguais");
		}else {
			if (valor1 > valor2 && valor2 > valor3) {
				System.out.println("Ordem Crescente, valor 3 : " + valor3 + " valor2: " + valor2 + " valor1: " + valor1);
			}else if (valor1 > valor3 && valor3 > valor2) {
				System.out.println("Ordem Crescente, valor 2 : " + valor2 + " valor3: " + valor3 + " valor1: " + valor1);
			}else if(valor2 > valor1 && valor1 > valor3) {
				System.out.println("Ordem Crescente, valor 3 : " + valor3 + " valor1: " + valor1 + " valor2: " + valor2);
			}else if(valor2 > valor3 && valor3 > valor1) {
				System.out.println("Ordem Crescente, valor 1 : " + valor1 + " valor3: " + valor3 + " valor2: " + valor2);
			}else if(valor3 > valor1 && valor1 > valor2) {
				System.out.println("Ordem Crescente, valor 2 : " + valor2 + " valor1: " + valor1 + " valor3: " + valor3);
			}else {
				System.out.println("Ordem Crescente, valor 1 : " + valor1 + " valor2: " + valor2 + " valor3: " + valor3);
			}
		}
	}

}
