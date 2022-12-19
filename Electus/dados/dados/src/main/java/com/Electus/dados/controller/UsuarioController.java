package com.Electus.dados.controller;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Electus.dados.banco.UsuarioBanco;
import com.Electus.dados.banco.bancoDocente;
import com.Electus.dados.banco.bancoEmpresa;
import com.Electus.dados.banco.bancoImagem;
import com.Electus.dados.banco.bancoPdf1;
import com.Electus.dados.banco.bancoPdf2;
import com.Electus.dados.banco.bancoPdf3;
import com.Electus.dados.banco.bancoVagaAluno;
import com.Electus.dados.banco.bancoVagas;
import com.Electus.dados.banco.testeBanco;
import com.Electus.dados.entides.Aluno;
import com.Electus.dados.entides.docente;
import com.Electus.dados.entides.empresa;
import com.Electus.dados.entides.imagemEmpresa;
import com.Electus.dados.entides.pdf1;
import com.Electus.dados.entides.teste;
import com.Electus.dados.entides.vaga;
import com.Electus.dados.entides.vagaaluno;


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

    @Autowired
    private bancoVagaAluno bancoVagaAluno;

    @Autowired
    private bancoImagem imagemEmpresa;

    @Autowired
    private bancoDocente acessoDocente;

    @Autowired
    private bancoPdf1 acessoPdf1;

    @Autowired
    private bancoPdf2 acessoPdf2;

    @Autowired
    private bancoPdf3 acessoPdf3;
     
    // @GetMapping("/Vagas/{id}")
    // public String ListaEmpresa(Model model,Aluno usuario, HttpSession session, @PathVariable int id){
    //     usuario = this.acessoBanco.getOne(id);
    //     model.addAttribute("lista", (List<vaga>) salvamentoVaga.findAll());
    //     session.setAttribute("aluno", usuario);
    //     return "principal";
    // }
    @GetMapping("/EmpresaVagas")
    public String VagasEmpresa(Model model){
        model.addAttribute("lista", (List<vaga>) salvamentoVaga.findAll());
        return "principal";
    }

    @PostMapping("/login-docente")
    public String loginDocente(docente Docente, HttpSession session){
        Docente = this.acessoDocente.findByCodicoAndSenha(Docente.getCodico(), Docente.getSenha());

        if(Docente != null){
            session.setAttribute("docente", Docente);
            return "redirect:/Docente";
        }
        else{
            return "/login-docente";
        }
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

    /* Area Pdf aluno */
    
    @PostMapping("/pdf1/{Id}")
    public String Pdf1(pdf1 Pdf, @RequestParam ("filePdf1") MultipartFile file, @PathVariable("Id") Integer id, Aluno usuario,  HttpSession session){
        usuario = this.acessoBanco.getOne(usuario.getId());
       try {
            Pdf.setId(id);
            Pdf.setImagem(file.getBytes());
             acessoPdf1.save(Pdf);
         } catch (IOException e) {
                           
                e.printStackTrace();
           }
          
           return "redirect:/perfil-estudante/" + usuario.getId();
                
    }
    @GetMapping("/exibirPdf1/{id}")
    @ResponseBody
    public byte[] exibirPdf1(@PathVariable("id") Integer id){
        pdf1 Pdf = acessoPdf1.getOne(id);
        return Pdf.getImagem();
    }



    /* ------------- */


    @PostMapping("/alterar")
    public void Alterar(@RequestBody Aluno usuario) {
        
        int id = Integer.parseInt(usuario.getTeste());
        acessoBanco.findById(id).map( novo -> {
            novo.setDescricao(usuario.getDescricao());
            novo.setFormacao(usuario.getFormacao());
               
            return acessoBanco.save(novo);
        });
    }

    @GetMapping("/Principal-Estudante/{id}")
    public String principalEstudante(Aluno usuario,HttpSession session, Model model, @PathVariable int id){
        usuario = this.acessoBanco.getOne(id);
        model.addAttribute("lista", (List<vaga>) salvamentoVaga.findAll());
        session.setAttribute("aluno", usuario);
        session.removeAttribute("empresa");
        return "principal";
    }

    @PostMapping("/Principal")
    public String efetuarLogin(Aluno usuario, HttpSession session, RedirectAttributes ra, pdf1 Pdf,Model model){
        usuario = this.acessoBanco.findByCpfAndSenha(usuario.getCpf(), usuario.getSenha());
        
        if(usuario != null){
            return "redirect:/Principal-Estudante/" + usuario.getId();
        }
        else{
            ra.addFlashAttribute("mensagem", "Login/usuario incoretos");
            return "redirect:/Login-estudante";
        }

    } 
    @GetMapping("Principal-empresa/{id}")
    public String principalEmpresa(empresa Empresa, HttpSession session, Model model, @PathVariable int id){
        Empresa = this.salvamentoEmpresa.getOne(id);
        model.addAttribute("lista", (List<vaga>) salvamentoVaga.findAll());
        session.setAttribute("empresa", Empresa);
        session.removeAttribute("aluno");
        return "principal";
    }
    @GetMapping("instituicao/{id}")
    public String instituicao(empresa Empresa, HttpSession session, Model model, @PathVariable int id){
        Empresa = this.salvamentoEmpresa.getOne(id);
        model.addAttribute("lista", (List<vaga>) salvamentoVaga.findAll());
        session.setAttribute("empresa", Empresa);
        session.removeAttribute("aluno");
        return "instituicao";
    }
    @GetMapping("Modulo/{nome}/{id}")
    public String Modulocurso(empresa Empresa,Aluno usuario ,HttpSession session, Model model, @PathVariable int id, @PathVariable String nome){
        Empresa = this.salvamentoEmpresa.getOne(id);
        session.setAttribute("Alunos", usuario);
        session.setAttribute("empresa", Empresa);
        session.setAttribute("nome", nome);
        session.removeAttribute("aluno");
        model.addAttribute("Turmas",  acessoBanco.findAll());
        
        return "Modulo";
    }
    @GetMapping("Alunos-curso/{modulo}/{nome}/{id}")
    public String curso(empresa Empresa,Aluno usuario ,HttpSession session, Model model, @PathVariable int id, @PathVariable String nome, @PathVariable String modulo){
        Empresa = this.salvamentoEmpresa.getOne(id);
        session.setAttribute("Alunos", usuario);
        session.setAttribute("empresa", Empresa);
        session.setAttribute("nome", nome);
        session.setAttribute("modulo", modulo);
        session.removeAttribute("aluno");
        model.addAttribute("Turmas",  acessoBanco.findAll());
        
        return "curso";
    }

    @PostMapping("/Principal-Empresa")
    public String EmpresaLogin(empresa Empresa, HttpSession session, RedirectAttributes ra, Model model){
        Empresa = this.salvamentoEmpresa.findByCnpjAndSenha(Empresa.getCnpj(), Empresa.getSenha());

        if(Empresa != null){
           
            return "redirect:/Principal-empresa/" + Empresa.getId();
        }
        else{
            ra.addFlashAttribute("mensagem", "Login/usuario incoretos");
            return "redirect:/Login-empresa";
        }
    }
    
    @GetMapping("/perfil-estudante/{id}")
    public String aVant(empresa Empresa,Aluno usuario, HttpSession session, RedirectAttributes ra, pdf1 Pdf, @PathVariable int id){
        usuario = this.acessoBanco.getOne(id);
        session.setAttribute("empresa", Empresa);
        session.removeAttribute("volta");
        session.setAttribute("usuarioLogado", usuario);
        return "perfil-estudante";
    }
    
    @GetMapping("/configEstudante/{id}")
    public String configEstudante(empresa Empresa,Aluno usuario, HttpSession session, RedirectAttributes ra, pdf1 Pdf, @PathVariable int id){
        usuario = this.acessoBanco.getOne(id);
        session.setAttribute("usuarioLogado", usuario);
        return "ConfiguracaoEstudante";
    }
    @GetMapping("/estudante/{id}/{idEmpresa}")
    public String perfilEstudante(empresa Empresa,Aluno usuario, HttpSession session, RedirectAttributes ra, pdf1 Pdf, @PathVariable int id,@PathVariable int idEmpresa){
        usuario = this.acessoBanco.getOne(id);
        Empresa = this.salvamentoEmpresa.getOne(idEmpresa);
        session.setAttribute("usuarioLogado", usuario);
        session.setAttribute("perfil", Empresa);
        session.setAttribute("volta", Empresa);
        session.removeAttribute("empresa");
        return "perfil-estudante";
    }

     
  
    @PostMapping("/Alea/{Id}")
    public String Imagem(teste T, @RequestParam ("fileProduto") MultipartFile file, @PathVariable("Id") Integer id, Aluno usuario,  HttpSession session){
        usuario = this.acessoBanco.getOne(usuario.getId());
       try {
            T.setId(id);
             T.setImagem(file.getBytes());
             bancoT.save(T);
         } catch (IOException e) {
                           
                e.printStackTrace();
           }
          
           return "redirect:/perfil-estudante/"+ usuario.getId();
                
    }
    @PostMapping("/empresaImagem/{Id}")
    public String ImagemEmpresa(imagemEmpresa empresa, @RequestParam ("fileProduto") MultipartFile file, @PathVariable("Id") Integer id){
    
       try {
        empresa.setId(id);
        empresa.setImagem(file.getBytes());
            imagemEmpresa.save(empresa);
         } catch (IOException e) {
                           
                e.printStackTrace();
           }
          
           return "redirect:/index";
                
    }
    @GetMapping("/empresaImagem/{id}")
    @ResponseBody
    public byte[] exibirImagemEmpresa(@PathVariable("id") Integer id){
        imagemEmpresa T = imagemEmpresa.getOne(id);
        return T.getImagem();
    }
   

    @GetMapping("/deletar/{id}")
    public String deletarUsuario(@PathVariable int id){
        acessoBanco.deleteById(id);
        bancoT.deleteById(id);
        acessoPdf1.deleteById(id);
        return "redirect:/index";
    }

    @GetMapping("/deletarVaga/{t}/{nome}/{id}")
    public String deletarVaga(@PathVariable int t, @PathVariable String nome, vagaaluno Aluno, @PathVariable int id){
        salvamentoVaga.deleteById(t);
        
        System.out.println(Aluno.getId());
            
      
        return "redirect:/perfil-empresa/" + id;
    }
    @GetMapping("Divulgar/{id}")
    public String divulgar(Model model,  @PathVariable int id,HttpSession session, empresa Empresa){
        Empresa = this.salvamentoEmpresa.getOne(id);
        session.setAttribute("empresa", Empresa);
        model.addAttribute("inscricoes", bancoVagaAluno.findAll());
        model.addAttribute("alunos", acessoBanco.findAll());
        model.addAttribute("lista",   salvamentoVaga.findAll());
        return "Divulga";
    }
    @GetMapping("/Vagaselecionada/{id}/{idAluno}")
    public String vagaSelecionada(HttpSession session, @PathVariable int id,vaga Vaga, Model model, Aluno aluno, @PathVariable int idAluno){
        aluno = acessoBanco.getOne(idAluno);
        Vaga = salvamentoVaga.getOne(id);
        session.setAttribute("aluno", aluno);
        session.setAttribute("vaga", Vaga);

        return "vagaSelecionada";
    }
     @GetMapping("/Turma/{id}")
    public String Turma(Model model, @PathVariable int id, HttpSession session, docente Docente){
        Docente = this.acessoDocente.getOne(id);
        session.setAttribute("docente", Docente);
        model.addAttribute("Turmas",  acessoBanco.findAll());

        return "turma";
    }
    
   
}
