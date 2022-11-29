package com.Electus.dados.entides;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
   

    private String codificacaoprogramas;
    private String desenvolvimento_prototipos; 
    private String realizacao_testes;
    private String implementacao_dados; 
    private String documentacao_programa; 
    private String alteracao_correcao_programa; 
    private String alteracao_armazenamento_dados;
    private String atualizacao_documentacao_programa;
    private String validacao;
    private String docente;

    public String getDocente() {
        return docente;
    }
    public void setDocente(String docente) {
        this.docente = docente;
    }
    public String getValidacao() {
        return validacao;
    }
    public void setValidacao(String validacao) {
        this.validacao = validacao;
    }
    public String getCodificacaoprogramas() {
        return codificacaoprogramas;
    }
    public void setCodificacaoprogramas(String codificacaoprogramas) {
        this.codificacaoprogramas = codificacaoprogramas;
    }
   
    public String getDesenvolvimento_prototipos() {
        return desenvolvimento_prototipos;
    }
    public void setDesenvolvimento_prototipos(String desenvolvimento_prototipos) {
        this.desenvolvimento_prototipos = desenvolvimento_prototipos;
    }
    public String getRealizacao_testes() {
        return realizacao_testes;
    }
    public void setRealizacao_testes(String realizacao_testes) {
        this.realizacao_testes = realizacao_testes;
    }
    public String getImplementacao_dados() {
        return implementacao_dados;
    }
    public void setImplementacao_dados(String implementacao_dados) {
        this.implementacao_dados = implementacao_dados;
    }
    public String getDocumentacao_programa() {
        return documentacao_programa;
    }
    public void setDocumentacao_programa(String documentacao_programa) {
        this.documentacao_programa = documentacao_programa;
    }
    public String getAlteracao_correcao_programa() {
        return alteracao_correcao_programa;
    }
    public void setAlteracao_correcao_programa(String alteracao_correcao_programa) {
        this.alteracao_correcao_programa = alteracao_correcao_programa;
    }
    public String getAlteracao_armazenamento_dados() {
        return alteracao_armazenamento_dados;
    }
    public void setAlteracao_armazenamento_dados(String alteracao_armazenamento_dados) {
        this.alteracao_armazenamento_dados = alteracao_armazenamento_dados;
    }
    public String getAtualizacao_documentacao_programa() {
        return atualizacao_documentacao_programa;
    }
    public void setAtualizacao_documentacao_programa(String atualizacao_documentacao_programa) {
        this.atualizacao_documentacao_programa = atualizacao_documentacao_programa;
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
    public String getEmail(){
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
