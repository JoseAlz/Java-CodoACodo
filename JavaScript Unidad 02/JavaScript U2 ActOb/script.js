var nombreAlumno = prompt("Ingrese el nombre del alumno: ");
var promedio;

var notaUno = prompt("Ingrese la primer nota del alumno: ");
var notaDos = prompt("Ingrese la segunda nota del alumno: ");
var notaTres = prompt("Ingrese la tercer nota del alumno: ");

promedio = (parseFloat(notaUno)+parseFloat(notaDos)+parseFloat(notaTres))/3;
alert("El promedio de las tres notas del alumno "+ nombreAlumno + " es: " + (parseFloat(promedio)));

