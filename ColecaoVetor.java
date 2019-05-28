/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap4;

/**
 *
 * @author jctv
 */
public class ColecaoVetor implements Colecao{
    
    Pessoa [] dados = new Pessoa [5];
         

    @Override
    public void inserir(Pessoa p) {
        for(int i=0; i < this.dados.length; i++){
              if(this.dados[i] == null){
                  this.dados[i] = p;               
                  break;
              }
              
        }
     }
    
     @Override  
       public int tamanhoColecaoNaoNull(){  
           int k = 0;
     for(int i=0; i < this.dados.length; i++){          
              if(this.dados[i]!= null){
                k++;               
                }
        }
        return this.dados.length - k;
       }
}
       