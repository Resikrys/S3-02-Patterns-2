package observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class StockbrokerTest {
    private StockBroker stockBroker;
    private StockExchangeAgency agency1;
    private StockExchangeAgency agency2;

    @BeforeEach
    void setUp() {
        // Inicializar el StockBroker antes de cada test
        stockBroker = new StockBroker();

        // Crear mocks de las agencias
        agency1 = mock(StockExchangeAgency.class);
        agency2 = mock(StockExchangeAgency.class);

        // Dile a Mockito que devuelva "Reuters" cuando se llame a getAgencyName()
        when(agency1.getAgencyName()).thenReturn("Reuters");

        // Registrar las agencias en el broker
        stockBroker.registerAgency(agency1);
        stockBroker.registerAgency(agency2);

        // Inicializar el StockBroker con un valor de mercado inicial
        // Esto evita que la primera llamada a 'update' sea silenciosa
        stockBroker.update(100.0);

        // Resetear los mocks para ignorar la llamada de inicialización
        Mockito.reset(agency1, agency2);
    }

    @Test
    void testNotificationOnMarketUp() {
        // Simular una subida del mercado. Ahora, esta llamada DEBE notificar.
        stockBroker.update(115.0);

        // Verificar que el método 'update' de ambas agencias fue llamado exactamente una vez
        verify(agency1, times(1)).update("up");
        verify(agency2, times(1)).update("up");
    }

    @Test
    void testNotificationOnMarketDown() {
        // Simular una bajada del mercado. Esta llamada DEBE notificar.
        stockBroker.update(95.0);

        // Verificar que el método 'update' de ambas agencias fue llamado con el valor "bajada"
        verify(agency1, times(1)).update("down");
        verify(agency2, times(1)).update("down");
    }

    @Test
    void testNoNotificationOnUnchangedValue() {
        // Simular un valor sin cambios.
        stockBroker.update(100.0);

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
        stockBroker.update(120.0);

        // Verificar que solo las agencias 1 y 2 fueron notificadas
        verify(agency1, times(1)).update("up");
        verify(agency2, times(1)).update("up");

        // Y que la agencia 3 nunca fue notificada
        verify(agency3, never()).update(anyString());
    }
}