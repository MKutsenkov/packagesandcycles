package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.Test;


public class SQRServiceTest {

    @Test
    public void test() {
        SQRService service = new SQRService();


        int actual = service.calculate(200, 300);
        int expented = 3;

        assertEquals(expented, actual);
    }
}
