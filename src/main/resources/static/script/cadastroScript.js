const formulario = document.querySelector("form");

const Iemail = document.querySelector("#inputEmail");
const isenha = document.querySelector("#inputPassword");
const isenha2 = document.querySelector("#inputPassword2");

function cadastrar(){
    fetch("http://localhost:8080/api/clients",{
        headers: {
            'Accept': "application/json",
            'Content-type' : "application/json"
        },
        method: "POST",
        body: JSON.stringify({
            email: Iemail.value,
            password: isenha.value
    })
})
};

function limpar(){
    Iemail.value ="";
    isenha.value = "";
    isenha2.value = "";
}

formulario.addEventListener("submit", function(event){
    event.preventDefault();
    cadastrar();
    limpar();
});