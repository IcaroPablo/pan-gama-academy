package day4;

public class ChangingIncrement {

//  2- Faça um programa que mostre uma contagem na tela de 233 a 456,
//  só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.

  public static void main(String[] args) {

      for(int i = 233; i <= 456; i += (i >= 300 && i <= 400) ? 3 : 5) { System.out.println(i); }
      
  }
  
}
