package Eje1_Barcos;

public class Velero extends Embarcacion {
    private int cantidadMastiles;
    public int getCantidadMastiles() {
        return cantidadMastiles;
    }
    public void setCantidadMastiles(int cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }
    public Velero(Capitan capitan, double precioBase, double valorAdicional, int añoFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, añoFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }
    public boolean esGrande() {
        boolean grande = cantidadMastiles > 4;
        if(grande){
            System.out.println("Haz alquilado un Velero Grande.");
        }else {
            System.out.println("Haz alquilado un Velero pequeño.");
        }return grande;
    }
    @Override
    public double calcularMontoAlquiler() {
        double monto = precioBase;
        if (añoFabricacion > 2020) {
            monto = monto + valorAdicional;
        }
        return monto;
    }
}