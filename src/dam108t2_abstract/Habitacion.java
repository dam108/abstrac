package dam108t2_abstract;
import java.time.*;

abstract class Habitacion implements Hab_Hotel {
    public double coste;
    public LocalTime fechaDeIngreso;
    public boolean ocupada;
    
    Habitacion(){}
    
    @Override
    public boolean estaOcupada(){
        return this.ocupada;
    }
    
    public void setOcupada(boolean a){
        this.ocupada = a;
    }
    
    public boolean chekIn(){
        if(ocupada)return false;
        else {
            this.setOcupada(true);
            this.fechaDeIngreso = LocalDateTime.now().toLocalTime();
            return true;
        }
    }
    
}
