package ru.netology.sqr.sqrservicemvn.services;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.sqr.sqrservicemvn.services.SQRService;

public class SQRServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSQR(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInexact() {
        SQRService service = new SQRService();

        int expected = 4;
        int actual = service.calcSQR(196, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInexact1() {
        SQRService service = new SQRService();

        int expected = 2;
        int actual = service.calcSQR(200, 288);

        Assertions.assertEquals(expected, actual);
    }
}
