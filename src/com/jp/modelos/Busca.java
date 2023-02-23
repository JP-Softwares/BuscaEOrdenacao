/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.modelos;

/**
 *
 * @author Woly
 */
public class Busca {
    
    public static boolean sequencial(int A[], int x){
        for(int i = 0; i < A.length; i++){
            if(x == A[i]) return true;
        }
        
        return false;
    }
    
    public static boolean binaria(int A[], int x, int inicio, int fim){
        if(inicio > fim) return false;
        
        int meio = (inicio + fim)/2;
        
        if(x == A[meio]) return true;
        
        if(x < A[meio]) return binaria(A, x, inicio, meio - 1);
        
        return binaria(A, x, meio + 1, fim);
    }
}
