package test_home;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.AddedNewRecord;

import java.time.Duration;

public class webTableTest extends basedClass{
    private final static String NAME = "Khrystyna";
    private final static String EDITNAME = "Olgha";
    private final static String SURNAME = "Zahorovska";
    private final static String MAIL = "qwer@gmail.com";
    private final static String AGE = "34";
    private final static String SALARY = "50000";
    private final static String DEPARTMENT = "IT";
    //protected WebDriver driver1;
    private final By addNewRecord = By.xpath("//button[@id='addNewRecordButton']");
    private final By EditRecord = By.xpath("//span[@id='edit-record-4']");
    @Test
    public void addNewRecordUserTest(){
        driver.findElement(addNewRecord).click();
        String userActual = new AddedNewRecord(driver)
                .AddNewUSer(NAME,SURNAME,MAIL,AGE,SALARY,DEPARTMENT);
        Assert.assertEquals(userActual,"Khrystyna", "User not equal Khrystyna name");
    }

//    @Test
//    public void editUserTest(){
//        driver.findElement(addNewRecord).click();
//        String userActual = new AddedNewRecord(driver)
//                .AddNewUSer(NAME,SURNAME,MAIL,AGE,SALARY,DEPARTMENT);
//        driver.findElement(EditRecord).click();
//        String editUser = new AddedNewRecord(driver)
//                .AddNewUSer(EDITNAME, SURNAME,MAIL,AGE,SALARY,DEPARTMENT);
//        Assert.assertEquals(editUser, "Olgha", "User not found");
//
//
//    }


}
