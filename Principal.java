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
public class Principal {
    
    
       public static void main(String[] args) {
        // TODO code application logic here
    
       ColecaoVetor c1 = new ColecaoVetor ();
       
       
       System.out.println(c1.tamanhoColecaoNaoNull());
      
       c1.inserir(new Professor ("TE", "Doutor", "Juliano", "033"));
       System.out.println(c1.dados[0].getNome());
       System.out.println(c1.tamanhoColecaoNaoNull());
           
       c1.inserir(new Professor ("TE", "Doutor", "Juliano2", "033"));
       System.out.println(c1.dados[1].getNome());           
       System.out.println(c1.tamanhoColecaoNaoNull());
      
       c1.inserir((new Aluno("23", "EC", "Juliano3", "034")));
       System.out.println(c1.dados[2].getNome());
       System.out.println(c1.tamanhoColecaoNaoNull());
      
 
        
       }
    
}
