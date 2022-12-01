package com.Electus.dados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Electus.dados.banco.bancoVagaAluno;

import com.Electus.dados.banco.UsuarioBanco;
import com.Electus.dados.banco.bancoEmpresa;
import com.Electus.dados.banco.bancoVagas;
import com.Electus.dados.entides.Aluno;
import com.Electus.dados.entides.empresa;
import com.Electus.dados.entides.vaga;
import com.Electus.dados.entides.vagaaluno;



@CrossOrigin("*")
@RestController
public class Requisicoes {

    @Autowired
    private UsuarioBanco acessoBanco;
    
    @Autowired
    private bancoEmpresa salvamentoEmpresa;

    @Autowired
    private bancoVagas salvamentoVaga;

    @Autowired
    private bancoVagaAluno bancoVagaAluno;

    @GetMapping("/Lista")
    public List<empresa> ListaEmpresa(){
        return (List<empresa>) salvamentoEmpresa.findAll();
    }

    @PostMapping("/vagaAluno")
    public void a(@RequestBody vagaaluno Cadastro){
        bancoVagaAluno.save(Cadastro);
    }

    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody Aluno novousuario){
        acessoBanco.save(novousuario);
    }

    @PostMapping("/cadastro-empresa")
    public void cadastroEmpresa(@RequestBody empresa Empresa){
        salvamentoEmpresa.save(Empresa);
    }
    @GetMapping("/usuarios")
    public List<Aluno> ListUsuario(){
        return (List<Aluno>) acessoBanco.findAll();
    }
    
    @PostMapping("/vaga")
    public void Vaga1(@RequestBody vaga Vaga) {
             salvamentoVaga.save(Vaga);
    }
    @PostMapping("/configEstudante")
    public void configEstudante(@RequestBody Aluno aluno){
        int id = aluno.getId();
        acessoBanco.findById(id).map(alteracao ->{
            alteracao.setAluno(aluno.getAluno());
            alteracao.setEmail(aluno.getEmail());
            alteracao.setNumero_telefone(aluno.getNumero_telefone());
            alteracao.setEndereco(aluno.getEndereco());
            alteracao.setNumero_casa(aluno.getNumero_casa());
            alteracao.setDescricao(aluno.getDescricao());
            alteracao.setSenha(aluno.getSenha());
            return acessoBanco.save(alteracao);
        });
    }

    @PostMapping("/estrela")
    public void Estrela(@RequestBody Aluno aluno){
        int id = aluno.getId();
        acessoBanco.findById(id).map(alteracao ->{
            alteracao.setCodificacaoprogramas(aluno.getCodificacaoprogramas());
            alteracao.setDesenvolvimento_prototipos(aluno.getDesenvolvimento_prototipos());
            alteracao.setRealizacao_testes(aluno.getRealizacao_testes());
            alteracao.setImplementacao_dados(aluno.getImplementacao_dados());
            alteracao.setDocumentacao_programa(aluno.getDocumentacao_programa());
            alteracao.setAlteracao_correcao_programa(aluno.getAlteracao_correcao_programa());
            alteracao.setAlteracao_armazenamento_dados(aluno.getAlteracao_armazenamento_dados());
            alteracao.setAtualizacao_documentacao_programa(aluno.getAtualizacao_documentacao_programa());
            alteracao.setValidacao("validado");
            return acessoBanco.save(alteracao);
        });

    }
 
    
}
