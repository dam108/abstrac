package dam108t2_abstract;
import java.util.*;

public class dam108t2e307 {

    public static void main(String[] args) {
       //creamos una instancia de esfera_v3 y de prismaRectangular_v3
       Esfera_v3 esfera = new Esfera_v3(10);
       PrismaRectangular_v3 prisma = new PrismaRectangular_v3(5, 10, 3);
       
       double vesfera = esfera.volumen();
       double vprisma = prisma.volumen();
       
        System.out.printf("La esfera tiene %.2f de volumen y el prisma %.2f de volumen\n", vesfera, vprisma);
 
    } // Fin main
}