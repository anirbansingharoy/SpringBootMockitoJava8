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

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void WhenInputNumberDividedBy3ReturnFizz() {
        Assert.assertEquals("fizz", FizzBuzzUtils.getFizzBuzzResponse(9));
    }

    @Test
    public void WhenInputNumberDividedBy5ReturnBuzz() {
        Assert.assertEquals("buzz", FizzBuzzUtils.getFizzBuzzResponse(10));
    }

    @Test
    public void WhenInputNumberDividedBy15ReturnFizzBuzz() {
        Assert.assertEquals("fizzbuzz", FizzBuzzUtils.getFizzBuzzResponse(30));
    }

    @Test
    public void WhenInputNumberDoesNotDoesnotDividedby3or5or15ThenReturnSameNumber() {
        int inputNumber = 101;
        Assert.assertEquals(String.valueOf(inputNumber), FizzBuzzUtils.getFizzBuzzResponse(inputNumber));
    }

    @Test
    public void WhenNegetiveNumberIsPassedReturnException() {
        try {
            FizzBuzzUtils.getFizzBuzzResponse(-50);
            Assert.fail("Expected Exception Actual No exception thrown");
        } catch (RuntimeException ex) {
            Assert.assertEquals("NEGETIVE NUMBER IS NOT ALLOWED", ex.getMessage());
        }
    }

}
