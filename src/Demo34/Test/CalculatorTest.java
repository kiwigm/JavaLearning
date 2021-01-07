package Demo34.Test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        int result = c.Add(1,2);
        Assert.assertEquals(3,result);
    }
    @Before
    public void init(){
        System.out.println("init...");
    }
    @After
    public void close(){
        System.out.println("close...");
    }
}
