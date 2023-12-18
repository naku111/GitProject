package day01;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testadd(){
        Calculator c=new Calculator();
        int add = c.add(1, 2);
        Assert.assertEquals(3,add);
    }
}
