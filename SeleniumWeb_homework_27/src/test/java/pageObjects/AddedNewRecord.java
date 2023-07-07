package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddedNewRecord extends AbstractPageObject{
    public final By firstNameField = By.xpath("//input[@id='firstName']");
    public final By lastNameField = By.xpath("//input[@id='lastName']");
    public final By userEmailField = By.xpath("//input[@id='userEmail']");
    public final By ageField = By.xpath("//input[@id='age']");
    public final By salaryField = By.xpath("//input[@id='salary']");
    public final By departmentField = By.xpath("//input[@id='department']");
    public final By submitField = By.xpath("//button[@id='submit']");
    public AddedNewRecord(WebDriver driver) {
        super(driver);
        //driver.get("https://demoqa.com/webtables");
    }

    public String AddNewUSer(String firstName, String lastName, String userEmail, String userAge, String salary, String department){
        getElement(firstNameField).sendKeys(firstName);
        getElement(lastNameField).sendKeys(lastName);
        getElement(userEmailField).sendKeys(userEmail);
        getElement(ageField).sendKeys(userAge);
        getElement(salaryField).sendKeys(salary);
        getElement(departmentField).sendKeys(department);
        getElement(submitField).click();


        return firstName;
    }
}
