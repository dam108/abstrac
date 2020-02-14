package dam108t2_abstract;

public class Triangulo_v9 extends Figura2D_v9 {
    public String estilo;
    
    /* CONSTRUCTOR HIJO */
    Triangulo_v9(){
        this.estilo = null;
    }
    Triangulo_v9(double al, String nom){
        super(al, nom);
        this.estilo = "igual Base Altura";
    }
    Triangulo_v9(double al, double an, String es, String nom){
        super(al, an, nom);
        this.estilo = es;
    }
    Triangulo_v9(Triangulo_v9 obj){
        this(obj.alto , obj.ancho, obj.estilo, obj.nombre);
    }
    public void verEstilo(){
        System.out.println(estilo);
    }
    public String getEstilo(){
        return this.estilo;
    }
    
    public double area(){
        return ( this.alto * this.ancho )/2;
    }
    
}
