package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

        for (int i = 0; i < output.size(); i++) {

            resultInString.add(output.get(i).getText());
        }

        ArrayList<String> checkFromThis = new ArrayList<>();
        checkFromThis.add("Name:" + name);
        checkFromThis.add("Email:" + email);
        checkFromThis.add("Current Address :" + currentAddress);
        checkFromThis.add("Permananet Address :" + permanentAddress);

        boolean isFound = true;
        for (int i = 0; i < checkFromThis.size(); i++) {
            if (checkFromThis.contains(resultInString.get(i))) {
                isFound = true;
            } else {
                isFound = false;
                break;
            }
        }
        if (isFound)
            System.out.println("Data is  correct!!!");
        else
            System.out.println("Data is incorrect!!!");
        driver.close();
    }

    @And("^Click on Submit button$")
    public void clickOnSubmitButton() throws InterruptedException {
        driver.findElement(Locators.submitButton).click();
        Thread.sleep(1000);
    }


    //TC2
    @And("^Click on Radio button present below Element dropdown$")
    public void clickOnRadioButtonPresentBelowElementDropdown() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(Locators.radioButton).click();
    }

    @Then("^Verify if three radio buttons get displayed on screen$")
    public void verifyIfThreeRadioButtonsGetDisplayedOnScreen() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> numberOfRadioButtons = driver.findElements(Locators.numberOfRadioButtons);
        if (numberOfRadioButtons.size() == 3)
            System.out.println("Yes displayed successfully");
        else
            System.out.println("Not displayed successfully");
    }

    @And("^Click on first radio button$")
    public void clickOnFirstRadioButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(Locators.radio1).click();

    }

    @And("Verify if {string} text displayed on screen")
    public void verifyIfTextDisplayedOnScreen(String res) throws InterruptedException {
        Thread.sleep(1000);
        if (driver.findElement(Locators.radioButtonResponse).getText().equalsIgnoreCase(res))
            System.out.println("Successfull outcome");
    }

    @Then("^Click on second radio button$")
    public void clickOnSecondRadioButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(Locators.radio2).click();
    }

    @Then("^Check if user is able to click on third radio button$")
    public void checkIfUserIsAbleToClickOnThirdRadioButton() {
        List<WebElement> numberOfRadioButtons = driver.findElements(Locators.numberOfRadioButtons);
        if (!numberOfRadioButtons.get(2).isEnabled())
            System.out.println("Third radio button is disabled");
        else
            System.out.println("Third radio button is enabled");
    }

    @Then("Close browser")
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

    //    TC3
    @And("Click on {string} button")
    public void clickOnButton(String buttonName) throws InterruptedException {
        Thread.sleep(2500);
        driver.findElement(Locators.dropDownButtons(buttonName)).click();
    }

    @Then("Click on {string} column header")
    public void clickOnColumnHeader(String columnString) throws InterruptedException {
        Thread.sleep(1500);
        List<WebElement> headers = driver.findElements(Locators.columnHeaders);
        headers.get(Integer.parseInt(columnString)).click();
    }

    @And("Verify if list get sort or not")
    public void verifyIfListGetSortOrNot() {
        List<WebElement> temp = driver.findElements(Locators.names);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> check = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {
            if(!temp.get(i).getText().contains(" ")) {
                names.add(temp.get(i).getText());
                check.add(temp.get(i).getText());
            }
        }
        Collections.sort(names);

        Boolean isTrue = true;
        for (int i = 0; i < names.size(); i++) {
            if (!names.get(i).equalsIgnoreCase(check.get(i))) {
                isTrue = false;
                break;
            }
        }

        if (isTrue)
            System.out.println("Sorted!!");
        else
            System.out.println("Not Sorted!!");
    }
}
