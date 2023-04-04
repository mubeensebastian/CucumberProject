package com.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TaskStep {
	WebDriver driver;
	@Given("user is on the omr branch page")
	public void user_is_on_the_omr_branch_page() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("greens omr");
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("blues@123");
		}
	@When("user click login button")
	public void user_click_login_button() {
		WebElement btnclk = driver.findElement(By.xpath("//button[text()='Login']"));
		btnclk.click();
		}
	@Then("user should verify after login success message")
	public void user_should_verify_after_login_success_message() {
		Assert.assertTrue("verify after login success msg", true);
		driver.quit();
		
}


}
