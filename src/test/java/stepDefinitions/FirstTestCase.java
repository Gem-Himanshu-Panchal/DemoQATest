package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class FirstTestCase {
    public WebDriver driver;

    @Then("^Setup Environment and open chrome$")
    public void setup_environment_and_open_chrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh Kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    }

    @Then("^Search for DemoQA website in chrome tab$")
    public void search_for_demo_qa_website_in_chrome_tab() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }

    @Then("^Click on Elements button$")
    public void click_on_elements_button() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(Locators.elementButton).click();
    }

    @Then("^Click on Text button present below Element dropdown$")
    public void click_on_text_button_present_below_element_dropdown() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(Locators.textBoxButton).click();
    }

    @Then("Fill the details {string},{string},{string},{string}")
    public void fill_the_details(String name, String email, String currentAddress, String permanentAddress) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(Locators.nameInputField).sendKeys(name);
        Thread.sleep(1000);
        driver.findElement(Locators.emailInput).sendKeys(email);
        Thread.sleep(1000);
        driver.findElement(Locators.currentAddressField).sendKeys(currentAddress);
        Thread.sleep(1000);
        driver.findElement(Locators.permanentAddressField).sendKeys(permanentAddress);
        Thread.sleep(1000);
    }

    @And("^Verify if the data displayed is correct or not$")
    public void verifyIfTheDataDisplayedIsCorrectOrNot() {

    }

    @And("Verify if {string},{string},{string},{string} data displayed is correct or not")
    public void verifyIfDataDisplayedIsCorrectOrNot(String name, String email, String currentAddress, String permanentAddress) {
        List<WebElement> output = driver.findElements(Locators.outputWebElement);
        ArrayList<String> resultInString = new ArrayList<>();

        for(int i=0;i<output.size();i++){

            resultInString.add(output.get(i).getText());
        }

        ArrayList<String> checkFromThis = new ArrayList<>();
        checkFromThis.add("Name:"+name);
        checkFromThis.add("Email:"+email);
        checkFromThis.add("Current Address :"+currentAddress);
        checkFromThis.add("Permananet Address :"+permanentAddress);

        boolean isFound=true;
        for(int i=0;i<checkFromThis.size();i++){
            if(checkFromThis.contains(resultInString.get(i))){
                isFound=true;
            }
               else{
                   isFound=false;break;
            }
        }
        if (isFound)
            System.out.println("Data is  correct!!!");
        else
            System.out.println("Data is incorrect!!!");
    }

    @And("^Click on Submit button$")
    public void clickOnSubmitButton() throws InterruptedException {
        driver.findElement(Locators.submitButton).click();
        Thread.sleep(1000);
    }
}
