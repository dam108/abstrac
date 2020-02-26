package dam108t2_abstract;

public class MovilPlus_v2 extends MovilPrepago_v2 implements Moviles {
    private float costeEstablecLlamada = 0f;
    
    MovilPlus_v2(long nM, float cML, float cMB, float s){
        super(nM, 0f, cML, cMB, s);
        
    }
    public void videollamada (int segs){
        super.navegar(segs * 2);
    }
}
