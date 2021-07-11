package br.com.principal.calculamais;

import br.com.model.calculamais.Matriz;
import br.com.view.calculamais.Escolha;
import java.util.Scanner;

public class Calculadora {

    static boolean stayMenuMatriz;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcoes = "\n1 - Operações com Matrizes;"
                + "\n2 - Cálculo de equações.";
        while (true) {
            System.out.print("\n\tOperações:");
            System.out.println(opcoes);
            System.out.print("\nEscolha uma opção: ");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    stayMenuMatriz = true;
                    menuMatriz();
                    break;
                case 2:
                    new Escolha().setVisible(true);
                    break;
                default:
                    System.out.println("Opção Inválida!");

            }
        }

    }
    static Matriz matriz = new Matriz();
    static int op = 0;
    static int controle = 0;
    static boolean stayMenuOperacoes = false;

    public static void menuMatriz() {
        while (stayMenuMatriz) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\tMatrizes");

            if (controle == 0) {
                System.out.println("1 - Preencher Matriz 1;\n5 - Voltar para menu anterior.\n");
            } else if (controle == 1) {
                System.out.println("2 - Preencher Matriz 2;\n3 - Vizualizar matrizes;\n4 - Operações básicas;\n5 - Voltar para menu anterior.\n");
            } else {
                System.out.println("3 - Vizualizar matrizes;\n4 - Operações básicas;\n5 - Voltar para menu anterior.\n");
            }
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    if (controle == 0) {
                        System.out.println("Matriz 1");
                        System.out.print("Infome o número de Linhas: ");
                        int linhas = sc.nextInt();
                        sc.nextLine();
                        System.out.println("");
                        System.out.print("Infome o número de Colunas: ");
                        int colunas = sc.nextInt();
                        sc.nextLine();
                        double[][] matriz1 = new double[linhas][colunas];
                        preencheMatriz(linhas, colunas, matriz1);
                        matriz.matrizInit1(linhas, colunas);
                        matriz.setMatriz1(matriz1);

                        controle++;
                    } else {
                        System.out.println("Opção Inválida!");
                    }
                    break;
                case 2:
                    if (controle == 1) {
                        System.out.println("Matriz 2");
                        System.out.println("Infome o número de Linhas");
                        int linhas = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Infome o número de Colunas");
                        int colunas = sc.nextInt();
                        sc.nextLine();
                        double[][] matriz2 = new double[linhas][colunas];
                        preencheMatriz(linhas, colunas, matriz2);
                        matriz.matrizInit2(linhas, colunas);
                        matriz.setMatriz2(matriz2);

                        controle++;
                    } else {
                        System.out.println("Opção Inválida!");
                    }
                    break;
                case 3:
                    if (controle > 0) {
                        exibeMatriz();
                    } else {
                        System.out.println("Opção Inválida!");
                    }
                    break;
                case 4:
                    stayMenuOperacoes = true;
                    operacoesMatriz();
                    break;
                case 5:
                    stayMenuMatriz = false;
                    break;
                default:
                    System.out.println("Opção Inválida!");

            }
        }
    }

    public static void operacoesMatriz() {
        while (stayMenuOperacoes) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\tOperações");

            if (controle == 1) {
                System.out.println("1 - Determinante Matriz 1; \n3 - Multiplicação Matriz 1 por escalar;\n8 - Voltar para menu anterior.\n");
            } else {
                System.out.println("1 - Determinante Matriz 1; \n2 - Determinante Matriz 2; \n3 - Multiplicação Matriz 1 por escalar;\n4 - Multiplicação Matriz 2 por escalar;\n5 - Soma das matrizes;\n6 - Subtraçao das Matrizes;\n7 - Multiplicação das Matrizes;\n8 - Voltar para menu anterior.\n");
            }
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    if (matriz.calculaDet(1) == null) {
                        System.out.println("Operaçao Invalida!");
                        System.out.println("Favor, verifique se a matriz 1 é matriz quadrada e se a ordem não utrapassa 3!\n");
                        volta();
                    } else {
                        System.out.println("\nDeterminante da Matriz 1 vale: ");
                        System.out.println(matriz.calculaDet(1));
                        volta();
                    }
                    
                    break;
                case 2:
                    if (controle != 1){
                        if (matriz.calculaDet(1) == null) {
                            System.out.println("Operaçao Invalida!");
                            System.out.println("Favor, verifique se a matriz 2 é matriz quadrada e se a ordem não utrapassa 3!\n");
                            volta();
                        } else {
                            System.out.println("\nDeterminante da Matriz 2 vale: ");
                            System.out.println(matriz.calculaDet(2));
                            volta();
                        }
                    }
                    else volta();
                    break;
                case 3:
                    System.out.print("\nRetorne o valor do escalar: ");
                    double escalar = sc.nextDouble();
                    sc.nextLine();
                    matriz.produtoEscalar1(escalar);
                    System.out.println("O produto Matriz 1 escalar " + escalar + "vale:");
                    double [][] matriz1 = matriz.getMatrizMultiplicacaoE();
                    for (int linha = 0; linha < matriz.getQtdLinhas1(); linha++) {
                        for (int coluna = 0; coluna < matriz.getQtdColunas1(); coluna++) {
                            System.out.print(matriz1[linha][coluna] + "    ");
                        }
                        System.out.println("");
                    }
                    volta();
                    break;
                case 4:
                    if (controle != 1){
                        System.out.print("\nRetorne o valor do escalar: ");
                        double escalar1 = sc.nextDouble();
                        matriz.produtoEscalar2(escalar1);
                        System.out.println("O produto Matriz 2 escalar " + escalar1 + "vale:");
                        double [][] matriz2 = matriz.getMatrizMultiplicacaoE();
                        for (int linha = 0; linha < matriz.getQtdLinhas2(); linha++) {
                            for (int coluna = 0; coluna < matriz.getQtdColunas2(); coluna++) {
                                System.out.print(matriz2[linha][coluna] + "    ");
                            }
                            System.out.println("");
                        }
                        volta();
                    }
                    else volta();
                    break;
                case 5:
                    if (controle != 1){
                        
                        if (matriz.somar() == null) {
                            System.out.println("Operação Invalida!");
                            System.out.println("Favor, verifique se a matriz 1 e matriz 2 são de mesma ordem!\n");
                            volta();
                        }  
                        else{
                            System.out.println("\nA soma das matrizes vale: ");
                            double [][] soma = matriz.getMatrizSoma();
                            for (int linha = 0; linha < matriz.getQtdLinhas1(); linha++) {
                                for (int coluna = 0; coluna < matriz.getQtdColunas1(); coluna++) {
                                    System.out.print(soma[linha][coluna] + "    ");
                                }
                                System.out.println("");
                            }
                            volta();
                        }
                    }
                    else volta();
                    break;
                case 6:
                    if (controle != 1){
                        
                        if (matriz.subtrair() == null) {
                            System.out.println("Operação Invalida!");
                            System.out.println("Favor, verifique se a matriz 1 e matriz 2 são de mesma ordem!\n");
                            volta();
                        }  
                        else{
                            System.out.println("\nA subtraçao das matrizes vale: ");
                            double [][] subtracao = matriz.getMatrizSubtracao();
                            for (int linha = 0; linha < matriz.getQtdLinhas1(); linha++) {
                                for (int coluna = 0; coluna < matriz.getQtdColunas1(); coluna++) {
                                    System.out.print(subtracao[linha][coluna] + "    ");
                                }
                                System.out.println("");
                            }
                            volta();
                        }
                    }
                    else volta();
                    break;
                case 7:
                    if (controle != 1){
                        
                        if (matriz.pMatrizMatriz() == null) {
                            System.out.println("Operação Invalida!");
                            System.out.println("Favor, verifique se o numero de colunas da matriz 1 é o mesmo numero de linhas da matriz 2!\n");
                            volta();
                        }  
                        else{
                            System.out.println("\nA multiplicação das matrizes vale: ");
                            double [][] multiplicacao = matriz.getMatrizMultiplicacaoM();
                            for (int linha = 0; linha < matriz.getQtdLinhas1(); linha++) {
                                for (int coluna = 0; coluna < matriz.getQtdColunas1(); coluna++) {
                                    System.out.print(multiplicacao[linha][coluna] + "    ");
                                }
                                System.out.println("");
                            }
                            volta();
                        }
                    }
                    else volta();
                    break;
                case 8:
                    stayMenuOperacoes = false;
                    break;
                default:

            }
        }
    }

    public static void preencheMatriz(int qtdLinhas, int qtdColunas, double[][] matrizp) {
        Scanner sc = new Scanner(System.in);
        for (int linha = 0; linha < qtdLinhas; linha++) {
            for (int coluna = 0; coluna < qtdColunas; coluna++) {
                System.out.printf("\nRetorne o elemento de linha %d e coluna %d: ", linha + 1, coluna + 1);
                matrizp[linha][coluna] = sc.nextDouble();
            }
        }
        System.out.println("Elementos da Matriz 1");
        for (int linha = 0; linha < qtdLinhas; linha++) {
            for (int coluna = 0; coluna < qtdColunas; coluna++) {
                System.out.print(matrizp[linha][coluna] + "    ");
            }
            System.out.println("");
        }
    }

    public static void exibeMatriz() {
        if (controle >= 1) {
            double[][] matriz1 = matriz.getMatriz1();
            System.out.println("Elementos da Matriz 1");
            for (int linha = 0; linha < matriz.getQtdLinhas1(); linha++) {
                for (int coluna = 0; coluna < matriz.getQtdColunas1(); coluna++) {
                    System.out.print(matriz1[linha][coluna] + "    ");
                }
                System.out.println("");
            }
        }
        if (controle >= 2) {
            double[][] matriz2 = matriz.getMatriz2();
            System.out.println("Elementos da Matriz 2");
            for (int linha = 0; linha < matriz.getQtdLinhas2(); linha++) {
                for (int coluna = 0; coluna < matriz.getQtdColunas2(); coluna++) {
                    System.out.print(matriz2[linha][coluna] + "    ");
                }
                System.out.println("");
            }
        }
        volta();
    }

    static void volta() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite \"c\" para continuar: ");
        char ch;
        do {
            ch = sc.next().charAt(0);

        } while (ch != 'c');
    }
}
