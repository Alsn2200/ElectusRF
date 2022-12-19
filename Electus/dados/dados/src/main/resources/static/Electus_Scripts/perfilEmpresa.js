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
    alert('Vaga registrada com sucesso! Atualize a pagina ou confira na pagina para visualizar a vaga')
    document.getElementById('tarefas').value = ""
    document.getElementById('cargo').value = ""
    document.getElementById('cbo').value = ""
    document.getElementById('Departamento').value = ""
    document.getElementById('profissional').value = ""
    document.getElementById('formacao').value = ""
    document.getElementById('comportamentais').value = ""
    document.getElementById('tecnicas').value = ""
    document.getElementById('tarefas').value = ""

})
