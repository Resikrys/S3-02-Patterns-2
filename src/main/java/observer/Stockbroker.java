package observer;

import java.util.ArrayList;
import java.util.List;

public class Stockbroker implements Observer   {
//    private List<Observer> observers;
//    private double marketValue;
//    private String marketState; // "subida" o "bajada"
    private List<StockExchangeAgency> agencies;
    private double lastKnownValue;

    public Stockbroker() {
//        this.observers = new ArrayList<>();
//        this.marketValue = initialValue;
//        this.marketState = "stable";
//        System.out.println("Stockbroker initiated with value: " + initialValue);
        this.agencies = new ArrayList<>();
        this.lastKnownValue = -1; // Valor inicial
    }

    public void registerAgency(StockExchangeAgency agency) {
        agencies.add(agency);
        System.out.println("Agencia " + agency.getAgencyName() + " registered with the StockBroker.");
    }
    @Override
    public void update(double newValue) {
        if (lastKnownValue == -1) {
            // Primera vez que se recibe una actualización.
            lastKnownValue = newValue;
            return;
        }

        String state;
        if (newValue > lastKnownValue) {
            state = "up";
        } else if (newValue < lastKnownValue) {
            state = "down";
        } else {
            state = "stable";
        }

        System.out.println("StockBroker has received an update. The market is in " + state + ".");

        if (!"stable".equals(state)) {
            notifyAgencies(state);
        }
        this.lastKnownValue = newValue;
    }

    private void notifyAgencies(String state) {
        for (StockExchangeAgency agency : agencies) {
            agency.update(state);
        }
    }

//    @Override
//    public void registerObserver(Observer observer) {
//        observers.add(observer);
//        System.out.println("Observer registrado.");
//    }
//
//    @Override
//    public void deleteObserver(Observer observer) {
//        observers.remove(observer);
//        System.out.println("Observer eliminado.");
//    }
//
//    @Override
//    public void notifyObservers() {
//        for (Observer observer : observers) {
//            observer.update(this.marketState);
//        }
//        System.out.println("Notificación enviada a todos los observers: " + this.marketState);
//    }
//
//        public void marketValueChangeSimulator(double newValue) {
//            if (newValue > this.marketValue) {
//                this.marketState = "up";
//                System.out.println("--- The stock market has risen from " + this.marketValue + " to " + newValue + " ---");
//            } else if (newValue < this.marketValue) {
//                this.marketState = "down";
//                System.out.println("--- The stock market HAS DOWN from " + this.marketValue + " to " + newValue + " ---");
//            } else {
//                this.marketState = "unchanged";
//                System.out.println("--- The Stock Market IS THE SAME in " + this.marketValue + " ---");
//                return; // No notificar si no hay cambio significativo
//            }
//            this.marketValue = newValue;
//            notifyObservers(); // Notificar a las agencias
//    }
}

