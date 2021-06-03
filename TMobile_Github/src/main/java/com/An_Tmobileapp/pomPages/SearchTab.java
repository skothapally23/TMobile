package com.An_Tmobileapp.pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.An_Tmobileapp.genericLib.BaseTest;

//@Listeners(com.Tmobile.genericLib.MyListeners.class)
public class SearchTab extends BaseTest{
	@FindBy(xpath="//input[@id='searchword']") private WebElement searchbox;
	@FindBy(xpath="//input[@type='submit']") private WebElement go;

	public void searchBar(String searchFor) {
		searchbox.sendKeys(searchFor);
		go.click();
		
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getGo() {
		return go;
	}
	
	public SearchTab() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	
	

}
