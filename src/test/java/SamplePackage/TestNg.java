package SamplePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {
    WebDriver driver;


    @BeforeMethod
    public void launchBrowser() {
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void URLhit() {
        driver.get("https://www.google.com");
    }

    @Test(priority = 2)
    public void PrintHelloworld() {
        System.out.println("Hello World");
    }

    @Test(priority = -1)
    public void checkingPriority()
    {
        System.out.println("checking priority");
    }

    @AfterMethod
    public void BrowserClose() {
        driver.close();
    }

}
