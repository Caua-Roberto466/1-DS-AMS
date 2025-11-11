function podeDirigir(num){
    if (num >= 18){
        return "Pode ser habilitado(a)"
    }else{
        return "Não pode"
    }
}
let idade = 16
console.log(podeDirigir(idade))