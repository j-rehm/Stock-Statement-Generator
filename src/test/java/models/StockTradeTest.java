package models;

import controllers.JSONController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTradeTest {

    StockTrade stockTrade;

    @BeforeEach
    void SetupStockTrade() {
        JSONController.loadJSON("src/test/java/raw_data/test.json");
        stockTrade = (StockTrade) ((Stockholder) JSONController.getStockholdersFromJSON().toArray()[0]).getStockTrades().toArray()[0];
    }

    @Test
    void testGetType() {
        // arrange
        String expected = "Buy";

        // act
        String actual = stockTrade.getType();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testSetType() {
        // arrange
        String expected = "Sell";

        // act
        stockTrade.setType(expected);
        String actual = stockTrade.getType();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testGetStockSymbol() {
        // arrange
        String expected = "AAPL";

        // act
        String actual = stockTrade.getStockSymbol();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testSetStockSymbol() {
        // arrange
        String expected = "TSLA";

        // act
        stockTrade.setStockSymbol(expected);
        String actual = stockTrade.getStockSymbol();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testGetShareCount() {
        // arrange
        long expected = 6L;

        // act
        long actual = stockTrade.getShareCount();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testSetShareCount() {
        // arrange
        long expected = 8L;

        // act
        stockTrade.setShareCount(expected);
        long actual = stockTrade.getShareCount();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testGetPricePerShare() {
        // arrange
        double expected = 2.0d;

        // act
        double actual = stockTrade.getPricePerShare();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testSetPricePerShare() {
        // arrange
        double expected = 5.0d;

        // act
        stockTrade.setPricePerShare(expected);
        double actual = stockTrade.getPricePerShare();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testGetTotalAmount() {
        // arrange
        double expected = 12.0d;

        // act
        double actual = stockTrade.getTotalAmount();

        // assert
        assertEquals(expected, actual);
    }
}