package main.java.controledeacesso;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Relatorio relatorio = new Relatorio();

    short opcaoEscolhidaConvertida = 1;

    while (opcaoEscolhidaConvertida != 2) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");

      String opcaoEscolhida = scanner.next();
      opcaoEscolhidaConvertida = Short.parseShort(opcaoEscolhida);

      if (opcaoEscolhidaConvertida == 1) {
        System.out.println("Entre com a sua idade:");
        String idade = scanner.next();
        int idadeConvertida = Integer.parseInt(idade);
        relatorio.addArrayIdades(idadeConvertida);
      } else if (opcaoEscolhidaConvertida == 2) {
        relatorio.relatorioEncerrado();
      } else {
        System.out.println("Entre com uma opção válida!");
      }
    }

    scanner.close();
  }
}

