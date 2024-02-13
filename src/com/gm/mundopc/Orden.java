package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int  contadorComputadoras;
    private int maxComputadoras = 5;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[this.maxComputadoras];
    }

    public void agregarComputadora(Computadora computadora){
        if( this.contadorComputadoras < this.maxComputadoras){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
    }

    public void mostrarOrden(){
        for (int i = 0; i < this.maxComputadoras ; i++) {
            if (computadoras[i] != null) {
                System.out.println(computadoras[i]);
            }
        }
    }

}
