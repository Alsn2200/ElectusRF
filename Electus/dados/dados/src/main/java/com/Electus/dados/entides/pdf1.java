package com.Electus.dados.entides;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Id;

@Entity
public class pdf1 {
    @Id
    private int Id;
    
    private String nome;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    @Lob
    private byte[] imagem;
    public byte[] getImagem() {
        return imagem;
    }


    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
   
}
