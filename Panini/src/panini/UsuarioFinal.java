package panini;

import java.util.HashSet;
import java.util.Set;

public class UsuarioFinal extends Usuario {
    @Override
    public void agregarFigurita(Figurita figurita) {
        figuritas.add(figurita);
    }

    public void pegarFigurita(Figurita figurita) throws FiguritaNoDisponibleException, FiguritaRepetidaException {
        if (!figuritas.contains(figurita)) {
            throw new FiguritaNoDisponibleException("La figurita no está disponible en el stock.");
        }
        if (!figuritas.remove(figurita)) {
            throw new FiguritaRepetidaException("La figurita ya ha sido pegada.");
        }
    }

    public void intercambiarFigurita(Figurita figurita, UsuarioFinal otroUsuario) throws FiguritaNoDisponibleException, FiguritaRepetidaException {
        if (!figuritas.contains(figurita)) {
            throw new FiguritaNoDisponibleException("La figurita no está disponible en el stock.");
        }
        if (!figuritas.remove(figurita)) {
            throw new FiguritaRepetidaException("La figurita ya ha sido pegada.");
        }
        otroUsuario.agregarFigurita(figurita);
    }
}

