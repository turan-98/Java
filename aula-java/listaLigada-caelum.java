/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package node;

/**
 *
 * @author samuel.silva
 */
public class Node {
    // referência para o elemento
    private Node proxima; 
    private Object elemento;
    
    // setters
    public Node(Object elemento, Node proxima){
        this.proxima = proxima;
        this.elemento = elemento;
    }
    public Node(Object elemento){
        this.elemento = elemento;
    }
    public void setProxima(Node proxima){
        this.proxima = proxima;
    }
    
    // getters
    public Node getProxima(){
        return proxima;
    }
    public Object GetElemento(){
        return elemento;
    }
    /*
    
        A classe possui apenas uma referência da primeira célula
    
    */
    public class ListaLigada{
        private Node primeira;
        private Node ultimo;
        
        // adicionando elemento e posição
        public void adiciona(Object elemento){}
        // adiciona posição para o elemento
        public void adiciona(int posicao, Object elemento){}
        // pega a posição do elemento
        public Object pega(int posicao){return null;}
        // classe sem retorno que remove posição
        public void remove(int posicao){}
        // retorno o tamanho da lista
        public int tamanho(){return 0;}
        
        public boolean contem(Object o){return false;}
    
        public void adicionaNoComeco(Object elemento){}
        
        public void removeDoComeco(){}
        
        public void removeDoFim(){}
    }
    // classe teste
    public class TesteAdicionaNoFim{
       
    }
    
    
    
    
    
  
    public static void main(String[] args) {
            
        // TODO code application logic here
        }
    
    /**
     * @param args the command line arguments
     */
    
    
}