package com.An_Tmobileapp.Actionstream;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.An_Tmobileapp.ValidLoginTest;
import com.An_Tmobileapp.genericLib.BaseTest;
import com.An_Tmobileapp.genericLib.FileLib;
import com.An_Tmobileapp.genericLib.WebDriverCommonLib;
import com.An_Tmobileapp.pomPages.SearchTab;

@Listeners(com.An_Tmobileapp.genericLib.MyListeners.class)
public class SearchElementTest extends BaseTest{
	@Test
	public void searchElement() throws Throwable {
		//login n verify
		ValidLoginTest vl= new ValidLoginTest();
		vl.loginToApp();
		
		
		//search for active campaigns
		FileLib flib= new FileLib();
		
		SearchTab sb=new SearchTab();
		String searchbox= flib.getCellData(Excel_PATH, "newcampaigndetails", 1, 0);
		
		sb.searchBar(searchbox);
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		
		wlib.getFullScreenshot("./data");	
		
	}
	

}
