package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerLoiginPage {

	WebDriver driver;

	By email_l = By.id("email");
	By password_l = By.id("pass");
	By loginButton_l = By.id("send2");

	By createAnAccount_l = By.xpath("//span[contains(text(),'Create an Account')]");

	public CustomerLoiginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void LoginToLuma(String uname, String password) {
		WebElement uname_e = driver.findElement(email_l);
		uname_e.sendKeys(uname);
		WebElement password_e = driver.findElement(password_l);
		password_e.sendKeys(password);

		WebElement loginButton_e = driver.findElement(loginButton_l);

		loginButton_e.click();
	}

	public void NavigateToCreateAnAccountPage() {
		WebElement createAnAccount_e = driver.findElement(createAnAccount_l);
		createAnAccount_e.click();
	}

}
