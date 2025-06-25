package Pagina25;

import java.util.Scanner;

public class questaoD {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo gasto na viagem (em horas):");
		double tempo = sc.nextDouble();
		
		System.out.println("Digite a velocidade média durante a viagem (em km/h):");
		int velocidade = sc.nextInt();
		
		double distancia =  tempo * velocidade;
		double litros = distancia / 12;
		
		System.out.println("Velocidade média: " + velocidade + "km/h");
		System.out.println("O tempo gasto: " + tempo + ": 00");
		System.out.println("A distância percorrida : " + distancia + "km");
		System.out.println("O litro do combustível usado: " + litros);
		
		
		
	}

}
