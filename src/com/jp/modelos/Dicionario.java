/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.modelos;

import java.io.File;

/**
 *
 * @author Woly
 */
public class Dicionario {
    
    private static File dicionarios[] = new File("./src/com/jp/dicionario").listFiles();

    private String[] vetor = null;
    private long tempoDeResposta = 0;
    private boolean achou = false;
    
    public Dicionario(){
        
    }
    
    public Dicionario(String[] vetor){
        this.vetor = vetor;
    }
    
    public Dicionario(String[] vetor, long tempoDeResposta){
        this.vetor = vetor;
        this.tempoDeResposta = tempoDeResposta;
    }
    
    public Dicionario(String[] vetor, long tempoDeResposta, boolean achou){
        this.vetor = vetor;
        this.tempoDeResposta = tempoDeResposta;
        this.achou = achou;
    }
    
    public static String[] listarIdiomas() {
        String[] idiomas = new String[dicionarios.length];
        
        for(int i = 0; i < idiomas.length; i++){
            idiomas[i] = dicionarios[i].getName().replace(".dic", "");
        }
        
        return idiomas;
    }

    public String[] getVetor() {
        return vetor;
    }

    public void setVetor(String[] vetor) {
        this.vetor = vetor;
    }

    public long getTempoDeResposta() {
        return tempoDeResposta;
    }

    public void setTempoDeResposta(long tempoDeResposta) {
        this.tempoDeResposta = tempoDeResposta;
    }
    
    public boolean isAchou() {
        return achou;
    }

    public void setAchou(boolean achou) {
        this.achou = achou;
    }
    
}
