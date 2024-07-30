package panini;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FiguritaTest {
    private Administrador admin;
    private UsuarioFinal usuario;
    private Figurita figurita;

    @Before
    public void setUp() {
        admin = new Administrador();
        usuario = new UsuarioFinal();
        figurita = new Figurita("ARG10", 'A', "Lionel Messi", 100.0);
    }

    @Test
    public void queSePuedaCrearUnaFigurita() {
        assertNotNull(figurita);
    }

    @Test
    public void queSePuedaCrearUnAdministrador() {
        assertNotNull(admin);
    }

    @Test
    public void queSePuedaCrearUnUsuarioFinal() {
        assertNotNull(usuario);
    }

    @Test
    public void queUnAdministradorPuedaAgregarUnaFigurita() throws Exception {
        admin.agregarFigurita(figurita);
        assertTrue(admin.figuritas.contains(figurita));
    }

    @Test
    public void queUnUsuarioFinalPuedaAgregarUnaFigurita() {
        usuario.agregarFigurita(figurita);
        assertTrue(usuario.figuritas.contains(figurita));
    }

    @Test(expected = Exception.class)
    public void queUnAdministradorNoPuedaAgregarUnaFiguritaExistente() throws Exception {
        admin.agregarFigurita(figurita);
        admin.agregarFigurita(figurita);
    }

    @Test
    public void queUnUsuarioFinalSiPuedaAgregarFiguritasExistentes() {
        usuario.agregarFigurita(figurita);
        usuario.agregarFigurita(figurita);
        assertEquals(1, usuario.figuritas.size());
    }

    @Test
    public void queUnUsuarioFinalPuedaPegarUnaFigurita() throws Exception {
        usuario.agregarFigurita(figurita);
        usuario.pegarFigurita(figurita);
        assertFalse(usuario.figuritas.contains(figurita));
    }

    @Test(expected = Exception.class)
    public void queUnUsuarioFinalNoPuedaPegarUnaFiguritaRepetida() throws Exception {
        usuario.agregarFigurita(figurita);
        usuario.pegarFigurita(figurita);
        usuario.pegarFigurita(figurita);
    }

    @Test(expected = Exception.class)
    public void queNoSePuedaIntercambiarUnaFiguritaDeUnUsuarioQueNoLaTenga() throws Exception {
        UsuarioFinal otroUsuario = new UsuarioFinal();
        usuario.intercambiarFigurita(figurita, otroUsuario);
    }

    @Test(expected = Exception.class)
    public void queNoSePuedaIntercambiarUnaFiguritaDeUnUsuarioQueYaLaHayaPegado() throws Exception {
        usuario.agregarFigurita(figurita);
        usuario.pegarFigurita(figurita);
        UsuarioFinal otroUsuario = new UsuarioFinal();
        usuario.intercambiarFigurita(figurita, otroUsuario);
    }
}

