package org.example;

/**
 * Клас, що представляє сервер у мережі.
 */
public class Server implements NetworkElement {
    private int price;
    private int capacity;

    public Server(int capacity, int price) {
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public void accept(Visitor v) {
        v.visitServer(this);
    }

    /**
     * Повертає вартість сервера.
     *
     * @return Вартість сервера.
     */
    public int getPrice() {
        return price;
    }
}
