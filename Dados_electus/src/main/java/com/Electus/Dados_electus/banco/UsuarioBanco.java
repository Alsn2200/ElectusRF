package  com.Electus.Dados_electus.banco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Electus.Dados_electus.entides.Aluno;


@Repository
public interface UsuarioBanco extends CrudRepository<Aluno, Integer>{
}
