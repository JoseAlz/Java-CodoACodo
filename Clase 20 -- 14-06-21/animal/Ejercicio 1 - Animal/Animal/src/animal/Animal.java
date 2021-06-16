/*
*Instanciación y mensajes de objetos - Ejemplo 1
*Módulo POO - Codo a Codo - 2017
*
 */
package animal;

/**
 * @author Leandro Grammatico
 * @version 1.0
 */
public class Animal extends Animal2{

    /*-----------------------ATRIBUTOS-----------------------------------------*/
 /*-------------------------------------------------------------------------*/
    String nombre;
    String raza;
    int edad;
    String sexo;

    /*-----------------------CONSTRUCTORES---------------------------------------*/
 /*-------------------------------------------------------------------------*/
    
    public Animal(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    public Animal() {     
    }
    public Animal(String nuevoNombre, int nuevaEdad) {
        nombre = nuevoNombre;
        edad = nuevaEdad;
    }
    public Animal(String nuevoNombre, String nuevaRaza, int nuevaEdad, String nuevoSexo) {
        nombre = nuevoNombre;
        raza = nuevaRaza;
        edad = nuevaEdad;
        sexo = nuevoSexo;
    }

    
    
    /*-----------------------MAIN----------------------------------------------*/
 /*-------------------------------------------------------------------------*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Instanciación de objetos de la clase Animal*/
        Animal mascota1 = new Animal("Firulais", "Canino", 2, "Macho");
        Animal mascota2 = new Animal("Sasha",1);
         Animal mascota3 = new Animal("Firulais", "Canino", 2, "Macho");
         Animal2 mascota4 = new Animal2 ("Pepito");
       
         
         mascota1.nombre= "Pepito";
            
        /*System.out.println( mascota1.mostrarNombre()  );
        System.out.println(mascota1.mostrarRaza());
        System.out.println(mascota1.mostrarEdad());
        System.out.println(mascota1.mostrarSexo());
        System.out.println("");        
        System.out.println(mascota2.mostrarNombre());
        System.out.println(mascota2.mostrarRaza());
        System.out.println(mascota2.mostrarEdad());
        System.out.println(mascota2.mostrarSexo());
        System.out.println("");
        System.out.println(mascota3.mostrarNombre());
        System.out.println(mascota3.mostrarRaza());
        System.out.println(mascota3.mostrarEdad());
        System.out.println(mascota3.mostrarSexo());*/
        
        /*imprimirDatos(mascota1);
        imprimirDatos(mascota2);
        imprimirDatos(mascota3);*/
        
 /*Imprimimos objetos*/
        System.out.println(mascota1);
        System.out.println(mascota2);
        System.out.println(mascota3);
          
        if (mascota1.equals(mascota2)) {
            System.out.println("Los animales comparados son iguales");
        }

        else {
            System.out.println("Los animales comparados son diferentes");
        }
    }

    /*---------------------------------MÉTODOS---------------------------------*/
 /*-------------------------------------------------------------------------*/
    public String mostrarNombre() {
        return "El animal se llama: " + nombre;
    }

    public String mostrarRaza() {
        return "La raza del animal es: " + raza;
    }

    public String mostrarEdad() {
        if (edad == 1) {
            return "El animal tiene: " + edad + " año.";
        } else {
            return "El animal tiene: " + edad + " años.";
        }
    }

    public String mostrarSexo() {
        return "El animal es : " + sexo;
    }
    
    void setNombre( String n ){
        nombre=n;
    }
    
  
    public static void imprimirDatos(Animal mascota) {
        //Imprimo atributos con formato
        System.out.println(mascota.mostrarNombre());
        System.out.println(mascota.mostrarRaza());
        System.out.println(mascota.mostrarEdad());
        System.out.println(mascota.mostrarSexo());
        System.out.println();
        //Imprimo atributos sin formato
        /*System.out.println(mascota.nombre);
        System.out.println(mascota.raza);
        System.out.println(mascota.edad);
        System.out.println(mascota.sexo);
        System.out.println();*/
    }
    //Sobre-escribimos el método equals() que Animal hereda de Object para comparar los objetos
    
    public boolean equals(Animal mascota2){
        return (nombre.equalsIgnoreCase(mascota2.nombre))&&(raza.equalsIgnoreCase(mascota2.raza))&&(edad==mascota2.edad)&&((sexo.equalsIgnoreCase(mascota2.sexo)));
    }

//Sobre-escribimos el método toString() que Animal hereda de Object, para dar una descripción de los objetos
   
    @Override
    public String toString() {
        return "El nombre de la mascota es: " + nombre + "\nLa raza de la mascota es: " + raza + "\nLa edad de la mascota es: " + edad + "\nLa mascota es: "+sexo;
    }
}
