class Fabricante{
    private String nombrefabricante;
    private String ciudadorigen;

    public Fabricante() {}
    public Fabricante(String nombrefabricante, String ciudadorigen) {
        this.nombrefabricante = nombrefabricante;
        this.ciudadorigen = ciudadorigen;
    }

    public String getNombrefabricante() {
        return nombrefabricante;
    }
    public void setNombrefabricante(String nombrefabricante) {
        this.nombrefabricante = nombrefabricante;
    }
    public String getCiudadorigen() {
        return ciudadorigen;
    }
    public void setCiudadorigen(String ciudadorigen) {
        this.ciudadorigen = ciudadorigen;
    }
  
     public String toString(){
        return String.format("\n Fabricante: %s"+
                "\n Ciudad de Origen: %s",
                this.getNombrefabricante(),this.getCiudadorigen());
    } 
}

class Automotor{
    private String cedula;
    private Fabricante fabricante;
    private int anofabricacion;
    private double valorvehiculo;
    private double valormatricula;

    public Automotor() {}
    public Automotor(String cedula, Fabricante fabricante, int anofabricacion, double valorvehiculo) {
        this.cedula = cedula;
        this.fabricante = fabricante;
        this.anofabricacion = anofabricacion;
        this.valorvehiculo = valorvehiculo;
    }

    public void calcularValorMatricula (){
        this.valormatricula=(0.00002*this.valorvehiculo)*(2023-anofabricacion);
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public Fabricante getFabricante() {
        return fabricante;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    public int getAnofabricacion() {
        return anofabricacion;
    }
    public void setAnofabricacion(int anofabricacion) {
        this.anofabricacion = anofabricacion;
    }
    public double getValorvehiculo() {
        return valorvehiculo;
    }
    public void setValorvehiculo(double valorvehiculo) {
        this.valorvehiculo = valorvehiculo;
    }
    public double getValormatricula() {
        return valormatricula;
    }
    public void setValormatricula(double valormatricula) {
        this.valormatricula = valormatricula;
    }
    
 public String toString(){
        return String.format("Automotor"+
                "\n Cedula: %s"+
                "%s"+
                "\n Ano de Fabricacion: %d"+
                "\n Valor del Vehiculo: %.2f"+
                "\n Valor de la Matricula: %.2f",
                this.getCedula(),this.getFabricante(),this.getAnofabricacion(),this.getValorvehiculo(),this.getValormatricula());
    } 
}

public class TestAutomotor2 {
    public static void main(String[] args) {
        Fabricante fabricante1 = new Fabricante("Ford","Quito");
        Automotor automotor1 = new Automotor ("1105658502",fabricante1,2018,18000.68);
        automotor1.calcularValorMatricula();
        System.out.println(automotor1);
    }
}
