import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mobile {
    @Test
    public void mobileLogin() {
        System.out.println("log into the phone");
    }

    @Test
    public void mobileFunction() {
        System.out.println("120 hz display");
    }

    @Test
    public void mobileLogout() {
        System.out.println("successful log out");
    }

    @Test
    public void notMobile() {
        System.out.println("this is not mobile test");
    }

    @Test
    @Parameters({"country"})
    public void mobileMaker(String countryName) {
        System.out.println(countryName + " Makes Mig");


    }


}
