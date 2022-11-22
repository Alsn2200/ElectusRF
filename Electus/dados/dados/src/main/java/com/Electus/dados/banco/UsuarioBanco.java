package  com.Electus.dados.banco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Electus.dados.entides.Aluno;
@Repository
public interface UsuarioBanco extends JpaRepository<Aluno, Integer>{
    public Aluno findByCpfAndSenha(String cpf, String senha);
    public Aluno findByDescricaoAndFormacao(String cpf, String senha);
    public Aluno getOne(Integer id);
    public Aluno findByAluno(String aluno);

}
