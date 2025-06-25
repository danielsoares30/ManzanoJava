package pagina41;

import java.util.Scanner;

public class questaoI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		if(numero % 2 ==0) {
			System.out.println("Esse número digitado é PAR.");
		}else {
			System.out.println("Esse número digitado é IMPAR.");
		}
	}

}
