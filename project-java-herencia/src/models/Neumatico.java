package models;

public class Neumatico extends ComponenteVehicular {
    int tamaño;
    double presion;

    public Neumatico(String codigo, String fabricante, int tamaño, double presion) {
        super(codigo, fabricante);
        this.tamaño = tamaño;
        this.presion = presion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tamaño: " + tamaño + " pulgadas");
        System.out.println("Presión: " + presion + " PSI");
    }

    public void verificarPresion() {
        if (presion >= 30 && presion <= 35) {
            System.out.println("Presión óptima.");
        } else {
            System.out.println("Presión fuera del rango recomendado.");
        }
    }
}
