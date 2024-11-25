package training;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PracticeFormTest {

    //Cream o metoda de test care sa mearga de pe pagina principala pana pe Practice Form
    public WebDriver driver;

    @Test
    public void navigateFromHomePageToPracticeFormPage(){
        openBrowser();
        scrollDown();
        clickFormMenu();
        clickOnPracticeFormSubmenu();
        scrollDown();
        fillFirstName();
        fillLastName();
        fillEmail();
        fillGender("Male");
        fillPhoneNumber();
        scrollDown();
        fillDateOfBirth();
        selectSubject();
        fillHobbies("Sports");
        fillHobbies("Reading");
        fillHobbies("Music");
        scrollDown();
        uploadImage();
        fillCurrentAddress();
        scrollDown();
        selectState();
        selectCity();
        clickOnSubmitButton();

    }

    //Facem o metoda care sa deschida browser-ul Chrome
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }

    //Facem o metoda care sa dea click pe meniul Forms
    public void clickFormMenu(){
        scrollDown();
        WebElement formsMenuElement = driver.findElement(By.xpath("//h5[text()='Forms']"));
        formsMenuElement.click();
    }

    //Facem o metoda care sa faca scroll in jos pe pagina
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,335)");
    }

    //Facem o metoda care sa faca click pe submeniul Practice Form
    public void clickOnPracticeFormSubmenu(){
        WebElement practiceFormSubmenuElement = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        practiceFormSubmenuElement.click();
    }

    //Facem o metoda sa completam campul de First Name
    public void fillFirstName(){
        WebElement firstNameFieldElement = driver.findElement(By.id("firstName"));
        firstNameFieldElement.sendKeys("Bogdan-Andrei");
    }

    //Facem o metoda care sa completeze campul Last Name
    public void fillLastName(){
        WebElement lastNameFieldElement = driver.findElement(By.id("lastName"));
        lastNameFieldElement.sendKeys("Ionescu");
    }

    //Facem o metoda care sa completeze campul e-mail
    public void fillEmail(){
        WebElement emailFieldElement = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailFieldElement.sendKeys("exemplu@yahoo.com");
    }
    //Facem o metoda care sa selecteze genul
    public void fillGender(String gender){
        WebElement maleGenderCheckboxElement = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement femaleGenderCheckboxElement = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement otherGenderCheckboxElement = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));
        List<WebElement> genderListElements = new ArrayList<>();
        genderListElements.add(maleGenderCheckboxElement);
        genderListElements.add(femaleGenderCheckboxElement);
        genderListElements.add(otherGenderCheckboxElement);
        for (int i = 0; i<genderListElements.size();i++){
            if (genderListElements.get(i).getText().equals(gender)){
                genderListElements.get(i).click();
            }
        }
    }

    //Facem o metoda care sa completeze campul Phone Number
    public void fillPhoneNumber(){
        WebElement phoneNumberFieldElement = driver.findElement(By.xpath("//input[@id='userNumber']"));
        phoneNumberFieldElement.sendKeys("0712345678");
    }
    //Facem o metoda care sa completeze campul Data nasterii
    public void fillDateOfBirth(){
        WebElement dateOfBirthFieldElement = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirthFieldElement.click();
        WebElement monthElement = driver.findElement(By.className("react-datepicker__month-select"));
        Select selectMonth = new Select(monthElement);
        selectMonth.selectByVisibleText("September");
        WebElement yearElement = driver.findElement(By.className("react-datepicker__year-select"));
        Select selectYear = new Select(yearElement);
        selectYear.selectByVisibleText("1994");
        WebElement dayElement = driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='25']"));
        dayElement.click();
    }

    //Facem o metoda care sa completeze campul Subjects
    public void selectSubject(){
        WebElement selectSubjectInputField = driver.findElement(By.id("subjectsInput"));
        selectSubjectInputField.sendKeys("Accounting");
        selectSubjectInputField.sendKeys(Keys.ENTER);
    }

    //Facem o metoda care sa selecteze optiunile de la Hobbies
    public void fillHobbies(String hobbies){
        WebElement sportsHobbyCheckboxElement = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        WebElement readingHobbyCheckboxElement = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
        WebElement musicHobbyCheckboxElement = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
        List<WebElement> hobbiesListElements = new ArrayList<>();
        hobbiesListElements.add(sportsHobbyCheckboxElement);
        hobbiesListElements.add(readingHobbyCheckboxElement);
        hobbiesListElements.add(musicHobbyCheckboxElement);
        for (int i = 0; i<hobbiesListElements.size();i++){
            if (hobbiesListElements.get(i).getText().equals(hobbies)){
                hobbiesListElements.get(i).click();
            }
        }
    }

    //Facem o metoda care sa incarce un fisier in formular
    public void uploadImage(){
        String pictureFilePath = "src/test/resources/imagineintellij.png";
        File file = new File(pictureFilePath);
        WebElement inputPictureButton = driver.findElement(By.cssSelector("#uploadPicture"));
        inputPictureButton.sendKeys(file.getAbsolutePath());
    }
    //Vom face scroll down in continuare
    //Facem o metoda care sa completeze campul Current Address
    public void fillCurrentAddress(){
        WebElement currentAddressFieldElement = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddressFieldElement.sendKeys("Bucuresti Sector 3, Str.A, nr.10, bl.5, et.2, ap.7");
    }
    //Facem o metoda care sa selecteze Statul
    public void selectState(){
        WebElement stateElement = driver.findElement(By.id("state"));
        stateElement.click();
        WebElement selectStateFromList = driver.findElement(By.xpath("//div[contains(text(),'Haryana')]"));
        selectStateFromList.click();
    }
    //Facem o metoda care sa selecteze Orasul
    public void selectCity(){
        WebElement cityElement = driver.findElement(By.id("city"));
        cityElement.click();
        WebElement selectCityFromList = driver.findElement(By.xpath("//div[contains(text(),'Panipat')]"));
        selectCityFromList.click();
    }
    //Facem o metoda care sa faca click pe Submit
    public void clickOnSubmitButton(){
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();
    }
    //de validat tabelul cu valori - tema pentru saptamana viitoare

}
