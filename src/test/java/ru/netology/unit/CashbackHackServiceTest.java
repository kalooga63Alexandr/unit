package ru.netology.unit;

import org.junit.jupiter.api.Test;
import ru.netulogy.unit.CashbackHackService;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturnCorrectRemainderWhenAmountLess () {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(expected, actual);
    }
}
