document.getElementById("cep").addEventListener("blur", () => {
    const cep = document.getElementById("cep").value;

    if (cep.length !== 8) {
        alert("CEP inválido");
        return;
    }

    fetch(`https://viacep.com.br/ws/${cep}/json/`)
        .then(response => response.json())
        .then(data => {

            if (data.erro) {
                alert("CEP não encontrado");
                return;
            }

            document.getElementById("rua").value = data.logradouro;
            document.getElementById("bairro").value = data.bairro;
            document.getElementById("cidade").value = data.localidade;
            document.getElementById("estado").value = data.uf;

        })
        .catch(error => console.error("Erro ao buscar endereço:", error));
});


function cadastrar() {
    const nome = document.getElementById("nome").value;
    const email = document.getElementById("email").value;
    const telefone = document.getElementById("telefone").value;
    const cpf = document.getElementById("cpf").value;

    const cep = document.getElementById("cep").value;
    const rua = document.getElementById("rua").value;
    const bairro = document.getElementById("bairro").value;
    const cidade = document.getElementById("cidade").value;
    const estado = document.getElementById("estado").value;

    const pessoa = { nome, email, telefone, cpf, cep, rua, bairro, cidade, estado };

    let lista = JSON.parse(localStorage.getItem("clientes")) || [];

    lista.push(pessoa);

    localStorage.setItem("clientes", JSON.stringify(lista));

    alert("Cadastrado ✅");

    // limpar campos
    document.getElementById("nome").value = "";
    document.getElementById("email").value = "";
    document.getElementById("telefone").value = "";
}
