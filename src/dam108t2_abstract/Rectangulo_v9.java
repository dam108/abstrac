package dam108t2_abstract;

public class Rectangulo_v9 extends Figura2D_v9 {
    
    Rectangulo_v9(){}
    Rectangulo_v9(double al, String nom){
        super(al, nom);
    }
    Rectangulo_v9(double al, double an, String nom){
        super(al, an, nom);
    }
    
    public boolean esCuadrado(){
        if (this.ancho == this.alto) return true;
        else return false;
    }
    
    @Override
    public double area(){
        return this.alto * this.ancho;
    }
}
