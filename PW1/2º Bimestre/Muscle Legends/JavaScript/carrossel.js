let index = 0;
const slides = document.querySelectorAll(".slide");
const dots = document.querySelectorAll(".dot");

function showSlide(i) {
    slides.forEach(slide => slide.classList.remove("active"));
    dots.forEach(dot => dot.classList.remove("active"));

    slides[i].classList.add("active");
    dots[i].classList.add("active");

    index = i;
}

// Botões
document.querySelector(".next").addEventListener("click", () => {
    let nextIndex = (index + 1) % slides.length;
    showSlide(nextIndex);
});

document.querySelector(".prev").addEventListener("click", () => {
    let prevIndex = (index - 1 + slides.length) % slides.length;
    showSlide(prevIndex);
});

// Bolinhas
dots.forEach(dot => {
    dot.addEventListener("click", () => {
        showSlide(Number(dot.dataset.slide));
    });
});

// Troca automática a cada 15 segundos
setInterval(() => {
    let nextIndex = (index + 1) % slides.length;
    showSlide(nextIndex);
}, 15000);
