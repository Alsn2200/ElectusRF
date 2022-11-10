package com.Electus.dados.banco;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Electus.dados.entides.teste;

@Repository
public interface testeBanco extends CrudRepository<teste, Integer>{

    teste getOne(Integer id);
    

}
