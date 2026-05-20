let lista = JSON.parse(localStorage.getItem("clientes")) || [];
const tabela = document.getElementById("tabela");


function carregar() {
    tabela.innerHTML = "";

    lista.forEach((pessoa, i) => {
        const linha = document.createElement("tr");

        linha.innerHTML = `
            <td>${pessoa.nome}</td>
            <td>${pessoa.email}</td>
            <td>${pessoa.telefone}</td>
            <td>${pessoa.cpf}</td>
            <td>
                <button onclick="editar(${i})">Editar</button>
                <button onclick="excluir(${i})">Excluir</button>
            </td>
        `;

        tabela.appendChild(linha);
    });
}


function excluir(index) {
    if (confirm("Tem certeza?")) {
        lista.splice(index, 1);
        salvar();
    }
}


function editar(index) {
    const novoNome = prompt("Novo nome:", lista[index].nome);
    const novoEmail = prompt("Novo email:", lista[index].email);

    if (novoNome && novoEmail) {
        lista[index].nome = novoNome;
        lista[index].email = novoEmail;
        salvar();
    }
}


function salvar() {
    localStorage.setItem("clientes", JSON.stringify(lista));
    carregar();
}


carregar();