package dam108t2_abstract;

public abstract class PiezaAjedrez {
    public char simbolo;
    public int fila;
    public int columna;
    public final int MIN_F_C = 0;
    public final int MAX_F_C = 7;
    public abstract boolean mover(int f, int c);
    
    PiezaAjedrez(){
        this.simbolo = 'P';
        this.fila = 0;
        this.columna = 0;
    }
    
    public boolean validarPos(int f, int c){
        if ((f >= MIN_F_C && f <= MAX_F_C) && (c >= MIN_F_C && c <= MAX_F_C) ){
            return true;
        }
        return false;
    }

} // fin PiedraAjedrez
