package br.com.view.calculamais;

import br.com.model.calculamais.Matriz;
import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SegundoG extends javax.swing.JFrame {

    public SegundoG() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        eqA = new javax.swing.JTextField();
        calculax = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        eqB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        eqC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        x1val = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        x2val = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Eq. do Segundo Grau");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Equação:");

        eqA.setBackground(new java.awt.Color(204, 204, 204));
        eqA.setColumns(2);
        eqA.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        eqA.setForeground(new java.awt.Color(0, 0, 0));
        eqA.setText("1");
        eqA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eqAActionPerformed(evt);
            }
        });

        calculax.setBackground(new java.awt.Color(0, 255, 102));
        calculax.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        calculax.setForeground(new java.awt.Color(0, 0, 0));
        calculax.setText("Calcular os valores de X");
        calculax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculaxActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("X² +");

        eqB.setBackground(new java.awt.Color(204, 204, 204));
        eqB.setColumns(2);
        eqB.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        eqB.setForeground(new java.awt.Color(0, 0, 0));
        eqB.setText("1");
        eqB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eqBActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("X +");

        eqC.setBackground(new java.awt.Color(204, 204, 204));
        eqC.setColumns(2);
        eqC.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        eqC.setForeground(new java.awt.Color(0, 0, 0));
        eqC.setText("1");
        eqC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eqCActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Exemplo: 2x² + 3x + 5 = 0");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("O valor de X' é:");

        x1val.setForeground(new java.awt.Color(0, 0, 0));
        x1val.setText("##");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("= 0");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText(" e o valor de X'' é:");

        x2val.setForeground(new java.awt.Color(0, 0, 0));
        x2val.setText("##");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(eqA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eqB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eqC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(calculax, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(x1val)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(3, 3, 3)
                        .addComponent(x2val)
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eqA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(eqB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(eqC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculax)
                    .addComponent(jLabel4)
                    .addComponent(x1val)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(x2val)))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculaxActionPerformed

        Double a = Double.parseDouble(eqA.getText());
        Double b = Double.parseDouble(eqB.getText());
        Double c = Double.parseDouble(eqC.getText());

        Double x1, x2, delta, raiz_delta;

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "O coeficinete que multiplica X² deve ser diferente de zero!");
        } else {
            delta = (b * b - 4 * (a * c));

            if (delta >= 0) {
                String passos = "Passos da Resolução: \n"
                        + "Cálculo do Delta:\n"
                        + "delta = (b² - 4*(a*c))\n"
                        + "delta = (" + b + "² - 4*(" + a + "*" + c + "))\n"
                        + "delta = "+delta;
                raiz_delta = sqrt(delta);
                x1 = (-b + raiz_delta) / (2 * a);
                x2 = (-b - raiz_delta) / (2 * a);
                if (x1 != x2) {
                    passos += "\nCálculo das Raizes:\n"
                            +"X' = (-b + Raiz_de_Delta)/2*a e X'' = (-b - Raiz_de_Delta)/2*a"
                            +"X' = (-"+(b)+ " + " +raiz_delta+")/2*"+a+" e X'' = (-"+(b)+ " - " +raiz_delta+")/2*"+a
                            +"X1 = "+ x1 + " e X'' = "+x2; 
                    x1val.setText(x1 + "");
                    x2val.setText(x2 + "");
                    JOptionPane.showMessageDialog(null, passos);
                } else {
                    passos += "\nComo delta = 0, o valor de X' = X'' !:\n"
                            +"X' = (-b + Raiz_de_Delta)/2*a e X'' = (-b - Raiz_de_Delta)/2*a"
                            +"X' = (-"+(b)+ " + " +raiz_delta+")/2*"+a+" e X'' = (-"+(b)+ " - " +raiz_delta+")/2*"+a
                            +"X1 = "+ x1 + " e X'' = "+x2; 
                    x1val.setText(x1 + "");
                    x2val.setText(x2 + "");
                    JOptionPane.showMessageDialog(null, passos);
                }

            } else {
                String deltaMsg = "O valor de Delta não pode ser negativo! \n"
                        + "Cálculo do Delta:\n"
                        + "delta = (b² - 4*(a*c))\n"
                        + "delta = (" + b + "² - 4*(" + a + "*" + c + "))\n"
                        + "delta = 0";
                JOptionPane.showMessageDialog(null, deltaMsg);
            }
        }
    }//GEN-LAST:event_calculaxActionPerformed

    private void eqAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eqAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eqAActionPerformed

    private void eqBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eqBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eqBActionPerformed

    private void eqCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eqCActionPerformed
    }//GEN-LAST:event_eqCActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SegundoG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SegundoG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SegundoG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SegundoG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SegundoG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculax;
    private javax.swing.JTextField eqA;
    private javax.swing.JTextField eqB;
    private javax.swing.JTextField eqC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel x1val;
    private javax.swing.JLabel x2val;
    // End of variables declaration//GEN-END:variables
}
