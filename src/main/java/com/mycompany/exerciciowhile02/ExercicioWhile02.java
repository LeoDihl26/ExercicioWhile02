package com.mycompany.exerciciowhile02;

import java.util.Scanner;

public class ExercicioWhile02 {

    public static void main(String[] args) {
        
      Scanner teclado = new Scanner(System.in);
      int x = teclado.nextInt();
      while (x != 2626){
          if (x != 2626) System.out.println("Senha Inválida.");
          x = teclado.nextInt();
      }   
          teclado.close();  
      System.out.println("Acesso Permitido.");
    }
}
