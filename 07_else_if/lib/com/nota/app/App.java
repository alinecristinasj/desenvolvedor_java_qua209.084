// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.nota.app;

import java.util.Scanner;

public class App {
   public App() {
   }

   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println("Informe o nome do aluno:");
      String nome = sc.nextLine();
      System.out.println("Informe a nota entre 0 e 10:");
      double nota = sc.nextDouble();
      if (nota >= (double)0.0F && nota <= (double)10.0F) {
         if (nota >= (double)7.0F) {
            System.out.println(nome + " está aprovado.");
         } else if (nota >= (double)5.0F) {
            System.out.println(nome + " está de recuperação.");
         } else {
            System.out.println(nome + " está reprovado.");
         }
      } else {
         System.out.println("Nota inválida.");
      }

      sc.close();
   }
}
