package day2;

import java.util.Scanner;

public class Polygons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qtdLados;

        System.out.println("Quantos lados possui a figura?");
        qtdLados = sc.nextInt();
        System.out.println(qtdLados < 3 ? "não é um polígono" : qtdLados > 5 ? "polígono não identificado" :  "é polígno" );

        sc.close();
    }
}