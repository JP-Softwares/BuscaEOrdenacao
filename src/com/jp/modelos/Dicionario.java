/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.modelos;

/**
 *
 * @author Woly
 */
public class Dicionario {
    
    private String[] vetorPT_BR = null;
    private long[] tempoDeResposta_vetorPT_BR = null;
    private String[] vetorSecundario = null;
    private long[] tempoDeResposta_vetorSecundario = null;
    private boolean achou = false;
    
    public Dicionario(){
        
    }
    
    public Dicionario(String[] vetorPT_BR, long[] tempoDeResposta_vetorPT_BR, String[] vetorSecundario, long[] tempoDeResposta_vetorSecundario){
        this.vetorPT_BR = vetorPT_BR;
        this.tempoDeResposta_vetorPT_BR = tempoDeResposta_vetorPT_BR;
        this.vetorSecundario = vetorSecundario;
        this.tempoDeResposta_vetorSecundario = tempoDeResposta_vetorSecundario;
    }
    
    public Dicionario(String[] vetorPT_BR, long[] tempoDeResposta_vetorPT_BR, String[] vetorSecundario, long[] tempoDeResposta_vetorSecundario, boolean achou){
        this.vetorPT_BR = vetorPT_BR;
        this.tempoDeResposta_vetorPT_BR = tempoDeResposta_vetorPT_BR;
        this.vetorSecundario = vetorSecundario;
        this.tempoDeResposta_vetorSecundario = tempoDeResposta_vetorSecundario;
        this.achou = achou;
    }

    public String[] getVetorPT_BR() {
        return vetorPT_BR;
    }

    public void setVetorPT_BR(String[] vetorPT_BR) {
        this.vetorPT_BR = vetorPT_BR;
    }

    public long[] getTempoDeResposta_vetorPT_BR() {
        return tempoDeResposta_vetorPT_BR;
    }

    public void setTempoDeResposta_vetorPT_BR(long[] tempoDeResposta_vetorPT_BR) {
        this.tempoDeResposta_vetorPT_BR = tempoDeResposta_vetorPT_BR;
    }

    public String[] getVetorSecundario() {
        return vetorSecundario;
    }

    public void setVetorSecundario(String[] vetorSecundario) {
        this.vetorSecundario = vetorSecundario;
    }

    public long[] getTempoDeResposta_vetorSecundario() {
        return tempoDeResposta_vetorSecundario;
    }

    public void setTempoDeResposta_vetorSecundario(long[] tempoDeResposta_vetorSecundario) {
        this.tempoDeResposta_vetorSecundario = tempoDeResposta_vetorSecundario;
    }

    public boolean isAchou() {
        return achou;
    }

    public void setAchou(boolean achou) {
        this.achou = achou;
    }
    
    
    
}
