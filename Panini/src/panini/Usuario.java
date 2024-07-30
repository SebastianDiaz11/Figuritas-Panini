package panini;

import java.util.HashSet;
import java.util.Set;

public abstract class Usuario {
    protected Set<Figurita> figuritas;

    public Usuario() {
        this.figuritas = new HashSet<>();
    }

    public abstract void agregarFigurita(Figurita figurita) throws Exception;
}
