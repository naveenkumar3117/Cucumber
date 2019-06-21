package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps {
	static WebDriver driver;

	@Given("Launch the browser and get guru{int}")
	public void launch_the_browser_and_get_guru(Integer int1) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("Reach add tariff plan page")
	public void reach_add_tariff_plan_page() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("fill the required fields")
	public void fill_the_required_fields() {
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
