package dam108t2_abstract;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.SECONDS;

public class Suite extends Habitacion {
    public int huespedes;
    public boolean suite;
    
    Suite(int h){
        this.huespedes = h;
        this.coste = 150.0 * huespedes;
        this.fechaDeIngreso = LocalDateTime.now().toLocalTime();
        this.ocupada = false;
        this.suite = true;
    }
    
    Suite(int h, boolean oc){
        this.huespedes = h;
        this.coste = 150.0 * huespedes;
        this.fechaDeIngreso = LocalDateTime.now().toLocalTime();
        this.ocupada = oc;
        this.suite = true;
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
