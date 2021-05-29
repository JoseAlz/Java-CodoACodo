alert("Punto 1 de la actividad")


function verEdad(){
    var edad1 = prompt("Ingrese su edad: ");
    if(edad1 >=18){
        alert("Usted es mayor de edad, tiene " + edad1 + " años.");
    } else {
        alert("Usted es menor de edad.")
    }
}

verEdad() //Llamado a funcion
//---------------------------------------------------------------------------------------------------

alert("Punto 2 de la actividad")

var edad1 = prompt("Ingrese la edad del usuario A: ");
var edad2 = prompt("Ingrese la edad del usuario B: ");
var edad3 = prompt("Ingrese la edad del usuario C: ");

if(edad1>edad2 && edad1>edad3){
    alert("El usuario A es el mayor");
}else if (edad2>edad1 && edad2>edad3) {
    alert("El usuario B es el mayor");
}else if (edad3>edad1 && edad3>edad2) {
    alert("El usuario C es el mayor");
}





