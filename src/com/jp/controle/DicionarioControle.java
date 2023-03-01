/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.controle;

import com.jp.modelos.Dicionario;
import com.jp.modelos.Search;
import com.jp.modelos.Sort;
import com.jp.persistencia.DicionarioDao;
import com.jp.persistencia.IDicionarioDao;

/**
 *
 * @author aluno
 */
public class DicionarioControle implements IDicionarioControle {
    
    IDicionarioDao dicionarioControle = null;
    
    public DicionarioControle(String idiomaSecundario){
        dicionarioControle = new DicionarioDao(idiomaSecundario);
    }

    @Override
    public Dicionario ordenarVetores(int vetor, Sort ordenacao) {
        return dicionarioControle.ordenarVetores(vetor, ordenacao);
    }

    @Override
    public Dicionario buscar(int vetor, Search busca, Sort ordenacao, String palavra) {
        return dicionarioControle.buscar(vetor, busca, ordenacao, palavra);
    }
}
