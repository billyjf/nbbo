import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SIPTest {
    private SIP sip;

    @Before
    public void setUp() {
        sip = new SIP();
    }

    @Test
    public void calculateNBBO() {
    }

    @Test
    public void getBidsAndOffers() {
        assertEquals(Map.of(SIP.StockSymbol.AAPL,
                        Map.of(SIP.Exchange.NYSE,
                                Map.of(SIP.PriceQuotation.BID, new BigDecimal(420.71),
                                        SIP.PriceQuotation.OFFER, new BigDecimal(420.76))
                        )
                ), sip.getBidsAndOffers().values().stream().findFirst().get());
    }
}