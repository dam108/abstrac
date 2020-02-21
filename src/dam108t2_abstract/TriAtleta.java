package dam108t2_abstract;

public class TriAtleta implements Ciclista, Nadador, Saltador {
    public double edad;
    
    TriAtleta (double ed){
        this.edad = ed;
    }
    
    @Override
    public double recorrer(int km, String ter){
        double metros = km * 1000;
        double metrosSegundo, vel_alta_M = 20.0, vel_baja_M = 15.0, segundos;       

        if( edad > 40.0){
            metrosSegundo = vel_alta_M / 3.6;
            segundos = metros /metrosSegundo;
            return segundos;
        }
        else if(edad < 40.0){
            metrosSegundo = vel_baja_M / 3.6;
            segundos = metros /metrosSegundo;
            return segundos;
        }
        else return 0;
    }
    
    @Override
    public double nadar(int metros){
        double metrosSegundo, vel_alta_M = 10.0, vel_baja_M = 8.0, segundos;
        if( edad > 40.0){
            metrosSegundo = vel_alta_M / 3.6;
            segundos = metros /metrosSegundo;
            return segundos;
        }
        else if(edad < 40.0){
            metrosSegundo = vel_baja_M / 3.6;
            segundos = metros /metrosSegundo;
            return segundos;
        }
        else return 0;
    }
    
    @Override
    public double saltarAltura(){
        if( edad > 40.0){
            return 250;
        }
        else if(edad < 40.0){
            return 220;
        }
        else return 0;
    }

}
