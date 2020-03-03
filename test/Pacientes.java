
public abstract class Pacientes implements Facturable {
        public String dni;
        public abstract int facturar();
        
    Pacientes(String d){
        this.dni = d;
    }
    
    @Override
    public boolean equals (Object obj){
        if (obj == null) return false;
        if (obj == this ) return true;
        if (!(obj instanceof Pacientes)) return false;
        Pacientes o = (Pacientes) obj;
        if (o.dni.equals(this.dni)) return true;
        return false;
    }
}