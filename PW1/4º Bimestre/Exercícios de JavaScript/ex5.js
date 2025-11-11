function verficarTemperatura(a){
    if(a < 10){
        return "Alerta de frio"
    }else if(a >= 10 && a <= 25){
        return "Temperatura ideal"
    }else{
        return "Alerta de calor"
    }
}
let temperatura = 26
console.log(verficarTemperatura(temperatura))