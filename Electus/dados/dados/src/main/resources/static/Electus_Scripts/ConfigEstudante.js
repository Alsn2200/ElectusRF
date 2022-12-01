document.getElementById('enviar').addEventListener('click', function Enviar(){
    fetch("http://localhost:8082/configEstudante",
            {
                headers: {
                  'Accept': 'application/json',
                  'Content-Type': 'application/json'
                },
                method: "POST",
                body: JSON.stringify({
                    aluno: document.getElementById('name').value,
                    numero_telefone: document.getElementById('numero_tell').value,       
                    email:  document.getElementById('email').value,
                    endereco: document.getElementById('endereco').value,
                    numero_casa:  document.getElementById('numero_casa').value,
                    senha: document.getElementById('senha').value,
                    descricao: document.getElementById('descricao').value,
                    id: document.getElementById('id').textContent
                })
            
            })

            alert('A sua alteração foi bem sucedida! Atualize a página para verificar')


            console.log(document.getElementById('name').value)
})