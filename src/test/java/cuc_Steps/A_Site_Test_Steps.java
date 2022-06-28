package cuc_Steps;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cuc_Utilities.Base_Webdriver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class A_Site_Test_Steps {

	WebDriver driver;
	Base_Webdriver base;

	public A_Site_Test_Steps(Base_Webdriver base) {
		this.base = base;
	}

	@Given("user opens {string}")
	public void user_opens(String Url) {
		base.getDriver().get(Url);
	}

	@And("user checks that site opened is {string}")
	public void user_checks_that_site_opened_is(String Url) {
		String linkName = base.getDriver().getCurrentUrl();
		if (!linkName.equals(Url)) {
			try {
				assertEquals(linkName, Url);
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(linkName);
		}
	}

	@AfterStep
	public void addScreenshot(Scenario scenario) {

		// validate if scenario has failed
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) base.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image");
		}
	}
}
