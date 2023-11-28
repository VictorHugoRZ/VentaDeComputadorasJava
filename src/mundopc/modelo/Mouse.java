package mundopc.modelo;

public class Mouse extends DispositivoEntrada{
    private final int idMouse;
    private static int contadorMouses;

    //Constructor
    public Mouse(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        idMouse = ++contadorMouses;
    }

    //Sobre escribimos el metodo toString();
    @Override
    public String toString() {
        return "Mouse{" +
                "idMouse=" + idMouse +
                "} " + super.toString();
    }
}
