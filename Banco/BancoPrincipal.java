package Banco;

import java.util.*;

public class BancoPrincipal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Banco c1 = new Banco("cliente");
        Banco c2 = new Banco("saldo");

        System.out.println("Qual o nome do correntista?");
        String nome = entrada.nextLine();

        c1.alterarNome(nome);
        int opcao = 0;

        while (opcao != 5) {

            System.out.println("Qual opção deseja fazer ?");
            System.out.println("1- Sacar");
            System.out.println("2- Depositar");
            System.out.println("3- Consultar saldo");
            System.out.println("4- Transeferir");
            System.out.println("5- Sair");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Quanto deseja sacar? ");
                    double saque = entrada.nextDouble();
                    System.out.println("Saldo: " + c1.sacar(saque));
                    break;
                case 2:
                    System.out.println("Quanto deseja depositar? ");
                    double deposito = entrada.nextDouble();
                    System.out.println("Saldo:" + c1.depositar(deposito));
                    System.out.println("Deposito realizado com sucesso !");
                    break;
                case 3:
                    System.out.println("Saldo atual:" + c1.consultarSaldo());
                    break;
                case 4:
                    System.out.println("Quanto deseja transferir?");
                    double valTransferir = entrada.nextDouble();

                    c1.transferir(c2, valTransferir);
                    System.out.println("Saldo do recebedor:" + c2.saldo);
                    break;
                case 5:
                    System.out.println("Atendimento realizado!");
                    break;
            }

        }
    }
}







