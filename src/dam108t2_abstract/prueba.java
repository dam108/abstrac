package dam108t2_abstract;
public class prueba {
    public static void main(String[] args) {
        int vel;
        
        for (int i = 0; i < 1000; i++) {
            vel = (int)(Math.random() * 30 )+ 40;
            if (vel <41) System.out.println(vel);
            if (vel >68) System.out.println(vel);
        }
    }
    
}
