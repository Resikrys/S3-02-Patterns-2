package observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Observable {
    private List<Observer> observers;
    private double stockMarketValue;

    public StockMarket(double initialValue) {
        this.observers = new ArrayList<>();
        this.stockMarketValue = initialValue;
        System.out.println("StockMarket initiated with value: " + initialValue);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.stockMarketValue);
        }
    }

    public void setStockMarketValue(double newStockMarketValue) {
        if (this.stockMarketValue != newStockMarketValue) {
            System.out.println("--- Stock Market value changes from " + this.stockMarketValue + " to " + newStockMarketValue + " ---");
            this.stockMarketValue = newStockMarketValue;
            notifyObservers();
        }
    }
}
