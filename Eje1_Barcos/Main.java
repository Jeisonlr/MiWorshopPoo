package Eje1_Barcos;


    public class Main {
        public static void main(String[] args) {
            Capitan capitanVelero = new Capitan("Richard", "Wurmbrand", "G2345");
            Capitan capitanYate = new Capitan("Sugel", "Michelen", "M6789");

            Velero velero = new Velero(capitanVelero, 500000, 20000, 2016, 15, 5);
            velero.setCantidadMastiles(4);

            Yate yate = new Yate(capitanYate, 800000, 20000, 2023, 20, 8);
            yate.setCantidadCamarotes(12);

            System.out.println("Información del Velero:");
            System.out.println("Nombre del capitán: " + velero.getCapitan().getNombre() + " " + velero.getCapitan().getApellido());
            System.out.println("Cantidad de mástiles: " + velero.getCantidadMastiles());
            System.out.println("Monto de alquiler: " + velero.calcularMontoAlquiler());
            velero.esGrande();
            System.out.println();

            System.out.println("Información del Yate:");
            System.out.println("Nombre del capitán: " + yate.getCapitan().getNombre() + " " + yate.getCapitan().getApellido());
            System.out.println("Cantidad de camarotes: " + yate.getCantidadCamarotes());
            System.out.println("Monto de alquiler: " + yate.calcularMontoAlquiler());
            yate.esMayorLujo();
            yate.comprar();
        }
    }