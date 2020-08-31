package testng_cuc.testnng_cucmb1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination
{
	
	 WebDriver driver;

public class StepDefinitions {
   @Given("^I am on the \"([^\"]*)\" page on URL \"([^\"]*)\"$")
   public void i_am_on_the_page_on_URL(String arg1, String arg2) throws Throwable {
       // Write code here that turns the phrase above into concrete actions
	   
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\piyush sinha\\OneDrive\\Desktop\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.hp.com");
		 
       throw new PendingException();
   }

   @When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
   public void i_fill_in_with(String arg1, String arg2) throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       throw new PendingException();
   }

   @When("^I click on the \"([^\"]*)\" button$")
   public void i_click_on_the_button(String arg1) throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       throw new PendingException();
   }

   @Then("^I should see \"([^\"]*)\" message$")
   public void i_should_see_message(String arg1) throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       throw new PendingException();
   }

   @Then("^I should see the \"([^\"]*)\" button$")
   public void i_should_see_the_button(String arg1) throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       throw new PendingException();
   }




}
}
