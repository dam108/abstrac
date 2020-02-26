package dam108t2_abstract;

public class MovilTarifaPlana_v2 extends MovilPrepago_v2 implements Moviles {

    MovilTarifaPlana_v2(long nM, float cEL, float cML, float cMB, float s){
        super(nM, cEL, cML, cMB, s);
    }
    
    @Override
    public void navegar(int mB){
        /*super.setSaldo(super.consultarSaldo());*/
        super.navegar(mB * 0);
    }
}
