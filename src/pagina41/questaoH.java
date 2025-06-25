package pagina41;

import java.util.Scanner;

public class questaoH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 // Leitura dos números
        System.out.print("Digite o 1º número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o 2º número: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o 3º número: ");
        int num3 = sc.nextInt();

        System.out.print("Digite o 4º número: ");
        int num4 = sc.nextInt();

        System.out.print("Digite o 5º número: ");
        int num5 = sc.nextInt();

        int maior = num1;
        int menor = num1;

        
        if (num2 > maior) maior = num2;
        if (num3 > maior) maior = num3;
        if (num4 > maior) maior = num4;
        if (num5 > maior) maior = num5;
        
        if (num2 < menor) menor = num2;
        if (num3 < menor) menor = num3;
        if (num4 < menor) menor = num4;
        if (num5 < menor) menor = num5;

        
        System.out.println("\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        sc.close();
	}

}
