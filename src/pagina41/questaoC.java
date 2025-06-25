package pagina41;

import java.util.Scanner;

public class questaoC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota do aluno");
		double nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota do aluno");
		double nota3 = sc.nextDouble();
		System.out.println("Digite a quarta nota do aluno");
		double nota4 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 5) {
			System.out.println("O aluno foi aprovado com a média: " + media);
		}else {
			System.out.println("O aluno foi reprovado com a média: " + media);
		}
	}

}
