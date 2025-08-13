package observer;

import java.util.ArrayList;
import java.util.List;

public class StockBroker implements Observer   {
    private List<StockExchangeAgency> agencies;
    private double lastKnownValue;

    public StockBroker() {
        this.agencies = new ArrayList<>();
        this.lastKnownValue = -1;
    }

    public void registerAgency(StockExchangeAgency agency) {
        agencies.add(agency);
        System.out.println("Agency " + agency.getAgencyName() + " registered with the StockBroker.");
    }

    public void deleteAgency(StockExchangeAgency agency) {
        agencies.remove(agency);
        System.out.println("Agency " + agency.getAgencyName() + " deleted.");
    }

    @Override
    public void update(double newValue) {
        if (lastKnownValue == -1) {
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
}

