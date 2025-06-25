package pagina41;

import java.util.Scanner;

public class questaoA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		int valor2 = sc.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("A diferença do maior valor pro menor valor é "+ (valor1 - valor2));
		}else {
			System.out.println("A diferença do maior valor pro menor valor é "+ (valor2 - valor1));
		}
	}

}
