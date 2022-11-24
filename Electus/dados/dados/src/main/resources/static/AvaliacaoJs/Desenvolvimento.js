var codificacao = document.querySelectorAll('.codificacao')
var avaliacao = document.getElementById('Avaliacao').textContent
    
codificacao.forEach(function(star){
        if(star.value == avaliacao){
            star.classList += " ativo"
        }  
 
});

var desenvolvimento = document.querySelectorAll('.desenvolvimento')
var avaliacao = document.getElementById('Avaliacao2').textContent
    
desenvolvimento.forEach(function(star){
        if(star.value == avaliacao){
            star.classList += " ativo"
        }  
 
});

var realizacao = document.querySelectorAll('.realizacao')
var avaliacao = document.getElementById('Avaliacao3').textContent
    
realizacao.forEach(function(star){
        if(star.value == avaliacao){
            star.classList += " ativo"
        }  
 
});

var implementacao = document.querySelectorAll('.implementacao')
var avaliacao = document.getElementById('Avaliacao4').textContent
    
implementacao.forEach(function(star){
        if(star.value == avaliacao){
            star.classList += " ativo"
        }  
 
});

var documentacao = document.querySelectorAll('.documentacao')
var avaliacao = document.getElementById('Avaliacao5').textContent
    
documentacao.forEach(function(star){
        if(star.value == avaliacao){
            star.classList += " ativo"
        }  
 
});

var Correcao_Programa = document.querySelectorAll('.Correcao_Programa')
var avaliacao = document.getElementById('Avaliacao6').textContent
    
Correcao_Programa.forEach(function(star){
        if(star.value == avaliacao){
            star.classList += " ativo"
        }  
 
});

var alteracao_armazenamento = document.querySelectorAll('.alteracao_armazenamento')
var avaliacao = document.getElementById('Avaliacao7').textContent
    
alteracao_armazenamento.forEach(function(star){
        if(star.value == avaliacao){
            star.classList += " ativo"
        }  
 
});

var atualizacao_Documentacao = document.querySelectorAll('.atualizacao_Documentacao')
var avaliacao = document.getElementById('Avaliacao8').textContent
    
atualizacao_Documentacao.forEach(function(star){
        if(star.value == avaliacao){
            star.classList += " ativo"
        }  
 
});
