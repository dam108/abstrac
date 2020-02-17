package dam108t2_abstract;

public class Cilindro_v2 extends Figura3D_v2{
    public double radio;

    
    /* CONSTRUCTOR */
    Cilindro_v2(double al, double rad){
        super(al, 0 , 0, "cilindro");
        this.radio = rad;
    }
    
    /* MÉTODOS */
    @Override
    public double volumen(){
        double vol;
        vol = Math.PI*(radio*radio)*alto;
        return vol;
    }
    
    @Override
    public double superficie(){
        double sup;
        sup = 2*Math.PI*radio * ( radio + alto );
        return sup;
    }
    /* FALTA HACER ESTA PARTE ACORDARSE */
}
