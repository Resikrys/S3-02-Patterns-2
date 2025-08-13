package observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class StockbrokerTest {
    private StockBroker stockBroker;
    private StockExchangeAgency agency1;
    private StockExchangeAgency agency2;

    @BeforeEach
    void setUp() {
        stockBroker = new StockBroker();

        agency1 = mock(StockExchangeAgency.class);
        agency2 = mock(StockExchangeAgency.class);

        when(agency1.getAgencyName()).thenReturn("Reuters");

        stockBroker.registerAgency(agency1);
        stockBroker.registerAgency(agency2);

        stockBroker.update(100.0);

        Mockito.reset(agency1, agency2);
    }

    @Test
    void testNotificationOnMarketUp() {
        stockBroker.update(115.0);

        verify(agency1, times(1)).update("up");
        verify(agency2, times(1)).update("up");
    }

    @Test
    void testNotificationOnMarketDown() {
        stockBroker.update(95.0);

        verify(agency1, times(1)).update("down");
        verify(agency2, times(1)).update("down");
    }

    @Test
    void testNoNotificationOnUnchangedValue() {
        stockBroker.update(100.0);

        verify(agency1, never()).update(anyString());
        verify(agency2, never()).update(anyString());
    }

    @Test
    void testAgencyUnregistered() {
        StockExchangeAgency agency3 = mock(StockExchangeAgency.class);
        stockBroker.registerAgency(agency3);
        stockBroker.deleteAgency(agency3);

        stockBroker.update(120.0);

        verify(agency1, times(1)).update("up");
        verify(agency2, times(1)).update("up");

        verify(agency3, never()).update(anyString());
    }
}