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
    
    public void matrizInit1(int i, int j){
        qtdLinhas1 = i;
        qtdColunas1 = j;
        this.matriz1 = new double[qtdLinhas1][qtdColunas1];
    }
     public void matrizInit2(int i, int j){
        qtdLinhas2 = i;
        qtdColunas2 = j;
        this.matriz2 = new double[qtdLinhas1][qtdColunas1];
        this.matrizSoma = new double[qtdLinhas1][qtdColunas1];
        this.matrizSubtracao = new double[qtdLinhas1][qtdColunas1];
        this.matrizMultiplicacaoE = new double[qtdLinhas1][qtdColunas1];
    }
    public void preencheMatriz(int num, int i, int j, double val){
        switch (num){
            case 1:
                if (i <= qtdLinhas1 && j <= qtdColunas1){
                    this.matriz1[i][j] = val;
                }
                break;
            case 2:
                if (i <= qtdLinhas2 && j <= qtdColunas2){
                    this.matriz2[i][j] = val;
                }
                break;
        }
    }
    public Integer somar(){ 
        if (qtdLinhas1 != qtdLinhas2 || qtdColunas1 != qtdColunas2) return null;
        else{
            for (int linhaM = 0; linhaM < this.qtdLinhas1; linhaM++){
                for (int colunaM = 0; colunaM < this.qtdColunas1; colunaM++){
                    this.matrizSoma[linhaM][colunaM] = (this.matriz1[linhaM][colunaM] + this.matriz2[linhaM][colunaM]);
                }
            }
            return 1;
        }
    }
    public Integer subtrair(){ 
        if (qtdLinhas1 != qtdLinhas2 || qtdColunas1 != qtdColunas2) return null;
        else {
            for (int linhaM = 0; linhaM < this.qtdLinhas1; linhaM++){
                for (int colunaM = 0; colunaM < this.qtdColunas1; colunaM++){
                    this.matrizSubtracao[linhaM][colunaM] = (this.matriz1[linhaM][colunaM] - this.matriz2[linhaM][colunaM]);
                }
            }
            return 1;
        }  
    }
    public void produtoEscalar1(double escalar){
        for (int linhaM = 0; linhaM < qtdLinhas1; linhaM++){
            for (int colunaM = 0; colunaM < qtdColunas1; colunaM++){
		this.matrizMultiplicacaoE[linhaM][colunaM] = matriz1[linhaM][colunaM]*escalar;
            }
        }
    }
    public void produtoEscalar2(double escalar){
        for (int linhaM = 0; linhaM < qtdLinhas1; linhaM++){
            for (int colunaM = 0; colunaM < qtdColunas1; colunaM++){
		this.matrizMultiplicacaoE[linhaM][colunaM] = matriz2[linhaM][colunaM]*escalar;
            }
        }
    }
    
    public Integer pMatrizMatriz(){
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
            return 1;
        }
        else return null;
    }
    
    public double detDois(double [][] matriz1){
        return (matriz1[0][0]*matriz1[1][1]) - (matriz1[0][1]*matriz1[1][0]);
    }
    public double detTres(double [][] matriz1){
        return (matriz1[0][0]*matriz1[1][1]*matriz1[2][2] +
		matriz1[0][1]*matriz1[1][2]*matriz1[2][0] +
		matriz1[0][2]*matriz1[1][0]*matriz1[2][1]) -
	       (matriz1[0][2]*matriz1[1][1]*matriz1[2][0] +
		matriz1[0][0]*matriz1[1][2]*matriz1[2][1] +
		matriz1[0][1]*matriz1[1][0]*matriz1[2][2]);
    }
    
    public Double calculaDet(int m){
        if (m == 1){
            if (qtdLinhas1 == qtdColunas1){
                if (qtdLinhas1 == 1){
                    return (matriz1[0][0]);
                }
                else if (qtdLinhas1 == 2){
                    return (detDois(matriz1));
                }
                else if (qtdLinhas1 == 3){
                    return (detTres(matriz1));
                }
                else return null;
            }
            else return null;
        }
        else {
            if (qtdLinhas2 == qtdColunas2){
                if (qtdLinhas2 == 2){
                    return (matriz2[0][0]);
                }
                else if (qtdLinhas2 == 2){
                    return (detDois(matriz2));
                }
                else if (qtdLinhas2 == 3){
                    return (detTres(matriz2));
                }
                else return null;
            }
            else return null;
        }
    }
}
