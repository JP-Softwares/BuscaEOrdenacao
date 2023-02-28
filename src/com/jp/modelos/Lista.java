/*
 * Click nbfs://nbhost/SystemFileSystem/Eemplates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Eemplates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author aluno
 */
public class Lista<E> {
    
    private Lista<E> proximo = null;
    
    private int tamanho = 0;
    
    private E valor = null;
    
    public Lista(){
    }
    
    public Lista(E valor){
        this.valor = valor;
        tamanho++;
    }
    
    public Object[] toArray(){
        Object[] array = new Object[tamanho];
        
        Lista<E> lista = this;
        
        for(int i = 0; i < array.length; i++){
            array[i] = lista.valor;
            lista = lista.proximo;
        }
        
        return array;
    }
    
    public void add(E valor){
        if(this.valor == null) { // caiu
            this.valor = valor;
            tamanho++; // tamanho = 1
            return;
        }
        
        Lista<E> lista = this;
        while(lista.proximo != null){
            lista = lista.proximo;
        }
        lista.proximo = new Lista<E>(valor);
        this.tamanho++;
    }
    
    
    public E get(int index){
        if(tamanho == 0) return null;
        Lista<E> lista = this;
        if(index == 0) return this.valor;
        for(int i = 0; i < index; i++){
            if(this.proximo != null){
                lista = lista.proximo;
            }else lista = null;
        }
        return lista.valor;
    }
    
    public boolean remove(int index){
        if(index < 0) return false;
        
        if(this.get(index) != null){
            if(this.proximo != null){

                if(index == 0){

                    this.valor = proximo.valor;
                    this.proximo = proximo.proximo;
                    tamanho--;
                    return true;
                }


        //        switch(index){
        //            case 0:
        //                this.valor = proximo.valor;
        //                this.proximo = proximo.proximo;
        //                break;
        //        }
                // Index > 0

                 Lista<E> lista = this;
                 
                 for(int i = 0; i < index - 1; i++){
                     if(lista.proximo != null){
                         lista = lista.proximo;
                     }
                 }
                 
                 lista.proximo = lista.proximo.proximo;
                 tamanho--;
                 return true;
            }
        }
        
        return false;
    }

    public E getValor() {
        return valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    public int getTamanho() {
        return tamanho;
    }
}
