package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewCustomerAccountPage {

	WebDriver driver;

	public CreateNewCustomerAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	By firstname_l = By.id("firstname");
	By lastname_l = By.id("lastname");

	By email_address_l = By.id("email_address");
	By password_l = By.id("password");
	By password_confirmation_l = By.id("password-confirmation");

	By createanAccount_l = By.xpath("//span[contains(text(),'Create an Account')]");

	public void setPersonalInformation(String firstName, String lastName) {
		WebElement firstname_e = driver.findElement(firstname_l);
		firstname_e.sendKeys(firstName);

		WebElement lastname_e = driver.findElement(lastname_l);
		lastname_e.sendKeys(lastName);
	}

	public void setSignInInformation(String emailId, String password) {
		WebElement email_address_e = driver.findElement(email_address_l);
		email_address_e.sendKeys(emailId);
		WebElement password_e = driver.findElement(password_l);
		password_e.sendKeys(password);
		WebElement password_confirmation_e = driver.findElement(password_confirmation_l);
		password_confirmation_e.sendKeys(password);

	}

	public void createAnLumaAccount(String firstName, String lastName, String emailId, String password) {

		setPersonalInformation(firstName, lastName);
		setSignInInformation(emailId, password);
		WebElement createanAccount_e = driver.findElement(createanAccount_l);
		createanAccount_e.click();

	}

}
