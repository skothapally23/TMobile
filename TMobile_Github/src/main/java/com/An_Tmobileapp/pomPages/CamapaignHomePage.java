package com.An_Tmobileapp.pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.An_Tmobileapp.genericLib.BaseTest;

public class CamapaignHomePage {
	@FindBy(xpath="//a[text()='Campaigns']") private WebElement campaignTab;

	public CamapaignHomePage() {
		super();
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getCampaignTab() {
		return campaignTab;
	}

	public void clickCampaignTab() {
		campaignTab.click();
	}
	
	
}
