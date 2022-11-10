package com.Electus.dados.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class paginas {
   
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
    @GetMapping("/perfil-empresa")
    public String Empresa(){
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
