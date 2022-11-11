package com.Electus.dados.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Electus.dados.banco.bancoVagas;

@Controller
public class paginas {

    @Autowired
    private bancoVagas salvamentoVaga;
   
    @GetMapping("/Login-empresa")
    public String LoginEmpresa(){
        return "login-Empresa";
    }
    @GetMapping("/Cadastro-empresa")
    public String CadastroEmpresa(){
        return "cad-empresa";
    }
    @GetMapping("/Cadastro-vaga")
    public String CadastroVaga(){
        return "cadastro-vaga";
    }
    @GetMapping("/Login-estudante")
    public String LoginEstudante(){
        return "loginEstudante";
    }
    @GetMapping("/Cadastro-estudante")
    public String CadastroEstudante(){
        return "cad-estudante2";
    }
    @GetMapping("/perfil-empresa/{id}")
    public String Empresa(@PathVariable int id, Model model){
        model.addAttribute("lista", salvamentoVaga.findById(id));
        return "perfil-empresa";
    }
    
    // @GetMapping("/Perfil")
    // public String PerfilEstudane(){
    //     return ("redirect:/a");
       
    // }
    // @GetMapping("/a")
    // public String a(){
    //     return "perfil-estudante";
       
    // }
  
}
