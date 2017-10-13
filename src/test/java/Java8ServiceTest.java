import com.tcs.java8.dao.Java8Dao;
import com.tcs.java8.dto.Employee;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class Java8ServiceTest {

   public static List<Employee> employeeList=null;
    @Mock
    Java8Dao java8Dao;

    @BeforeClass
    public  static void setup()
    {
        MockitoAnnotations.initMocks(new Java8ServiceTest());
employeeList= Arrays.asList(new Employee.EmployeeBuider().setEmpId(1).setEmpName("Anirban").build(),
        new Employee.EmployeeBuider().setEmpId(2).setEmpName("Avi").build(),
        new Employee.EmployeeBuider().setEmpId(3).setEmpName("Ari").build(),
        new Employee.EmployeeBuider().setEmpId(4).setEmpName("Axi").build());
    }

    @Test
    public void WhenGetEmployeeMethodCallsThenReturnList()
    {
        //Mock the behaviour
when(java8Dao.getEmployee()).thenReturn(this.employeeList);


        Assert.assertEquals(4,java8Dao.getEmployee().size());

    }

}
