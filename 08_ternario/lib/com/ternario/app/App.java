// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.ternario.app;

import java.util.Scanner;

public class App {
   public App() {
   }

   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println("Informe seu nome:");
      String nome = sc.nextLine();
      System.out.println("Informe sua idade:");
      int idade = sc.nextInt();
      String result = idade >= 18 ? " é maior de idade." : " é menor de idade.";
      System.out.println(nome + result);
      sc.close();
   }
}
