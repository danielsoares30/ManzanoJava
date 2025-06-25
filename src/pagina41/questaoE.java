package pagina41;

import java.util.Scanner;

public class questaoE {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Cálculo da Equação de Segundo Grau (ax² + bx + c = 0)");
	        System.out.print("Digite o valor de a: ");
	        double a = sc.nextDouble();
	        if (a == 0) {
	            System.out.println("O valor de 'a' deve ser diferente de zero para uma equação de segundo grau.");
	        } else {
	            System.out.print("Digite o valor de b: ");
	            double b = sc.nextDouble();

	            System.out.print("Digite o valor de c: ");
	            double c = sc.nextDouble();
	            double delta = Math.pow(b, 2) - 4 * a * c;
	            if (delta < 0) {
	                System.out.println("A equação não possui raízes reais, pois o delta é negativo (" + delta + ").");
	            } else {
	                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

	                System.out.println("\nAs raízes da equação são:");
	                System.out.printf("x1 = %.2f\n", x1);
	                System.out.printf("x2 = %.2f\n", x2);
	            }
	        }
	        sc.close();
	    }

}
