package org.example;

/**
 * Реалізація відвідувача для обчислення загальної вартості елементів мережі.
 */
public class PriceCalculator implements Visitor {
    private int sumValue = 0;

    @Override
    public int visitCable(Cable el) {
        sumValue += el.getPrice();
        return el.getPrice();
    }

    @Override
    public int visitServer(Server el) {
        sumValue += el.getPrice();
        return el.getPrice();
    }

    @Override
    public int visitProcessingStation(ProcessingStation el) {
        sumValue += el.getPrice();
        return el.getPrice();
    }

    /**
     * Повертає загальну вартість, обчислену для всіх елементів.
     *
     * @return Загальна вартість.
     */
    public int getSumValue() {
        return sumValue;
    }
}
