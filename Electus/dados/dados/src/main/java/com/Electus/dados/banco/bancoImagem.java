package com.Electus.dados.banco;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Electus.dados.entides.imagemEmpresa;

@Repository
public interface bancoImagem extends CrudRepository<imagemEmpresa, Integer> {
    imagemEmpresa getOne(Integer id);
}
