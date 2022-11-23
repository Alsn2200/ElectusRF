package com.Electus.dados.banco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Electus.dados.entides.pdf1;

@Repository
public interface bancoPdf1 extends JpaRepository<pdf1, Integer>{
     pdf1 getOne(Integer id);
}
