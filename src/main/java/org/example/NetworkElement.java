package org.example;

/**
 * Інтерфейс для елементів мережі, які можуть приймати об'єкти-відвідувачі.
 */
public interface NetworkElement {
    void accept(Visitor v);
}
