function classificarMoedas(a){
    if(a/100 == 0.01){
        return "Um centavo"
    }else if(a/100 == 0.05){
        return "Cinco centavos"
    }else if(a/100 == 0.1){
        return "Dez centavos"
    }else if(a/100 == 0.25){
        return "Vinte e cinco centavos"
    }else if(a/100 == 0.5){
        return "Cinquente centavos"
    }else if(a/100 == 1){
        return "Um real"
    }else{
        return "Valor não identificado"
    }
}

moeda = 25
console.log(classificarMoedas(moeda))