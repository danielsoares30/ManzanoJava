package Pagina25;

import java.util.Scanner;

public class questaoF {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int A = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int B = sc.nextInt();
		
		int troca = A;
		A = B;
		B = troca;
		
		System.out.println("O valor antes da troca era: A = " + A + ", B = " + B);
		System.out.println("O valor depois da troca é: B = " + B + ", A = " + A);
	}

}
