function verificarSenha(a){
    if(a.length > 8 && a != "12345678"){
        return true
    }else{
        return false
    }
}
senha = "senha@2024"
console.log(verificarSenha(senha))