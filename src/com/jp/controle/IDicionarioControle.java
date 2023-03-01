/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jp.controle;

import com.jp.modelos.Dicionario;
import com.jp.modelos.Search;
import com.jp.modelos.Sort;
import com.jp.modelos.Time;

/**
 *
 * @author aluno
 */
public interface IDicionarioControle {
    
    Dicionario ordenarVetores(int vetor, Sort ordenacao);
    
    Dicionario buscar(int vetor, Search busca, Sort ordenacao, String palavra);

}
