import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
    @BeforeClass
    void beforeClass()
    {
        System.out.println("przed klasacmd");
    }

    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("wykonuje przed metodami");
    }


    @Test
    void test1()
            {
                System.out.println("to test1");
            }

            @Test
            void test2()
            {
                System.out.println("to test2");
            }


}
