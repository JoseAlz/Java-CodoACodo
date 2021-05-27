function saludar() {
    console.log("HOla osy una funcion")
}

saludar();

function tablaMultiplicar(tabla, hasta) {
    for (i = 0; i <= hasta; i++)
        console.log(tabla, "x", i, "=", tabla * i);
}

tablaMultiplicar(5,10);


var a = 2

function arrow(a){
    return a + 100;
}
console.log(arrow(2))






function saludar(nombre) {
    alert("Hola " + nombre);
}

function procesarEntradaUsuario(letra) {
    var nombre = prompt("Ingresa tu nombre. ");
    letra(nombre);
}

procesarEntradaUsuario(saludar);



