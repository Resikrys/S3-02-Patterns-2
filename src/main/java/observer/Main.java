package observer;

public class Main {
    public static void main(String[] args) {
        //Create StockBroker + create new Agencies
        //add agencies to <list> Observers
        //Call simulation methods to change Stock values
        //Try observable methods
        // Crear el Agente de Bolsa
        Stockbroker agente = new Stockbroker(100.0);

        // Crear Agencias de Bolsa (Observers)
        StockExchangeAgency agencia1 = new StockExchangeAgency("Reuters");
        StockExchangeAgency agencia2 = new StockExchangeAgency("Bloomberg");
        StockExchangeAgency agencia3 = new StockExchangeAgency("Financial Times");

        // Registrar las agencias con el Agente de Bolsa
        agente.registerObserver(agencia1);
        agente.registerObserver(agencia2);
        agente.registerObserver(agencia3);

        System.out.println("\n--- Simulación de cambios en la Bolsa ---");

        // Simular cambios en la bolsa
        agente.marketValueChangeSimulator(105.5); // Subida
        System.out.println("\n");
        agente.marketValueChangeSimulator(98.2);  // Bajada
        System.out.println("\n");
        agente.marketValueChangeSimulator(98.2); // Sin cambios
        System.out.println("\n");
        agente.marketValueChangeSimulator(110.0); // Subida

        System.out.println("\n--- Una agencia se da de baja ---");
        agente.deleteObserver(agencia2);
        System.out.println("\n");
        agente.marketValueChangeSimulator(95.0); // Bajada (solo notifica a las 2 restantes)
    }
}
