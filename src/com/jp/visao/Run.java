/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.visao;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JOptionPane;

/**
 *
 * @author Woly
 */
public class Run {
    
    public static TelaPrincipal telaPrincipal = null;
    
    public static void main(String[] args){
        if(!FlatDarkLaf.setup()) JOptionPane.showMessageDialog(null, "Falha ao importar o tema.");
        telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }
}
