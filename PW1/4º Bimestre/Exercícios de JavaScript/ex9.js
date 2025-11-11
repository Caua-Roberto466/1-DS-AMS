function verificarNota(a, b){
    media = (a + b)/2
    if(media < 7){
        return "Reprovado"
    }else{
        return "Aprovado"
    }
}
let nota1 = 6
let nota2 = 8
console.log(verificarNota(nota1, nota2))