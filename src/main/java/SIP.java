import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * Securities Information Processor.
 */
public class SIP {
    public enum StockSymbol {AAPL}

    public enum Exchange {NYSE, NASDAQ, BATS}

    public enum PriceQuotation {BID, OFFER}

    private Map<LocalDateTime, Map<StockSymbol, Map<Exchange, Map<PriceQuotation, BigDecimal>>>> bidsAndOffers = getBidsAndOffers();

    /**
     * Calculate national best bid or offer.
     * @param stockSymbol to calculate NBBO for.
     * @return Map of BigDecimals with left bid against closest offer on the right.
     */
    Map<BigDecimal, BigDecimal> calculateNBBO(String stockSymbol) {
        return Map.of(new BigDecimal(0.00), new BigDecimal(0.00));
    }

    Map<LocalDateTime, Map<StockSymbol, Map<Exchange, Map<PriceQuotation, BigDecimal>>>> getBidsAndOffers() {
        return Map.of(LocalDateTime.now(),
                Map.of(StockSymbol.AAPL,
                        Map.of(Exchange.NYSE,
                                Map.of(PriceQuotation.BID, new BigDecimal(420.71),
                                        PriceQuotation.OFFER, new BigDecimal(420.76))
                        )
                ));
    }
}
