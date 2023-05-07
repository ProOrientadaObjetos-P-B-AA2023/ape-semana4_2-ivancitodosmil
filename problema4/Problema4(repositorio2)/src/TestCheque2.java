class Cliente{
    private String nombres;
    private String apellidos;
    private String cedula;

    public Cliente() {}
    public Cliente(String nombres, String apellidos, String cedula) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    @Override
    public String toString() {
        return "Cliente{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", cedula=" + cedula + '}';
    }
}

class Banco{
    private String nombrebanco;
    private int numerosucursales;

    public Banco() {}
    public Banco(String nombrebanco, int numerosucursales) {
        this.nombrebanco = nombrebanco;
        this.numerosucursales = numerosucursales;
    }

    public String getNombrebanco() {
        return nombrebanco;
    }
    public void setNombrebanco(String nombrebanco) {
        this.nombrebanco = nombrebanco;
    }
    public int getNumerosucursales() {
        return numerosucursales;
    }
    public void setNumerosucursales(int numerosucursales) {
        this.numerosucursales = numerosucursales;
    }
    @Override
    public String toString() {
        return "Banco{" + "nombrebanco=" + nombrebanco + ", numerosucursales=" + numerosucursales + '}';
    } 
}

class Cheque{
    private Cliente cliente;
    private Banco banco;
    private double valorcheque;
    private double comisionbanco;

    public Cheque() {}
    public Cheque(Cliente cliente, Banco banco, double valorcheque) {
        this.cliente = cliente;
        this.banco = banco;
        this.valorcheque = valorcheque;
    }
    
    public void calcularComisionbanco(){
        this.comisionbanco=this.valorcheque*0.00003;    
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Banco getBanco() {
        return banco;
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    public double getValorcheque() {
        return valorcheque;
    }
    public void setValorcheque(double valorcheque) {
        this.valorcheque = valorcheque;
    }
    public double getComisionbanco() {
        return comisionbanco;
    }
    public void setComisionbanco(double comisionbanco) {
        this.comisionbanco = comisionbanco;
    }
     public String toString(){
        return String.format("Cheque"+
                "\n %s"+
                "\n %s"+
                "\n Valor del Cheque: %.2f"+
                "\n Comision que Cobra el Banco: %.2f",
                this.getCliente(),this.getBanco(),this.getValorcheque(),this.getComisionbanco());
    }
}

public class TestCheque2 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente ("Ivan Patricio","Gonzalez Castro", "1105658502");
        Banco banco1 = new Banco ("Coopmego",23);
        Cheque cheque1 = new Cheque(cliente1,banco1,3000.75);
        cheque1.calcularComisionbanco();
        System.out.println(cheque1);
    }
}
