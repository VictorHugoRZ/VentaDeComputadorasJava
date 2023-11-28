package mundopc.modelo;

public class DispositivoEntrada {
    private String tipoDeEntrada;
    private String marca;

    //Constructores
    public DispositivoEntrada(String tipoDeEntrada, String marca) {
        this.tipoDeEntrada = tipoDeEntrada;
        this.marca = marca;
    }

    //Metodos;
    //Tipo de entrada
    //Get
    public String getTipoEntrada() {
        return tipoDeEntrada;
    }
    //Set
    public void setTipoEntrada(String tipoEntrada) {
        this.tipoDeEntrada = tipoEntrada;
    }

    //Marca
    //Get
    public String getMarca() {
        return marca;
    }
    //Set
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Sobre escribimos el metodo toString() para que nos muestre toda la informacion de nuestros objetos.
    @Override
    public String toString() {
        return "DispositivoEntrada{" +
                "tipoDeEntrada='" + tipoDeEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
