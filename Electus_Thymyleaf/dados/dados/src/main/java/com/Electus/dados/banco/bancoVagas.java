package com.Electus.dados.banco;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Electus.dados.entides.vaga;

@Repository
public interface bancoVagas extends CrudRepository<vaga, Integer>{
    
}
