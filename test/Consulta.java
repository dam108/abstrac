import java.time.*;
public class Consulta extends Pacientes{
    public LocalDate fechaNac;
    Consulta(String d, String fec){
        super(d);
        this.fechaNac = LocalDate.parse(fec);
    }
    
    @Override
    public int facturar(){
        LocalDate fechaHoy = LocalDate.now();
        int diff, precio;
        diff = fechaHoy.getYear() - this.fechaNac.getYear();
        if(diff >= 65) precio = 30;
        else precio = 50;
        
        return precio;
    }
    
    
    
}
