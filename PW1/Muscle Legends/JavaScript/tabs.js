document.querySelectorAll(".tab-btn").forEach(button => {
    button.addEventListener("click", () => {
        // Remove "active" de todos os botões e conteúdos
        document.querySelectorAll(".tab-btn").forEach(btn => btn.classList.remove("active"));
        document.querySelectorAll(".tab-content").forEach(tab => tab.classList.remove("active"));

        // Adiciona "active" ao botão clicado e ao conteúdo correspondente
        button.classList.add("active");
        document.getElementById(button.dataset.tab).classList.add("active");
    });
});
