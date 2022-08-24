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
}
