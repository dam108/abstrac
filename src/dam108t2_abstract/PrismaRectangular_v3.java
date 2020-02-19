package dam108t2_abstract;

public class PrismaRectangular_v3 implements Figura3D_v3{
    public double alto;
    public double ancho;
    public double fondo;
    public String nombre;
    
    /* CONSTRUCTOR */
    PrismaRectangular_v3(double al, double an, double fo){
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
}
