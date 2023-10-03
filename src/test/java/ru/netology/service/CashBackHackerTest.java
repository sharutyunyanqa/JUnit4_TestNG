package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashBackHackerTest {
    @Test
    public void shouldTestCashBack(){
        CashBackHacker service= new CashBackHacker();

        int expected=100;
        int actual= service.remain(900);
        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void shouldTestCashBackWhenIts1000(){
        CashBackHacker service= new CashBackHacker();

        int expected=0;
        int actual= service.remain(1000);
        Assertions.assertEquals(expected, actual);


    }
}

