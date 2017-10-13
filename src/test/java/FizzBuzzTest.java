import com.tcs.java8.utility.FizzBuzzUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class FizzBuzzTest {

@Test
    public void WhenInputNumberDividedBy3ReturnFizz()
{
    Assert.assertEquals("fizz", FizzBuzzUtils.getFizzBuzzResponse(9));
}

}
