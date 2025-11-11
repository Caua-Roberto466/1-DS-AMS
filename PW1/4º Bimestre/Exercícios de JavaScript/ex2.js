function maiorEntreTres(num1, num2, num3){
    if(num1 > num2 && num1 > num3){
        return `O número ${num1} é maior`
    }else if(num2 > num1 && num2 > num3){
        return `O número ${num2} é maior`
    }else if (num3 > num2 && num3 > num1){
        return `O número ${num3} é maior`
    }else{
        return "Não foi possível passar um número maior"
    }
}
numero1 = 4
numero2 = 6
numero3 = 2
console.log(maiorEntreTres(numero1, numero2, numero3))