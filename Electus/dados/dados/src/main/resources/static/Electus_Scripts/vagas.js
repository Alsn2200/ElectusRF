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
                .querySelectorAll("#slider div")
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

var move = document.getElementById('header')

document.onscroll = function (){ testeScroll()}

function testeScroll(){
    if (document.documentElement.scrollTop >= 30){
        document.getElementById('header').style.transition= '2s'
        document.getElementById('link-1').className = 'color-text'
        document.getElementById('link-2').className = 'color-text'
        document.getElementById('link-3').className = 'color-text'
        document.getElementById('link-4').className = 'color-text'
        document.getElementById('header').style.boxShadow = '0 0 1rem 0.1rem black'
        document.getElementById('header').style.borderBottom = ' 1px solid black'
        document.getElementById('header').className = 'hover'
        move.addEventListener('mouseenter', entrou)
        move.addEventListener('mouseleave', saiu)
        
        
        function entrou(){
            document.getElementById('header').className = 'bg-secondary'
            document.getElementById('link-1').className = ''
            document.getElementById('link-2').className = ''
            document.getElementById('link-3').className = ''
            document.getElementById('link-4').className = ''
            document.getElementById('link-5').className = ''
            document.getElementById('link-1').style.transition = '1s';
            document.getElementById('link-2').style.transition = '1s';
            document.getElementById('link-3').style.transition = '1s';
            document.getElementById('link-4').style.transition = '1s';
            document.getElementById('link-5').style.transition = '1s';
            document.getElementById('header').style.boxShadow = '0 1px 15px 2px black'
        }
        function saiu(){
            document.getElementById('link-1').className = 'color-text'
            document.getElementById('link-2').className = 'color-text'
            document.getElementById('link-3').className = 'color-text'
            document.getElementById('link-4').className = 'color-text'
            document.getElementById('link-5').className = 'color-text'
            document.getElementById('header').className = 'hover'
            document.getElementById('header').style.boxShadow = 'none'
        }
        
        
    }
    else{
        document.getElementById('header').className -= 'hover'
        document.getElementById('header').className = 'bg-secondary'
            document.getElementById('link-1').className = ''
            document.getElementById('link-2').className = ''
            document.getElementById('link-3').className = ''
            document.getElementById('link-4').className = ''
            document.getElementById('link-5').className = ''
        document.getElementById('header').style.boxShadow = '0 1px 15px 2px black'
        // document.documentElement.scrollTop = 0
        move.addEventListener('mouseleave', saiu)
        function saiu(){
            document.getElementById('header').className = 'bg-secondary'
            document.getElementById('header').style.boxShadow = '0 1px 15px 2px black'
            document.getElementById('link-1').className = ''
            document.getElementById('link-2').className = ''
            document.getElementById('link-3').className = ''
            document.getElementById('link-4').className = ''
            document.getElementById('link-5').className = ''
        }
        // if(document.documentElement.scrollTop > 25){
        //     document.getElementById('navbar').style.position = 'fixed'
        // }
    }
    
    
}