package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.PicoContainerSteup;
import io.cucumber.java.en.Given;

public class HomePageStepDefinition {

	PicoContainerSteup picoContainerSteup;

	public HomePageStepDefinition(PicoContainerSteup picoContainerSteup) {
		this.picoContainerSteup = picoContainerSteup;
	}

	By mensMenu_l = By.xpath("//span[contains(text(),'Men')]");
	By mensJackets_l = By.xpath("//a[contains(text(),'Jackets')]");

	@Given("I navigate to jackshirt page")
	public void i_navigate_to_jackshirt_page() {
		WebElement mensMenu_e = picoContainerSteup.driver.findElement(mensMenu_l);
		mensMenu_e.click();
		WebElement mensJackets_e = picoContainerSteup.driver.findElement(mensJackets_l);
		mensJackets_e.click();

	}

}
