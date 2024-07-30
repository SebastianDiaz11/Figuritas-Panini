package panini;

public class Administrador extends Usuario {
    @Override
    public void agregarFigurita(Figurita figurita) throws CodigoExistenteException {
        if (figuritas.contains(figurita)) {
            throw new CodigoExistenteException("CodigoExistente");
        }
        figuritas.add(figurita);
    }
}


