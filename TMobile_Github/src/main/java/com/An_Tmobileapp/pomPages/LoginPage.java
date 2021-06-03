package com.An_Tmobileapp.pomPages;

	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.An_Tmobileapp.genericLib.BaseTest;

	public class LoginPage extends BaseTest {
		@FindBy(id="userName")private WebElement untb;
		@FindBy(id="passWord")private WebElement pwtb;
		@FindBy(xpath="//input[@title='Sign In']")private WebElement loginBtn;
		  
		public LoginPage() {
			PageFactory.initElements(BaseTest.driver, this);
			}
		public WebElement getUntb(){
			return untb;
		}
		
		public WebElement getPwtb() {
			return pwtb;
		}
		
		public WebElement getLoginBtn() {
			return loginBtn;
		}
		
		public void login(String un, String pwd)
		{
			untb.sendKeys(un);
			pwtb.sendKeys(pwd);
			loginBtn.click();
		}

	}

