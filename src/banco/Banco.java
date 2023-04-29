package banco;

import java.util.Scanner;

import banco.conta.Conta;
import banco.conta.Tipo;


public abstract class Banco{
    public static void main(String[] args) throws Exception{
        boolean usuario;
        boolean tipo;
        int agencia;
        int conta;
        String nome;
        int cpf;
        double saldo;
        String operacao;
        Conta opcao = new Tipo();

        try (Scanner valor = new Scanner(System.in)) {
            System.out.println("Digite 'true' se já tiver uma conta ou 'false' para criar uma conta e tecle ENTER");
            usuario = valor.nextBoolean();

            if(usuario){
                System.out.println("Digite 'true' se for Conta Corrente ou 'false' se for Conta Poupança e tecle ENTER");
                tipo = valor.nextBoolean();

                System.out.println("Digite o Número da Agência e tecle ENTER");
                agencia = valor.nextInt();

                System.out.println("Digite o Número da Conta e tecle ENTER");
                conta = valor.nextInt();

                System.out.println("Se deseja fazer uma compra, digite 'comprar' e tecle ENTER");
                System.out.println("Se deseja fazer uma conversão, digite 'converter' e tecle ENTER");
                System.out.println("Se deseja fazer um depósito, digite 'depositar' e tecle ENTER");
                System.out.println("Se deseja fazer uma doação, digite 'doar' e tecle ENTER");
                System.out.println("Se deseja fazer um envio, digite 'enviar' e tecle ENTER");
                System.out.println("Se deseja ver o extrato, digite 'extrato' e tecle ENTER");
                System.out.println("Se deseja fazer um investimento, digite 'investir' e tecle ENTER");
                System.out.println("Se deseja fazer um pagamento, digite 'pagar' e tecle ENTER");
                System.out.println("Se deseja fazer um parcelamento, digite 'parcelar' e tecle ENTER");
                System.out.println("Se deseja fazer um recebimento, digite 'receber' e tecle ENTER");
                System.out.println("Se deseja fazer um saque, digite 'sacar' e tecle ENTER");
                System.out.println("Se deseja ver o saldo, digite 'verificar' e tecle ENTER");
                System.out.println("Se deseja editar a conta, digite 'editar' e tecle ENTER");
                System.out.println("Se deseja excluir a conta, digite 'excluir' e tecle ENTER");
                valor.nextLine();
                operacao = valor.nextLine();

                nome = "";
                cpf = 0;
                saldo = 0;
                opcao.conta(usuario, tipo, agencia, conta, nome, cpf, saldo, operacao);
            }
            else{
                System.out.println("Digite 'true' se for Conta Corrente ou 'false' se for Conta Poupança e tecle ENTER");
                tipo = valor.nextBoolean();

                System.out.println("Digite o seu Nome e tecle ENTER");
                valor.nextLine();
                nome = valor.nextLine();

                System.out.println("Digite o Número do seu CPF e tecle ENTER");
                cpf = valor.nextInt();

                System.out.println("Digite o Valor de Depósito e tecle ENTER");
                saldo = valor.nextDouble();
                
                operacao = "criar";
                opcao.conta(usuario, tipo, 0, 0, nome, cpf, saldo, operacao);
            }
        }
    }
}