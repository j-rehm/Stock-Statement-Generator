package models;

import controllers.JSONController;
import models.Stockholder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockholderTest {

    Stockholder stockholder;

    @BeforeEach
    void SetupStockholder() {
        JSONController.loadJSON("src/test/java/raw_data/test.json");
        stockholder = (Stockholder) JSONController.getStockholdersFromJSON().toArray()[0];
    }

    @Test
    void testGetAccountNumber() {
        // arrange
        long expected = 1L;

        // act
        long actual = stockholder.getAccountNumber();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testSetAccountNumber() {
        // arrange
        long expected = 2L;

        // act
        stockholder.setAccountNumber(expected);
        long actual = stockholder.getAccountNumber();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testGetSsn() {
        // arrange
        String expected = "123-45-6789";

        // act
        String actual = stockholder.getSsn();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testSetSsn() {
        // arrange
        String expected = "987-65-4321";

        // act
        stockholder.setSsn(expected);
        String actual = stockholder.getSsn();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testGetFirstName() {
        // arrange
        String expected = "Jeffrey";

        // act
        String actual = stockholder.getFirstName();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testSetFirstName() {
        // arrange
        String expected = "Gregor";

        // act
        stockholder.setFirstName(expected);
        String actual = stockholder.getFirstName();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testGetLastName() {
        // arrange
        String expected = "Rehm";

        // act
        String actual = stockholder.getLastName();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testSetLastName() {
        // arrange
        String expected = "Dzierzon";
        // act
        stockholder.setLastName(expected);
        String actual = stockholder.getLastName();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testGetEmail() {
        // arrange
        String expected = "jrehm@student.neumont.edu";

        // act
        String actual = stockholder.getEmail();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testSetEmail() {
        // arrange
        String expected = "gdzierzon@neumont.edu";

        // act
        stockholder.setEmail(expected);
        String actual = stockholder.getEmail();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testGetPhoneNumber() {
        // arrange
        String expected = "801-123-4567";

        // act
        String actual = stockholder.getPhoneNumber();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testSetPhoneNumber() {
        // arrange
        String expected = "801-765-4321";

        // act
        stockholder.setPhoneNumber(expected);
        String actual = stockholder.getPhoneNumber();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testGetBeginningBalance() {
        // arrange
        double expected = 100.0d;

        // act
        double actual = stockholder.getBeginningBalance();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testSetBeginningBalance() {
        // arrange
        double expected = 50.0d;

        // act
        stockholder.setBeginningBalance(expected);
        double actual = stockholder.getBeginningBalance();

        // assert
        assertEquals(expected, actual);
    }

//    @Test
//    void testGetStockTrades() {
//        // arrange
//
//
//        // act
//
//        // assert
//        assertEquals(expected, actual);
//    }

//    @Test
//    void testSetStockTrades() {
//        // arrange
//
//        // act
//
//        // assert
//        assertEquals(expected, actual);
//    }

    @Test
    void testGetTotalCashAmount() {
        // arrange
        double expected = 97.0d;

        // act
        double actual = stockholder.getTotalCashAmount();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testGetTotalStockAmount() {
        // arrange
        double expected = 3.0d;

        // act
        double actual = stockholder.getTotalStockAmount();

        // assert
        assertEquals(expected, actual);
    }
}