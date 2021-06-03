package com.An_Tmobileapp.pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.An_Tmobileapp.genericLib.BaseTest;

public class DisplayingNewCampaignPage {
	@FindBy(xpath="//input[@value='New Campaign']") private WebElement newCampaignBtn;

	public WebElement getNewCampaignBtn() {
		return newCampaignBtn;
	}

	public DisplayingNewCampaignPage() {
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	public void clicknewCampaignBtn() {
		newCampaignBtn.click();
	}
	
}
