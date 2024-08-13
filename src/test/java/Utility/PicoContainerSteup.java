package Utility;

import org.openqa.selenium.WebDriver;

import pageObject.PageObjectManager;

public class PicoContainerSteup {

	public WebDriver driver;

	public PageObjectManager manager;

	public PicoContainerSteup(PageObjectManager manager) {
		manager = new PageObjectManager(driver);
	}

}
