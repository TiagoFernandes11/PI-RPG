const formulario = document.querySelector("form");
const Iemail = document.querySelector("#inputEmail");
const isenha = document.querySelector("#inputPassword");
const isenha2 = document.querySelector("#inputPassword2");

let arrEmails = [];

//só deus sabe pq isso nao ta funcionando
function cadastrar(){
      preencherArrayComEmailsCadastrados();
      console.log(arrEmails);
      console.log(Iemail.value)
      console.log(arrEmails.includes(Iemail.value));
      if (arrEmails.includes(Iemail.value)) {
        alert("Email ja cadastrado!");
      } else {
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
        alert("Cadastro concluido");
      }
};

function limpar(){
    Iemail.value ="";
    isenha.value = "";
    isenha2.value = "";
}

function preencherArrayComEmailsCadastrados() {
  const items = fetch("http://localhost:8080/api/clients")
    .then((data) => {
      return data.json();
    })
    .then((post) => {
      post.forEach((items) => {
        arrEmails.push(items.email);
      });
    });
}

formulario.addEventListener("submit", function(event){
    event.preventDefault();
    if(isenha.value === isenha2.value){
        cadastrar();
        limpar();
    }
    else{
    alert("Senhas não são identicas");
    }
});


