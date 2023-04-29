package banco;

import java.util.Scanner;

import banco.conta.Tipo;

public class Banco extends Tipo{
    public static void main(String[] args) throws Exception{
        boolean usuario;

        try (Scanner valor = new Scanner(System.in)) {
            System.out.println("Digite 'true' se já tiver uma conta ou 'false' para criar uma conta");
            usuario = valor.nextBoolean();

            if(usuario){
                boolean tipo;
                int agencia;
                int conta;
                String nome;
                int cpf;
                double saldo;
        
                System.out.println("Digite 'true' se for Conta Corrente ou 'false' se for Conta Poupança");
                tipo = valor.nextBoolean();

                System.out.println("Digite o Número da Agência");
                agencia = valor.nextInt();

                System.out.println("Digite o Número da Conta");
                conta = valor.nextInt();


            }
            else{
                boolean tipo;
                String nome;
                int cpf;
                double saldo;

                System.out.println("Digite 'true' se for Conta Corrente ou 'false' se for Conta Poupança");
                tipo = valor.nextBoolean();

                System.out.println("Digite o seu Nome");
                valor.nextLine();
                nome = valor.nextLine();

                System.out.println("Digite o Número do seu CPF");
                cpf = valor.nextInt();

                System.out.println("Digite o Valor de Depósito");
                saldo = valor.nextDouble();
            }
        }
    }
}