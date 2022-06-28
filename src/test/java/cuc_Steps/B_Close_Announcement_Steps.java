package cuc_Steps;

import static org.junit.Assert.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cuc_Pages_Data.A_Announcement;
import cuc_Utilities.Base_Webdriver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class B_Close_Announcement_Steps {

	WebDriver driver;
	Base_Webdriver base;
	A_Announcement announce;
	
	public B_Close_Announcement_Steps(Base_Webdriver base) {
		this.base = base;
	}

	@Given("user opens {string} for closing announcement")
	public void user_opens_for_closing_announcement(String Url) {
		base.getDriver().get(Url);
	}

	@And("user clicks on do not show again checkbox")
	public void user_clicks_on_do_not_show_again_checkbox() throws InterruptedException {
		Thread.sleep(1500);
		announce = new A_Announcement(base);
		announce.doNotShowAgainTodayCheckbox();
	}

	@Then("user clicks on close button")
	public void user_clicks_on_close_button() {
		announce = new A_Announcement(base);
		announce.closeAnnouncement();
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
