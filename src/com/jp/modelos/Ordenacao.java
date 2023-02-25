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
    public static String[] mergeSort(String vetor[]) {
        if(vetor.length == 0) return vetor; // vetor não tem nenhuma posição
        int inicio = 0; // Nos comentários abaixo estou testando quando o vetor tem 1, 2 e 3 posições.
        int fim = vetor.length - 1; // 0, 1, 2 
        int meio = (inicio + fim) / 2; // 0, 0.5 -> 0, 1
        
        String vetor1[] = new String[(meio - inicio) + 1]; // 1, 1, 2
        String vetor2[] = new String[(fim - (meio + 1)) + 1]; // 0, 1, 1
        
        if(vetor2.length == 0) return vetor; // Quer dizer que o vetor só tem 1 posição
        
        int contador = 0;
        for(int i = 0; i < vetor1.length; i++){
            vetor1[i] = vetor[contador];
            contador++;
        }
        
        for(int i = 0; i < vetor2.length; i++){
            vetor2[i] = vetor[contador];
            contador++;
        }
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                selectionSort(vetor1);
            }
        }).run();
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                selectionSort(vetor2);
            }
        }).run();
        
//        selectionSort(vetor1);
//        selectionSort(vetor2);
        //vetor2 = 
        
        int cont = 0;
        for(int i = 0; i < vetor.length; i++){
            
            if(i == vetor1.length) cont = 0;
            
            if(i < vetor1.length){
                vetor[i] = vetor1[cont];
                cont++;
            }else{
                vetor[i] = vetor2[cont];
                cont++;
            }
        }
        
        
        // transfere os elementos entre left e right para um array auxiliar.
        String[] helper = new String[vetor.length];
        for (int i = inicio; i <= fim; i++) {
            helper[i] = vetor[i];
        }


        int i = 0;
        int j = meio + 1;
        int k = 0;

        while (i <= meio && j <= fim) {

            if (helper[i].length() <= helper[j].length()) {
                vetor[k] = helper[i];
                i++;
            } else {
                vetor[k] = helper[j];
                j++;
            }
            k++;    

        }

        // se a metade inicial não foi toda consumida, faz o append.
        while (i <= meio) {
            vetor[k] = helper[i];
            i++;
            k++;
        }

        // se a metade final não foi toda consumida, faz o append.
        while (j <= fim) {
            vetor[k] = helper[j];
            j++;
            k++;
        }

        
        return vetor;
    }
    
}
