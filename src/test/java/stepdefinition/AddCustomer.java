package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomer {
	static WebDriver driver;


@Given("launch browser and get guru")
public void launch_browser_and_get_guru() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/");
}

@Given("click add customer")
public void click_add_customer() {
	driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
}

@When("fill on the details")
public void fill_on_the_details() {
	driver.findElement(By.xpath("//input[@name='rental']")).sendKeys("499");
	driver.findElement(By.xpath("//input[@name='local_minutes']")).sendKeys("10000");
	driver.findElement(By.xpath("//input[@name='inter_minutes']")).sendKeys("1000");
	driver.findElement(By.xpath("//input[@name='sms_pack']")).sendKeys("3000");
	driver.findElement(By.xpath("//input[@name='minutes_charges']")).sendKeys("1");
	driver.findElement(By.xpath("//input[@name='inter_charges']")).sendKeys("15");
	driver.findElement(By.xpath("//input[@name='sms_charges']")).sendKeys("1.5");
}

@When("click submit")
public void click_submit() {
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}

@Then("validate the outcomes")
public void validate_the_outcomes() {
	Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
}
}
