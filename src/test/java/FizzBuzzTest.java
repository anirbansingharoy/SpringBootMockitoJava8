import com.tcs.java8.utility.FizzBuzzUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.StringUtils;

@RunWith(SpringJUnit4ClassRunner.class)
public class FizzBuzzTest {

    @Test
    public void shouldReturnFizzWhenInputNumberDividedBy3AndNotBy15() {
        Assert.assertEquals("fizz", FizzBuzzUtils.getFizzBuzzResponse(9));
    }

    @Test
    public void shouldReturnBuzzWhenInputNumberDividedBy5AndNotBy15() {
        Assert.assertEquals("buzz", FizzBuzzUtils.getFizzBuzzResponse(10));
    }

    @Test
    public void shouldReturnFizzBuzzWhenInputNumberDividedBy15() {
        Assert.assertEquals("fizzbuzz", FizzBuzzUtils.getFizzBuzzResponse(30));
    }

    @Test
    public void shouldReturnSameNumberWhenInputNumberDoesNotDividedby3or5or15() {
        int inputNumber = 49;
        Assert.assertEquals(String.valueOf(inputNumber), FizzBuzzUtils.getFizzBuzzResponse(inputNumber));
    }

    @Test
    public void shouldReturnZeroWhenInputNumberPassedAsZero() {
        int inputNumber = 0;
        Assert.assertEquals(String.valueOf(inputNumber), FizzBuzzUtils.getFizzBuzzResponse(inputNumber));
    }



    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionWhenNegetiveNumberIsPassed() {

            FizzBuzzUtils.getFizzBuzzResponse(-50);

    }

}
