package dam108t2_abstract;
import java.util.*;

public class dam108t2e309 {

    public static void main(String[] args) {
        Delfin delfin1 = new Delfin();
        Delfin delfin2 = new Delfin();
        BallenaAzul ballena1 = new BallenaAzul(15);
        BallenaAzul ballena2 = new BallenaAzul(3);
        TriAtleta atleta1 = new TriAtleta(45);
        TriAtleta atleta2 = new TriAtleta(20);
        TriAtleta atleta3 = new TriAtleta(35);
        TriAtleta atleta4 = new TriAtleta(55);
        
        System.out.println("Segundos nadar delfin 1: " +delfin1.nadar(600));
        System.out.println("Segundos nadar delfin 2: " +delfin2.nadar(100));
        System.out.println("Segundos nadar ballena 1: " +ballena1.nadar(800));
        System.out.println("Segundos nadar ballena 2: " +ballena2.nadar(500));
        System.out.println("Segundos nadar atleta 1: " + atleta1.nadar(2000));
        System.out.println("Segundos recorrer atleta 1: " + atleta1.recorrer(5, "Playa") );
        System.out.println("centimetros saltar atleta 1: " + atleta1.nadar(2000));
        
        System.out.println("Segundos nadar atleta 2: " + atleta2.nadar(2000));
        System.out.println("Segundos recorrer atleta 2: " + atleta2.recorrer(5, "Playa") );
        System.out.println("centimetros saltar atleta 2: " + atleta2.nadar(2000));
        
        System.out.println("Segundos nadar atleta 3: " + atleta3.nadar(2000));
        System.out.println("Segundos recorrer atleta 3: " + atleta3.recorrer(5, "Playa") );
        System.out.println("centimetros saltar atleta 3: " + atleta3.nadar(2000));
        
        System.out.println("Segundos nadar atleta 4: " + atleta4.nadar(2000));
        System.out.println("Segundos recorrer atleta 4: " + atleta4.recorrer(5, "Playa") );
        System.out.println("centimetros saltar atleta 4: " + atleta4.nadar(2000));
        
        
        
     
    } // Fin main
}