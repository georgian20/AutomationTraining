package training;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertsTests {

    public WebDriver driver;

    @Test
    public void alertsTests(){
        openBrowser();
        scrollDown();
        clickOnAlertsFrameWindows();
        clickOnAlertsSubmenu();
        clickOnFirstButton();
        interactWithAlertPopOut();
        clickOnSecondButton();
        interactWithTimerAlert();
        clickOnThirdButton();
        interactWithConfirmBoxAlert();
        clickOnFourthButton();
        interactWithPromptButton();
    }

    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
    }
    public void clickOnAlertsFrameWindows() {
        WebElement alertsFrameWindowssMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertsFrameWindowssMenu.click();
    }

    public void clickOnAlertsSubmenu(){
        WebElement alertsSubmenuElement = driver.findElement(By.xpath("//span[text()='Alerts']"));
        alertsSubmenuElement.click();
    }

    public void clickOnFirstButton(){
        WebElement firstButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
        firstButton.click();
    }

    //interactionam cu alreta (prima)
    public void interactWithAlertPopOut(){
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();
    }

    public void clickOnSecondButton(){
        WebElement secondButton = driver.findElement(By.id("timerAlertButton"));
        secondButton.click();
    }

    //interactionam cu alreta (a doua)
    public void interactWithTimerAlert(){
        waitForAlert();
        Alert timerAlert = driver.switchTo().alert();
        timerAlert.accept();
    }
    public void waitForAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void clickOnThirdButton(){
        WebElement thirdButton = driver.findElement(By.id("confirmButton"));
        thirdButton.click();
    }

    //interactionam cu alreta (a treia)
    public void interactWithConfirmBoxAlert(){
        Alert confirmBoxAlert = driver.switchTo().alert();
        confirmBoxAlert.dismiss();
    }

    public void clickOnFourthButton(){
        WebElement fourthButton = driver.findElement(By.id("promtButton"));
        fourthButton.click();
    }

    //interactionam cu alreta (a treia)
    public void interactWithPromptButton(){
        Alert promptButtonAlert = driver.switchTo().alert();
        promptButtonAlert.sendKeys("Abcdef");
        promptButtonAlert.accept();
    }
}
