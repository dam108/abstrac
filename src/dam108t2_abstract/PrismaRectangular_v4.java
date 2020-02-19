package dam108t2_abstract;

public class PrismaRectangular_v4 implements Figura3D_v4{
    public double alto;
    public double ancho;
    public double fondo;
    public String nombre;
    
    /* CONSTRUCTOR */
    PrismaRectangular_v4(double al, double an, double fo){
        this.alto = al;
        this.ancho = an;
        this.fondo = fo;
        nombre = "Prisma Rectangular";
    }
    
    /* MÉTODOS */
    @Override
    public double volumen(){
        double vol;
        vol = this.alto * this.ancho * this.fondo;
        return vol;
    }
    
    @Override
    public double superficie(){
        double sup;
        sup = 2 * ( ( ancho * fondo ) + ( ancho * alto ) + ( alto * fondo ) );
        return sup;
    }
}
