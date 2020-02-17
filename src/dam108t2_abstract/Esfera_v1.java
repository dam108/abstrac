package dam108t2_abstract;

public class Esfera_v1 extends Figura3D_v1{
    public double diametro;
    public double radio;
    
    /* CONSTRUCTOR */
    Esfera_v1(double diam){
        super("Esfera");
        this.diametro = diam;
        this.radio = diametro / 2;
    }
    
    /* MÉTODOS */
    @Override
    public double volumen(){
        double vol;
        double radioCubo = (radio*radio*radio);
        vol = radioCubo * Math.PI * (1.33333333);
        return vol;
    }
}
