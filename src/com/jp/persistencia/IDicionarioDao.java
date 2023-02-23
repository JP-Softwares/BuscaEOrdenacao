/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jp.persistencia;

import com.jp.modelos.Dicionario;
/**
 *
 * @author Woly
 */
public interface IDicionarioDao {
    
    String[] listarIdiomas();
    
    Dicionario ordenarVetores(String idiomaSecundario);
    
    Dicionario buscar(Dicionario dicionario, String palavra);
}
