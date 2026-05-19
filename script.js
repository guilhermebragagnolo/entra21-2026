let cinema = document.querySelector(".cinema");
let contador = document.getElementById("contador");
let total = document.getElementById("total");
let linha = document.createElement("div");

    let linhas = 6;
    let colunas = 8;
    let preco = 20;

    for (let i = 0; i < linhas; i++) {

        let linha = document.createElement("div");
        linha.classList.add("linha");

        let numeroLinha = document.createElement("span");
        numeroLinha.textContent = linhas - i;

        numeroLinha.style.color = "white";
        numeroLinha.style.marginRight = "10px";

        linha.appendChild(numeroLinha);

        let containerAssentos = document.createElement("div");
        containerAssentos.classList.add("assentos");

        for (let j = 0; j < colunas; j++) {
            let assento = document.createElement("div");
            assento.classList.add("assento");

        if (j === 4) {

            let espaco = document.createElement("div");
            espaco.style.width = "20px";
            containerAssentos.appendChild(espaco)

        }

        if (Math.random() < 0.3) {
            assento.classList.add("ocupado");

        }

        assento.addEventListener("click", function  () {

            if (assento.classList.contains("ocupado")) return;

            assento.classList.toggle("selecionado");

            let selecionados = cinema.querySelectorAll(".assento.selecionado");

            contador.textContent = selecionados.length;
            total.textContent = selecionados.length * preco;
        });

        containerAssentos.appendChild(assento);
    }

    linha.appendChild(containerAssentos);
    cinema.appendChild(linha);
    }