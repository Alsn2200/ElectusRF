package com.Electus.dados.banco;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Electus.dados.entides.pdf2;

@Repository
public interface bancoPdf2 extends CrudRepository<pdf2, Integer>{
    pdf2 getOne(Integer id);
}
