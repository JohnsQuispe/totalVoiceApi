function login(){
	let cpf = document.getElementById("cpf");
	let senha = document.getElementById("senha");



    if(cpf.value == "123456789" && senha.value=="123"){
      alert("Logado");
      window.location.href("localhost:8888/app");
    }

	
}