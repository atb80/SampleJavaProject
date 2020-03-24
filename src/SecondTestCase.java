import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class SecondTestCase {

    @Test(priority = 1)
        void setup()
    {
        System.out.println("otworz przegladarke");
    }
    @Test(priority = 3)
        void searchCustomer()
    {
        System.out.println("otwarcie przegladarki");
    }
    @Test(priority = 2)
        void addCustomer()
    {
        System.out.println("to tylko test");

    }
    @Test(priority =  4)
    void teardown()
    {
        System.out.println("zamykanie przeglaradki");
    }
}
