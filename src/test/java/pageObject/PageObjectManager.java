package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public CustomerLoiginPage customerLoiginPage;
	public CreateNewCustomerAccountPage createNewCustomerAccountPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public CustomerLoiginPage getCustomerLoiginPage(WebDriver driver) {

		customerLoiginPage = new CustomerLoiginPage(driver);
		return customerLoiginPage;
	}

	public CreateNewCustomerAccountPage getCreateNewCustomerAccountPage() {
		createNewCustomerAccountPage = new CreateNewCustomerAccountPage(driver);
		return createNewCustomerAccountPage;
	}

}
