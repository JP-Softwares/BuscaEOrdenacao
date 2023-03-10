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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import com.jp.modelos.Lista;

/**
 *
 * @author Woly
 */
public class DicionarioDao implements IDicionarioDao {

    File dicionarios[] = new File("./src/com/jp/dicionario").listFiles();
    
    private String[] palavras_arquivoPTBR = null;
    private String[] palavras_arquivoSecundario = null;
    
    
//    public static void main(String[] args){
////        String[] vetor = {"opa", "fala meu", "oi", "de boa?"};
////        
////        long tempo = System.nanoTime();
////        vetor = Ordenacao.mergeSort(vetor);
////        tempo = System.nanoTime() - tempo;
////        
////        for(int i = 0; i < vetor.length; i++){
////            System.out.print(vetor[i] + " | ");
////        }
////        System.out.println();
////        
////        System.out.println(tempo);
//
////        String vetor[] = new DicionarioDao("Arabic").ordenarVetores(1, Sort.QUICKSORT).getVetor();
////        
//        
//        
////        for(int i = 0; i < vetor.length; i++){
////            System.out.print(vetor[i] + " | ");
////        }
////        System.out.println("");
//
//        
//        
//        
//        
//    }
    
    public static void ordenarTXT(File entradaTXT){
        try {
            FileReader fr = new FileReader(entradaTXT);
            BufferedReader br = new BufferedReader(fr);
            
            String linha = "";
            Lista<String> palavras = new Lista<>();
            
            while((linha = br.readLine()) != null){
                palavras.add(linha);
            }
            
            br.close();
            
            Object[] objetoPalavras = palavras.toArray();
            String[] vetorPalavra = new String[palavras.getTamanho()];
            
            for(int i = 0; i < vetorPalavra.length; i++){
                vetorPalavra[i] = objetoPalavras[i].toString();
            }
            
            vetorPalavra = Ordenacao.quickSort(vetorPalavra);
            
            File saidaTXT = new File(entradaTXT.getAbsolutePath().replace(entradaTXT.getName(), "saida.txt"));
            FileWriter fw = new FileWriter(saidaTXT);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String saida = "";
            
            for(int i = 0; i < vetorPalavra.length; i++){
                saida += vetorPalavra[i] + " " + vetorPalavra[i].length() + "\n";
            }
            
            bw.write(saida);
            
            bw.close();
            
            //palavras = new String[Integer.parseInt(br.readLine())];
            
            //for(int i = 0; i < palavras.length; i++) palavras[i] = br.readLine();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void saidaTXT(File saidaTxt, String[] vetor){
        saidaTxt = new File(saidaTxt.getAbsolutePath() + "\\saida.txt");
        try {
            saidaTxt.delete();
            FileWriter fw = new FileWriter(saidaTxt, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0; i < vetor.length; i++){
                bw.write(vetor[i]);
                bw.newLine();
            }
            
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public DicionarioDao(String idiomaSecundario) {
        buscarVetores(idiomaSecundario);
    }
    
    private void buscarVetores(String idiomaSecundario) {
        File arquivoPTBR = null;
        File arquivoSecundario = null;
        String[] idiomas = Dicionario.listarIdiomas();
        
        // Achando os dicion??rios
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
        
        // Realizar a ordena????o dos vetores aqui
        //dicionario.setVetorPT_BR(Ordenacao.mergeSort(dicionario.getVetorPT_BR()));
        // Talvez d?? pra usar o new Thread() para realizar as multiplas opera????es com vetores
        //return dicionario;
    }
    
    private String[] palavras(File arquivo){
        // M??todo que pega todas as palavras do dicion??rio
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
        Dicionario dicionario = new Dicionario();
        long milisegundo = 0;
        long nanosegundo = 0;
        
        switch (ordenacao) {
            case SELECTIONSORT:
                milisegundo = System.currentTimeMillis();
                nanosegundo = System.nanoTime();
                //tempoAtual(Tempo.ANTES, milisegundo, nanosegundo);
                vetorPalavra = Ordenacao.selectionSort(vetorPalavra);
                milisegundo = System.currentTimeMillis() - milisegundo;
                nanosegundo = System.nanoTime() - nanosegundo;
                //tempoAtual(Tempo.DEPOIS, milisegundo, nanosegundo);
                break;
            case INSERTIONSORT:
                milisegundo = System.currentTimeMillis();
                nanosegundo = System.nanoTime();
                //tempoAtual(Tempo.ANTES, milisegundo, nanosegundo);
                vetorPalavra = Ordenacao.selectionSort(vetorPalavra);
                milisegundo = System.currentTimeMillis() - milisegundo;
                nanosegundo = System.nanoTime() - nanosegundo;
                //tempoAtual(Tempo.DEPOIS, milisegundo, nanosegundo);
                break;
            case MERGESORT:
                milisegundo = System.currentTimeMillis();
                nanosegundo = System.nanoTime();
                //tempoAtual(Tempo.ANTES, milisegundo, nanosegundo);
                vetorPalavra = Ordenacao.mergeSort(vetorPalavra, 0, vetorPalavra.length - 1);
                milisegundo = System.currentTimeMillis() - milisegundo;
                nanosegundo = System.nanoTime() - nanosegundo;
                //tempoAtual(Tempo.DEPOIS, milisegundo, nanosegundo);
                break;
            case QUICKSORT:
                milisegundo = System.currentTimeMillis();
                nanosegundo = System.nanoTime();
                //tempoAtual(Tempo.ANTES, milisegundo, nanosegundo);
                vetorPalavra = Ordenacao.quickSort(vetorPalavra);
                milisegundo = System.currentTimeMillis() - milisegundo;
                nanosegundo = System.nanoTime() - nanosegundo;
                //tempoAtual(Tempo.DEPOIS, milisegundo, nanosegundo);
                break;
        }
        
        dicionario.setTempoDeResposta_milisegundo(milisegundo);
        dicionario.setTempoDeResposta_nanosegundo(nanosegundo);
        
        dicionario.setVetor(vetorPalavra);
        
        return dicionario;
    }

    @Override
    public Dicionario buscar(int vetor, Search busca, Sort ordenacao, String palavra) {
        String vetorPalavra[] = (vetor == 1) ? this.palavras_arquivoPTBR : this.palavras_arquivoSecundario;
        Dicionario dicionario = new Dicionario();
        // Realizar a busca nos vetores aqui
        long milisegundo = 0;
        long nanosegundo = 0;

        boolean achou = false;
        
        switch (busca) {
            case SEQUENCIAL:
                milisegundo = System.currentTimeMillis();
                nanosegundo = System.nanoTime();
                //tempoAtual(Tempo.ANTES, milisegundo, nanosegundo);
                achou = Busca.sequencial(vetorPalavra, palavra);
                milisegundo = System.currentTimeMillis() - milisegundo;
                nanosegundo = System.nanoTime() - nanosegundo;
                //tempoAtual(Tempo.DEPOIS, milisegundo, nanosegundo);
                break;
            case BINARIA:
                milisegundo = System.currentTimeMillis();
                nanosegundo = System.nanoTime();
                //tempoAtual(Tempo.ANTES, milisegundo, nanosegundo);
                vetorPalavra = ordenarVetores(vetor, ordenacao).getVetor();
                achou = Busca.binaria(vetorPalavra, palavra, 0, vetorPalavra.length-1);
                milisegundo = System.currentTimeMillis() - milisegundo;
                nanosegundo = System.nanoTime() - nanosegundo;
                //tempoAtual(Tempo.DEPOIS, milisegundo, nanosegundo);
                break;
        }
        
        dicionario.setTempoDeResposta_milisegundo(milisegundo);
        
        dicionario.setTempoDeResposta_nanosegundo(nanosegundo);
        
        dicionario.setAchou(achou);
        
        dicionario.setVetor(vetorPalavra);
        
        return dicionario;
    }
    
    enum Tempo {
        ANTES, DEPOIS
    };
    
//    private void tempoAtual(Tempo tempo, long milisegundo, long nanosegundo){
//        switch (tempo) {
//            case ANTES:
//                milisegundo = System.currentTimeMillis();
//                nanosegundo = System.nanoTime();
//                break;
//            case DEPOIS:
//                milisegundo = System.currentTimeMillis() - milisegundo;
//                nanosegundo = System.nanoTime()- nanosegundo;
//                break;
//        }
//    }
    
//    private boolean vetorExiste(int vetor){
//        if(vetor != 1 || vetor != 2) return false;
//        
//        return true;
//    }
    
}
