package br.com.model.calculamais;
public class Matriz {
    private double[][] matrizSoma;
    private double[][] matrizSubtracao;
    private double[][] matrizMultiplicacaoE;
    private double[][] matrizMultiplicacaoM;
    private double[][] matriz1;
    private double[][] matriz2;
    private int qtdLinhas1, qtdColunas1, qtdLinhas2, qtdColunas2;
    
    public Matriz(){}
    public Matriz(int i, int j, int k, int l){
        this.matrizSoma = new double[i][j];
        this.matrizSubtracao = new double[i][j];
        this.matrizMultiplicacaoE = new double[i][j];
        this.matriz1 = new double[i][j];
        this.matriz2 = new double[k][l];
        qtdLinhas1 = i;
        qtdColunas1 = j;
        qtdLinhas2 = k;
        qtdColunas2 = l;
    }
    
    public Matriz(int i, int j, double[][] matriz1, int k, int l, double[][] matriz2){
        this.matrizSoma = new double[i][j];
        this.matrizSubtracao = new double[i][j];
        this.matrizMultiplicacaoE = new double[i][j];
        this.matriz1 = new double[i][j];
        this.matriz2 = new double[k][l];
        qtdLinhas1 = i;
        qtdColunas1 = j;
        qtdLinhas2 = k;
        qtdColunas2 = l;
        this.matriz1 = matriz1;
        this.matriz2 = matriz2;
    }
    
    public Matriz(int i, int j, double[][] matriz1){
        this.matrizMultiplicacaoE = new double[i][j];
        this.matriz1 = new double[i][j];
        qtdLinhas1 = i;
        qtdColunas1 = j;
        this.matriz1 = matriz1;
    }

    public double[][] getMatrizSoma() {
        return matrizSoma;
    }

    public double[][] getMatriz1() {
        return matriz1;
    }

    public void setMatriz1(double[][] matriz1) {
        this.matriz1 = matriz1;
    }

    public double[][] getMatriz2() {
        return matriz2;
    }

    public void setMatriz2(double[][] matriz2) {
        this.matriz2 = matriz2;
    }

    public void setQtdLinhas1(Integer qtdLinhas1) {
        this.qtdLinhas1 = qtdLinhas1;
    }

    public void setQtdColunas1(Integer qtdColunas1) {
        this.qtdColunas1 = qtdColunas1;
    }

    public void setQtdLinhas2(int qtdLinhas2) {
        this.qtdLinhas2 = qtdLinhas2;
    }

    public void setQtdColunas2(int qtdColunas2) {
        this.qtdColunas2 = qtdColunas2;
    }

    public int getQtdLinhas1() {
        return qtdLinhas1;
    }

    public int getQtdColunas1() {
        return qtdColunas1;
    }
    
    public int getQtdLinhas2() {
        return qtdLinhas2;
    }

    public int getQtdColunas2() {
        return qtdColunas2;
    }

    public double[][] getMatrizSubtracao() {
        return matrizSubtracao;
    }

    public double[][] getMatrizMultiplicacaoE() {
        return matrizMultiplicacaoE;
    }
    public double[][] getMatrizMultiplicacaoM() {
        return matrizMultiplicacaoM;
    }

    public void somar(){ 
        for (int linhaM = 0; linhaM < this.qtdLinhas1; linhaM++){
            for (int colunaM = 0; colunaM < this.qtdColunas1; colunaM++){
                this.matrizSoma[linhaM][colunaM] = (this.matriz1[linhaM][colunaM] + this.matriz2[linhaM][colunaM]);
            }
        }
    }
    public void subtrair(){ 
        for (int linhaM = 0; linhaM < this.qtdLinhas1; linhaM++){
            for (int colunaM = 0; colunaM < this.qtdColunas1; colunaM++){
                this.matrizSubtracao[linhaM][colunaM] = (this.matriz1[linhaM][colunaM] - this.matriz2[linhaM][colunaM]);
            }
        }
    }
    public void produtoEscalar(double escalar){
        for (int linhaM = 0; linhaM < qtdLinhas1; linhaM++){
            for (int colunaM = 0; colunaM < qtdColunas1; colunaM++){
		this.matrizMultiplicacaoE[linhaM][colunaM] = matriz1[linhaM][colunaM]*escalar;
            }
        }
    }
    
    public void pMatrizMatriz(){
        if (qtdColunas1 == qtdLinhas2){
            this.matrizMultiplicacaoM = new double[qtdLinhas1][qtdColunas2];
            for (int linhaM = 0; linhaM < qtdLinhas1; linhaM++){
                for (int colunaM = 0; colunaM < qtdColunas2; colunaM++){
                    matrizMultiplicacaoM[linhaM][colunaM] = 0;
                    int i = 0, j = 0;
                    do{
			matrizMultiplicacaoM[linhaM][colunaM] +=
			matriz1[linhaM][j]*matriz2[i][colunaM];
			i++;
			j++;
                    }while(i < qtdLinhas2 | j < qtdColunas1);
                }
            }
        }
    }
    
    public double detDois(){
        return (matriz1[0][0]*matriz1[1][1]) - (matriz1[0][1]*matriz1[1][0]);
    }
    public double detTres(){
        return (matriz1[0][0]*matriz1[1][1]*matriz1[2][2] +
		matriz1[0][1]*matriz1[1][2]*matriz1[2][0] +
		matriz1[0][2]*matriz1[1][0]*matriz1[2][1]) -
	       (matriz1[0][2]*matriz1[1][1]*matriz1[2][0] +
		matriz1[0][0]*matriz1[1][2]*matriz1[2][1] +
		matriz1[0][1]*matriz1[1][0]*matriz1[2][2]);
    }
    
}
