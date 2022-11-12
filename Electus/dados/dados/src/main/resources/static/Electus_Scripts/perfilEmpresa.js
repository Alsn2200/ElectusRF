document.getElementById('vaga-1').addEventListener('click', function Vaga(){
    var teste = document.getElementById('teste').textContent
    

    console.log(formacao)
    fetch("http://localhost:8082/vaga",
    {
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            id:  document.getElementById('id').textContent,
            nome:  document.getElementById('nome').textContent,
            area:  document.getElementById('area').textContent,
            email:  document.getElementById('email').textContent,
            tell:  document.getElementById('tel').textContent,
            cidade:  document.getElementById('cidade').textContent,
            uf:  document.getElementById('uf').textContent,
            endereco:  document.getElementById('endereco').textContent,
            atribuicao: document.getElementById('tarefas').value,
            cargo: document.getElementById('cargo').value,
            cbo: document.getElementById('cbo').value,
            departamento: document.getElementById('Departamento').value,
            experiencia: document.getElementById('profissional').value,
            formacao: document.getElementById('formacao').value,
            habilidade_comportamentais: document.getElementById('comportamentais').value,
            habilidades_tecnicas: document.getElementById('tecnicas').value,
            tarefas: document.getElementById('tarefas').value,
            teste: teste
        })
    
    })

})
