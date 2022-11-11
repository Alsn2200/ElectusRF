package com.Electus.dados.controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Electus.dados.banco.UsuarioBanco;
import com.Electus.dados.banco.bancoEmpresa;
import com.Electus.dados.banco.bancoVagas;
import com.Electus.dados.entides.Aluno;
import com.Electus.dados.entides.empresa;
import com.Electus.dados.entides.vaga;



@CrossOrigin("*")
@RestController
public class Requisicoes {

    @Autowired
    private UsuarioBanco acessoBanco;
    
    @Autowired
    private bancoEmpresa salvamentoEmpresa;

    @Autowired
    private bancoVagas salvamentoVaga;

    @GetMapping("/Lista")
    public List<empresa> ListaEmpresa(){
        return (List<empresa>) salvamentoEmpresa.findAll();
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
    
    
    
}
