package day4;

import java.util.Scanner;

public class SalaryAndKids {
//1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
//    a) média do salário da população;
//    b) média do número de filhos;
//    c) maior salário;
//    d) percentual de pessoas com salário até R$100,00.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;
        double totalSalario=0.0;
        double maiorSalario=0;
        
        int nfilhos;
        int totalFilhos=0;
        int nPessoas100 = 0;

        for(int i = 1; i <= 20; i++){

            System.out.printf("Entre com o salario da pessoa %d:\n",i);
            salario = entrada.nextDouble();
            totalSalario = totalSalario + salario;

            if (salario > maiorSalario) maiorSalario = salario;
            if (salario <= 100.00) nPessoas100 = nPessoas100 + 1;

            System.out.printf("Entre com o numero de filhos da pessoa %d:\n", i);
            nfilhos = entrada.nextInt();
            totalFilhos = totalFilhos + nfilhos;

        }
        
        entrada.close();

        System.out.printf("A média do salario da populacao é %.2f\n", totalSalario/20);
        System.out.printf("A média do numero de filhos é %.2f\n", (double)totalFilhos/20);
        System.out.printf("O maior salario é %.2f\n", maiorSalario);
        System.out.printf("O percentual de pessoas que ganham até 100,00 é %.2f\n", (double)nPessoas100/20*100);

    }

}
