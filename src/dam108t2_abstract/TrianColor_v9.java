package dam108t2_abstract;

public class TrianColor_v9 extends Triangulo_v9 {
    public String color;
    
    
    /* CONSTRUCCTOR */
    
    TrianColor_v9(){}
    TrianColor_v9(double al, double an,  String es, String co, String nom) {
        super(al, an, es, nom);
        this.color =  co;
    }
    /* FIN CONSTRUCCTOR */
    
    /* GETTERS Y SETTERS */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public double area(){
        return ( this.alto * this.ancho )/2;
    }
    
}
