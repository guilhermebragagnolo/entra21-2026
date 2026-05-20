function cadastrar() {
    const nome = document.getElementById("nome").value;
    const email = document.getElementById("email").value;
    const telefone = document.getElementById("telefone").value;
    const cpf = document.getElementById("cpf").value;


    const pessoa = { nome, email, telefone, cpf };


    let lista = JSON.parse(localStorage.getItem("clientes")) || [];

    lista.push(pessoa);


    localStorage.setItem("clientes", JSON.stringify(lista));

    alert("Cadastrado ✅");


    document.getElementById("nome").value = "";
    document.getElementById("email").value = "";
    document.getElementById("telefone").value = "";
    document.getElementById("cpf").value = "";
}