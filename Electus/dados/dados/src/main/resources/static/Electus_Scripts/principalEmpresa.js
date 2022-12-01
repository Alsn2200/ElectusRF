
var move = document.getElementById('header')

document.onscroll = function (){ testeScroll()}

function testeScroll(){
    if (document.documentElement.scrollTop >= 30){
        document.getElementById('header').style.transition= '2s'
    
        document.getElementById('link-2').className = 'color-text'
        document.getElementById('link-3').className = 'color-text'
        document.getElementById('header').style.boxShadow = '0 0 1rem 0.1rem black'
        document.getElementById('header').style.borderBottom = ' 1px solid black'
        document.getElementById('header').className = 'hover'
        move.addEventListener('mouseenter', entrou)
        move.addEventListener('mouseleave', saiu)
        
        
        function entrou(){
            document.getElementById('header').className = 'bg-secondary'
          
            document.getElementById('link-2').className = ''
            document.getElementById('link-3').className = ''
           
            document.getElementById('link-2').style.transition = '1s';
            document.getElementById('link-3').style.transition = '1s';
            document.getElementById('header').style.boxShadow = '0 1px 15px 2px black'
        }
        function saiu(){
           
            document.getElementById('link-2').className = 'color-text'
            document.getElementById('link-3').className = 'color-text'
            document.getElementById('header').className = 'hover'
            document.getElementById('header').style.boxShadow = 'none'
        }
        
        
    }
    else{
        document.getElementById('header').className -= 'hover'
        document.getElementById('header').className = 'bg-secondary'
           
            document.getElementById('link-2').className = ''
            document.getElementById('link-3').className = ''
        document.getElementById('header').style.boxShadow = '0 1px 15px 2px black'
        // document.documentElement.scrollTop = 0
        move.addEventListener('mouseleave', saiu)
        function saiu(){
            document.getElementById('header').className = 'bg-secondary'
            document.getElementById('header').style.boxShadow = '0 1px 15px 2px black'
           
            document.getElementById('link-2').className = ''
            document.getElementById('link-3').className = ''
        }
        // if(document.documentElement.scrollTop > 25){
        //     document.getElementById('navbar').style.position = 'fixed'
        // }
    }
    
    
}
