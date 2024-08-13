package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.PicoContainerSteup;
import io.cucumber.java.en.Given;

public class LoginPageStepDefinition {

	PicoContainerSteup picoContainerSteup;

	public LoginPageStepDefinition(PicoContainerSteup picoContainerSteup) {
		this.picoContainerSteup = picoContainerSteup;
	}

	By email_l = By.id("email");
	By password_l = By.id("pass");
	By loginButton_l = By.id("send2");
	

	@Given("I Login to Luma application with valid Login Details {string} and {string}")
	public void i_login_to_luma_application_with_valid_login_details(String uname, String password, String otp) {

		picoContainerSteup.driver = new ChromeDriver();
		picoContainerSteup.driver.get(
				"https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2xvZ291dFN1Y2Nlc3Mv/");
		picoContainerSteup.driver.manage().window().maximize();
		WebElement uname_e = picoContainerSteup.driver.findElement(email_l);
		uname_e.sendKeys(uname);
		WebElement password_e = picoContainerSteup.driver.findElement(password_l);
		password_e.sendKeys(password);

	

		WebElement loginButton_e = picoContainerSteup.driver.findElement(loginButton_l);

		loginButton_e.click();

	}

}
