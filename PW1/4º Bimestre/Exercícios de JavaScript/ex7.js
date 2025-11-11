function triangulo(a, b, c){
    if(a + b > c && a + c > b && b + c > a){
        if(a == b && a == c){
            return "Equilátero"
        }else if((a == b && a != c )|| (b == c && b != a) || (c == a && c != b) ){
            return "Isóceles"
        }else if(a != b && a != c && c != b){
            return "Escaleno"
        }
    }
}
let lado1 = 3
let lado2 = 4
let lado3 = 5
console.log(triangulo(lado1, lado2, lado3))