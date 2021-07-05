package br.com.principal.calculamais;

import java.util.Scanner;

public class Calculadora {
    public static void  main(String [] args){
        Scanner sc = new Scanner(System.in);
        String opcoes = "\n1 - Operações com Matrizes;"
                        +"\n2 - Cálculo de equações.";
        while (true){
            System.out.println("Informe qual o tipo de operações: ");
            System.out.println(opcoes);
            int op = sc.nextInt();
            sc.nextLine();
            switch(op){
                case 1:
                    calculoMatriz();
                    break;
                case 2:
                    break;
                default:  
                    System.out.println("Opção Inválida!");

            }
        }
                
    }
    public static void calculoMatriz(){
        System.out.println("\n\tMatrizes");
        System.out.println("1 - Somar Matrizes;\n2 - Subtrair Matrizes;\n"
                + "3 - Multiplicação Matricial;\n4 - Cálculo de Determinante.");
    }

        
}
