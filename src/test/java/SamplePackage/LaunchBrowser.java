package SamplePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();


        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
