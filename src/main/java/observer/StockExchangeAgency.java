package observer; //Agencia -> observador (rep al notificació)

public class StockExchangeAgency implements Observer {
    //Implements Observer -> concrete observer
    //String name + method update()... notification
    private String agencyName;

    public StockExchangeAgency(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public void update(String change) {
        System.out.println("Agency " + agencyName + ": ¡Alert! The Stock Exchange has experienced a chnage: " + change + ".");
    }
}
