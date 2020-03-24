import org.testng.Assert;
import org.testng.annotations.Test;

public class zaleznosci {
    @Test
    void wpiszWprzegladarkeMarkeAuta (){
        System.out.println("nastepnieWpiszModelAuta");
        //Assert.fail();
    }
    @Test(dependsOnMethods = {"wpiszWprzegladarkeMarkeAuta"})
    void wpiszWprzegladarkeModelAuta(){
        System.out.println("Podaj rocznik auta");
    }
    @Test(dependsOnMethods = {"wpiszWprzegladarkeModelAuta"})
    void Podajrocznik(){
        System.out.println("Wyliczam Ci Skladke");
    }
    @Test(dependsOnMethods = {"Podajrocznik"})
    void WyliczamSkladke(){
        System.out.println("Twoja Skladka za OC Samochodu to 999zł ");
    }
}
