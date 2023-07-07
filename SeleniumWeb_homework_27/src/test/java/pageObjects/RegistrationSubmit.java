package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationSubmit extends AbstractPageObject{
    public final By submitField = By.xpath("//button[@id='submit']");
    public RegistrationSubmit(WebDriver driver1) {
        super(driver1);
    }

}
