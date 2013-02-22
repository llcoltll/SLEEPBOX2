package FclinicaGUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Diéferson
 */
public class EPWORTH extends javax.swing.JFrame {
    private int[] EPWorth;  
    private int EPWfinal;
    private FclinicaGUI TelaAnterior;
    /**
     * Creates new form EPWORTH
     */
    //<editor-fold defaultstate="collapsed" desc="ATUALIZA O VALOR DA ESCALA EPWORTH">   
    private void atualizaEPW(int valor, int indice){
       EPWorth[indice] = valor;
       EPWfinal = 0;
       
       for(int i =0; i < EPWorth.length; i++){
           EPWfinal += EPWorth[i];
       }
       jTextField8.setText(String.valueOf(EPWfinal));
        
    }
    //</editor-fold>
    public EPWORTH(FclinicaGUI pTelaAnterior) {
        EPWfinal = 0;
        EPWorth = new int[7];
    //INICIALIZAÇÃO DOS VALORES DO VETOR EM 0    
        for(int i = 0; i < EPWorth.length; i++){
            EPWorth[i] = 0;
        }
        TelaAnterior = pTelaAnterior;
        TelaAnterior.setEnabled(false);
        initComponents();
        atualizaEPW(0,0);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TFvendoTV = new javax.swing.JTextField();
        TFSitLendo = new javax.swing.JTextField();
        TFSentado = new javax.swing.JTextField();
        TFDirigindo = new javax.swing.JTextField();
        TFTransito = new javax.swing.JTextField();
        TFDeitado = new javax.swing.JTextField();
        TFConversando = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Calculo Escala EPWorth");

        jLabel2.setText("Situação:");

        jLabel3.setText("Vendo TV:");

        jLabel4.setText("Sentado e Lendo:");

        jLabel5.setText("Sentado (sala de espera, igreja, estação) :");

        jLabel6.setText("Em carro, ônibus, com mais de 1 hora:");

        jLabel7.setText("Dirigindo na espera de semáforo ou trânsito:");

        jLabel8.setText("Deitado, após o almoço:");

        jLabel9.setText("Sentado, conversando:");

        TFvendoTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFvendoTVActionPerformed(evt);
            }
        });
        TFvendoTV.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TFvendoTVFocusLost(evt);
            }
        });
        TFvendoTV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFvendoTVKeyTyped(evt);
            }
        });

        TFSitLendo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TFSitLendoFocusLost(evt);
            }
        });

        TFSentado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TFSentadoFocusLost(evt);
            }
        });

        TFDirigindo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TFDirigindoFocusLost(evt);
            }
        });

        TFTransito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TFTransitoFocusLost(evt);
            }
        });

        TFDeitado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TFDeitadoFocusLost(evt);
            }
        });

        TFConversando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFConversandoActionPerformed(evt);
            }
        });
        TFConversando.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TFConversandoFocusLost(evt);
            }
        });

        jLabel10.setText("Somatório:");

        jTextField8.setText(String.valueOf(EPWorth));
        jTextField8.setEditable(false);

        jButton1.setText("OK!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TFSitLendo)
                                    .addComponent(TFSentado)
                                    .addComponent(TFDirigindo)
                                    .addComponent(TFTransito)
                                    .addComponent(TFDeitado)
                                    .addComponent(TFvendoTV)
                                    .addComponent(TFConversando, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TFConversando, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(TFvendoTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(32, 32, 32))
                                                            .addComponent(TFSitLendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(32, 32, 32))
                                                    .addComponent(TFSentado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(32, 32, 32))
                                            .addComponent(TFDirigindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32))
                                    .addComponent(TFTransito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addComponent(TFDeitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//METODOS NAO UTILIZADOS (EVENTOS) APAGAR (?)
// <editor-fold defaultstate="collapsed" desc="EVENTOS NAO UTILIZADOS">
    

    private void TFvendoTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFvendoTVActionPerformed
        //TODO
    }//GEN-LAST:event_TFvendoTVActionPerformed

    private void TFConversandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFConversandoActionPerformed
        //TODO
    }//GEN-LAST:event_TFConversandoActionPerformed

    private void TFvendoTVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFvendoTVKeyTyped
        //TODO
    }//GEN-LAST:event_TFvendoTVKeyTyped
