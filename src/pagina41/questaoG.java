package pagina41;

import java.util.Scanner;

public class questaoG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	        int[] numeros = new int[4];
	        for (int i = 0; i < 4; i++) {
	            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
	            numeros[i] = sc.nextInt();
	        }

	        System.out.println("\nNúmeros divisíveis por 2 e 3:");

	        boolean encontrou = false;
	        for (int numero : numeros) {
	            if (numero % 2 == 0 && numero % 3 == 0) {
	                System.out.println(numero);
	                encontrou = true;
	            }
	        }

	        if (!encontrou) {
	            System.out.println("Nenhum número divisível por 2 e 3 foi encontrado.");
	        }

	        sc.close();
	    
	}

}
