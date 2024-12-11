package org.example;

/**
 * Головний клас для демонстрації мережевої структури та обчислення її загальної вартості.
 */
public class Main {
    public static void main(String[] args) {
        Cable c = new Cable(3, 1500);
        Cable c2 = new Cable(1, 480);
        Server s = new Server(1000, 1000);
        ProcessingStation st = new ProcessingStation(200, 300);
        ProcessingStation st2 = new ProcessingStation(400, 450);

        NetworkElement[] elements = new NetworkElement[]{c, c2, s, st, st2};
        Network network = new Network(elements);

        System.out.println("Загальна вартість мережі: " + network.totalValue());
    }
}
