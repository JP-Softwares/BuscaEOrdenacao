/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.persistencia;

import com.jp.modelos.Dicionario;
import com.jp.modelos.Busca;
import com.jp.modelos.Ordenacao;
import com.jp.modelos.Search;
import com.jp.modelos.Sort;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Woly
 */
public class DicionarioDao implements IDicionarioDao {

    File dicionarios[] = new File("./src/com/jp/dicionario").listFiles();
    
    private String[] palavras_arquivoPTBR = null;
    private String[] palavras_arquivoSecundario = null;
    
    
    public static void main(String[] args){
//        String[] vetor = {"opa", "fala meu", "oi", "de boa?"};
//        
//        long tempo = System.nanoTime();
//        vetor = Ordenacao.mergeSort(vetor);
//        tempo = System.nanoTime() - tempo;
//        
//        for(int i = 0; i < vetor.length; i++){
//            System.out.print(vetor[i] + " | ");
//        }
//        System.out.println();
//        
//        System.out.println(tempo);

        String vetor[] = new DicionarioDao("Arabic").ordenarVetores(1, Sort.QUICKSORT).getVetor();
        
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " | ");
        }
        System.out.println("");
    }
    
    public DicionarioDao(String idiomaSecundario){
        buscarVetores(idiomaSecundario);
    }
    
    private void buscarVetores(String idiomaSecundario) {
        File arquivoPTBR = null;
        File arquivoSecundario = null;
        String[] idiomas = Dicionario.listarIdiomas();
        
        // Achando os dicionários
        for(int i = 0; i < this.dicionarios.length && (arquivoPTBR == null || arquivoSecundario == null); i++){
            if(idiomas[i].equals("Portuguese (Brazilian)") || idiomas[i].equals(idiomaSecundario)){
                if(idiomas[i].equals("Portuguese (Brazilian)")){
                    arquivoPTBR = this.dicionarios[i];
                }else{
                    arquivoSecundario = this.dicionarios[i];
                }
            }
        }
        
        this.palavras_arquivoPTBR = palavras(arquivoPTBR);
        this.palavras_arquivoSecundario = palavras(arquivoSecundario);
        
        //Dicionario dicionario = new Dicionario();
        
        //dicionario.setVetorPT_BR(palavras_arquivoPTBR);
        //dicionario.setVetorSecundario(palavras_arquivoSecundario);
        
        // Realizar a ordenação dos vetores aqui
        //dicionario.setVetorPT_BR(Ordenacao.mergeSort(dicionario.getVetorPT_BR()));
        // Talvez dê pra usar o new Thread() para realizar as multiplas operações com vetores
        //return dicionario;
    }
    
    private String[] palavras(File arquivo){
        // Método que pega todas as palavras do dicionário
        String[] palavras = null;
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            
            palavras = new String[Integer.parseInt(br.readLine())];
            
            for(int i = 0; i < palavras.length; i++) palavras[i] = br.readLine();
            
            br.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return palavras;
    }

    @Override
    public Dicionario ordenarVetores(int vetor, Sort ordenacao) {
        String vetorPalavra[] = (vetor == 1) ? this.palavras_arquivoPTBR : this.palavras_arquivoSecundario;
        Dicionario dicionario = new Dicionario(vetorPalavra);
        long tempo = 0;
        
        switch (ordenacao) {
            case SELECTIONSORT:
                tempo = System.currentTimeMillis();
                Ordenacao.selectionSort(vetorPalavra);
                tempo = System.currentTimeMillis() - tempo;
                break;
            case INSERTIONSORT:
                tempo = System.currentTimeMillis();
                Ordenacao.selectionSort(vetorPalavra);
                tempo = System.currentTimeMillis() - tempo;
                break;
            case MERGESORT:
                tempo = System.currentTimeMillis();
                Ordenacao.mergeSort(vetorPalavra);
                tempo = System.currentTimeMillis() - tempo;
                break;
            case QUICKSORT:
                tempo = System.currentTimeMillis();
                Ordenacao.quickSort(vetorPalavra);
                tempo = System.currentTimeMillis() - tempo;
                break;
        }
        
        dicionario.setTempoDeResposta(tempo);
        
        return dicionario;
    }

    @Override
    public Dicionario buscar(int vetor, Search busca, String palavra) {
        String vetorPalavra[] = (vetor == 1) ? this.palavras_arquivoPTBR : this.palavras_arquivoSecundario;
        Dicionario dicionario = new Dicionario(vetorPalavra);
        // Realizar a busca nos vetores aqui
        
        boolean achou = false;
        switch (busca) {
            case SEQUENCIAL:
                achou = Busca.sequencial(vetorPalavra, palavra);
                break;
            case BINARIA:
                achou = Busca.binaria(vetorPalavra, palavra, 0, vetorPalavra.length-1);
                break;
        }
        
        dicionario.setAchou(achou);
        
        return dicionario;
    }
    
}
