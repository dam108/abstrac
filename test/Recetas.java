
public class Recetas extends Pacientes {
    public int cantRecetas;
    public final int PREICIO_RECETA;
    Recetas(String d, int r){
        super(d);
        this.cantRecetas = r;
        this.PREICIO_RECETA = 5;
    }
    
    @Override
    public int facturar(){
        int precio;
        precio = this.PREICIO_RECETA * this.cantRecetas;
        
        return precio;
    }
    
    
}
