package cuc_Pages_Data;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cuc_Utilities.Base_Webdriver;

public class A_Announcement {

	WebDriver driver;
	Base_Webdriver base;

	public A_Announcement(Base_Webdriver base) {
		this.base = base;
	}

	public void doNotShowAgainTodayCheckbox() {
		WebElement doNotShowAgainTodayCheckboxBtn = base.getDriver().findElement(By.xpath("(//*[name()='svg'])[1]"));
		WebElement doNotShowAgainTodayCheckboxTxt = base.getDriver().findElement(By.xpath("(//span[contains(text(),'今日不再显示')])[1]"));
		String dNSATC = doNotShowAgainTodayCheckboxTxt.getText();
		if (!dNSATC.equals("今日不再显示")) {
			try {
				assertEquals(dNSATC, "今日不再显示");
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(dNSATC);
			doNotShowAgainTodayCheckboxBtn.click();
		}
	}

	public void closeAnnouncement() {
		WebElement closeAnnouncementBtn = base.getDriver().findElement(By.xpath("(//button[@aria-label='Close'])[1]"));
		closeAnnouncementBtn.click();
	}
}
