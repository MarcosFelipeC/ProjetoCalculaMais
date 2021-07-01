package br.com.model.calculamais;

public class Teste {
    public static void main(String [] args){
        double[][] matriz1 = {{1,2},{2,3}};
        double[][] matriz2 = {{1,2},{2,3}};
        Matriz m1 = new Matriz(2,2,matriz1,2,2,matriz2);
        
        m1.somar();
        double[][] matrizSoma = m1.getMatrizSoma();
        for (int linha = 0; linha < 2; linha++){
                for (int coluna = 0; coluna < 2; coluna++){
                    System.out.print(matrizSoma[linha][coluna]+"    ");
                }
                System.out.println("");
        }
        System.out.println("");
        m1.subtrair();
        double[][] matrizSubtracao = m1.getMatrizSubtracao();
        for (int linha = 0; linha < 2; linha++){
                for (int coluna = 0; coluna < 2; coluna++){
                    System.out.print(matrizSubtracao[linha][coluna]+"    ");
                }
                System.out.println("");
        }
        System.out.println("");
        m1.produtoEscalar(3);
        double[][] matrizMultiplicacao = m1.getMatrizMultiplicacaoE();
        for (int linha = 0; linha < 2; linha++){
                for (int coluna = 0; coluna < 2; coluna++){
                    System.out.print(matrizMultiplicacao[linha][coluna]+"    ");
                }
                System.out.println("");
        }
        System.out.println("");
        m1.pMatrizMatriz();
        double[][] matrizMultiplicacaoM = m1.getMatrizMultiplicacaoM();
        for (int linha = 0; linha < 2; linha++){
                for (int coluna = 0; coluna < 2; coluna++){
                    System.out.print(matrizMultiplicacaoM[linha][coluna]+"    ");
                }
                System.out.println("");
        }
        
    }
    
}
