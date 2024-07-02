package dados;

import java.util.Scanner;

public class entradas {

    int numero = 0;
    String agencia = "";
    String nomeCliente = "";
    double saldo = 0.0;

    public void menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t╔═════════════════════════════════════╗");
        System.out.println("\t║    Bem-Vindo ao sistema Bancario :  ║");
        System.out.println("\t╚═════════════════════════════════════╝\n");

        boolean bancario = true;

        while (bancario) {

            System.out.printf("Por favor, informe seu nome: ");
            nomeCliente = sc.nextLine().trim();

            System.out.printf("\nPor favor, informe o número da Agência: ");
            agencia = sc.nextLine().trim();

            System.out.printf("\nPor favor, informe o número da Conta: ");
            numero = sc.nextInt();

            System.out.printf("\nPor favor, informe o seu saldo: ");
            saldo = sc.nextDouble();

            System.out.println("\nOlá ".concat(nomeCliente)
                    .concat(", ")
                    .concat("obrigado por criar uma conta em nosso banco, sua agência é ")
                    .concat(agencia)
                    .concat(", conta ")
                    .concat(String.valueOf(numero))
                    .concat(" e seu saldo ")
                    .concat(String.valueOf(saldo))
                    .concat(" já está disponivel para saque\n"));

            bancario = false;
        }

        sc.close();
    }

}
