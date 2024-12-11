package org.example;

/**
 * Клас, що представляє кабель у мережі.
 */
public class Cable implements NetworkElement {
    private int price;
    private int length;

    public Cable(int length, int price) {
        this.length = length;
        this.price = price;
    }

    @Override
    public void accept(Visitor v) {
        v.visitCable(this);
    }

    /**
     * Повертає вартість кабелю.
     *
     * @return Вартість кабелю.
     */
    public int getPrice() {
        return price;
    }
}
