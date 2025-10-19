import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class Button {
    WebDriver driver;

    @Test
    public void test1() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.cnarios.com/concepts/button#try-it-yourself");
        List<WebElement> lists = driver.findElements(By.cssSelector(".css-12nllm1 h6"));
        List<WebElement> cartButtons = driver.findElements(By.cssSelector(".css-12nllm1 .css-15q2cw4 button"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOf((WebElement) lists));
        List<Integer> indexList=lists.stream().filter(S->S.getText().equalsIgnoreCase("Anjali Sharma"))
                .map(lists::indexOf).toList();
        for (Integer index:indexList){
            WebElement cart= cartButtons.get(index);
            cart.click();
            //System.out.println(cart.getText());
            String actual="Follow";
           String expected=  wait.until(ExpectedConditions.elementToBeClickable(cart)).getText();
            System.out.println(expected);
            Assert.assertTrue(true);
        }


    }
}