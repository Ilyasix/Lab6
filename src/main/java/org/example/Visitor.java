package org.example;

/**
 * Інтерфейс для визначення операцій над елементами мережі.
 */
public interface Visitor {
    int visitCable(Cable el);
    int visitServer(Server el);
    int visitProcessingStation(ProcessingStation el);
}
