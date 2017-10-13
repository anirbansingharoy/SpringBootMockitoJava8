import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.tcs.java8")
public class SpringBootJava8Startup {

    public static void main(String args[])
    {

        SpringApplication.run(SpringBootJava8Startup.class,args);
        System.out.println("Running successfully");
    }
}
