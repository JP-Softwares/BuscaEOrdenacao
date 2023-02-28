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
    
    // QuickSort não está funcionando
    
    public static String[] quickSort(String vetor[]){
        
        quickSort_Recursivo(vetor, 0, vetor.length-1);
        
        return vetor;
    }
    
    private static void quickSort_Recursivo(String a[], int p, int u) { 
        int i = p, f = u;                        // Extremos 
        int x = (int) (Math.random()*(u-p+1))+p; // Aleatório 
        String pivô = a[x];                         // para evitar quadrático 

        while (i <= f)  // Enquanto não se cruzarem 
        {                        

          while (i < u && a[i].length() < pivô.length()) i++;      // Organiza primeira metade 

          while (f > p && a[f].length() > pivô.length()) f--;      // Organiza segunda metade 

          if (i <= f) {                          // Se ainda não acabou 
            String aux = a[f];                            // troca os elementos 
            a[f--] = a[i];                       // dos dois lados 
            a[i++] = aux;                          // da lista 
          } 
        } 

        if (p < f) quickSort_Recursivo(a,p,f);                // a[p]..a[f] < pivô 
        if (i < u) quickSort_Recursivo(a,i,u);                // a[i]..a[u] > pivô 

       
     }
    
//    private static void quickSort_Recursivo(String vetor[], int inicio, int fim){
//        if(fim > inicio) {
//            //Chamada da rotina que ira dividir o vetor em 3 partes.
//            int indexPivo = dividir(vetor, inicio, fim);
//            /* Chamada recursiva para redivisao do vetor de elementos menores
//              que o pivô. */
//            quickSort_Recursivo(vetor, inicio, indexPivo - 1);
//            /* Chamada recursiva para redivisao do vetor de elementos maiores
//              que o pivô. */
//            quickSort_Recursivo(vetor, indexPivo + 1, fim);
//          }
//    }
    
//    public static int dividir(String[] vetor, int inicio, int fim) {
//        String pivo;
//        int pontEsq, pontDir = fim;
//        pontEsq = inicio + 1;
//        pivo = vetor[inicio];
//
//        while(pontEsq <= pontDir) {
//          /* Vai correr o vetor ate que ultrapasse o outro ponteiro
//            ou ate que o elemento em questão seja menor que o pivô. */
//          while(pontEsq <= pontDir && vetor[pontEsq].length() <= pivo.length()) {
//            pontEsq++;
//          }
//
//          /* Vai correr o vetor ate que ultrapasse o outro ponteiro
//            que o elemento em questão seja maior que o pivô. */
//          while(pontDir >= pontEsq && vetor[pontDir].length() > pivo.length()) {
//            pontDir--;
//          }
//
//          /* Caso os ponteiros ainda nao tenham se cruzado, significa que valores
//            menores e maiores que o pivô foram localizados em ambos os lados.
//            Trocar estes elementos de lado. */
//          if(pontEsq < pontDir) {
//            trocar(vetor, pontDir, pontEsq);
//            pontEsq++;
//            pontDir--;
//          }
//        }
//
//        trocar(vetor, inicio, pontDir);
//        return pontDir;
//    }
//    
//    public static void trocar(String[] vetor, int i, int j){
//        String aux = vetor[i];
//        vetor[i] = vetor[j];
//        vetor[j] = aux;
//    }
    
}
