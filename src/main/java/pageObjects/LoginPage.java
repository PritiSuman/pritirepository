package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'login-button-wrapper')]/descendant::a[contains(@class, 'btn btn-block btn-social btn-saml')]")
	private WebElement link_SAML;
	
	

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'or with username and password')]")
	private WebElement link_ToUse_UserName_Or_Password;
	
	
	@FindBy(how = How.NAME, using = "username")
	private WebElement txtbx_UserName;
	
	

	@FindBy(how = How.NAME, using = "password")
	private WebElement txtbx_Password;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='btn-block btn btn-primary']")
	private WebElement btn_Submit;
	
	
	
	public void click_ToLinkFor_UserNameAnd_Password()
	{
		link_ToUse_UserName_Or_Password.click();
	}
	
	
	public void enter_UserName(String sUserName)
	{
		txtbx_UserName.sendKeys(sUserName);
	}
	
	
	public void enter_Password(String sPassword )
	{
		txtbx_Password.sendKeys(sPassword);
	}
	
	public void clickOn_SubmitButton()
	{
		btn_Submit.click();
	}
	
	
	public void loginTo_IntelieLiveApplication(String sUserName, String sPassword)
	{
		click_ToLinkFor_UserNameAnd_Password();
		enter_UserName(sUserName);
		enter_Password(sPassword );
		clickOn_SubmitButton();
		
	}

}
