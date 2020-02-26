package dam108t2_abstract;
/* PREGUNTAR QUE SE QUIERE HACER AQUI */
/* NOSE SI ES ESTO LO QUE SE PIDE O NO */
interface Moviles {
    default boolean efecturaLlamada(int segs){
        return false;
    }
    boolean recargar(int importe);
}
