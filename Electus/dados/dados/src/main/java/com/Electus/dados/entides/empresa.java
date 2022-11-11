package com.Electus.dados.entides;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    @Column(unique = true, length = 50)
    private String cnpj;
    private String data;
    private String tel;
    private String responsavel;
    private String email;
    private String cidade;
    private String uf;
    private String endereco;
    private String cep;
    private String area;
    @Column(length = 50)
    private String senha;
    
    private String cargo0;
    private String departamento0;
    private String cbo0;
    private String atribuicao0;
    private String tarefas0;
    private String formacao0;
    private String experiencia0;
    private String habilidade_comportamentais0;
    private String habilidades_tecnicas0; 
    private String teste;

    public String getTeste() {
        return teste;
    }
    public void setTeste(String teste) {
        this.teste = teste;
    }
    public String getCargo0() {
        return cargo0;
    }
    public void setCargo0(String cargo0) {
        this.cargo0 = cargo0;
    }
    public String getDepartamento0() {
        return departamento0;
    }
    public void setDepartamento0(String departamento0) {
        this.departamento0 = departamento0;
    }
    public String getCbo0() {
        return cbo0;
    }
    public void setCbo0(String Cbo0) {
        this.cbo0 = Cbo0;
    }
    public String getAtribuicao0() {
        return atribuicao0;
    }
    public void setAtribuicao0(String atribuicao0) {
        this.atribuicao0 = atribuicao0;
    }
    public String getTarefas0() {
        return tarefas0;
    }
    public void setTarefas0(String tarefas0) {
        this.tarefas0 = tarefas0;
    }
    public String getFormacao0() {
        return formacao0;
    }
    public void setFormacao0(String formacao0) {
        this.formacao0 = formacao0;
    }
    public String getExperiencia0() {
        return experiencia0;
    }
    public void setExperiencia0(String experiencia0) {
        this.experiencia0 = experiencia0;
    }
    public String getHabilidade_comportamentais0() {
        return habilidade_comportamentais0;
    }
    public void setHabilidade_comportamentais0(String habilidade_comportamentais0) {
        this.habilidade_comportamentais0 = habilidade_comportamentais0;
    }
    public String getHabilidades_tecnicas0() {
        return habilidades_tecnicas0;
    }
    public void setHabilidades_tecnicas0(String habilidades_tecnicas0) {
        this.habilidades_tecnicas0 = habilidades_tecnicas0;
    }
    public int getId(){
        return this.id;
    }
    public void setId( int Id){
        this.id = Id;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome( String Nome){
        this.nome = Nome;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getCnpj(){
        return this.cnpj;
    }
    public void setCnpj( String Cnpj){
        this.cnpj = Cnpj;
    }
    public String getTel(){
        return this.tel;
    }
    public void setTel(String Tel){
        this.tel = Tel;
    }
    public String getResponsavel(){
        return this.responsavel;
    }
    public void setResponsavel( String tel2){
        this.responsavel = tel2;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail( String email){
        this.email = email;
    }
    public String getCidade(){
        return this.cidade;
    }
    public void setCidade( String cidade){
        this.cidade = cidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String Uf) {
        this.uf = Uf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String Endero) {
        this.endereco = Endero;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

}
