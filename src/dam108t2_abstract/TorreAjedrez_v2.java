package dam108t2_abstract;

public class TorreAjedrez_v2 extends PiezaAjedrez {
    public static char simbolo;
    
    TorreAjedrez_v2(){
        simbolo = 'T';
    }
    
    @Override
    public boolean mover(int f, int c){
        if(validarPos(f,c)){
            
            if( (fila == f && columna != c )||( fila != f && columna == c  ) ) {
                this.fila = f;
                this.columna = c;
                return true;
            }
            else return false;
        }
        else return false;
    } // fin mover
    
} // fin class TorreAjedrez
