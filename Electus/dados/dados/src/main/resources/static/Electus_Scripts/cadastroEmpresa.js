document.getElementById('Cadastrar').addEventListener('click', function Cadastrar(){
    var nome = document.getElementById('nome').value 
    var formt = new FormData(document.querySelector('form'))
    var data = formt.get('dtnasc')
    var cnpj = document.getElementById('cnpj').value
    var telefone = document.getElementById('telefone').value
    console.log(telefone)
    var responsavel = document.getElementById('responsavel').value
    var email = document.getElementById('email').value
    var cidade = document.getElementById('cidade').value
    var uf = document.getElementById('uf').value
    var endereco = document.getElementById('endereco').value
    var cep = document.getElementById('cep').value
    var area = document.getElementById('curso').value
    var senha = document.getElementById('senha').value

    fetch("http://localhost:8082/cadastro-empresa",
    {
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            nome: nome,
            data: data,
            cnpj: cnpj,
            tel: telefone,
            responsavel: responsavel,
            email: email,
            cidade: cidade,
            uf: uf,
            endereco: endereco,
            cep: cep,
            area: area,
            senha: senha
        })
    
    })
    alert('Cadatro feito com sucesso!!!')
    window.location.href = "/Login-empresa"
    
})
