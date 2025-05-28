import models.Chasis;
import models.ComponenteVehicular;
import models.Motor;
import models.Neumatico;
import models.SistemaFrenos;
import models.Transmision;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    ComponenteVehicular myComponenteVehicular = new ComponenteVehicular("L0L", "Toyota");
    
    Motor motor = new Motor("M001", "Bosch", 4, 120);
    Transmision transmision = new Transmision("T001", "ZF", "Automática", 6);
    Neumatico neumatico = new Neumatico("N001", "Michelin", 17, 32.5);
    Chasis chasis = new Chasis("C001", "Toyota", "Monocasco", 250.0);
    SistemaFrenos frenos = new SistemaFrenos("F001", "Brembo", true, "Discos ventilados");
}
