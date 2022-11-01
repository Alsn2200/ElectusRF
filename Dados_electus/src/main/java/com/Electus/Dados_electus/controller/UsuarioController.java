package com.Electus.Dados_electus.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.Electus.Dados_electus.banco.UsuarioBanco;
import com.Electus.Dados_electus.entides.Aluno;


@CrossOrigin("*")
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioBanco acessoBanco;

    @GetMapping("/usuarios")
    public List<Aluno> ListUsuario(){
        return (List<Aluno>) acessoBanco.findAll();
    }

    @GetMapping("/usuarios/{id}")
    public Optional<Aluno> peguePorId(@PathVariable int id){
        return acessoBanco.findById(id);
    }
    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody Aluno novousuario){
        acessoBanco.save(novousuario);
    }

    // @PutMapping("alterar/{id}")
    // public void alterrar(@PathVariable Integer id, @RequestBody Aluno usuario){
    //     acessoBanco.findById(id).map( novo -> {
    //         novo.setNome(usuario.getNome());
    //         novo.setUsuario(usuario.getUsuario());
    //         novo.setEmail(usuario.getEmai());
    //         novo.setSenha(usuario.getSenha());

    //         return acessoBanco.save(novo);
    //     });
    // }

    // @PutMapping
    // public void alterarNovo(@PathVariable int id){

    // }

    // @DeleteMapping("/deletar/{id}")
    // public void deletandoUsuario(@PathVariable int id){
    //     acessoBanco.deleteById(id);
    // }

    
}