//ATÉ AQUI.
//</editor-fold>
    
    private boolean VerificaEntrada(int entrada){
        if((entrada <=3) && (entrada >= 0 ))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
   

    private void TFvendoTVFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFvendoTVFocusLost
        try {
            int numero = Integer.parseInt(TFvendoTV.getText());
            if(!VerificaEntrada(numero)){
                JOptionPane.showMessageDialog(this, "Entrada inválida, O número deve estar entre 0 e 3!");
               }
            else{
                atualizaEPW(numero, 0);
        }
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Entrada inválida!");
        }

    }//GEN-LAST:event_TFvendoTVFocusLost

    private void TFSitLendoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFSitLendoFocusLost
        try {
            int numero = Integer.parseInt(TFSitLendo.getText());
            if(!VerificaEntrada(numero)){
                JOptionPane.showMessageDialog(this, "Entrada inválida, O número deve estar entre 0 e 3!");
               }
            else{
                atualizaEPW(numero, 1);
             }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Entrada inválida!");
        }
    }//GEN-LAST:event_TFSitLendoFocusLost

    private void TFSentadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFSentadoFocusLost
        try {
            int numero = Integer.parseInt(TFSentado.getText());
            if(!VerificaEntrada(numero)){
                JOptionPane.showMessageDialog(this, "Entrada inválida, O número deve estar entre 0 e 3!");
               }
            else{
                atualizaEPW(numero, 2);
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Entrada inválida!");
        }
    }//GEN-LAST:event_TFSentadoFocusLost

    private void TFDirigindoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFDirigindoFocusLost
        try {
            int numero = Integer.parseInt(TFDirigindo.getText());
            if(!VerificaEntrada(numero)){
                JOptionPane.showMessageDialog(this, "Entrada inválida, O número deve estar entre 0 e 3!");
               }
            else{
                atualizaEPW(numero, 3);
            }
        } 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Entrada inválida!");
        }
    }//GEN-LAST:event_TFDirigindoFocusLost

    private void TFTransitoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFTransitoFocusLost
        try {
            int numero = Integer.parseInt(TFTransito.getText());
            if(!VerificaEntrada(numero)){
                JOptionPane.showMessageDialog(this, "Entrada inválida, O número deve estar entre 0 e 3!");
               }
            else{
                atualizaEPW(numero, 4);
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Entrada inválida!");
        }
    }//GEN-LAST:event_TFTransitoFocusLost

    private void TFDeitadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFDeitadoFocusLost
        try {
            int numero = Integer.parseInt(TFDeitado.getText());
            if(!VerificaEntrada(numero)){
                JOptionPane.showMessageDialog(this, "Entrada inválida, O número deve estar entre 0 e 3!");
               }
            else{
                atualizaEPW(numero, 5);
        }
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Entrada inválida!");
        }
    }//GEN-LAST:event_TFDeitadoFocusLost

    private void TFConversandoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFConversandoFocusLost
        try {
            int numero = Integer.parseInt(TFConversando.getText());
            if(!VerificaEntrada(numero)){
                JOptionPane.showMessageDialog(this, "Entrada inválida, O número deve estar entre 0 e 3!");
               }
            else{
                atualizaEPW(numero, 6);
        }
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Entrada inválida!");
        }
    }//GEN-LAST:event_TFConversandoFocusLost


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        TelaAnterior.AtualizaEPW(EPWfinal);
        TelaAnterior.setEnabled(true);
        TelaAnterior.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EPWORTH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new EPWORTH().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFConversando;
    private javax.swing.JTextField TFDeitado;
    private javax.swing.JTextField TFDirigindo;
    private javax.swing.JTextField TFSentado;
    private javax.swing.JTextField TFSitLendo;
    private javax.swing.JTextField TFTransito;
    private javax.swing.JTextField TFvendoTV;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
