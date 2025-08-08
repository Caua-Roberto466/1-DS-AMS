document.querySelector('form').addEventListener('submit', function(event) { //Pega o elemento 'form' da página html, espera o botão enviar ser apertado, e começa um evento quando for apertado
    event.preventDefault(); // Impede o envio tradicional

    const emailInput = document.getElementById('email'); //Pega o campo do emai e transforma em uma váriavel
    const erroEmail = document.getElementById('erro-email'); //Pega a menssagem de erro e transforma numa váriavel
    const email = emailInput.value.trim().toLowerCase(); //Pega o valor digitado no campo de email, tensforma em uma váriavel e deixa em minúsculo para poder comparar

    // Recuperar os cadastros salvos
    const cadastros = JSON.parse(localStorage.getItem('cadastros')) || []; //Pega os cadastro salvos (se tiver), transforma em uma váriavel array, e se não tiver nenhum cadastro salvo, deixa um array vazio

    // Verificar se o e-mail já existe
    const emailJaExiste = cadastros.some(user => user.email.toLowerCase() === email); //Vai ver se  o email já está salvo, e retorna true se tiver

    if (emailJaExiste) { //Vai iniciar a condição se o resultado der true
        // Mostrar mensagem de erro
        erroEmail.textContent = "Este e-mail já está cadastrado."; //Vai exibir a menssagem na div
        erroEmail.style.display = "block"; //Deixa o display em blocos
        return; // Impede o cadastro
    } else { //Se der falso deixa oculta a menssagem de erro
        // Esconde a mensagem de erro, caso já tenha aparecido antes
        erroEmail.style.display = "none"; //Esconde a menssagem
    }

    // Coletar os demais dados
    const dados = { //É onde vai guarda os dados pegos no formulário
        nome: document.getElementById('nome').value,
        email: email,
        senha: document.getElementById('senha').value,
        genero: document.querySelector('input[name="genero"]:checked')?.value || '',
        estado: document.getElementById('estado').value,
        mensagem: document.getElementById('menssagem').value
    };

    // Adiciona e salva no localStorage
    cadastros.push(dados); //Adiciona os dados na lista de cadastro
    localStorage.setItem('cadastros', JSON.stringify(cadastros)); //transforma isso em String

    alert('Cadastro salvo com sucesso!'); //Exibe o alerta de que foi salvo
    document.querySelector('form').reset(); //Limpa todo o formulário
});
