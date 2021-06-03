package com.An_Tmobileapp.pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.An_Tmobileapp.genericLib.BaseTest;

public class NewCamapignPage {
	@FindBy(xpath="//input[@name='property(Campaign Name)']") private WebElement campaignName;
	@FindBy(xpath="//div[@class='bodyText mandatory']/following-sibling::table[2]//input[@value='Save']") private WebElement saveBtn; 
	
	public NewCamapignPage() {
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public WebElement getCampaignName() {
		return campaignName;
	}
	
	public void createCampaign(String cName) {
		
		campaignName.sendKeys(cName);
		saveBtn.click();
}
	
	
}
