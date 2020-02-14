package dam108t2_abstract;
public abstract class Figura2D_v9 {
    public double ancho;
    public double alto;
    public String nombre;
    public abstract double area();
    
    /* CONSTRUCTOR PADRE */
    
    Figura2D_v9(){
        this.alto = 0; this.ancho = 0;
        this.nombre = null;
    }
    Figura2D_v9(double al, String nom){
        this.alto = al; this.ancho = al; this.nombre = nom;
    }
    Figura2D_v9(double al, double an, String nom){
        this.alto = al; this.ancho = an; this.nombre = nom;
    }
    Figura2D_v9(Figura2D_v9 obj){
        this(obj.alto, obj.ancho, obj.nombre);
    }
    
    public double precio(double precioMetroCuadrado){
        double total;
        total = area() * precioMetroCuadrado;
        return total;
    }

    public void verDim(){
        System.out.printf("El alto es %.2f y el ancho es %.2f \n", this.alto, this.ancho);
    }
   
}
