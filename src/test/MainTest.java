package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java1.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;

public class MainTest {
    private Main main;
    @BeforeEach
    public void setUp() throws Exception {
        main = new Main();
    }
    @Test
    public void testSum() {

        int sum = main.sum(1, 2);
        Assert.assertEquals(3, sum);
        //assert sum == 3;
    }
    @Test
    public void even1() {
        Main main = new Main();
        boolean e= main.even(10);
        Assert.assertTrue(e);
    }
    @Test
    public void even2() {
        boolean e = main.even(11);
        Assert.assertFalse(e);
    }
    @Test
   public void divide(){
        Main main = new Main();
       // main.divide(10, 0);
        Assert.assertThrows(ArithmeticException.class, () -> main.divide(10, 0));
    }

}
