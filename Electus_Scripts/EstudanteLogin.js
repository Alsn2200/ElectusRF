var btnEntrar = document.getElementById('Entrar')

let testes = []

    fetch("http://localhost:8082/usuarios")
    .then(
        Response => Response.json()
    )
    .then(function (data){
        data.forEach(element => {
           testes.push(element)
        });
        
    })
    .catch(function(res){ console.log(res) })

btnEntrar.addEventListener('click', function Entrar(){
    // for(var i=0; i < testes.length; i++){
    //     console.log(testes[i].emai)
    // }

    var inpCpf = document.getElementById('cpf').value
    var inpSenha = document.getElementById('nova-senha').value
    testes.forEach( i=> {
       if(i.cpf == inpCpf && i.senha == inpSenha){
            console.log('deu certo')
       }    
    })
})