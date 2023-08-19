package Eje2_Parqueaderos;





public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(2000.0);

        System.out.println("Estado actual del parqueadero:");
        parqueadero.mostrarEstadoParqueadero();

        Carro carro1 = new Carro("ABC123", "Toyota", "Corolla");
        Carro carro2 = new Carro("DEF456", "Honda",  "HR-V");
        Carro carro3 = new Carro("GHI789", "Ford",   "Fiesta");
        Carro carro4 = new Carro("JKL789", "Suzuki", "Vitara");

        parqueadero.parquearCarro(carro1, 0, 0);
        System.out.println("Estado actual del parqueadero:");
        parqueadero.mostrarEstadoParqueadero();
        parqueadero.parquearCarro(carro2, 2, 2);
        System.out.println("Estado actual del parqueadero:");
        parqueadero.mostrarEstadoParqueadero();
        parqueadero.parquearCarro(carro3, 3, 1);
        System.out.println("Estado actual del parqueadero:");
        parqueadero.mostrarEstadoParqueadero();
        parqueadero.parquearCarro(carro4, 0, 0);
        System.out.println("Estado actual del parqueadero:");
        parqueadero.mostrarEstadoParqueadero();


        double costoCarro1 = parqueadero.cobrarPorTiempo(carro1, 3);
        double costoCarro2 = parqueadero.cobrarPorTiempo(carro2, 2);
        double costoCarro3 = parqueadero.cobrarPorTiempo(carro3, 8);
        double costoCarro4 = parqueadero.cobrarPorTiempo(carro4, 4);

        System.out.println("Costo de estacionamiento para " + carro1 + ": $" + costoCarro1);
        System.out.println("Costo de estacionamiento para " + carro2 + ": $" + costoCarro2);
        System.out.println("Costo de estacionamiento para " + carro3 + ": $" + costoCarro3);
        System.out.println("Costo de estacionamiento para " + carro4 + ": $" + costoCarro4);

        System.out.println("Estado actual del parqueadero:");
        parqueadero.mostrarEstadoParqueadero();
    }
}

