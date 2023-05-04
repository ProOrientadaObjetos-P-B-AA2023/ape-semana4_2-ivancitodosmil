class Profesor{
    private String nombre;
    private String apellido;
    private double sueldobasico;
    private double sueldototal;
    private String cedula;
    private Provincia provincia;

    public Profesor(String nombre, String apellido, double sueldobasico, String cedula,Provincia provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldobasico = sueldobasico;
        this.cedula = cedula;
        this.provincia=provincia;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void calcularSueldoTotal(){
        this.sueldototal=sueldobasico+(this.sueldobasico*0.20);
    }
    public double getSueldoBasico() {
        return sueldobasico;
    }

    public void setSueldoBasico(double sueldobasico) {
        this.sueldobasico = sueldobasico;
    }

    public double getSueldoTotal() {
        return sueldototal;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", apellido=" + apellido + ", sueldobasico=" + sueldobasico + ", sueldototal=" + sueldototal + ", cedula=" + cedula + ", provincia=" + provincia + '}';
    }
}

class Provincia{
    private String nombre;
    private int habitantes;

    public Provincia(String nombre, int habitantes) {
        this.nombre = nombre;
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }
    public String toString() {
        return "Provincia{" + "nombre=" + nombre + ", habitantes=" + habitantes + '}';
    }
}

public class TestProfesor2 {
    public static void main(String[] args) {
        Provincia provincia=new Provincia("Cuenca",45000);
        Profesor profesor1= new Profesor("Daniel","Irene",1000,"11259542436",provincia);
        profesor1.calcularSueldoTotal();
        System.out.println(profesor1);
    }
}