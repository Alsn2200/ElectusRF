// var btnButton = document.getElementById('btn-enviar-descricao')
// btnButton.addEventListener('click', function Enviar(){

//     var descricao = document.getElementById('add-descricao').value
//     var formacao = document.getElementById('add-formacao').value
//     var teste = document.getElementById('teste').textContent
   
//     console.log(formacao)
//     fetch("http://localhost:8082/alterar",
//     {
//         headers: {
//           'Accept': 'application/json',
//           'Content-Type': 'application/json'
//         },
//         method: "POST",
//         body: JSON.stringify({
//             descricao: descricao,
//             formacao: formacao,
//             teste:teste
//         })
    
//     })
    
// })
// var stars = document.querySelectorAll('.star-icon')
// var avaliacao = document.getElementById('Avaliacao').textContent


    
//     stars.forEach(function(star){
//         if(star.value == avaliacao){
//             star.classList += " ativo"
//         }
       
        
//     });
   
   
  


// document.getElementById('imgamem').addEventListener('click', function Enviarrr(){
//     var teste = document.getElementById('teste').textContent
   
//     console.log(formacao)
//     fetch("http://localhost:8082/Salvamento",
//     {
//         headers: {
//           'Accept': 'application/json',
//           'Content-Type': 'application/json'
//         },
//         method: "POST",
//         body: JSON.stringify({
//             teste:teste
//         })
    
//     })
// })
// document.getElementById('btn2').addEventListener('click', function Excluir(){
//     var escolha = confirm("Deseja excluir a conta? ")
//     if(escolha == true){}
// })

var url = document.getElementById('pdf').textContent

var pdfjsLib = window['pdfjs-dist/build/pdf'];

pdfjsLib.GlobalWorkerOptions.workerSrc = '//mozilla.github.io/pdf.js/build/pdf.worker.js';

var pdfDoc = null,
    pageNum = 1,
    pageRendering = false,
    pageNumPending = null,
    scale = 0.8,
    canvas = document.getElementById('pdf-exemplo'),
    ctx = canvas.getContext('2d');


function renderPage(num) {
  pageRendering = true;

  pdfDoc.getPage(num).then(function(page) {
    var viewport = page.getViewport({scale: scale});
    canvas.height = viewport.height;
    canvas.width = viewport.width;

    var renderContext = {
      canvasContext: ctx,
      viewport: viewport
    };
    var renderTask = page.render(renderContext);

    renderTask.promise.then(function() {
      pageRendering = false;
      if (pageNumPending !== null) {
        renderPage(pageNumPending);
        pageNumPending = null;
      }
    });
  });

  document.getElementById('page_num').textContent = num;
}


function queueRenderPage(num) {
  if (pageRendering) {
    pageNumPending = num;
  } else {
    renderPage(num);
  }
}

/**
 * mostra a página anterior
 */
function onPrevPage() {
  if (pageNum <= 1) {
    return;
  }
  pageNum--;
  queueRenderPage(pageNum);
}
document.getElementById('prev').addEventListener('click', onPrevPage);

/**
 * mostra a proxima página
 */
function onNextPage() {
  if (pageNum >= pdfDoc.numPages) {
    return;
  }
  pageNum++;
  queueRenderPage(pageNum);
}
document.getElementById('next').addEventListener('click', onNextPage);

/**
 * Download assincrono do PDF.
 */
pdfjsLib.getDocument(url).promise.then(function(pdfDoc_) {
  pdfDoc = pdfDoc_;
  document.getElementById('page_count').textContent = pdfDoc.numPages;

  renderPage(pageNum);
});