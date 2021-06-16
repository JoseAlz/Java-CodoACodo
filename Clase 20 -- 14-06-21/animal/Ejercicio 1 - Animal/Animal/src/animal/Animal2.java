/*
*Instanciación y mensajes de objetos - Ejemplo 1
*Módulo POO - Codo a Codo - 2017
*
 */
package animal;

/**
 * @author Leandro Grammatico
 * @version 2.0
 */
public class Animal2 {

    /*-----------------------ATRIBUTOS-----------------------------------------*/
 /*-------------------------------------------------------------------------*/
    String nombre="Por defecto";
    String raza;
    int edad=99;
    String sexo;

    /*-----------------------CONSTRUCTORES---------------------------------------*/
 /*-------------------------------------------------------------------------*/
    public Animal2(String nuevoNombre, String nuevaRaza, int nuevaEdad, String nuevoSexo) {

        nombre = nuevoNombre;
        raza = nuevaRaza;
        edad = nuevaEdad;
        sexo = nuevoSexo;
    }

    public Animal2(String nuevoNombre) {

        nombre = nuevoNombre;
        raza = "default";
        edad = 0;
        sexo = "default";
    }

    public Animal2() {

        
        raza = "default";
        sexo = " ";
    }

    public Animal2(String nuevoNombre, int nuevaEdad) {
        nombre = nuevoNombre;
        edad = nuevaEdad;
    }

    /*-----------------------MAIN----------------------------------------------*/
 /*-------------------------------------------------------------------------*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Instanciación de objetos de la clase Animal*/
        Animal2 mascota1 = new Animal2("Firulais", "Canino", 2, "Macho");
        Animal2 mascota2 = new Animal2("Firulais", "Canino", 2, "Macho");
        Animal2 mascota3 = new Animal2();
        
        /*Imprimimos objetos*/
        System.out.println(mascota1);
        System.out.println(mascota2);
        System.out.println(mascota3);
   
        if (mascota2.equals(mascota3)) {
            System.out.println("Los animales comparados son iguales");
        }
        else {
            System.out.println("Los animales comparados son diferentes");
        }
    }

    //Sobre-escribimos el método equals() que Animal hereda de Object para comparar los objetos
    public boolean equals(Animal2 mascota){
    
        return (nombre.equalsIgnoreCase(mascota.nombre))&&(raza.equalsIgnoreCase(mascota.raza))&&(edad==mascota.edad)&&((sexo.equalsIgnoreCase(mascota.sexo)));
    }

//Sobre-escribimos el método toString() que Animal hereda de Object, para dar una descripción de los objetos
    @Override
    public String toString() {
        return "El nombre de la mascota es: " + nombre + "\nLa raza de la mascota es: " + raza + "\nLa edad de la mascota es: " + edad + "\nLa mascota es: "+sexo;
    }
}
