let lista = JSON.parse(localStorage.getItem("clientes")) || [];
const container = document.getElementById("lista");

function renderizar(dados) {
    container.innerHTML = "";

    dados.forEach((pessoa, i) => {
        const card = document.createElement("div");
        card.classList.add("card");

        card.innerHTML = `
            <h3>${pessoa.nome}</h3>
            <p><strong>Email:</strong> ${pessoa.email}</p>
            <p><strong>Telefone:</strong> ${pessoa.telefone}</p>
            <p><strong>CPF:</strong> ${pessoa.cpf}</p>
            <P><strong>CEP:</strong> ${pessoa.cep || ""}</p>
            <p><strong>Rua:</strong> ${pessoa.rua || ""}</p>
            <p><strong>Bairro:</strong> ${pessoa.bairro || ""}</p>
            <p><strong>Cidade:</strong> ${pessoa.cidade || ""}</p>
            <p><strong>Estado:</strong> ${pessoa.estado || ""}</p>

            <button class="edit" onclick="editar(${i})">Editar</button>
            <button class="delete" onclick="excluir(${i})">Excluir</button>
        `;

        container.appendChild(card);
    });
}

// excluir
function excluir(index) {
    lista.splice(index, 1);
    salvar();
}

// editar
function editar(index) {
    const pessoa = lista[index];

    const novoNome = prompt("Nome:", pessoa.nome);
    const novoEmail = prompt("Email:", pessoa.email);

    if (novoNome && novoEmail) {
        lista[index].nome = novoNome;
        lista[index].email = novoEmail;
        salvar();
    }
}

// salvar
function salvar() {
    localStorage.setItem("clientes", JSON.stringify(lista));
    renderizar(lista);
}

// busca
function filtrar() {
    const termo = document.getElementById("busca").value.toLowerCase();

    const filtrados = lista.filter(p =>
        p.nome.toLowerCase().includes(termo)
    );

    renderizar(filtrados);
}

// iniciar
renderizar(lista);