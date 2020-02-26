package dam108t2_abstract;

interface Hab_Hotel {
    boolean estaOcupada();
    boolean chekIn();
    static double checkOut(Habitacion n){
        double precio = 0;
        if(n instanceof Lowcost){
            precio = ((Lowcost) n).calcularprecio();
            ((Lowcost) n).ocupada = false;
            ((Lowcost) n).fechaDeIngreso = null;
        }
        if(n instanceof Hdoble){
            precio = ((Hdoble) n).calcularprecio();
            ((Hdoble) n).ocupada = false;
            ((Hdoble) n).fechaDeIngreso = null;
        }
        if(n instanceof Suite){
            precio = ((Suite) n).calcularprecio();
            ((Suite) n).ocupada = false;
            ((Suite) n).fechaDeIngreso = null;
        }
        return precio;
    }
    
}
