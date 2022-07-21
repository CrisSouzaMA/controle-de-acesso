package main.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Relatorio {
  int menorIdade18 = 0;
  int adulto = 0;
  int maiorIdade50 = 0;

  ArrayList<Integer> idades = new ArrayList<>();

  DecimalFormat decimalF = new DecimalFormat("#0.00");

  public void addArrayIdades(int idade) {

    if (idade < 18) {
      System.out.println("Pessoa cliente menor de idade, catraca liberada!");
      menorIdade18 += 1;
      idades.add(idade);
    } else if (idade >= 18 && idade <= 49) {
      System.out.println("Pessoa adulta, catraca liberada!");
      adulto += 1;
      idades.add(idade);
    } else {
      System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
      maiorIdade50 += 1;
      idades.add(idade);
    }
  }

  public String decimalMetodo(double idade) {
    return decimalF.format(idade);
  }

  public void relatorioEncerrado() {

    double menor18Porcent = 0;
    double adultPercent = 0;
    double maior50Percent = 0;

    if (idades.size() != 0) {
      menor18Porcent = (menorIdade18 * 100) / (double) idades.size();
      adultPercent = (adulto * 100) / (double) idades.size();
      maior50Percent = (maiorIdade50 * 100) / (double) idades.size();
    }

    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + menorIdade18);
    System.out.println("adultas: " + adulto);
    System.out.println("a partir de 50: " + maiorIdade50);

    System.out.println("----- Percentual -----");
    System.out.println("menores: " + decimalMetodo(menor18Porcent) + "%");
    System.out.println("adultas: " + decimalMetodo(adultPercent) + "%");
    System.out.println("a partir de 50: " + decimalMetodo(maior50Percent) + "%");
  }
}
