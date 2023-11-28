package mundopc.servicio;

import mundopc.modelo.Computadora;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private final int idOrden;
    private final List<Computadora> computadoras;
    private static int contadorOrdenes;

    //Constructor publico
    public Orden() {
        this.idOrden = ++contadorOrdenes;
        computadoras = new ArrayList<>();
    }

    //Metodo para agregar computadoras a la orden;
    public void agregarComputadora(Computadora computadora) {
        computadoras.add(computadora);
    }

    //Metodo para mostrar los datos de la orden;
    public void mostrarOrden() {
        System.out.println("Orden #: " + idOrden);
        System.out.println("Total de computadoras en la orden: " + computadoras.size());
        computadoras.forEach(System.out::println);
    }


    //Sobre escribimos el metodo toString;
    @Override
    public String toString() {
        return "Orden{" +
                "idOrden=" + idOrden +
                ", computadoras=" + computadoras +
                '}';
    }
}
