package pagina41;

import java.util.Scanner;

public class questaoD {
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
		
		if (media >= 7) {
			System.out.println("O aluno foi aprovado com a média: " + media);
		}else if (media < 7) {
			System.out.println("O aluno precisa de recuperação");
			System.out.println("Digite a nota da recuperação do aluno: ");
			double recuperacao = sc.nextDouble();
			if (recuperacao >= 5) {
				System.out.println("O aluno passou na recuperação com a nota da recuperação: " + recuperacao);
			}else {
				System.out.println("O aluno não passou na recuperação com a nota: " + recuperacao);
			}
		}
	}
}
