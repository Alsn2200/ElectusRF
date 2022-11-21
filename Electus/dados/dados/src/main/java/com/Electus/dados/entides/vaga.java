package com.Electus.dados.entides;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class vaga{
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   
  
    private int codico;
    public int getCodico() {
        return codico;
    }
    public void setCodico(int codico) {
        this.codico = codico;
    }
    private String nome;
    private String area;
    private String email;
    private String tell;
    private String cidade;
    private String uf;
    private String endereco;
    private String cargo;
    private String departamento;
    private String cbo;
    private String atribuicao;
    private String tarefas;
    private String formacao;
    private String experiencia;
    private String habilidade_comportamentais;
    private String habilidades_tecnicas; 
    private String salario;
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getCbo() {
        return cbo;
    }
    public void setCbo(String cbo) {
        this.cbo = cbo;
    }
    public String getAtribuicao() {
        return atribuicao;
    }
    public void setAtribuicao(String atribuicao) {
        this.atribuicao = atribuicao;
    }
    public String getTarefas() {
        return tarefas;
    }
    public void setTarefas(String tarefas) {
        this.tarefas = tarefas;
    }
    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    public String getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
    public String getHabilidade_comportamentais() {
        return habilidade_comportamentais;
    }
    public void setHabilidade_comportamentais(String habilidade_comportamentais) {
        this.habilidade_comportamentais = habilidade_comportamentais;
    }
    public String getHabilidades_tecnicas() {
        return habilidades_tecnicas;
    }
    public void setHabilidades_tecnicas(String habilidades_tecnicas) {
        this.habilidades_tecnicas = habilidades_tecnicas;
    }
    private String teste;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTell() {
        return tell;
    }
    public void setTell(String tell) {
        this.tell = tell;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTeste() {
        return teste;
    }
    public void setTeste(String teste) {
        this.teste = teste;
    }
}
