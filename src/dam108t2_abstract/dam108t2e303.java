package dam108t2_abstract;
import java.util.*;

public class dam108t2e303 {
    public static void main(String[] args) {
    
        // creamos efera y calculamos la superficie
        Esfera_v2 esfera = new Esfera_v2(10);
        System.out.println("La superficie de la esfera es "+esfera.superficie());
        // creamos prisma y calculamos la superficie
        PrismaRectangular_v2 prisma = new PrismaRectangular_v2(5.0, 5.0, 5.0);
        System.out.println("La superficie del prisma es "+prisma.superficie());
        //creamos un cilindro y calculamos la superficie
        Cilindro_v2 cilindro = new Cilindro_v2(10.0, 3.0);
        System.out.println("La superficie del cilindro es "+cilindro.superficie());
        
    } //Fin Main
}     //Fin Class