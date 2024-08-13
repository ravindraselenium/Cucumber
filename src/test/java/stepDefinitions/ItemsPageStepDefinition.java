package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.PicoContainerSteup;
import io.cucumber.java.en.When;

public class ItemsPageStepDefinition {

	PicoContainerSteup picoContainerSteup;

	public ItemsPageStepDefinition(PicoContainerSteup picoContainerSteup) {
		this.picoContainerSteup = picoContainerSteup;
	}

	public By getSize(String size) {
		return By.xpath(
				"//strong[@class='product name product-item-name']/a[contains(text(),'Proteus Fitness Jackshirt')]/ancestor::div[@class='product details product-item-details']//child::div[text()='"
						+ size + "']");

	}

	public By getColorLocator(String color) {
		return By.xpath(
				"//strong[@class='product name product-item-name']/a[contains(text(),'Proteus Fitness Jackshirt')]/ancestor::div[@class='product details product-item-details']//child::div[@option-label='"
						+ color + "']");
	}

	@When("I select a Jaacket of {string} {string}")
	public void i_select_a_jaacket_of(String size, String color) {
		WebElement size_e = picoContainerSteup.driver.findElement(getSize(size));
		size_e.click();
		WebElement color_e = picoContainerSteup.driver.findElement(getColorLocator(color));
		color_e.click();

	}

	@When("Click on add to cart button")
	public void click_on_add_to_cart_button() {
	}

}
