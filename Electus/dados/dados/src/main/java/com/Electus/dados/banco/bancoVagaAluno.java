package com.Electus.dados.banco;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Electus.dados.entides.vagaaluno;

@Repository
public interface bancoVagaAluno extends CrudRepository<vagaaluno, Integer>{

    // vagaaluno findByDepartamento(String depatamento);
  
}
