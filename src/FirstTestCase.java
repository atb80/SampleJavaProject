import org.testng.annotations.Test;

public class FirstTestCase {



    @Test(priority=1)
    void setup() {
        System.out.println("otwarcie przegladarki");
    }
    @Test
    void login(){
        System.out.println("to jest test");
    }
    @Test
    void teardown(){
        System.out.println("zamykanie przeglaradki");
    }
}
