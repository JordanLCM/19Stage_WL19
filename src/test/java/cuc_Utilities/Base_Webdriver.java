package cuc_Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Webdriver {

	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver() {
		String chromeDriver = "webdriver.chrome.driver";
		String chromeDriverPath = "C:\\Eclipse-Workspace\\19Stage_WL19\\driver\\chromedriver.exe";
		System.setProperty(chromeDriver, chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
}
