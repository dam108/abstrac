package dam108t2_abstract;
public abstract class Figura3D_v2 {
    public double ancho;
    public double alto;
    public double fondo;
    public String nombre;
    public abstract double volumen();
    public abstract double superficie();

    
    /* CONSTRUCTOR PADRE */
    
    Figura3D_v2(){
        this.alto = 0; this.ancho = 0;this.fondo = 0;
        this.nombre = null;
    }
    Figura3D_v2(String nom){
        this.alto = 0; this.ancho = 0;this.fondo = 0;
        this.nombre = nom;
    }
    Figura3D_v2(double al, String nom){
        this.alto = al; this.ancho = al; this.fondo = al; this.nombre = nom;
    }
    Figura3D_v2(double al, double an, double fo, String nom){
        this.alto = al; this.ancho = an; this.fondo = fo; this.nombre = nom;
    }
    Figura3D_v2(Figura3D_v2 obj){
        this(obj.alto, obj.ancho, obj.fondo, obj.nombre);
    }
    
    public void verDim(){
        System.out.printf("El alto es %.2f , el ancho es %.2f y el fondo es %.2f \n", this.alto, this.ancho, this.fondo);
    }
}
