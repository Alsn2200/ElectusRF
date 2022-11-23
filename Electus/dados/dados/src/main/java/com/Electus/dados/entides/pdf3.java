package com.Electus.dados.entides;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class pdf3 {
    @Id
    private int Id;
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
