package models;

public class Transmision extends ComponenteVehicular {
    String tipo;
    int marchas;

    public Transmision(String codigo, String fabricante, String tipo, int marchas) {
        super(codigo, fabricante);
        this.tipo = tipo;
        this.marchas = marchas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
        System.out.println("Número de marchas: " + marchas);
    }

    public void cambiarMarcha(int marcha) {
        if (marcha > 0 && marcha <= marchas) {
            System.out.println("Cambiando a la marcha " + marcha + "...");
        } else {
            System.out.println("Marcha inválida.");
        }
    }
}
