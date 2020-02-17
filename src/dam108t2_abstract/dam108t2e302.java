package dam108t2_abstract;
import java.util.*;

public class dam108t2e302 {
    public static void main(String[] args) {
        
        // creamos efera y calculamos volumen
        Esfera_v1 esfera = new Esfera_v1(10);
        System.out.println("El volumen de la esfera es "+esfera.volumen());
        // creamos prisma y calculamos volumen
        PrismaRectangular_v1 prisma = new PrismaRectangular_v1(5.0, 5.0, 5.0);
        System.out.println("El volumen del prisma es "+prisma.volumen());
        
    } //Fin Main
}     //Fin Class
