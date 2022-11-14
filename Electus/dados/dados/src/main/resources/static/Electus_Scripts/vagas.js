// let testes = []
// var tamanho 
// testes.length = 0
//     fetch("http://localhost:8082/Lista")
//     .then(
//         Response => Response.json()
//     )
//     .then(function (data){
//         data.forEach(element => {
//            testes.push(element)
//         });
        
//     })
//     .catch(function(res){ console.log(res) })
document.getElementById('Enviar').addEventListener('click', function Enviar(){
    fetch("http://localhost:8082/vagaAluno",
    {
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            nome_empresa: document.getElementById('nome').textContent,
            cbo:document.getElementById('cbo').textContent,
            departamento:document.getElementById('departamento').textContent,
            nome:document.getElementById('aluno').textContent
        })
    
    })
    .catch(
        alert("Parece que você ja se inscreveu nessa vaga! confira o seu perfil")
    )
})