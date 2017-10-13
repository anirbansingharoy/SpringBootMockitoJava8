import com.tcs.java8.utility.FizzBuzzUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.StringUtils;

@RunWith(SpringJUnit4ClassRunner.class)
public class FizzBuzzTest {

@Test
    public void WhenInputNumberDividedBy3ReturnFizz()
{
    Assert.assertEquals("fizz", FizzBuzzUtils.getFizzBuzzResponse(9));
}

    @Test
    public void WhenInputNumberDividedBy5ReturnBuzz()
    {
        Assert.assertEquals("buzz", FizzBuzzUtils.getFizzBuzzResponse(10));
    }

    @Test
    public void WhenInputNumberDividedBy15ReturnFizzBuzz()
    {
        Assert.assertEquals("fizzbuzz", FizzBuzzUtils.getFizzBuzzResponse(30));
    }
    @Test
    public void WhenInputNumberDoesNotDoesnotDividedby3or5or15ThenReturnSameNumber()
    {
        int inputNumber=101;
        Assert.assertEquals(String.valueOf(inputNumber), FizzBuzzUtils.getFizzBuzzResponse(inputNumber));
    }

}
