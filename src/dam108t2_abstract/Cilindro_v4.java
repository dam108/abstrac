package dam108t2_abstract;

public class Cilindro_v4 extends Figura3D_v2{
    public double radio;
    public double alto;
    public String nombre;

    
    /* CONSTRUCTOR */
    Cilindro_v4(double al, double rad){
        this.alto = al;
        this.nombre = "cilindro";
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
