package observer;

public class RunDemo {
    public void start() {
        StockMarket stockMarket = new StockMarket(100.0);

        Stockbroker broker = new Stockbroker();

        stockMarket.registerObserver(broker);

        StockExchangeAgency reuters = new StockExchangeAgency("Reuters");
        StockExchangeAgency bloomberg = new StockExchangeAgency("Bloomberg");

        broker.registerAgency(reuters);
        broker.registerAgency(bloomberg);

        System.out.println("\n--- Simulation: the value of the stock market rises ---");
        stockMarket.setStockMarketValue(105.5);

        System.out.println("\n--- Simulation: the value of the stock market goes down ---");
        stockMarket.setStockMarketValue(98.2);
    }
}
