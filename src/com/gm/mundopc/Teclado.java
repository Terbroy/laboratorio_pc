package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado (String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    public int getIdTeclado() {
        return this.idTeclado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teclado{");
        sb.append("idTeclado=").append(this.idTeclado);
        sb.append("marca=").append(this.getMarca());
        sb.append("tipo de entrada=").append(this.getTipoEntrada());
        sb.append('}');
        return sb.toString();
    }
}