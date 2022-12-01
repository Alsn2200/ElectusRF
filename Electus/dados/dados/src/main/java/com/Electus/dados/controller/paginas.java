package com.Electus.dados.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Electus.dados.banco.bancoVagas;
import com.Electus.dados.banco.UsuarioBanco;
import com.Electus.dados.banco.bancoEmpresa;
import com.Electus.dados.banco.bancoVagaAluno;
import com.Electus.dados.entides.empresa;
import com.Electus.dados.entides.vaga;

@Controller
public class paginas {

    @Autowired
    private bancoVagas salvamentoVaga;

    @Autowired
    private bancoVagaAluno bancoVagaAluno;

    @Autowired
    private UsuarioBanco acessoBanco;

    @Autowired
    private bancoEmpresa salvamentoEmpresa;
   
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
    List<vaga> Vaga = new ArrayList<>();
    @GetMapping("/perfil-empresa/{id}")
    public String Empresa(Model model,  @PathVariable int id,HttpSession session, empresa Empresa){
        Empresa = this.salvamentoEmpresa.getOne(id);
        session.setAttribute("empresa", Empresa);
        model.addAttribute("inscricoes", bancoVagaAluno.findAll());
        model.addAttribute("alunos", acessoBanco.findAll());
        model.addAttribute("lista",   salvamentoVaga.findAll());
        return "perfil-empresa";
    }
    
    @GetMapping("/login-docente")
    public String loginDocente(){
        return "login-docente";
    }
    @GetMapping("/Docente")
    public String Docente(Model model){
        model.addAttribute("Turmas",  acessoBanco.findAll());
        return "perfil-docente";
    }
    @GetMapping("/index")
    public String index(){
        return "index";
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
