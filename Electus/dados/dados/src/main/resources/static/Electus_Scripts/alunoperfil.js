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
var stars = document.querySelectorAll('.star-icon')
var avaliacao = document.getElementById('Avaliacao').textContent


    
    stars.forEach(function(star){
        if(star.value == avaliacao){
            star.classList += " ativo"
        }
       
        
    });
   
   
  


document.getElementById('imgamem').addEventListener('click', function Enviarrr(){
    var teste = document.getElementById('teste').textContent
   
    console.log(formacao)
    fetch("http://localhost:8082/Salvamento",
    {
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            teste:teste
        })
    
    })
})
document.getElementById('btn2').addEventListener('click', function Excluir(){
    var escolha = confirm("Deseja excluir a conta? ")
    if(escolha == true){}
})