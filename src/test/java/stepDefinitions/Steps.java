package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.annotations.Test;

public class Steps {
    @Then("^run fun1$")
    public void runfun1() {
        System.out.println("hello1");
    }

    @Then("^run fun2$")
    public void runfun2() {
        System.out.println("hello2");
    }

    @And("^run fun3$")
    public void runfun3() {
        System.out.println("hello3");
    }
}
