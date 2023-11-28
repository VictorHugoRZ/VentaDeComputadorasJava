package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Mouse;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaDeComputadorasApp {
    public static void main(String[] args) {
    //Creacion de objetos de prueba
        Mouse mouseLenovo = new Mouse("Bluetooth", "Lenovo");
        //Mouse{idMouse=1} DispositivoEntrada{tipoDeEntrada='Bluetooth', marca='Lenovo'}

        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        //Teclado{idTeclado=1} DispositivoEntrada{tipoDeEntrada='Bluetooth', marca='Lenovo'}

        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        //Monitor{idMonitor=1, marca='Lenovo', tamanio=27.0}

        //Creamos un objeto de la clase Computadora;
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, mouseLenovo);
        //Computadora{idComputadora=1, nombre='Computadora Lenovo',
        //monitor=Monitor{idMonitor=1, marca='Lenovo', tamanio=27.0},
        //teclado=Teclado{idTeclado=1} DispositivoEntrada{tipoDeEntrada='Bluetooth', marca='Lenovo'},
        //mouse=Mouse{idMouse=1} DispositivoEntrada{tipoDeEntrada='Bluetooth', marca='Lenovo'}}

        //Computadora 2;
        Mouse mouseHp = new Mouse("Bluetooth", "HP");
        Teclado tecladoHp = new Teclado("Bluetooth", "HP");
        Monitor monitorHp = new Monitor("HP", 32);
        Computadora computadoraHp = new Computadora("Computadora HP", monitorHp, tecladoHp, mouseHp);

        //Computadora 3;
        Mouse mouseDell = new Mouse("Bluetooth", "Dell");
        Teclado tecladoDell = new Teclado("Bluetooth", "Dell");
        Monitor monitorDell = new Monitor("Dell", 32);
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, mouseDell);

        //Creamos ordenes
        //Orden 1;
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

        //Orden 2;
        Orden orden2 =  new Orden();
        orden2.agregarComputadora(computadoraHp);
        orden2.agregarComputadora(computadoraLenovo);
        orden2.mostrarOrden();

    }
}