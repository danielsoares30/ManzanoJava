package pagina41;

import java.util.Scanner;

public class questaoK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		if(valor < 3) {
			System.out.println("O valor digitado é: " + valor);
		}else {
			System.out.println("Por favor, efetue um valor menor que 3");
		}
	}

}
