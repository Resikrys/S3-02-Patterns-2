package observer; //Borsa -> Obj observat (sujeto -> emisor de evento)

public class StockMarket {
    private final String name;
    private double stockMarketValue;

    public StockMarket(String name, double stockMarketValue) {
        this.name = name;
        this.stockMarketValue = stockMarketValue;
    }

    public String getName() {
        return name;
    }

    public double getStockMarketValue() {
        return stockMarketValue;
    }

    public void setStockMarketValue(double stockMarketValue) {
        this.stockMarketValue = stockMarketValue;
    }
}
