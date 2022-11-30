document.getElementById('Enviar').addEventListener('click', function Enviar(){
    fetch("http://localhost:8082/vagaAluno",
    {
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            nome_empresa: document.getElementById('empresa').textContent,
            cbo:document.getElementById('cbo').textContent,
            departamento:document.getElementById('departamento').textContent,
            nome:document.getElementById('aluno').textContent,
            idAluno:document.getElementById('idAluno').textContent,
            curso: document.getElementById('curso').textContent,
            modulo: document.getElementById('modulo').textContent
        })
    
    })
    .finally(
        alert("Cadastro feito com sucesso!!! confira o seu perfil")
    )
})

