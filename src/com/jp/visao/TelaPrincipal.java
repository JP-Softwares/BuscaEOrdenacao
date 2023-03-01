/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jp.visao;

import com.formdev.flatlaf.FlatDarkLaf;
import com.jp.controle.DicionarioControle;
import com.jp.controle.IDicionarioControle;
import com.jp.modelos.Busca;
import com.jp.modelos.Dicionario;
import com.jp.modelos.Search;
import com.jp.modelos.Sort;
import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Woly
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    
    IDicionarioControle dicionarioControle = null;
    Dicionario dicionario = null;
    
    public TelaPrincipal() {
        //lookAndFeel();
        initComponents();
        this.setLocationRelativeTo(null);
        adicionarTela(jInternalFrameTelaInicial);
        listar();
        
    }
    
    public void listar(){
        jComboBox1.setModel(new DefaultComboBoxModel<>(Dicionario.listarIdiomas()));
        jComboBoxFun.setModel(new DefaultComboBoxModel<>(Dicionario.listarIdiomas()));
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
        jButtonGoFun = new javax.swing.JButton();
        jButtonGoDic = new javax.swing.JButton();
        jButtonEscolhertxt = new javax.swing.JButton();
        jInternalFrameTestDicionario = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTempoDeOrdenacao = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonMergeSort = new javax.swing.JButton();
        jButtonSelectionSort = new javax.swing.JButton();
        jButtonInsertionSort = new javax.swing.JButton();
        jButtonQuickSort = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jInternalFrameTesteFuncional = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPalavra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEncontrada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTempoBusca = new javax.swing.JTextField();
        jButtonBuscaBinaria = new javax.swing.JButton();
        jButtonBuscaSequencial = new javax.swing.JButton();
        jComboBoxFun = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        jInternalFrameTelaInicial.setBorder(null);
        jInternalFrameTelaInicial.setVisible(true);

        jButtonGoFun.setText("Teste Funcional");
        jButtonGoFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoFunActionPerformed(evt);
            }
        });

        jButtonGoDic.setText("Teste Dicionario");
        jButtonGoDic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoDicActionPerformed(evt);
            }
        });

        jButtonEscolhertxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonEscolhertxt.setText("Entrada");
        jButtonEscolhertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEscolhertxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameTelaInicialLayout = new javax.swing.GroupLayout(jInternalFrameTelaInicial.getContentPane());
        jInternalFrameTelaInicial.getContentPane().setLayout(jInternalFrameTelaInicialLayout);
        jInternalFrameTelaInicialLayout.setHorizontalGroup(
            jInternalFrameTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameTelaInicialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrameTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGoDic, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonGoFun, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jInternalFrameTelaInicialLayout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jButtonEscolhertxt)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jInternalFrameTelaInicialLayout.setVerticalGroup(
            jInternalFrameTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameTelaInicialLayout.createSequentialGroup()
                .addComponent(jButtonGoFun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGoDic)
                .addGap(111, 111, 111)
                .addComponent(jButtonEscolhertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jInternalFrameTestDicionario.setBorder(null);
        jInternalFrameTestDicionario.setVisible(true);

        jLabel1.setText("Escolha o dicionario");

        jLabel2.setText("Tempo em Milisegundos");

        jTextFieldTempoDeOrdenacao.setEditable(false);
        jTextFieldTempoDeOrdenacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTempoDeOrdenacaoActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonMergeSort.setText("MergeSort");
        jButtonMergeSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMergeSortActionPerformed(evt);
            }
        });

        jButtonSelectionSort.setText("SelectionSort");
        jButtonSelectionSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectionSortActionPerformed(evt);
            }
        });

        jButtonInsertionSort.setText("InsertionSort");
        jButtonInsertionSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertionSortActionPerformed(evt);
            }
        });

        jButtonQuickSort.setText("QuickSort");
        jButtonQuickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuickSortActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameTestDicionarioLayout = new javax.swing.GroupLayout(jInternalFrameTestDicionario.getContentPane());
        jInternalFrameTestDicionario.getContentPane().setLayout(jInternalFrameTestDicionarioLayout);
        jInternalFrameTestDicionarioLayout.setHorizontalGroup(
            jInternalFrameTestDicionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameTestDicionarioLayout.createSequentialGroup()
                .addGroup(jInternalFrameTestDicionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameTestDicionarioLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jInternalFrameTestDicionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrameTestDicionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTempoDeOrdenacao, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrameTestDicionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonInsertionSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMergeSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrameTestDicionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSelectionSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonQuickSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jInternalFrameTestDicionarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVoltar)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jInternalFrameTestDicionarioLayout.setVerticalGroup(
            jInternalFrameTestDicionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameTestDicionarioLayout.createSequentialGroup()
                .addComponent(jButtonVoltar)
                .addGap(26, 26, 26)
                .addGroup(jInternalFrameTestDicionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMergeSort)
                    .addComponent(jButtonSelectionSort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameTestDicionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertionSort)
                    .addComponent(jButtonQuickSort))
                .addGap(103, 103, 103)
                .addGroup(jInternalFrameTestDicionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldTempoDeOrdenacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        jInternalFrameTesteFuncional.setBorder(null);
        jInternalFrameTesteFuncional.setVisible(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Teste Funcional");

        jLabel4.setText("Escreva a palavra");

        jLabel5.setText("Palavra encontrada?");

        jTextFieldEncontrada.setEditable(false);

        jLabel6.setText("tempo de procura:");

        jTextFieldTempoBusca.setEditable(false);

        jButtonBuscaBinaria.setText("Busca Binária");
        jButtonBuscaBinaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBuscaBinariaMouseClicked(evt);
            }
        });
        jButtonBuscaBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaBinariaActionPerformed(evt);
            }
        });

        jButtonBuscaSequencial.setText("Busca  Sequencial");
        jButtonBuscaSequencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaSequencialActionPerformed(evt);
            }
        });

        jComboBoxFun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Dicionario");

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameTesteFuncionalLayout = new javax.swing.GroupLayout(jInternalFrameTesteFuncional.getContentPane());
        jInternalFrameTesteFuncional.getContentPane().setLayout(jInternalFrameTesteFuncionalLayout);
        jInternalFrameTesteFuncionalLayout.setHorizontalGroup(
            jInternalFrameTesteFuncionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameTesteFuncionalLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jInternalFrameTesteFuncionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameTesteFuncionalLayout.createSequentialGroup()
                        .addGroup(jInternalFrameTesteFuncionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGroup(jInternalFrameTesteFuncionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrameTesteFuncionalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jComboBoxFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(485, 485, 485))
                            .addGroup(jInternalFrameTesteFuncionalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jInternalFrameTesteFuncionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jInternalFrameTesteFuncionalLayout.createSequentialGroup()
                                        .addComponent(jButtonBuscaSequencial)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonBuscaBinaria))
                                    .addComponent(jTextFieldPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jInternalFrameTesteFuncionalLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(jInternalFrameTesteFuncionalLayout.createSequentialGroup()
                        .addGroup(jInternalFrameTesteFuncionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrameTesteFuncionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEncontrada, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTempoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jInternalFrameTesteFuncionalLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jInternalFrameTesteFuncionalLayout.setVerticalGroup(
            jInternalFrameTesteFuncionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameTesteFuncionalLayout.createSequentialGroup()
                .addGroup(jInternalFrameTesteFuncionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameTesteFuncionalLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(jInternalFrameTesteFuncionalLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(78, 78, 78)
                        .addGroup(jInternalFrameTesteFuncionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrameTesteFuncionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameTesteFuncionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBuscaSequencial)
                    .addComponent(jButtonBuscaBinaria))
                .addGap(24, 24, 24)
                .addGroup(jInternalFrameTesteFuncionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEncontrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jInternalFrameTesteFuncionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldTempoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
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
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTempoDeOrdenacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTempoDeOrdenacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTempoDeOrdenacaoActionPerformed

    private void jButtonEscolhertxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEscolhertxtMouseClicked
        JFileChooser fc = new JFileChooser();
        fc.setAcceptAllFileFilterUsed(false);
        fc.setFileFilter(new FileNameExtensionFilter("Arquivo txt", "txt"));
        fc.showOpenDialog(this);
        File arquivo = fc.getSelectedFile();
        if(arquivo != null) Dicionario.ordenarTXT(arquivo);
    }//GEN-LAST:event_jButtonEscolhertxtMouseClicked

    private void jButtonBuscaBinariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscaBinariaMouseClicked
        
    }//GEN-LAST:event_jButtonBuscaBinariaMouseClicked

    private void jButtonGoFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoFunActionPerformed
        adicionarTela(jInternalFrameTesteFuncional);
    }//GEN-LAST:event_jButtonGoFunActionPerformed

    private void jButtonGoDicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoDicActionPerformed
        adicionarTela(jInternalFrameTestDicionario);
    }//GEN-LAST:event_jButtonGoDicActionPerformed

    private void jButtonBuscaSequencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaSequencialActionPerformed
        if(jComboBoxFun.getSelectedItem().toString().equals("Portuguese (Brazilian)")){
            dicionarioControle = new DicionarioControle("Persian");
            dicionario = dicionarioControle.buscar(1, Search.SEQUENCIAL, Sort.MERGESORT, jTextFieldPalavra.getText());
            
        }else{
            dicionarioControle = new DicionarioControle(jComboBoxFun.getSelectedItem().toString());
            dicionario = dicionarioControle.buscar(2, Search.SEQUENCIAL, Sort.MERGESORT, jTextFieldPalavra.getText());
        }
        
        jTextFieldEncontrada.setText((dicionario.isAchou()) ? "Sim" : "Não");
        jTextFieldTempoBusca.setText(dicionario.getTempoDeResposta_nanosegundo()+ "");
    }//GEN-LAST:event_jButtonBuscaSequencialActionPerformed

    private void jButtonBuscaBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaBinariaActionPerformed
        if(jComboBoxFun.getSelectedItem().toString().equals("Portuguese (Brazilian)")){
            dicionarioControle = new DicionarioControle("Persian");
            dicionario = dicionarioControle.buscar(1, Search.BINARIA, Sort.QUICKSORT, jTextFieldPalavra.getText());
            
        }else{
            dicionarioControle = new DicionarioControle(jComboBoxFun.getSelectedItem().toString());
            dicionario = dicionarioControle.buscar(2, Search.BINARIA, Sort.QUICKSORT, jTextFieldPalavra.getText());
        }
        
        jTextFieldEncontrada.setText((dicionario.isAchou()) ? "Sim" : "Não");
        jTextFieldTempoBusca.setText(dicionario.getTempoDeResposta_nanosegundo()+ "");
    }//GEN-LAST:event_jButtonBuscaBinariaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        adicionarTela(jInternalFrameTelaInicial);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonMergeSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMergeSortActionPerformed
         if(jComboBoxFun.getSelectedItem().toString().equals("Portuguese (Brazilian)")){
            dicionarioControle = new DicionarioControle("Persian");
            dicionario = dicionarioControle.ordenarVetores(1, Sort.MERGESORT);
            
        }else{
            dicionarioControle = new DicionarioControle(jComboBoxFun.getSelectedItem().toString());
            dicionario = dicionarioControle.ordenarVetores(2, Sort.MERGESORT);
        }
        jTextFieldTempoDeOrdenacao.setText(dicionario.getTempoDeResposta_milisegundo()+"");
    }//GEN-LAST:event_jButtonMergeSortActionPerformed

    private void jButtonSelectionSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectionSortActionPerformed
        // TODO add your handling code here:
        if(jComboBoxFun.getSelectedItem().toString().equals("Portuguese (Brazilian)")){
            dicionarioControle = new DicionarioControle("Persian");
            dicionario = dicionarioControle.ordenarVetores(1, Sort.SELECTIONSORT);
            
        }else{
            dicionarioControle = new DicionarioControle(jComboBoxFun.getSelectedItem().toString());
            dicionario = dicionarioControle.ordenarVetores(2, Sort.SELECTIONSORT);
        }
        jTextFieldTempoDeOrdenacao.setText(dicionario.getTempoDeResposta_milisegundo()+"");
    }//GEN-LAST:event_jButtonSelectionSortActionPerformed

    private void jButtonInsertionSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertionSortActionPerformed
        // TODO add your handling code here:
        if(jComboBoxFun.getSelectedItem().toString().equals("Portuguese (Brazilian)")){
            dicionarioControle = new DicionarioControle("Persian");
            dicionario = dicionarioControle.ordenarVetores(1, Sort.INSERTIONSORT);
            
        }else{
            dicionarioControle = new DicionarioControle(jComboBoxFun.getSelectedItem().toString());
            dicionario = dicionarioControle.ordenarVetores(2, Sort.INSERTIONSORT);
        }
        jTextFieldTempoDeOrdenacao.setText(dicionario.getTempoDeResposta_milisegundo()+"");
    }//GEN-LAST:event_jButtonInsertionSortActionPerformed

    private void jButtonQuickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuickSortActionPerformed
        // TODO add your handling code here:
        if(jComboBoxFun.getSelectedItem().toString().equals("Portuguese (Brazilian)")){
            dicionarioControle = new DicionarioControle("Persian");
            dicionario = dicionarioControle.ordenarVetores(1, Sort.QUICKSORT);
            
        }else{
            dicionarioControle = new DicionarioControle(jComboBoxFun.getSelectedItem().toString());
            dicionario = dicionarioControle.ordenarVetores(2, Sort.QUICKSORT);
        }
        jTextFieldTempoDeOrdenacao.setText(dicionario.getTempoDeResposta_milisegundo()+"");
    }//GEN-LAST:event_jButtonQuickSortActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        adicionarTela(jInternalFrameTelaInicial);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
    private javax.swing.JButton jButtonBuscaBinaria;
    private javax.swing.JButton jButtonBuscaSequencial;
    private javax.swing.JButton jButtonEscolhertxt;
    private javax.swing.JButton jButtonGoDic;
    private javax.swing.JButton jButtonGoFun;
    private javax.swing.JButton jButtonInsertionSort;
    private javax.swing.JButton jButtonMergeSort;
    private javax.swing.JButton jButtonQuickSort;
    private javax.swing.JButton jButtonSelectionSort;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxFun;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrameTelaInicial;
    private javax.swing.JInternalFrame jInternalFrameTestDicionario;
    private javax.swing.JInternalFrame jInternalFrameTesteFuncional;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextFieldEncontrada;
    private javax.swing.JTextField jTextFieldPalavra;
    private javax.swing.JTextField jTextFieldTempoBusca;
    private javax.swing.JTextField jTextFieldTempoDeOrdenacao;
    // End of variables declaration//GEN-END:variables
}
