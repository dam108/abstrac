package dam108t2_abstract;

public class BallenaAzul_v2 implements Nadador_v2 {
        public int edad;
        public int VEL_MAYOR;
        public int VEL_MENOR;
    BallenaAzul_v2(int ed){
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
