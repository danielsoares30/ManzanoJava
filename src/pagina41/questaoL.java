package pagina41;

import java.util.Scanner;

public class questaoL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o seu sexo (M/F): ");
        String sexo = sc.nextLine();

        
        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Olá Sr. " + nome);
        } else if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Olá Sra. " + nome);
        } else {
            System.out.println("Sexo inválido.");
        }

        sc.close();
    }
}



