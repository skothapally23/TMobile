package com.An_Tmobileapp.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import com.An_Tmobileapp.genericLib.FileLib;

public class BaseTest implements IAutoConsts {
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() throws Throwable {
		FileLib flib = new FileLib();
		String browserName = flib.readPropData(PROP_PATH, "browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Enter proper browser name");
		}
		driver.manage().window().maximize();
		String appurl=flib.readPropData(PROP_PATH, "url");
		driver.get(appurl);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(),flib.readPropData(PROP_PATH, "loginTitle"),"Login page");
		
		
	}
	public void closeBrowser()
	{
		driver.quit();
	}

}
