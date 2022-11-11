package com.Electus.dados.controller;
import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Electus.dados.banco.UsuarioBanco;
import com.Electus.dados.banco.bancoEmpresa;
import com.Electus.dados.banco.bancoVagas;
import com.Electus.dados.banco.testeBanco;
import com.Electus.dados.entides.Aluno;
import com.Electus.dados.entides.empresa;
import com.Electus.dados.entides.teste;
import com.Electus.dados.entides.vaga;


@Controller
public class UsuarioController {


    @Autowired
    private UsuarioBanco acessoBanco;

    @Autowired
    private bancoEmpresa salvamentoEmpresa;

    @Autowired
    private bancoVagas salvamentoVaga;

    @Autowired
    private testeBanco bancoT;
    

    

    @GetMapping("/Vagas")
    public String ListaEmpresa(Model model){
        model.addAttribute("lista", (List<vaga>) salvamentoVaga.findAll());
        return "principal";
    }

    @GetMapping("/usuarios/{id}")
    public Optional<Aluno> peguePorId(@PathVariable int id){
        return acessoBanco.findById(id);
    }
    
    @PostMapping("/recarregar")
    public String recarregar(Aluno usuario, HttpSession session){
        session.setAttribute("usuarioLogado", usuario);
        return "/perfil-estudante";
    }

    
    @GetMapping("/imagem/{id}")
    @ResponseBody
    public byte[] exibirImagem(@PathVariable("id") Integer id){
        teste T = bancoT.getOne(id);
      return T.getImagem();
    }

    @PostMapping("/alterar")
    public void Alterar(@RequestBody Aluno usuario) {
        
        int id = Integer.parseInt(usuario.getTeste());
        acessoBanco.findById(id).map( novo -> {
            novo.setDescricao(usuario.getDescricao());
            novo.setFormacao(usuario.getFormacao());
            return acessoBanco.save(novo);
        });
    }
    
    @PostMapping("/efetuarLogin")
    public String efetuarLogin(Aluno usuario, HttpSession session){
        usuario = this.acessoBanco.findByCpfAndSenha(usuario.getCpf(), usuario.getSenha());
       
        if(usuario != null){
           
            session.setAttribute("usuarioLogado", usuario);
            return "redirect:/perfil-estudante";
        }
        else{
           
            return "redirect:/Login-estudante";
        }

    } 
    @PostMapping("/empresalogin")
    public String EmpresaLogin(empresa Empresa, HttpSession session, RedirectAttributes ra){
        Empresa = this.salvamentoEmpresa.findByCnpjAndSenha(Empresa.getCnpj(), Empresa.getSenha());

        if(Empresa != null){
            session.setAttribute("empresa", Empresa);
            return "redirect:/perfil-empresa/" + Empresa.getId();
        }
        else{
            ra.addFlashAttribute("mensagem", "Login/usuario incoretos");
            return "redirect:/Login-empresa";
        }
    }
    @GetMapping("/perfil-estudante")
    public String aVant(){
        return "perfil-estudante";
    }
     
  
    @PostMapping("/Alea/{Id}")
    public String Imagem(teste T, @RequestParam ("fileProduto") MultipartFile file, @PathVariable("Id") Integer id){
    
       try {
            T.setId(id);
             T.setImagem(file.getBytes());
             bancoT.save(T);
         } catch (IOException e) {
                           
                e.printStackTrace();
           }
          
           return "redirect:/index";
                
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/deletar/{id}")
    public String deletarUsuario(@PathVariable int id){
        acessoBanco.deleteById(id);
        return "redirect:/index";
    }
}