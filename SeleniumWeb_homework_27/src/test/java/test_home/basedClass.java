package test_home;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basedClass {
   protected WebDriver driver;
   @BeforeMethod
   public void setUp(){
       WebDriverManager.chromedriver().setup(); // апдейт хрому в автоматич. режимі, тепер це не треба робити вручну
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demoqa.com/elements");
       //driver.get("https://demoqa.com/webtables");
    }
    @AfterMethod
    public void cleanUp(){
        driver.close();
        driver.quit();

    }
}
