package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractPageObject {
    private final static int DURATION_FOR_DEFAULT = 4;
    protected WebDriver driver;

    public AbstractPageObject(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getElement(By by, int waitForSeconds){ // Використовуємо коли елемент видимий на сторінці.Потрібен для екстра ординарних випадкі, коли ми самі хочемо чекати якусь кількість часу
        return new WebDriverWait(driver, Duration.ofSeconds(waitForSeconds))
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement getElement(By by){ // для всіх звичайних випадків, час очікування в константі - однаковий для всіх
        return new WebDriverWait(driver, Duration.ofSeconds(DURATION_FOR_DEFAULT))
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
