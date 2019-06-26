package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLogin {
   static WebDriver driver;

@Given("Launch Browser and get facebook")
public void launch_Browser_and_get_facebook() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.facebook.com/");
}

@When("enter username and password{string},{string}")
public void enter_username_and_password(String s1, String s2) {
	driver.findElement(By.id("email")).sendKeys(s1);
	driver.findElement(By.id("pass")).sendKeys(s2);	
}

@When("click login")
public void click_login() {
	driver.findElement(By.id("loginbutton")).click();
}

@Then("validate homepage")
public void validate_homepage() {
	 Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Home']")).isDisplayed());
}

}
