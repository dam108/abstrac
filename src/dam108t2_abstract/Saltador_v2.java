package dam108t2_abstract;

interface Saltador_v2 {
    double saltarAltura();
    default boolean saltaPertiga(int alturaCm) {
        return false;
    }
}

