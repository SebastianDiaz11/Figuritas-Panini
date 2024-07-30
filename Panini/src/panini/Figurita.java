package panini;

import java.util.Objects;

public class Figurita {
    private String codigo;
    private char grupo;
    private String nombreJugador;
    private double valorMercado;

    public Figurita(String codigo, char grupo, String nombreJugador, double valorMercado) {
        this.codigo = codigo;
        this.grupo = grupo;
        this.nombreJugador = nombreJugador;
        this.valorMercado = valorMercado;
    }

    public String getCodigo() {
        return codigo;
    }

    public char getGrupo() {
        return grupo;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Figurita figurita = (Figurita) obj;
        return Objects.equals(codigo, figurita.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}

