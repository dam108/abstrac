package dam108t2_abstract;
import java.util.*;

public class dam108t2e301 {
    public static void main(String[] args) {
        ArrayList <Figura2D_v9> figuras = new ArrayList<>();
        double total = 0;
        
        figuras.add(new TrianColor_v9(10,15,"rectangulo","rojo","pepe"));
        figuras.add(new TrianColor_v9(20,15,"rectangulo","verde","juan"));
        figuras.add(new TrianColor_v9(5,10,"rectangulo","azul","david"));
        figuras.add(new Triangulo_v9(10, 20,"equilatero","carlos"));
        figuras.add(new Triangulo_v9(25, 30,"equilatero","ivan"));
        figuras.add(new Rectangulo_v9(10,"jorge"));
        figuras.add(new Rectangulo_v9(9, 8,"dionisio"));
        
        for(Figura2D_v9 i: figuras){
           total += i.precio(10);
        }
        
        System.out.println("Precio total: "+total+"€.");
        
    } //Fin Main
}     //Fin Class
