window.onload = function() {
    const pesoUser = localStorage.getItem('peso_user');
    const pesoElement = document.getElementById('peso-user');

    if (pesoUser) {
        pesoElement.textContent = `${pesoUser} Kg`;
        
        // Estilizando o elemento
        pesoElement.style.color = 'black'; // Cor do texto
        pesoElement.style.textAlign = 'center'; // Centralizando o texto
        pesoElement.style.fontSize = '20px'; // Tamanho da fonte (opcional)
        pesoElement.style.fontWeight = 'bold'; // Negrito (opcional)
    }
};