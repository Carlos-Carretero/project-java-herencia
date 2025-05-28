package models;

public class Motor extends ComponenteVehicular {
    int cilindros;
    int potencia;

    public Motor(String codigo, String fabricante, int cilindros, int potencia) {
        super(codigo, fabricante);
        this.cilindros = cilindros;
        this.potencia = potencia;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindros: " + cilindros);
        System.out.println("Potencia: " + potencia + " HP");
    }

    public void encenderMotor() {
        System.out.println("Motor encendido con " + cilindros + " cilindros y " + potencia + " HP.");
    }
}
