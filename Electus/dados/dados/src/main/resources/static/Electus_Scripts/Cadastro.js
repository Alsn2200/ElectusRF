var btnEnviar = document.getElementById('btn-cadastrar')
btnEnviar.addEventListener('click', function Enviar(){
    var formData = new FormData(document.querySelector('form'))
    var data_nascimento = formData.get("dtnasc")
    var nome = document.getElementById('nome').value
    var cpf = document.getElementById('cpf').value
    var telefone = document.getElementById('telefone').value
    var email = document.getElementById('email').value
    var sexo = document.querySelector('input[name = "sexo"]:checked').value
    var enderco = document.getElementById('endereco').value
    var n_casa = document.getElementById('n-casa').value
    var curso = document.getElementById('curso').value
    var modulo = document.getElementById('modulo').value
    var select = document.getElementById('turno').value
    var senha = document.getElementById('nova-senha').value
   
    if(nome == "" || cpf == "" || telefone == "" || email == "" || sexo == "" || enderco == "" || n_casa == "" || curso == "" || modulo == "" || select == ""|| senha == ""){
        alert("Prencha todos os campos")
    }
    else{

        fetch("http://localhost:8082/cadastrar",
    {
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            aluno: nome,
            data_nascimento: data_nascimento,
            cpf: cpf,
            numero_telefone: telefone,       
            email:  email,
            sexo: sexo,
            endereco: enderco,
            numero_casa: n_casa,
            curso:curso,
            modulo:modulo,
            periodo: select,
            senha:senha
        })
    
    })
       
    .then(function(res){  
        if(res.status == 500 ){
            alert('Algo deu errado!!! EMAIL ou CPF ja cadastrados!!!')
    } })
    alert('cadastro feito com sucesso!!!')
    window.location.href = "/Login-estudante"
    }
    
})
