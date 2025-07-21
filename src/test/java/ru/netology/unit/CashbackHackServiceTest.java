package ru.netology.unit;

import org.testng.annotations.Test;
import ru.netulogy.unit.CashbackHackService;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    @Test
    public void remain () {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals (actual, expected);
    }

    @Test
    public void shouldReturnCorrectRemainderWhenAmountMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals (actual, expected);
    }

    @Test
    public void shouldReturnBoundaryWhenAmountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCorrectRemainderWhenAmountIsOneLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnZeroWhenAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}