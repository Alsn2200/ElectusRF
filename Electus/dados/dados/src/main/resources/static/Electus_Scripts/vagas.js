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
// document.getElementById('Enviar').addEventListener('click', function Enviar(){
//     fetch("http://localhost:8082/vagaAluno",
//     {
//         headers: {
//           'Accept': 'application/json',
//           'Content-Type': 'application/json'
//         },
//         method: "POST",
//         body: JSON.stringify({
//             nome_empresa: document.getElementById('nome').textContent,
//             cbo:document.getElementById('cbo').textContent,
//             departamento:document.getElementById('departamento').textContent,
//             nome:document.getElementById('aluno').textContent,
//             curso: document.getElementById('curso').textContent,
//             modulo: document.getElementById('modulo').textContent
//         })
    
//     })
//     .finally(
//         alert("Cadastro feito com sucesso!!! confira o seu perfil")
//     )
// })
// document.getElementById('vagas').addEventListener('click' , function Entrou(){
//     document.getElementById('vagas').style.backgroundColor

// })
// document.getElementById('click').addEventListener('click', function click(){
//     document.getElementById('click').style.backgroundImage = "url('../Imagens/principal-vaga\(1\).jpg')"
// })
// var tamanho = 0
// function passando(){
//     if(tamanho == 0){
//         document.getElementById('click').classList.toggle('splite')
        
//      }
//      if(tamanho == 1){
//         document.getElementById('click').classList.toggle('splite')
//         document.getElementById('click').classList.toggle('splite2')
//     }
//     else if(tamanho == 2){
//         document.getElementById('click').classList.toggle('splite')
//         document.getElementById('click').classList.toggle('splite2')
//         document.getElementById('click').classList.toggle('splite3')
//     }
//     tamanho++
//     if(tamanho == 3){
//         tamanho = 0
//     }
// }
// setInterval(passando, 3000)
let time = 5000,
    currentImageIndex = 0,
    images = document
                .querySelectorAll("#slider img")
    max = images.length;

function nextImage() {

    images[currentImageIndex]
        .classList.remove("selected")

    currentImageIndex++

    if(currentImageIndex >= max)
        currentImageIndex = 0

    images[currentImageIndex]
        .classList.add("selected")
}

function start() {
    setInterval(() => {
        // troca de image
        nextImage()
    }, time)
}

window.addEventListener("load", start)

