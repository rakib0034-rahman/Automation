import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Country {
    @Test(groups = {"smoke"})
    public void countryPopulation(){
        System.out.println("Chaina");
    }
    @Test(dataProvider ="getData")
    public void countryBig(String name,String pass){
        System.out.println(name+" "+pass);
    }
    @Test
    public void countrySecLarg(){
        System.out.println("Russia");
    }
    @DataProvider
    public Object[][] getData(){
        Object [][] objects= new Object[2][2];
        objects[0][0]="rakib@rakib.com";
        objects[0][1]="Password";
        objects[1][0]= "tuli@tuli.com";
        objects[1][1]="password1";
        return objects;

    }
}
