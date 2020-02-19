package dam108t2_abstract;

public class Esfera_v3 implements Figura3D_v3{
    public double radio;
    public String nombre;
    
    /* CONSTRUCTOR */
    Esfera_v3(double rad){
        nombre = "Esfera";
        this.radio = rad;
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
