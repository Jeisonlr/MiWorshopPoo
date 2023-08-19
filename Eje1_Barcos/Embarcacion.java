package Eje1_Barcos;

public abstract class Embarcacion {
    protected Capitan capitan;
    protected double precioBase;
    protected double valorAdicional;
    protected int añoFabricacion;
    protected double eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int añoFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.añoFabricacion = añoFabricacion;
        this.eslora = eslora;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public abstract double calcularMontoAlquiler();
}