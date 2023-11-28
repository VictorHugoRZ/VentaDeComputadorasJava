package mundopc.modelo;

public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclados;

    //Constructor
    public Teclado(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        idTeclado = ++contadorTeclados;
    }

    //Sobre escribimos el metodo toString();
    @Override
    public String toString() {
        return "Teclado{" +
                "idTeclado=" + idTeclado +
                "} " + super.toString();
    }
}
