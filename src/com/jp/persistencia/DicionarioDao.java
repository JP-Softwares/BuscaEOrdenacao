/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.persistencia;

import com.jp.modelos.Dicionario;
import com.jp.modelos.Busca;
import com.jp.modelos.Ordenacao;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Woly
 */
public class DicionarioDao implements IDicionarioDao {

    File dicionarios[] = new File("./src/com/jp/dicionario").listFiles();
    
    public DicionarioDao(){
        
    }

    @Override
    public String[] listarIdiomas() {
        String[] idiomas = new String[this.dicionarios.length];
        
        for(int i = 0; i < idiomas.length; i++){
            idiomas[i] = dicionarios[i].getName().replace(".dic", "");
        }
        
        return idiomas;
    }
    
    @Override
    public Dicionario ordenarVetores(String idiomaSecundario) {
        File arquivoPTBR = null;
        File arquivoSecundario = null;
        String[] idiomas = listarIdiomas();
        
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
        
        String[] palavras_arquivoPTBR = palavras(arquivoPTBR);
        String[] palavras_arquivoSecundario = palavras(arquivoSecundario);
        
        Dicionario dicionario = new Dicionario();
        
        dicionario.setVetorPT_BR(palavras_arquivoPTBR);
        dicionario.setVetorSecundario(palavras_arquivoSecundario);
        
        // Realizar a ordenação dos vetores aqui
        // Talvez dê pra usar o new Thread() para realizar as multiplas operações com vetores
        return dicionario;
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
    public Dicionario buscar(Dicionario dicionario, String palavra) {
        
        // Realizar a busca nos vetores aqui
        
        return dicionario;
    }
    
}
