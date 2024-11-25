package training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsTest {

    public WebDriver driver;

    @Test
    public void testMethods(){
        openBrowser();
        scrollDown();
        clickOnAlertsFrameWindows();
        clickOnBrowserWindowsSubmenu();
        clickOnNewTabButton();
        interactWithNewTab();
        closeWindow();
        switchToDefaultWindow();
        clickOnNewWindowButton();
        interactWithNewWindow();
        closeWindow();
        switchToDefaultWindow();
        quitBrowser();
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
        WebElement alertsFrameWindowsMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertsFrameWindowsMenu.click();
    }

    public void clickOnBrowserWindowsSubmenu(){
        WebElement browserWindowsSubmenuElement = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        browserWindowsSubmenuElement.click();
    }

    public void clickOnNewTabButton(){
        WebElement newTabButtonElement = driver.findElement(By.xpath("//button[@id='tabButton']"));
        newTabButtonElement.click();
    }

    public void interactWithNewTab(){
        List<String> windowsList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowsList.get(1));
        System.out.println("Textul din noul tab este: "+driver.findElement(By.id("sampleHeading")).getText());
    }

    public void closeWindow(){
        driver.close();
    }

    public void switchToDefaultWindow(){
        List<String> windowsList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowsList.get(0));
    }

    public void clickOnNewWindowButton(){
        WebElement newWindowButtonElement = driver.findElement(By.xpath("//button[@id='windowButton']"));
        newWindowButtonElement.click();
    }

    public void interactWithNewWindow(){
        List<String> windowsList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowsList.get(1));
        System.out.println("Textul din noua fereastra este: "+driver.findElement(By.id("sampleHeading")).getText());
    }

    public void quitBrowser (){
        driver.quit();
    }
}
