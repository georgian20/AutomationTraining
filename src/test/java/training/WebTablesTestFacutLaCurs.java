package training;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WebTablesTestFacutLaCurs {

    //declaram o variabila globala pentru dimensiunea tabelului
    int initialTableSize = 0;  //la variabile nu avem nevoie de paranteze.

    public WebDriver driver;

    @Test
    public void navigateFromHomePageToWebElementsPage(){
        //openBrowser();
        openBrowser2();
        scrollDown();
        clickOnElementsMenu();
        clickOnWebTablesSubmenu();
        scrollDown();
        getInitialTableSize();
        //clickOnAddButton();
        //deleteItem1();
        //deleteItem2();
        //deleteItem3();
        clickOnAddButton2();
        fillRegistrationForm();
        //clickOnAddButton2();
        //fillRegistrationForm2();
        //clickOnAddButton2();
        //fillRegistrationForm3();
        //deleteItem2();
        //deleteItem1();
        checkNewTableRecords();
    }

    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().setSize(new Dimension(1920,1080));
    }
    public void openBrowser2(){
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
        WebElement addButtonElement = driver.findElement(By.id("addNewRecordButton"));
        Actions actions = new Actions(driver);
        actions.moveToElement(addButtonElement).click().perform();
    }
    public void clickOnAddButton2(){
        //waitForElement();
        WebElement addButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        addButton.click();
    }

    //Facem o metoda care completeaza tot formularul
    public void fillRegistrationForm (){
        fillFirstName("Radu");
        fillLastName("Grigorescu");
        fillEmail("rgrig@mail.com");
        fillAge("34");
        fillSalary("6750");
        fillDepartment("Sales");
        clickOnSubmitButton();
    }
    public void fillFirstName(String firstName) {
        WebElement firstNameFieldElement = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstNameFieldElement.sendKeys(firstName);
    }
    public void fillLastName(String lastName){
        WebElement lastNameFieldElement = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameFieldElement.sendKeys(lastName);
    }

    public void fillEmail(String emailAddress){
        WebElement emailFieldElement = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailFieldElement.sendKeys(emailAddress);
    }

    public void fillAge(String varsta){
        WebElement ageFieldElement = driver.findElement(By.xpath("//input[@id='age']"));
        ageFieldElement.sendKeys(varsta);
    }

    public void fillSalary(String salaryField){
        WebElement salaryFieldElement = driver.findElement(By.xpath("//input[@id='salary']"));
        salaryFieldElement.sendKeys(salaryField);
    }

    public void fillDepartment(String department){
        WebElement departmentFieldElement = driver.findElement(By.xpath("//input[@id='department']"));
        departmentFieldElement.sendKeys(department);
    }

    public void clickOnSubmitButton(){
        WebElement submitButtonElement = driver.findElement(By.xpath("//button[@id='submit']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(submitButtonElement).click().perform();
    }
    public void fillRegistrationForm2 (){
        fillFirstName2("Ionel");
        fillLastName2("Mihalcea");
        fillEmail2("imih@mail.com");
        fillAge2("44");
        fillSalary2("8750");
        fillDepartment2("Sales");
        clickOnSubmitButton2();
    }
    public void fillFirstName2(String firstName) {
        WebElement firstNameFieldElement = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstNameFieldElement.sendKeys(firstName);
    }
    public void fillLastName2(String lastName){
        WebElement lastNameFieldElement = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameFieldElement.sendKeys(lastName);
    }

    public void fillEmail2(String emailAddress){
        WebElement emailFieldElement = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailFieldElement.sendKeys(emailAddress);
    }

    public void fillAge2(String varsta){
        WebElement ageFieldElement = driver.findElement(By.xpath("//input[@id='age']"));
        ageFieldElement.sendKeys(varsta);
    }

    public void fillSalary2(String salaryField){
        WebElement salaryFieldElement = driver.findElement(By.xpath("//input[@id='salary']"));
        salaryFieldElement.sendKeys(salaryField);
    }

    public void fillDepartment2(String department){
        WebElement departmentFieldElement = driver.findElement(By.xpath("//input[@id='department']"));
        departmentFieldElement.sendKeys(department);
    }

    public void clickOnSubmitButton2(){
        WebElement submitButtonElement = driver.findElement(By.xpath("//button[@id='submit']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(submitButtonElement).click().perform();
    }
    public void fillRegistrationForm3 (){
        fillFirstName3("Tudor");
        fillLastName3("Oprescu");
        fillEmail3("toprescu@mail.com");
        fillAge3("24");
        fillSalary3("5750");
        fillDepartment3("Claims");
        clickOnSubmitButton3();
    }
    public void fillFirstName3(String firstName) {
        WebElement firstNameFieldElement = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstNameFieldElement.sendKeys(firstName);
    }
    public void fillLastName3(String lastName){
        WebElement lastNameFieldElement = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameFieldElement.sendKeys(lastName);
    }

    public void fillEmail3(String emailAddress){
        WebElement emailFieldElement = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailFieldElement.sendKeys(emailAddress);
    }

    public void fillAge3(String varsta){
        WebElement ageFieldElement = driver.findElement(By.xpath("//input[@id='age']"));
        ageFieldElement.sendKeys(varsta);
    }

    public void fillSalary3(String salaryField){
        WebElement salaryFieldElement = driver.findElement(By.xpath("//input[@id='salary']"));
        salaryFieldElement.sendKeys(salaryField);
    }

    public void fillDepartment3(String department){
        WebElement departmentFieldElement = driver.findElement(By.xpath("//input[@id='department']"));
        departmentFieldElement.sendKeys(department);
    }

    public void clickOnSubmitButton3(){
        WebElement submitButtonElement = driver.findElement(By.xpath("//button[@id='submit']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(submitButtonElement).click().perform();
    }
    public void deleteItem1(){
        WebElement deleteItemFromTable = driver.findElement(By.id("delete-record-1"));
        deleteItemFromTable.click();
    }
    public void deleteItem2(){
        WebElement deleteItemFromTable = driver.findElement(By.id("delete-record-2"));
        deleteItemFromTable.click();
    }
    public void deleteItem3(){
        WebElement deleteItemFromTable = driver.findElement(By.id("delete-record-3"));
        deleteItemFromTable.click();
    }

    //Dimensiune tabel
    public int getInitialTableSize(){
        List<WebElement>tableElements=driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        initialTableSize=tableElements.size();
        System.out.println("Tabelul are "+initialTableSize+" randuri");
        return initialTableSize;
    }
    //Metoda - validam ca dupa introducere date in formular, am mai introdus o linie in tabel.
    public void checkNewTableRecords(){
        List<WebElement>tableElements=driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        int actualTableSize = tableElements.size();
        int expectedTableSize = initialTableSize+1;
        Assert.assertEquals(actualTableSize,expectedTableSize,"Actual table size: "+actualTableSize+" is different than expected table size: "+expectedTableSize);
        System.out.println("Actual table size: "+actualTableSize+" is different than expected table size: "+expectedTableSize);
    }

    //facem o metoda de wait = ca sa se incarce toata pagina - o folosim in metoda de clickOnElement
    public void waitForElement(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
