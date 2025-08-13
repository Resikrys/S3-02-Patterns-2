package observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class StockbrokerTest {
    // Objeto que vamos a testear
    private StockBroker stockBroker;

    // Mocks de las agencias para verificar la interacción
    private StockExchangeAgency agency1;
    private StockExchangeAgency agency2;

    @BeforeEach
    void setUp() {
        // Inicializar el StockBroker antes de cada test
        stockBroker = new StockBroker();

        // Crear mocks de las agencias
        agency1 = mock(StockExchangeAgency.class);
        agency2 = mock(StockExchangeAgency.class);

        // Registrar las agencias en el broker
        stockBroker.registerAgency(agency1);
        stockBroker.registerAgency(agency2);
    }

    @Test
    void testNotificationOnMarketUp() {
        // Simular una subida del mercado
        stockBroker.update(110.0);
        stockBroker.update(115.0);

        // Verificar que el método 'update' de ambas agencias fue llamado exactamente una vez
        verify(agency1, times(1)).update("subida");
        verify(agency2, times(1)).update("subida");
    }

    @Test
    void testNotificationOnMarketDown() {
        // Simular una bajada del mercado
        stockBroker.update(110.0);
        stockBroker.update(105.0);

        // Verificar que el método 'update' de ambas agencias fue llamado con el valor "bajada"
        verify(agency1, times(1)).update("bajada");
        verify(agency2, times(1)).update("bajada");
    }

    @Test
    void testNoNotificationOnUnchangedValue() {
        // Simular un valor sin cambios
        stockBroker.update(110.0);
        stockBroker.update(110.0);

        // Verificar que los métodos de las agencias nunca fueron llamados en la segunda actualización
        verify(agency1, never()).update(anyString());
        verify(agency2, never()).update(anyString());
    }

    @Test
    void testAgencyUnregistered() {
        // Registrar una tercera agencia y luego eliminarla
        StockExchangeAgency agency3 = mock(StockExchangeAgency.class);
        stockBroker.registerAgency(agency3);
        stockBroker.deleteAgency(agency3);

        // Simular un cambio en el mercado
        stockBroker.update(110.0);
        stockBroker.update(120.0);

        // Verificar que solo las agencias 1 y 2 fueron notificadas
        verify(agency1, times(1)).update("subida");
        verify(agency2, times(1)).update("subida");

        // Y que la agencia 3 nunca fue notificada
        verify(agency3, never()).update(anyString());
    }
}