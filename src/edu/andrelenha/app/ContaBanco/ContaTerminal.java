package edu.andrelenha.app.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados da conta bancária
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta (Só números):");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente após o próximo inteiro

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Exibição das informações da conta bancária
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo + ".");
        
        scanner.close(); // Fechar o scanner para liberar recursos
    }
}

