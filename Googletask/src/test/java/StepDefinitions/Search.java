package StepDefinitions;

import PageFactory.google;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Search {
    WebDriver driver;

    google g=new google();


    @Given("user is on google")
    public void user_is_on_google() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();

        System.setProperty("webdriver.chrome.driver","C:/Users/NasrG/Desktop/Task1/src/test/resources/Drivers/chromedriver.exe");


        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.navigate().to("https://www.google.com");

    }
    @When("user enters {string}")
    public void user_enters(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        g.enter_Search(driver,string);
    }
    @Then("click search")
    public void click_search() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        g.click_Search(driver);
    }
    @Then("choose the  first link")
    public void choose_the_first_link() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        g.click_Link(driver);
    }
    @Then("assert on power output")
    public void assert_on_power_output() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        Assert.assertEquals(g.find_elment_in_Shadow_cons(driver),"5.2-5.5");
        Assert.assertEquals(g.find_elment_in_Shadow_engine(driver),"163hp /5.000 - 5.000");
        Assert.assertEquals(g.find_elment_in_Shadow_from(driver),"8.1");
        Assert.assertEquals(g.find_elment_in_Shadow_max(driver),"230");
    }

}
