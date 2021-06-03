package com.An_Tmobileapp.Actionstream;

import org.testng.annotations.Listeners;

import com.An_Tmobileapp.ValidLoginTest;
import com.An_Tmobileapp.genericLib.BaseTest;
import com.An_Tmobileapp.genericLib.FileLib;
import com.An_Tmobileapp.genericLib.WebDriverCommonLib;
import com.An_Tmobileapp.pomPages.CamapaignHomePage;
import com.An_Tmobileapp.pomPages.DisplayingNewCampaignPage;
import com.An_Tmobileapp.pomPages.NewCamapignPage;

@Listeners(com.An_Tmobileapp.genericLib.MyListeners.class)

public class EditCampaignTest extends BaseTest{
	
	public void createCampaign() throws Throwable {

		// login n verify
		ValidLoginTest vl = new ValidLoginTest();
		vl.loginToApp();

		// click on campaign tab on zoho crm custom view page and verify all campaign
		// page

		CamapaignHomePage cHomePage = new CamapaignHomePage();
		cHomePage.clickCampaignTab();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		FileLib flib = new FileLib();

		wlib.waitForTitle(flib.readPropData(PROP_PATH, "campaignTitle"));
		wlib.verify(wlib.getPageTitle(), flib.readPropData(PROP_PATH, "campaignTitle"), "campaign Page");

		// click on new campaign tab ang verify create campaign page
		DisplayingNewCampaignPage ncp = new DisplayingNewCampaignPage();
		ncp.clicknewCampaignBtn();

		wlib.waitForTitle(flib.readPropData(PROP_PATH, "createCampaignTitle"));
		wlib.verify(wlib.getPageTitle(), flib.readPropData(PROP_PATH, "createCampaignTitle"), "new campaign page");

		// fill all mandatory fields and click on save btn n verify it.
		NewCamapignPage cp = new NewCamapignPage();
		String camName = flib.getCellData(Excel_PATH, "newcampaigndetails", 0, 0);

		cp.createCampaign(camName);

		wlib.waitForTitle(flib.readPropData(PROP_PATH, "campaignDetailsTitle"));
		wlib.verify(wlib.getPageTitle(), flib.readPropData(PROP_PATH, "campaignDetailsTitle"), "campaign details page");
		
		//edit the created campaign and verify it
		
		
		
	}

}
