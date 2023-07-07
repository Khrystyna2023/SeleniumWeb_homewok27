package test_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class pushButtonTest extends basedClass{
    private final By buttonMenu = By.xpath("//span[text()='Buttons']");
    private final By clickMeButton = By.xpath("//button[text()='Click Me']");
    private final By reedText = By.xpath("//p[text()='You have done a dynamic click']");
    @Test
    public void pushButtonTest(){
        driver.findElement(buttonMenu).click();
        driver.findElement(clickMeButton).click();
        String text = String.valueOf(driver.findElement(reedText).getText());
        Assert.assertEquals(text,"You have done a dynamic click", "Test failed, text not found");

    }

}
