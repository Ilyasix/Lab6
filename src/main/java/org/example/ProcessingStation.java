package org.example;

/**
 * Клас, що представляє робочу станцію у мережі.
 */
public class ProcessingStation implements NetworkElement {
    private int price;
    private int capacity;

    public ProcessingStation(int capacity, int price) {
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public void accept(Visitor v) {
        v.visitProcessingStation(this);
    }

    /**
     * Повертає вартість робочої станції.
     *
     * @return Вартість робочої станції.
     */
    public int getPrice() {
        return price;
    }
}
