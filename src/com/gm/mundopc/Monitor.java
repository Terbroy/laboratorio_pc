package com.gm.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;

    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    public Monitor (String marca, double tamano){
        this();
        this.tamano = tamano;
        this.marca = marca;
    }

    private String getMarca() {
        return this.marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    private double getTamano() {
        return this.tamano;
    }

    private void setTamano(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Monitor{");
        sb.append("idMonitor=").append(this.idMonitor);
        sb.append(", marca=").append(this.marca);
        sb.append(", tamano=").append(this.tamano);
        sb.append('}');
        return sb.toString();
    }
}
