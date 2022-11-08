var btnButton = document.getElementById('btn-enviar-descricao')
btnButton.addEventListener('click', function Enviar(){

    var descricao = document.getElementById('add-descricao').value
    var formacao = document.getElementById('add-formacao').value
    var teste = document.getElementById('teste').textContent
   
    console.log(formacao)
    fetch("http://localhost:8082/alterar",
    {
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            descricao: descricao,
            formacao: formacao,
            teste:teste
        })
    
    })
    
})
