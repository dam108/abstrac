package dam108t2_abstract;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.SECONDS;

public class Hdoble extends Habitacion{
    public boolean Hdoble;
    
    Hdoble(){
        this.coste = 100.0;
        this.fechaDeIngreso = LocalDateTime.now().toLocalTime();
        this.ocupada = false;
        this.Hdoble = true;
    }
    
    Hdoble(boolean oc){
        this.coste = 100.0;
        this.fechaDeIngreso = LocalDateTime.now().toLocalTime();
        this.ocupada = oc;
        this.Hdoble = true;
    }
    
    public double calcularprecio(){
        LocalTime fechaSalida = LocalDateTime.now().toLocalTime();
        long dias = Math.abs(SECONDS.between(this.fechaDeIngreso, fechaSalida));
        LocalDate today = LocalDate.now();
        double precio = 0;
        if(today.getMonthValue() == 4 || today.getMonthValue() == 7 || today.getMonthValue() == 8 ){
            precio = this.coste + (this.coste * 20 /100 );
            precio = precio * dias;
            return precio;
        }
        else{
            precio = this.coste;
            precio = precio * dias;
            return precio;
        }
    }
    
}
