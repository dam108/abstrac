package dam108t2_abstract;

public class TriAtleta_v2b implements Ciclista_v2, Nadador_v2, Saltador_v2 {
    public double edad;
    
    TriAtleta_v2b (double ed){
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
    
    @Override
    public boolean saltaPertiga(int alturaCm){
        if (alturaCm > 600) return false;
        else if(alturaCm < 600 && alturaCm > 500){
            int n = (int) (Math.random()* 2);
            if(n == 0)return false;
            else return true;
        }
        else return true;
    }

}
