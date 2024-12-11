package org.example;

/**
 * Клас, що представляє мережу, яка складається з різних елементів.
 */
public class Network {
    private NetworkElement[] elements;
    private PriceCalculator operation;

    public Network(NetworkElement[] elements) {
        this.elements = elements;
        this.operation = new PriceCalculator();
    }

    /**
     * Обчислює загальну вартість мережі.
     *
     * @return Загальна вартість всіх елементів мережі.
     */
    public int totalValue() {
        for (NetworkElement element : elements) {
            element.accept(operation);
        }
        return operation.getSumValue();
    }
}
