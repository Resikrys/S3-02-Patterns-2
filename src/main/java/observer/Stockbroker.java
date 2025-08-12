package observer; //Agent de Borsa -> notificador (rep l'evento) -> concrete Observable

import java.util.ArrayList;
import java.util.List;

public class Stockbroker implements Observable  {
    //Implements Observable -> concrete observable
    //list observers, double stockPrice, Str stockState
    //methods: addObserver(Obs obs), deleteObs (Obs obs), notifyAll(), getStockPrice, getStockState, stockExchange(?)
    //private List<StockExchangeAgency> subcribers;
    private List<Observer> observers;
    private double marketValue;
    private String marketState; // "subida" o "bajada"

    public Stockbroker(double initialValue) {
        this.observers = new ArrayList<>();
        this.marketValue = initialValue;
        this.marketState = "stable";
        System.out.println("Stockbroker initiated with value: " + initialValue);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer registrado.");
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer eliminado.");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.marketState);
        }
        System.out.println("Notificación enviada a todos los observers: " + this.marketState);
    }

        public void marketValueChangeSimulator(double newValue) {
            if (newValue > this.marketValue) {
                this.marketState = "up";
                System.out.println("--- The stock market has risen from " + this.marketValue + " to " + newValue + " ---");
            } else if (newValue < this.marketValue) {
                this.marketState = "down";
                System.out.println("--- The stock market HAS DOWN from " + this.marketValue + " to " + newValue + " ---");
            } else {
                this.marketState = "unchanged";
                System.out.println("--- The Stock Market IS THE SAME in " + this.marketValue + " ---");
                return; // No notificar si no hay cambio significativo
            }
            this.marketValue = newValue;
            notifyObservers(); // Notificar a las agencias
    }
}

