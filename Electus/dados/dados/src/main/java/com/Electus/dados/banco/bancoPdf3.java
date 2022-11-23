package com.Electus.dados.banco;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Electus.dados.entides.pdf3;

@Repository
public interface bancoPdf3 extends CrudRepository<pdf3, Integer>{
    pdf3 getOne(Integer id);
}
