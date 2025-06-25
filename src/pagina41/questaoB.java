package pagina41;

import java.util.Scanner;

public class questaoB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int numero = sc.nextInt();
		
		if(numero < 0) {
			int convertNum = numero * -1;
			System.out.println("O número que você me enviou é negativo, mas ele positivo fica:  " + convertNum);
		}else {
			System.out.println("O número que você digitou já é positivo " + numero);
		}
	}

}
