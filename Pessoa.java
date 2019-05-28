/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap4;

public abstract class Pessoa {

    private String nome;
    private String cpf;
   // private Date dataNasc;
  //  private String fone;
  //  private String celular;
    
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
      
       
    }
    
 //concret methods 

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }


  //abstract methods

    public abstract void setNome(String nome);  
      
    public abstract void setCpf(String cpf) ;
    


}
