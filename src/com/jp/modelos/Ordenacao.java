/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.modelos;

/**
 *
 * @author Woly
 */
public class Ordenacao {
    
    public static int[] selectionSort(int[] A){
        
        for(int i = 0; i <= A.length - 2; i++){
            int min = i;
            for(int j = i + 1; j <= A.length - 1; j++){
                if(A[j] < A[min]) min = j;
            }
            
            int t = A[min];
            A[min] = A[i];
            A[i] = t;
        }
        return A;
    }
    
    public static int[] bubbleSort(int[] A){
        for(int i = A.length - 1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                if(A[j-1] > A[j]){
                    int t = A[j-1];
                    A[j-1] = A[j];
                    A[j] = t;
                }
            }
        }
        return A;
    }
    
    public static int[] insertionSort(int[] A){
        for(int i = 1; i < A.length - 1; i++){
            int v = A[i];
            int j = i;
            while (j > 0 && A[j-1] > v) {                
                A[j] = A[j-1];
                j = j-1;
            }
            A[j] = v;
        }
        
        return A;
    }
    
}
