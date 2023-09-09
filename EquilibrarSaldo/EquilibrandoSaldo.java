package EquilibrarSaldo;

import java.util.Scanner;

public class EquilibrandoSaldo {
  public static void main(String[] args) {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
  

    int saldoTotal = scanner.nextInt();


    int valorSaque = scanner.nextInt();

    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
    
    if (saldoTotal >= valorSaque) {
      int novoSaldo = saldoTotal - valorSaque;
    System.out.print(  "Saque realizado com sucesso! Novo saldo:" +"{" + novoSaldo +"}");
    } else {
      System.out.print( "Saldo insuficiente. Saque nao realizado!");
    }

    scanner.close();
  }
}