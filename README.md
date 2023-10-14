# Sistema de Contas Bancárias

Este projeto é uma simulação de um sistema de contas bancárias que permite aos usuários realizar diversas operações bancárias, como criar, editar, excluir, verificar, sacar, depositar, converter, investir, pagar, parcelar, receber, enviar, comprar e doar dinheiro em contas correntes ou poupanças.

## Visão Geral

O sistema é implementado em Java e consiste em várias classes interconectadas. As principais classes e conceitos incluem:

1. **Banco**: A classe `Banco` contém o método `main` que é o ponto de entrada do programa. Ele interage com o usuário, coleta informações como agência, conta, nome, CPF, saldo e tipo de conta (corrente ou poupança) e executa as operações bancárias correspondentes.

2. **Conta**: A interface `Conta` define os métodos que uma conta deve implementar. As classes `Tipo`, `Corrente` e `Poupanca` implementam esses métodos para manipular contas e executar operações.

3. **Corrente e Poupança**: As classes `Corrente` e `Poupanca` implementam as operações específicas de contas correntes e poupanças, como criar, editar, excluir, verificar, sacar, depositar, etc.

4. **Serviços**: Existem várias classes de serviços para cada tipo de conta, como `ComprarCorrente`, `ConverterPoupanca`, `InvestirCorrente`, entre outras, que realizam operações específicas.

## Uso

Para executar o sistema, siga as etapas a seguir:

1. Clone ou faça o download deste repositório para sua máquina local.
2. Importe o projeto em sua IDE Java preferida.
3. Execute a classe `Banco`.

O sistema irá interagir com você para criar uma nova conta ou realizar operações em uma conta existente, dependendo de suas respostas.

## Personalização

Você pode personalizar o sistema estendendo as operações disponíveis, adicionando validações ou melhorando a estrutura do código, conforme necessário.

## Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter detalhes.

## Autor

- Hudson Silva