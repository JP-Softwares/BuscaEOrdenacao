/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jp.persistencia;

import com.jp.modelos.Dicionario;
import com.jp.modelos.Search;
import com.jp.modelos.Sort;
import java.io.File;
/**
 *
 * @author Woly
 */
public interface IDicionarioDao { 
    
    //String[] listarIdiomas();
    
    Dicionario ordenarVetores(int vetor, Sort ordenacao); // Se 1 = PT_BR, se 2 = idiomaSecundário
    
    Dicionario buscar(int vetor, Search busca, Sort ordenacao, String palavra);
}
