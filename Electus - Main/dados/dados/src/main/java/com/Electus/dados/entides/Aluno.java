package com.Electus.dados.entides;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Aluno{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String aluno;
    // @DateTimeFormat(pattern = "dd/mm/yyyy")
    private String data_nascimento;
    
    @Column(unique = true, length = 50)
    private String cpf;

    private String numero_telefone;
    private String email;
    private String sexo;
    private String endereco;
    private String numero_casa;
    private String curso;
    private String modulo;
    private String periodo;
    @Column(length = 50)
    private String senha;
    private String descricao;
    private String formacao;
    private String teste;
    @Lob
    private byte[] imagem;

    public byte[] getImagem() {
        return imagem;
    }
    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
    public int getId(){
        return this.Id;
    }
    public void setId(int id){
         this.Id = id;
    }
    public String getAluno(){
        return this.aluno;
    }
    public void setAluno(String Aluno){
         this.aluno = Aluno;
    }
    public String getData_nascimento(){
        return this.data_nascimento;
    }
    public void setData_nascimento(String Data_nascimento){
         this.data_nascimento = Data_nascimento;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getNumero_telefone(){
        return this.numero_telefone;
    }
    public void setNumero_telefone(String Numero_telefone){
        this.numero_telefone = Numero_telefone;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String Sexo){
        this.sexo = Sexo;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String Endereco){
        this.endereco = Endereco;
    }
    public String getNumero_casa(){
        return this.numero_casa;
    }
    public void setNumero_casa(String Numero_casa){
        this.numero_casa = Numero_casa;
    }
    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String Curso){
        this.curso = Curso;
    }
    public String getModulo(){
        return this.modulo;
    }
    public void setModulo(String Modulo){
        this.modulo = Modulo;
    }
    public String getPeriodo(){
        return this.periodo;
    }
    public void setPeriodo(String Periodo){
        this.periodo = Periodo;
    }
    public String getEmai(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setFormacao(String formacao){
        this.formacao = formacao;
    }
    public String getFormacao(){
        return this.formacao;
    }
    public String getTeste(){
        return this.teste;
    }
    public void setTeste(String Teste){
         this.teste = Teste;
    }
    
   
}
