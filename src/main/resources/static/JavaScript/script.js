// Script per attivare il carousel di immagini
document.addEventListener("DOMContentLoaded", function() {
    const carousel = document.querySelector('.carousel');
    let counter = 0;

    setInterval(() => {
        counter++;
        if (counter === 3) {
            counter = 0;
        }
        carousel.style.transform = `translateX(${-counter * 100}%)`;
    }, 5000); // Cambia immagine ogni 5 secondi
});

// Script per lo scorrimento fluido alla sezione desiderata al clic sul link nel menu
document.querySelectorAll('header nav ul li a').forEach(anchor => {
    anchor.addEventListener('click', function(e) {
        e.preventDefault();
        
        const target = document.querySelector(this.getAttribute('href'));
        window.scrollTo({
            top: target.offsetTop,
            behavior: 'smooth'
        });
    });
});

// Script per aggiungere un effetto di hover alle immagini del team
document.querySelectorAll('.team-member img').forEach(img => {
    img.addEventListener('mouseover', function() {
        this.style.transform = 'scale(1.1)'; // Ingrandisce leggermente l'immagine al passaggio del mouse
        this.style.transition = 'transform 0.3s ease'; // Aggiunge un effetto di transizione fluida
    });
    
    img.addEventListener('mouseout', function() {
        this.style.transform = 'scale(1)'; // Riporta l'immagine alla dimensione originale quando il mouse esce
    });
});

// Script per la barra di navigazione fissa
window.addEventListener('scroll', function() {
    const header = document.querySelector('header');
    if (window.scrollY > header.offsetHeight) {
        header.classList.add('fixed-nav');
    } else {
        header.classList.remove('fixed-nav');
    }

    // Mostra/nascondi il pulsante "Torna all'inizio"
    const backToTopButton = document.querySelector('.back-to-top');
    if (window.scrollY > 300) {
        backToTopButton.style.display = 'block';
    } else {
        backToTopButton.style.display = 'none';
    }
});

// Script per lo scorrimento fluido verso l'inizio della pagina
document.querySelector('.back-to-top').addEventListener('click', function() {
    window.scrollTo({
        top: 0,
        behavior: 'smooth'
    });
});

document.addEventListener('DOMContentLoaded', function() {
    const modalBtns = document.querySelectorAll('.modal-btn');
    const closeBtns = document.querySelectorAll('.close-btn');
    const modals = document.querySelectorAll('.modal');

    modalBtns.forEach(btn => {
        btn.addEventListener('click', () => {
            const modalTarget = btn.getAttribute('data-modal-target');
            const modal = document.querySelector(modalTarget);
            modal.style.display = 'block';
        });
    });

    closeBtns.forEach(btn => {
        btn.addEventListener('click', () => {
            const modal = btn.closest('.modal');
            modal.style.display = 'none';
        });
    });

    modals.forEach(modal => {
        modal.addEventListener('click', e => {
            if (e.target === modal) {
                modal.style.display = 'none';
            }
        });
    });
});
