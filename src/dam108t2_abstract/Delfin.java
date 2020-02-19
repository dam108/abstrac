package dam108t2_abstract;

public class Delfin implements Nadador {
    
    Delfin(){}
    
    public double nadar(int metros){
        int vDelfin = (int)(Math.random() * 30 )+ 40;
        // tenemos los km/h, sacamos los metos segundo
        double metrosSegundo = vDelfin / 3.6;
        // sacamos los segundos
        double segundos = metros /metrosSegundo;
        return segundos;
    }
}
