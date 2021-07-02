package br.com.view.calculamais;

import br.com.model.calculamais.Matriz;

public class Matrizes {
    public static int linhasM1;
    public static int colunasM1;
    public static int linhasM2;
    public static int colunasM2;
    public static int operacao;
    
    public static Matriz m1 = new Matriz();
    
    public static void initM(){
        m1.matrizInit();
    }
}
