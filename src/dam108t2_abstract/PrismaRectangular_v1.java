package dam108t2_abstract;

public class PrismaRectangular_v1 extends Figura3D_v1{
    
    /* CONSTRUCTOR */
    PrismaRectangular_v1(double al, double an, double fo){
        super(al, an, fo, "Prisma Rectangular");
    }
    
    /* MÉTODOS */
    @Override
    public double volumen(){
        double vol;
        vol = this.alto * this.ancho * this.fondo;
        return vol;
    }
}
