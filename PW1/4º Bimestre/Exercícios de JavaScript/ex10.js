function formatarTelefone(string){
    let parte1 = string.slice(0, 4)
    let parte2 = string.slice(4)
    let formatado = parte1 + "-" + parte2
    return formatado
}
let telefone = "94543129"
console.log(formatarTelefone(telefone))