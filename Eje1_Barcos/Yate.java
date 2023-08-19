package Eje1_Barcos;
class Yate extends Embarcacion {
    private int cantidadCamarotes;
    public boolean comprado;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int añoFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, añoFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
        this.comprado = false;
    }
    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }
    public void setCantidadCamarotes(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public boolean esMayorLujo() {
        boolean mayorLujo = cantidadCamarotes > 7;
        if (mayorLujo) {
            System.out.println("Yate de Lujo.");
        } else {
            System.out.println(" Yate Sencillo.");
        }
        return mayorLujo;
    }
    public void comprar() {
        if (!comprado) {
            System.out.println("Se ha comprado el yate con " + cantidadCamarotes + " camarotes.");
            comprado = true;
        } else {
            System.out.println("El yate ya había sido comprado anteriormente.");
        }
    }

    public boolean estaComprado() {
        return comprado;
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
