package training;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTablesTestFacutDeMine {

    public WebDriver driver;

    @Test
    public void navigateFromHomePageToWebElementsPage(){
        openBrowser();
        scrollDown();
        clickOnElementsMenu();
        clickOnWebTablesSubmenu();
        scrollDown();
        clickOnAddButton();
        fillFirstName();
        fillLastName();
        fillEmail();
        fillAge();
        fillSalary();
        fillDepartment();
        clickOnSubmitButton();
        clickOnAddButton();
        fillFirstNamePersTwo();
        fillLastNamePersTwo();
        fillEmailPersTwo();
        fillAgePersTwo();
        fillSalaryPersTwo();
        fillDepartmentPersTwo();
        clickOnSubmitButtonPersTwo();
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

    public void clickOnElementsMenu() {
        WebElement elementsMenu = driver.findElement(By.xpath("//h5[text()='Elements']"));
        elementsMenu.click();
    }

    public void clickOnWebTablesSubmenu(){
        WebElement webTablesSubmenuElement = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTablesSubmenuElement.click();
    }

    public void clickOnAddButton(){
        WebElement addButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        addButton.click();
    }

    public void fillFirstName(){
        WebElement firstNameFieldElement = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstNameFieldElement.sendKeys("Radu");
    }
    public void fillLastName(){
        WebElement lastNameFieldElement = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameFieldElement.sendKeys("Grigorescu");
    }

    public void fillEmail(){
        WebElement emailFieldElement = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailFieldElement.sendKeys("radugrigorescu@mail.com");
    }

    public void fillAge(){
        WebElement ageFieldElement = driver.findElement(By.xpath("//input[@id='age']"));
        ageFieldElement.sendKeys("37");
    }

    public void fillSalary(){
        WebElement salaryFieldElement = driver.findElement(By.xpath("//input[@id='salary']"));
        salaryFieldElement.sendKeys("6500");
    }

    public void fillDepartment(){
        WebElement departmentFieldElement = driver.findElement(By.xpath("//input[@id='department']"));
        departmentFieldElement.sendKeys("Sales");
    }

    public void clickOnSubmitButton(){
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();
    }

    //a doua persoana

    public void fillFirstNamePersTwo(){
        WebElement firstNameFieldElement = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstNameFieldElement.sendKeys("Mihai");
    }
    public void fillLastNamePersTwo(){
        WebElement lastNameFieldElement = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameFieldElement.sendKeys("Dumitru");
    }

    public void fillEmailPersTwo(){
        WebElement emailFieldElement = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailFieldElement.sendKeys("mdumitru@mail.com");
    }

    public void fillAgePersTwo(){
        WebElement ageFieldElement = driver.findElement(By.xpath("//input[@id='age']"));
        ageFieldElement.sendKeys("29");
    }

    public void fillSalaryPersTwo(){
        WebElement salaryFieldElement = driver.findElement(By.xpath("//input[@id='salary']"));
        salaryFieldElement.sendKeys("7800");
    }

    public void fillDepartmentPersTwo(){
        WebElement departmentFieldElement = driver.findElement(By.xpath("//input[@id='department']"));
        departmentFieldElement.sendKeys("Claims");
    }

    public void clickOnSubmitButtonPersTwo(){
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();
    }

}
