package com.vtiger.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.pages.loginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	
	public WebDriver driver;
	
	@Given("^User should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/Selenium_Software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:100");
		driver.manage().window().maximize();
	    
	}

	@When("^user enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
		loginPage lp = new loginPage(driver);
		lp.login("adasda", "asfaf");
	}

	@Then("^user should be login successfully$")
	public void user_should_be_login_successfully() throws Throwable {
	    System.out.println(driver.findElement(By.linkText("Logout")).isDisplayed());
	}

	@Then("^user should be landed on home page$")
	public void user_should_be_landed_on_home_page() throws Throwable {
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@When("^user enters invalid credentials username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_invalid_credentials_username_and_password(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("user_name")).sendKeys(arg1);
	    driver.findElement(By.name("user_password")).sendKeys(arg2);
	    driver.findElement(By.name("Login")).click();
	}

	@Then("^user should be on loginpage only$")
	public void user_should_be_on_loginpage_only() throws Throwable {
	    System.out.println("on login page");
	}

	@Then("^user should get error msg \"([^\"]*)\"$")
	public void user_should_get_error_msg(String arg1) throws Throwable {
	   System.out.println("This is error");
	}

}
