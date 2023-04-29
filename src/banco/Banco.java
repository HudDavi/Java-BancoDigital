package banco;

import java.util.Scanner;

import banco.conta.Conta;
import banco.conta.Tipo;


public class Banco{
    public static void main(String[] args) throws Exception{
        boolean usuario;
        boolean tipo;
        int agencia;
        int conta;
        String nome;
        int cpf;
        double saldo;
        Conta opcao = new Tipo();

        try (Scanner valor = new Scanner(System.in)) {
            System.out.println("Digite 'true' se já tiver uma conta ou 'false' para criar uma conta");
            usuario = valor.nextBoolean();

            if(usuario){
                System.out.println("Digite 'true' se for Conta Corrente ou 'false' se for Conta Poupança");
                tipo = valor.nextBoolean();

                System.out.println("Digite o Número da Agência");
                agencia = valor.nextInt();

                System.out.println("Digite o Número da Conta");
                conta = valor.nextInt();

                opcao.conta(usuario, tipo, agencia, conta, "", 0, 0, "depositar");
            }
            else{
                System.out.println("Digite 'true' se for Conta Corrente ou 'false' se for Conta Poupança");
                tipo = valor.nextBoolean();

                System.out.println("Digite o seu Nome");
                valor.nextLine();
                nome = valor.nextLine();

                System.out.println("Digite o Número do seu CPF");
                cpf = valor.nextInt();

                System.out.println("Digite o Valor de Depósito");
                saldo = valor.nextDouble();
 
                opcao.conta(usuario, tipo, 0, 0, nome, cpf, saldo, "depositar");
            }
        }
    }
}