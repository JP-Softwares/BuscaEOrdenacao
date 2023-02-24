/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jp.visao;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Woly
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        //lookAndFeel();
        initComponents();
        this.setLocationRelativeTo(null);
        adicionarTela(jInternalFrameTelaInicial);
        listar();
        if('a' < 'b') JOptionPane.showMessageDialog(null, "a é menor que b");
    }
    
    public void listar(){
        
    }
    
    private void adicionarTela(JInternalFrame tela){
        tela.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
        ((BasicInternalFrameUI)tela.getUI()).setNorthPane(null);
        jDesktopPane1.removeAll();
        jDesktopPane1.add(tela);
        tela.setVisible(true);
    }
    
//    public void lookAndFeel(){
//        if(!FlatDarkLaf.setup()) JOptionPane.showMessageDialog(null, "Falha ao importar o tema.");
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameTelaInicial = new javax.swing.JInternalFrame();
        jLabel2D1 = new com.jp.modelos.JLabel2D();
        jLabel2D2 = new com.jp.modelos.JLabel2D();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel2D3 = new com.jp.modelos.JLabel2D();
        jButton1 = new javax.swing.JButton();
        jLabel2D4 = new com.jp.modelos.JLabel2D();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        jInternalFrameTelaInicial.setBorder(null);
        jInternalFrameTelaInicial.setVisible(true);

        jLabel2D1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2D1.setText("Busca e Ordenação");
        jLabel2D1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N

        jLabel2D2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2D2.setText("Escolha duas línguas para fazer a busca:");
        jLabel2D2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        jScrollPane2.setViewportView(jList1);

        jScrollPane3.setViewportView(jList2);

        jLabel2D3.setText("Primeira língua:");
        jLabel2D3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton1.setText("Avançar");

        jLabel2D4.setText("Segunda língua:");
        jLabel2D4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout jInternalFrameTelaInicialLayout = new javax.swing.GroupLayout(jInternalFrameTelaInicial.getContentPane());
        jInternalFrameTelaInicial.getContentPane().setLayout(jInternalFrameTelaInicialLayout);
        jInternalFrameTelaInicialLayout.setHorizontalGroup(
            jInternalFrameTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2D1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2D2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jInternalFrameTelaInicialLayout.createSequentialGroup()
                .addGroup(jInternalFrameTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameTelaInicialLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jInternalFrameTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2D3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2D4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrameTelaInicialLayout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jButton1)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jInternalFrameTelaInicialLayout.setVerticalGroup(
            jInternalFrameTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameTelaInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2D1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2D2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2D3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2D4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TelaPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrameTelaInicial;
    private com.jp.modelos.JLabel2D jLabel2D1;
    private com.jp.modelos.JLabel2D jLabel2D2;
    private com.jp.modelos.JLabel2D jLabel2D3;
    private com.jp.modelos.JLabel2D jLabel2D4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
