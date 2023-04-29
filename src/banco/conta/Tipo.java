package banco.conta;

import banco.conta.corrente.Corrente;
import banco.conta.corrente.CriarCorrente;
import banco.conta.corrente.ExcluirCorrente;
import banco.conta.corrente.EditarCorrente;
import banco.conta.corrente.servico.ComprarCorrente;
import banco.conta.corrente.servico.ConverterCorrente;
import banco.conta.corrente.servico.DepositarCorrente;
import banco.conta.corrente.servico.DoarCorrente;
import banco.conta.corrente.servico.EnviarCorrente;
import banco.conta.corrente.servico.ExtratoCorrente;
import banco.conta.corrente.servico.InvestirCorrente;
import banco.conta.corrente.servico.PagarCorrente;
import banco.conta.corrente.servico.ParcelarCorrente;
import banco.conta.corrente.servico.ReceberCorrente;
import banco.conta.corrente.servico.SacarCorrente;
import banco.conta.corrente.servico.ServicoCorrente;
import banco.conta.corrente.servico.VerificarCorrente;

import banco.conta.poupanca.CriarPoupanca;
import banco.conta.poupanca.ExcluirPoupanca;
import banco.conta.poupanca.EditarPoupanca;
import banco.conta.poupanca.Poupanca;
import banco.conta.poupanca.servico.ComprarPoupanca;
import banco.conta.poupanca.servico.ConverterPoupanca;
import banco.conta.poupanca.servico.DepositarPoupanca;
import banco.conta.poupanca.servico.DoarPoupanca;
import banco.conta.poupanca.servico.EnviarPoupanca;
import banco.conta.poupanca.servico.ExtratoPoupanca;
import banco.conta.poupanca.servico.InvestirPoupanca;
import banco.conta.poupanca.servico.PagarPoupanca;
import banco.conta.poupanca.servico.ParcelarPoupanca;
import banco.conta.poupanca.servico.ReceberPoupanca;
import banco.conta.poupanca.servico.SacarPoupanca;
import banco.conta.poupanca.servico.ServicoPoupanca;
import banco.conta.poupanca.servico.VerificarPoupanca;

public class Tipo implements Conta{
    @Override
    public void conta(boolean usuario, boolean tipo, int agencia, int conta, String nome, int cpf, double saldo, String operacao){
        if(usuario){
            if(tipo){
                if(operacao.equals("comprar")){
                    ServicoCorrente comprar = new ComprarCorrente();
                    comprar.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("converter")){
                    ServicoCorrente converter = new ConverterCorrente();
                    converter.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("depositar")){
                    ServicoCorrente depositar = new DepositarCorrente();
                    depositar.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("doar")){
                    ServicoCorrente doar = new DoarCorrente();
                    doar.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("enviar")){
                    ServicoCorrente enviar = new EnviarCorrente();
                    enviar.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("extrato")){
                    ServicoCorrente extrato = new ExtratoCorrente();
                    extrato.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("investir")){
                    ServicoCorrente investir = new InvestirCorrente();
                    investir.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("pagar")){
                    ServicoCorrente pagar = new PagarCorrente();
                    pagar.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("parcelar")){
                    ServicoCorrente parcelar = new ParcelarCorrente();
                    parcelar.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("receber")){
                    ServicoCorrente receber = new ReceberCorrente();
                    receber.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("sacar")){
                    ServicoCorrente sacar = new SacarCorrente();
                    sacar.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("verificar")){
                    ServicoCorrente verificar = new VerificarCorrente();
                    verificar.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("editar")){
                    Corrente editar = new EditarCorrente();
                    editar.corrente(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("excluir")){
                    Corrente excluir = new ExcluirCorrente();
                    excluir.corrente(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else{
                }
            }
            else{
                if(operacao.equals("comprar")){
                    ServicoPoupanca comprar = new ComprarPoupanca();
                    comprar.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("converter")){
                    ServicoPoupanca converter = new ConverterPoupanca();
                    converter.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("depositar")){
                    ServicoPoupanca depositar = new DepositarPoupanca();
                    depositar.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("doar")){
                    ServicoPoupanca doar = new DoarPoupanca();
                    doar.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("enviar")){
                    ServicoPoupanca enviar = new EnviarPoupanca();
                    enviar.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("extrato")){
                    ServicoPoupanca extrato = new ExtratoPoupanca();
                    extrato.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("investir")){
                    ServicoPoupanca investir = new InvestirPoupanca();
                    investir.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("pagar")){
                    ServicoPoupanca pagar = new PagarPoupanca();
                    pagar.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("parcelar")){
                    ServicoPoupanca parcelar = new ParcelarPoupanca();
                    parcelar.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("receber")){
                    ServicoPoupanca receber = new ReceberPoupanca();
                    receber.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("sacar")){
                    ServicoPoupanca sacar = new SacarPoupanca();
                    sacar.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("verificar")){
                    ServicoPoupanca verificar = new VerificarPoupanca();
                    verificar.servico(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("editar")){
                    Poupanca editar = new EditarPoupanca();
                    editar.poupanca(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else if(operacao.equals("excluir")){
                    Poupanca excluir = new ExcluirPoupanca();
                    excluir.poupanca(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else{
                }
            }
        }
        else{
            if(tipo){
                if(operacao.equals("criar")){
                    Corrente criar = new CriarCorrente();
                    criar.corrente(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else{
                }
            }
            else{
                if(operacao.equals("criar")){
                    Poupanca criar = new CriarPoupanca();
                    criar.poupanca(usuario, tipo, agencia, conta, nome, cpf, saldo);
                }
                else{
                }
            }
        }
    }
}