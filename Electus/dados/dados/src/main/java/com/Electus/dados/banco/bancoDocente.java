package com.Electus.dados.banco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.Electus.dados.entides.docente;
@Repository
public interface bancoDocente extends JpaRepository<docente, Integer>{
    public docente findByCodicoAndSenha(String codico, String senha);
    public docente getOne(Integer id);
}
