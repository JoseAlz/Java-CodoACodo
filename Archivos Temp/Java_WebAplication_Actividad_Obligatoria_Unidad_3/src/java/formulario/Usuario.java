package formulario;




public class Usuario {

    private String Apellido;

    private String nombre;
    
    private String curso;
    
    private String comision;


   

    public Usuario(){

        

    }

    public Usuario(String Apellido, String nombre, String curso, String comision) {
        this.Apellido = Apellido;
        this.nombre = nombre;
        this.curso = curso;
        this.comision = comision;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getComision() {
        return comision;
    }

    public String getCurso() {
        return curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    

    
    


    
    

}


