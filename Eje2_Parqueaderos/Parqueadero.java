package Eje2_Parqueaderos;


import org.w3c.dom.ls.LSOutput;

public class Parqueadero {
    private Carro[][] matrizParqueadero;
    private double tarifaPorHora;

    public Parqueadero(double tarifaPorHora) {

        this.tarifaPorHora = tarifaPorHora;
        matrizParqueadero = new Carro[4][4];
    }

    public void mostrarEstadoParqueadero() {
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                if (matrizParqueadero[fila][columna] == null) {
                    System.out.print("[ ] ");
                } else {
                    System.out.print("[*] "); //
                }
            }
            System.out.println();
        }
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        if (fila < 0 || fila >= 4 || columna < 0 || columna >= 4) {
            System.out.println("El cubiculo NO existe en Nuestro Parqueadero.");
            return false;
        }

        if (matrizParqueadero[fila][columna] == null) {
            matrizParqueadero[fila][columna] = carro;
            return true;
        } else {
            System.out.println("Espacio ocupado. No se pudo estacionar el carro.");
            return false;
        }
    }

    public double cobrarPorTiempo(Carro carro, int horas) {
        return horas * tarifaPorHora;
    }
}

