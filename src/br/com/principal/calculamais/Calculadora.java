package br.com.principal.calculamais;

import br.com.model.calculamais.Matriz;
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
                    menuMatriz();
                    break;
                case 2:
                    break;
                default:  
                    System.out.println("Opção Inválida!");

            }
        }
                
    }
    static Matriz matriz = new Matriz();
    static int op = 0;
    static int controle = 0;
    public static void menuMatriz(){       
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\tMatrizes");
            System.out.println("Escolha uma opção: ");
            if (controle == 0){
                System.out.println("1 - Preencher Matriz 1;\n");
            }
            else if (controle == 1){
                System.out.println("2 - Preencher Matriz 2;\n3 - Vizualizar matrizes;\n4 - Operações básicas.");
            }
            else {
                System.out.println("3 - Vizualizar matrizes;\n4 - Operações básicas.");
            }
            op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    if (controle == 0){
                        System.out.println("Matriz 1");
                        System.out.println("Infome o número de Linhas");
                        int linhas = sc. nextInt();
                        sc.nextLine();
                        System.out.println("Infome o número de Colunas");
                        int colunas = sc. nextInt();
                        sc.nextLine();
                        double[][] matriz1 = new double [linhas][colunas];
                        preencheMatriz(linhas, colunas, matriz1);
                        matriz.setMatriz1(matriz1);
                        matriz.matrizInit1();
                        controle ++;
                    }
                    else System.out.println("Opção Inválida!");
                    break;
                case 2:
                    if (controle == 1){
                        System.out.println("Matriz 2");
                        System.out.println("Infome o número de Linhas");
                        int linhas = sc. nextInt();
                        sc.nextLine();
                        System.out.println("Infome o número de Colunas");
                        int colunas = sc. nextInt();
                        sc.nextLine();
                        double[][] matriz2 = new double [linhas][colunas];
                        preencheMatriz(linhas, colunas, matriz2);
                        matriz.setMatriz2(matriz2);
                        matriz.matrizInit2();
                        controle ++;
                    }
                    else System.out.println("Opção Inválida!");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    
            }
        }
         //   System.out.println("1 - Somar Matrizes;\n2 - Subtrair Matrizes;\n"
           //     + "3 - Multiplicação Matricial;\n4 - Cálculo de Determinante.");
    }
    public static void preencheMatriz(int qtdLinhas, int qtdColunas, double[][] matriz){
        Scanner sc = new Scanner(System.in);
	for (int linha = 0; linha < qtdLinhas; linha++){
                for (int coluna = 0; coluna < qtdColunas; coluna++){
                        System.out.printf("\nRetorne o elemento de linha %d e coluna %d: ", linha+1, coluna+1);
			matriz[linha][coluna] = sc.nextDouble();
                }
        }
    }
    public static void exibeMatriz(){
        if (controle == 1){
            double[][] matriz1 = matriz.getMatriz1();
            for (int linha = 0; linha < matriz.getQtdLinhas1(); linha++){
                for (int coluna = 0; coluna < matriz.getQtdColunas2(); coluna++){
                    System.out.print(matriz1[linha][coluna]+"    ");
                }
                System.out.println("");
            }
        }
    }
        
}
