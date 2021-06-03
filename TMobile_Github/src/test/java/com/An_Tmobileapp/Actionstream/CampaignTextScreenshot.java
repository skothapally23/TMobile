package com.An_Tmobileapp.Actionstream;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.An_Tmobileapp.ValidLoginTest;
import com.An_Tmobileapp.genericLib.BaseTest;
import com.An_Tmobileapp.genericLib.FileLib;
import com.An_Tmobileapp.genericLib.WebDriverCommonLib;
import com.An_Tmobileapp.pomPages.CamapaignHomePage;

@Listeners(com.An_Tmobileapp.genericLib.MyListeners.class)
public class CampaignTextScreenshot extends BaseTest {
	
	//open browser and enter the test url
	@Test
	public void campaignScreenshot() throws Throwable {
		
		//login into app n verify
		ValidLoginTest vl= new ValidLoginTest();
		vl.loginToApp();
	
	//// click on campaign tab on zoho crm custom view page and verify all campaign page
		
		CamapaignHomePage homePage=new CamapaignHomePage();
		homePage.clickCampaignTab();
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		FileLib flib = new FileLib();

		wlib.waitForTitle(flib.readPropData(PROP_PATH, "campaignTitle"));
		wlib.verify(wlib.getPageTitle(), flib.readPropData(PROP_PATH, "campaignTitle"), "campaign Page");
		//take screenshot 
		
		wlib.getFullScreenshot(".\\data\\campaignScreenshot.jpg");	
	
	
	}

}
