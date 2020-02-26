package dam108t2_abstract;
import java.util.*;

public class dam108t2e310 {

    public static void main(String[] args) {
        TriAtleta_v2 atleta1 = new TriAtleta_v2(35);
        TriAtleta_v2b atleta2 = new TriAtleta_v2b(35);
         
        System.out.println("salto de 100 cm atleta 1: " + atleta1.saltaPertiga(100));
        System.out.println("salto de 550 cm atleta 1: " + atleta1.saltaPertiga(550));
        System.out.println("salto de 560 cm atleta 1: " + atleta1.saltaPertiga(560));
        System.out.println("salto de 580 cm atleta 1: " + atleta1.saltaPertiga(580));
        System.out.println("salto de 700 cm atleta 1: " + atleta1.saltaPertiga(700));
        
        System.out.println("salto de 100 cm atleta 2: " + atleta2.saltaPertiga(100));
        System.out.println("salto de 550 cm atleta 2: " + atleta2.saltaPertiga(550));
        System.out.println("salto de 560 cm atleta 2: " + atleta2.saltaPertiga(560));
        System.out.println("salto de 580 cm atleta 2: " + atleta2.saltaPertiga(580));
        System.out.println("salto de 700 cm atleta 2: " + atleta2.saltaPertiga(700));

    } // Fin main
}