package dam108t2_abstract;

public class PrismaRectangular_v2 extends Figura3D_v2{
    
    /* CONSTRUCTOR */
    PrismaRectangular_v2(double al, double an, double fo){
        super(al, an, fo, "Prisma Rectangular");
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
