'use strict'
console.log("OPERADORES POSTFIJOS");
var a;
var i;
i = 0
console.log("i:"+i);
console.log("i++:" + (i++));

console.log("i: "+i);

console.log("---------------------------");

a = 0;
i = 0;
console.log("i:"+i);
a = i++;
console.log("a: "+a);
console.log("i: "+i);

console.log("---------------------------");
console.log("OPERADORES PREFIJOS");
a = 0;
i = 0;
a = ++i;
console.log("a: "+a);
console.log("i: "+i);
console.log("---------------------------");
a = 0;
console.log("a: "+a);
a = a+1;
console.log("a=+1: "+a);
console.log("a: "+a);
console.log("---------------------------");

var edad = 80;
var imprime ="";

switch(edad){
    case 18:
        imprime = "Acabas de cumplir la mayoria de edad";
        break;
    case 25:
        imprime = "ya eres adulto";
        break;
    default:
        imprime = "Tu edad es neutra";     
}

console.log(imprime);
console.log("---------------------------");
console.log("USO FOR");
var i = 0;
for (var i=2; i<=100; i+=2){
    console.log("El nuemero es: " +i);
}


var tt = 'Laura'
console.log(tt);
var we;
we = parseFloat(" ");
console.log(we)

var wii;
wii = parseInt();
console.log(wii)