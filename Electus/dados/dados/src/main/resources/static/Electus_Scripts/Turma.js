var codificacao = document.querySelectorAll('.codificacao');
var desenvolvimento = document.querySelectorAll('.desenvolvimento');
var realizacao = document.querySelectorAll('.realizacao');
var implementacao = document.querySelectorAll('.implementacao');
var documentacao = document.querySelectorAll('.documentacao');
var Correcao_Programa = document.querySelectorAll('.Correcao_Programa');
var alteracao_armazenamento = document.querySelectorAll('.alteracao_armazenamento');
var atualizacao_Documentacao= document.querySelectorAll('.atualizacao_Documentacao');

var avaliacao1 = [];
var avaliacao2 = []
var avaliacao3 = []
var avaliacao4 = []
var avaliacao5 = []
var avaliacao6 = []
var avaliacao7 = []
var avaliacao8 = []
/* 1 */

document.getElementById('estrela1').addEventListener('click', function(avl_1){
  var classStar = avl_1.target.classList;
  if(!classStar.contains('ativo')){
    codificacao.forEach(function(star){
      star.classList.remove('ativo');
    });
    classStar.add('ativo');
   
    avaliacao1.push(avl_1.target.getAttribute('data-avaliacao'));
  }
  // fetch("http://localhost:8082/a",
  // {
  //     headers: {
  //       'Accept': 'application/json',
  //       'Content-Type': 'application/json'
  //     },
  //     method: "POST",
  //     body: JSON.stringify({
  //        id:1,
  //        codificacaoprogramas: 1
  //     })
  
  // })
});

/* 2 */

document.getElementById('estrela2').addEventListener('click', function(avl_2){
  var classStar = avl_2.target.classList;
  if(!classStar.contains('ativo2')){
    desenvolvimento.forEach(function(star){
      star.classList.remove('ativo2');
    });
    classStar.add('ativo2');
     avaliacao2.push(avl_2.target.getAttribute('data-avaliacao'));
  }
});
/* 3 */
document.getElementById('estrela3').addEventListener('click', function(avl_3){
  var classStar = avl_3.target.classList;
  if(!classStar.contains('ativo3')){
    realizacao.forEach(function(star){
      star.classList.remove('ativo3');
    });
    classStar.add('ativo3');
     avaliacao3.push(avl_3.target.getAttribute('data-avaliacao'));
  }
});
/* 4 */
document.getElementById('estrela4').addEventListener('click', function(avl_4){
  var classStar = avl_4.target.classList;
  if(!classStar.contains('ativo4')){
    implementacao.forEach(function(star){
      star.classList.remove('ativo4');
    });
    classStar.add('ativo4');
    avaliacao4.push(avl_4.target.getAttribute('data-avaliacao'));
  }
});
/* 5 */
document.getElementById('estrela5').addEventListener('click', function(avl_5){
  var classStar = avl_5.target.classList;
  if(!classStar.contains('ativo5')){
    documentacao.forEach(function(star){
      star.classList.remove('ativo5');
    });
    classStar.add('ativo5');
     avaliacao5.push(avl_5.target.getAttribute('data-avaliacao'));
  }
});
/* 6 */
document.getElementById('estrela6').addEventListener('click', function(avl_6){
  var classStar = avl_6.target.classList;
  if(!classStar.contains('ativo6')){
    Correcao_Programa.forEach(function(star){
      star.classList.remove('ativo6');
    });
    classStar.add('ativo6');
     avaliacao6.push(avl_6.target.getAttribute('data-avaliacao'));
  }
});
/* 7 */
document.getElementById('estrela7').addEventListener('click', function(avl_7){
  var classStar = avl_7.target.classList;
  if(!classStar.contains('ativo7')){
    alteracao_armazenamento.forEach(function(star){
      star.classList.remove('ativo7');
    });
    classStar.add('ativo7');
    avaliacao7.push(avl_7.target.getAttribute('data-avaliacao'));
  }
});
/* 8 */
document.getElementById('estrela8').addEventListener('click', function(avl_8){
  var classStar = avl_8.target.classList;
  if(!classStar.contains('ativo8')){
    atualizacao_Documentacao.forEach(function(star){
      star.classList.remove('ativo8');
    });
    classStar.add('ativo8');
     avaliacao8.push(avl_8.target.getAttribute('data-avaliacao'));
  }
});

// 

document.getElementById('a').addEventListener('click', function enviarDados(){
  fetch("http://localhost:8082/estrela",
  {
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      method: "POST",
      body: JSON.stringify({
         id: document.getElementById('id').textContent,
         codificacaoprogramas: avaliacao1[0],
         desenvolvimento_prototipos: avaliacao2[0],
         realizacao_testes: avaliacao3[0],
         implementacao_dados: avaliacao4[0],
         documentacao_programa: avaliacao5[0],
         alteracao_correcao_programa: avaliacao6[0],
         alteracao_armazenamento_dados: avaliacao7[0],
         atualizacao_documentacao_programa: avaliacao8[0],
         
         
      })
  
  })

  console.log(avaliacao1[0])
console.log(avaliacao2[0])
console.log(avaliacao3[0])
console.log(avaliacao4[0])
console.log(avaliacao5[0])
console.log(avaliacao6[0])
console.log(avaliacao7[0])
console.log(avaliacao8[0])

window.location.href=window.location.href
  
})
