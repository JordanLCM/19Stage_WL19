package cuc_Utilities;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import cuc_Utilities.Base_Webdriver;

public class Base_Hooks {

	WebDriver driver;
	Base_Webdriver base;

	public Base_Hooks(Base_Webdriver base) {
		this.base = base;
	}

	@Before(order = 1)
	public void setUp() {
		base.setDriver();
	}

	@Before(order = 0)
	public void beforeScenarioStart() {
		System.out.println("-----------------Start of Scenario-----------------");
	}

	@After(order = 0)
	public void afterScenarioFinish() {
		System.out.println("-----------------End of Scenario-----------------");
	}

	@After(order = 1)
	public void tearDown() throws InterruptedException {
		Thread.sleep(1500);
		base.getDriver().quit();
	}
}
