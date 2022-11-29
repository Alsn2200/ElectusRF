package com.Electus.dados.entides;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class vagaaluno{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; 
    
    private String nome_empresa;
    private String cbo;
    private String departamento;
    private String nome;
    private int idAluno;
    private String curso;
    private String modulo;
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getModulo() {
        return modulo;
    }
    public void setModulo(String modulo) {
        this.modulo = modulo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome_empresa() {
        return nome_empresa;
    }
    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }
    public String getCbo() {
        return cbo;
    }
    public void setCbo(String cbo) {
        this.cbo = cbo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setIdAluno( int idAluno){
        this.idAluno = idAluno;
    }

    public int getIdAluno(){
        return this.idAluno;
    }
}
