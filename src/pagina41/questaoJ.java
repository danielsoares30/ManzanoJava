package pagina41;

import java.util.Scanner;

public class questaoJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		if (valor >= 1 & valor <= 9) {
			System.out.println("O valor está na faixa permitida");
		}else {
			System.out.println("O valor está fora da faixa permitida");
		}
	}
}
