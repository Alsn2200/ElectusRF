package com.Electus.dados.banco;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Electus.dados.entides.empresa;
@Repository
public interface bancoEmpresa extends CrudRepository<empresa, Integer>{
    public empresa findByCnpjAndSenha(String cnpj, String senha);

    public empresa getOne(Integer id);

}
