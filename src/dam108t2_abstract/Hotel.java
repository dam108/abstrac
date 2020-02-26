package dam108t2_abstract;
import java.util.*;

public class Hotel {
    public ArrayList <Habitacion> habitaciones;
    
    Hotel(){
        habitaciones = new ArrayList<>();
        
        habitaciones.add(new Lowcost());
        habitaciones.add(new Lowcost());
        habitaciones.add(new Lowcost());
        habitaciones.add(new Hdoble());
        habitaciones.add(new Hdoble());
        habitaciones.add(new Hdoble());
        habitaciones.add(new Hdoble());
        habitaciones.add(new Hdoble());
        habitaciones.add(new Hdoble());
        habitaciones.add(new Hdoble());
        habitaciones.add(new Hdoble());
        habitaciones.add(new Hdoble());
        habitaciones.add(new Hdoble());
        habitaciones.add(new Suite(0));
        habitaciones.add(new Suite(0));
        habitaciones.add(new Suite(0));
        habitaciones.add(new Suite(0));
        habitaciones.add(new Suite(0));
    }
    
}
