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
    
    public static String[] selectionSort(String[] A){
        
        for(int i = 0; i <= A.length - 2; i++){
            //int qtdLetras = A[i].length();
            
            int min = i;
            
            for(int j = i + 1; j <= A.length - 1; j++){
                if(A[j].length() < A[min].length()) min = j;
            }
            
            String aux = A[min];
            A[min] = A[i];
            A[i] = aux;
            
        }
        
//        for(int i = 0; i <= A.length - 2; i++){
//            int min = i;
//            for(int j = i + 1; j <= A.length - 1; j++){
//                if(A[j] < A[min]) min = j;
//            }
//            
//            char t = A[min];
//            A[min] = A[i];
//            A[i] = t;
//        }
        return A;
    }
    
    public static String[] bubbleSort(String[] A){
        for(int i = A.length - 1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                if(A[j-1].length() > A[j].length()){
                    String t = A[j-1];
                    A[j-1] = A[j];
                    A[j] = t;
                }
            }
        }
        return A;
    }
    
    public static String[] insertionSort(String[] A){
        for(int i = 1; i <= A.length - 1; i++){
            String v = A[i];
            int j = i;
            while (j > 0 && A[j-1].length() > v.length()) {                
                A[j] = A[j-1];
                j = j-1;
            }
            A[j] = v;
        }
        
        return A;
    }
    
    // Mergesort e QuickSort
    
    //MergeSort não está funcionando
    public static int[] mergeSort(int arr[]) {
        int p = 0;
        int r = arr.length - 1;
        int q = (p + r)/2;
        // Create L ← A[p..q] and M ← A[q+1..r]
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1], M[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = arr[q + 1 + j];

        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        while (i < n1 && j < n2) {
            System.out.println("oi");
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }

        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }
        
        return arr;
    }
    
}
