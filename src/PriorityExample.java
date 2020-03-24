import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityExample {
    @Test
    void TestPierwszy(){
        System.out.println("to jest test pierwszy");
        Assert.fail();
    }
    @Test
    void TestDrugi(){
        System.out.println("to jest tesst drugi");
    }
    @Test (priority = 3)
    void TestTrzeci(){
        System.out.println("to jest test trzeci");}
}
