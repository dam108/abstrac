package dam108t2_abstract;

public class AlfilAjedrez_v2 extends PiezaAjedrez_v2 {
    
    AlfilAjedrez_v2(){
        this.simbolo = 'A';
    }
    
    @Override
    public boolean mover(int f, int c){
        int diff_filas;
        int diff_columnas;
        if (validarPos(f, c)){
            diff_filas = Math.abs(fila - f);
            diff_columnas = Math.abs(columna - c);
            if(diff_filas == diff_columnas){
                this.fila = f;
                this.columna = c;
                return true;
            }
            else return false;
            
        } return false;
        
    } // fin mover
    
} // fin class AlfilAjedrez
