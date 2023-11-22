package SamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class FlipKart {

@Test
public void  method()
{
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com");

        driver.findElement(By.xpath("//span[@role='button']")).click();

        driver.findElement(By.xpath("//header/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"))
                .sendKeys("laptop");

        driver.findElement(By.xpath("//header/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"))
                .sendKeys(Keys.ENTER);


        driver.findElement(By.xpath("//div[contains(text(),'ASUS TUF Gaming F15 with 90WHr Battery Core i5 11t')]"))
                .click();

        Set<String> wh = driver.getWindowHandles();

        for (String wh1 : wh)

        driver.switchTo().window(wh1);

       System.out.println( driver.getTitle());

       System.out.println(wh);

        /*driver.findElement(By.xpath("//div[contains(text(),'HP 2023 Ryzen 3 Dual Core 3250U - (8 GB/512 GB SSD')]"))
                .click();

        driver.switchTo().window(wh);

        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[contains(text(),'APPLE 2022 MacBook AIR M2 - (8 GB/256 GB SSD/Mac O')]"))
                .click();
*/


    }
}