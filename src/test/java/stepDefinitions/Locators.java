package stepDefinitions;

import org.openqa.selenium.By;

public class Locators {

    public static By elementButton = By.xpath("//h5[text()='Elements']");
    public static By textBoxButton = By.xpath("//span[text()='Text Box']");
    public static By nameInputField = By.xpath("//input[@id='userName']");
    public static By emailInput = By.xpath("//input[@id='userEmail']");
    public static By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    public static By permanentAddressField = By.xpath("//textarea[@id='permanentAddress']");
    public static By submitButton = By.xpath("//button[@id='submit']");
    public static By outputWebElement = By.xpath("//div[@class='border col-md-12 col-sm-12']//p");
    public static By radioButton = By.xpath("//span[text()='Radio Button']");
    public static By numberOfRadioButtons = By.xpath("//input[@name='like']");
    public static By radio1 = By.xpath("//label[@for='yesRadio']");
    public static By radio2 = By.xpath("//label[@for='impressiveRadio']");
    public static By radioButtonResponse = By.xpath("//span[@class='text-success']");

    public static By dropDownButtons(String name) {
        return (By.xpath("//span[text()='" + name + "']"));
    }

    public static By columnHeaders = By.xpath("//div[@class='rt-resizable-header-content']");
    public static By names = By.xpath("//div[@class='rt-tr-group']//div[@class='rt-td'][1]");
}
