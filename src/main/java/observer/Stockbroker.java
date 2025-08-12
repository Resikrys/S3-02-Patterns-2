package observer; //Agent de Borsa -> notificador (rep l'evento)

import java.util.List;

public class Stockbroker implements Observable  {
    //Implements Observable -> concrete observable
    //list observers, double stockPrice, Str stockState
    //methods: addObserver(Obs obs), deleteObs (Obs obs), notifyAll(), getStockPrice, getStockState, stockExchange(?)
    List<StockexchangeAgency> subcribers;

}
