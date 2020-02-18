package dam108t2_abstract;
import java.util.*;

public class dam108t2e305 {
    public static AlfilAjedrez alfil;
    public static TorreAjedrez torre;
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        torre = new TorreAjedrez();
        alfil = new AlfilAjedrez();
        int opc, n = 0, fi, co;
        boolean mover;
        do{
            System.out.println("1. para mover la torre\n2. Para mover el Alfil.\n0. Para salir");
            opc = teclado.nextInt();
            switch (opc){
                case 1: 
                    do {
                        System.out.println("1. Para mover\n0. Para Salir");
                        n = teclado.nextInt();
                        if(n != 0){
                            System.out.println("Introduce la Fila (0,7)");
                            fi = teclado.nextInt();
                            System.out.println("Introduce la Columna (0,7)");
                            co =  teclado.nextInt();
                            mover = torre.mover(fi, co);
                            if (mover) pintar(fi, co, opc);
                            else System.out.println("No se ha podido mover la torre a esas casillas");
                        }
                    }while(n != 0);
                    break;
                case 2:
                    do {
                        System.out.println("1. Para mover\n0. Para Salir");
                        n = teclado.nextInt();
                        if(n != 0){
                           System.out.println("Introduce la Fila (0,7)");
                            fi = teclado.nextInt();
                            System.out.println("Introduce la Columna (0,7)");
                            co =  teclado.nextInt();
                            mover = alfil.mover(fi, co);
                            if (mover) pintar(fi, co, opc);
                            else System.out.println("No se ha podido mover la torre a esas casillas"); 
                        }
                    }while(n != 0);
                    break;
            }
            resetearPiezas();
        } while(opc != 0);

        
    } // Fin main
    
    public static void pintar(int f, int c, int opc){
        char pieza = 'P';
        if (opc == 1 ) pieza = torre.simbolo;
        else if (opc == 2 ) pieza = alfil.simbolo;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (f == i && c == j ) System.out.print(" "+ pieza+ " ");
                else System.out.print(" * ");
            }
            System.out.println();

        }
    }
    
    public static void resetearPiezas(){
        torre.columna = 0;
        torre.fila = 0;
        alfil.columna = 0;
        alfil.fila = 0;
    }
}     //Fin Class