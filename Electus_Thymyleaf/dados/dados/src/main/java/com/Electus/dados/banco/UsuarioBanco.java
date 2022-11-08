package  com.Electus.dados.banco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Electus.dados.entides.Aluno;
@Repository
public interface UsuarioBanco extends CrudRepository<Aluno, Integer>{
    public Aluno findByCpfAndSenha(String cpf, String senha);
    public Aluno findByDescricaoAndFormacao(String cpf, String senha);
}
