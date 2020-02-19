package dam108t2_abstract;
import java.util.*;

public class dam108t2e308 {

    public static void main(String[] args) {
       //creamos una instancia de esfera_v3 y de prismaRectangular_v3
       Esfera_v4 esfera = new Esfera_v4(10);
       PrismaRectangular_v4 prisma = new PrismaRectangular_v4(5, 10, 3);
       Cilindro_v4 cilindro = new Cilindro_v4(10, 5);
       
       double sesfera = esfera.superficie();
       double sprisma = prisma.superficie();
       double scilindro = cilindro.superficie();
       
        System.out.printf("La esfera tiene %.2f de superficie , el prisma %.2f de superficie y cilindro %.2f de superficie\n", sesfera, sprisma, scilindro);
 
    } // Fin main
}