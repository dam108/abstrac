package dam108t2_abstract;

public class BallenaAzul implements Nadador {
        public int edad;
        public int VEL_MAYOR;
        public int VEL_MENOR;
    BallenaAzul(int ed){
        this.edad = ed;
        this.VEL_MAYOR = 10;
        this.VEL_MENOR = 13;
    }
    
    public double nadar(int metros){
        double metrosSegundo;
        double segundos;
        if(edad > 5){
            metrosSegundo = this.VEL_MAYOR / 3.6;
            // sacamos los segundos
            segundos = metros /metrosSegundo;
            return segundos;
        }
        else {
            metrosSegundo = this.VEL_MENOR / 3.6;
            // sacamos los segundos
            segundos = metros /metrosSegundo;
            return segundos;
        }
    }
}
