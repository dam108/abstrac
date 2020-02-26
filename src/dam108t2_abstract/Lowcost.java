package dam108t2_abstract;
import java.time.*;
import static java.time.temporal.ChronoUnit.SECONDS;

public class Lowcost extends Habitacion {
    public boolean lowcost;
     
    Lowcost(){
        this.coste = 50.0;
        this.fechaDeIngreso = LocalDateTime.now().toLocalTime();
        this.ocupada = false;
        this.lowcost = true;
    }
    
    Lowcost(boolean oc){
        this.coste = 50.0;
        this.fechaDeIngreso = LocalDateTime.now().toLocalTime();
        this.ocupada = oc;
        this.lowcost = true;
    }
    
    
    @Override
    public boolean chekIn(){
        if(ocupada)return false;
        else {
            this.setOcupada(true);
            this.fechaDeIngreso = LocalDateTime.now().toLocalTime();
            return true;
        }
    }
    
    public double calcularprecio(){
        LocalTime fechaSalida = LocalDateTime.now().toLocalTime();
        long dias = Math.abs(SECONDS.between(this.fechaDeIngreso, fechaSalida));
        double precio = this.coste * dias;
        return precio;
    }
}
