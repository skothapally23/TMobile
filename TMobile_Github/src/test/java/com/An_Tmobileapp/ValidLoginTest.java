package com.An_Tmobileapp;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.An_Tmobileapp.genericLib.BaseTest;
import com.An_Tmobileapp.genericLib.FileLib;
import com.An_Tmobileapp.genericLib.WebDriverCommonLib;
import com.An_Tmobileapp.pomPages.LoginPage;


@Listeners(com.An_Tmobileapp.genericLib.MyListeners.class)
public class ValidLoginTest extends BaseTest {
		@Test
		public void loginToApp() throws Throwable {
			LoginPage lp=new LoginPage();
			FileLib flib= new FileLib();
			lp.login(flib.readPropData(PROP_PATH, "username"), flib.readPropData(PROP_PATH, "password"));
			
			
			WebDriverCommonLib wlib= new WebDriverCommonLib();
			wlib.waitForTitle(flib.readPropData(PROP_PATH, "homeTitle"));
			wlib.verify(wlib.getPageTitle(),flib.readPropData(PROP_PATH, "homeTitle"), "Zoho CRM - Home Page");
			
			
			
		}
}
