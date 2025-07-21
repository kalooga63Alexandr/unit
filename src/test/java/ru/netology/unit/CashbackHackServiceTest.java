package ru.netology.unit;

import org.junit.Test;
import ru.netulogy.unit.CashbackHackService;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void remain () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        long actual = service.remain(amount);
        long expected = 999;

        assertEquals (expected, actual);
    }

    @Test
    public void shouldReturnCorrectRemainderWhenAmountMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        long expected = 500;
        long actual = service.remain(amount);
        assertEquals (expected, actual);
    }

    @Test
    public void shouldReturnBoundaryWhenAmountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        long expected = 1000;
        long actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectRemainderWhenAmountIsOneLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        long expected = 1;
        long actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroWhenAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        long expected = 0;
        long actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}