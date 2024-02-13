package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Raton raton1 = new Raton( "Bluetooth", "hp");
        Teclado teclado1 = new Teclado("Bluetooth", "hp");
        Monitor monitor1 = new Monitor("hp", 1420);
        Computadora supercomputadora = new Computadora("pc gamer", monitor1, teclado1, raton1);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(supercomputadora);
        orden1.mostrarOrden();


    }
}
