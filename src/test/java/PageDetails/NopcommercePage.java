package PageDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NopcommercePage {
	WebDriver driver;
	
	//Registeration page

	@FindBy(id  = "gender-female")
	WebElement female;
	@FindBy(id = "FirstName")
	WebElement fname;
	@FindBy(id  = "LastName")
	WebElement lname ;
	@FindBy(id = "Email")
	WebElement  email;

	//company details
	@FindBy(id  = "Company")
	WebElement  companyname;
	@FindBy(id = "Newsletter")
	WebElement option;
	@FindBy(id = "Password")
	WebElement passwrd;
	@FindBy(id = "ConfirmPassword")
	WebElement confmpasswrd ;
	@FindBy(id = "register-button")
	WebElement  register;
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[1]/a/img")
	WebElement logo;
	
	

	public NopcommercePage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	public void registration(String f_nam,String l_nam,String emai,String cmpny_nam,String pswd) {
	if(!female.isSelected()) {
	female.click();
	}
	fname.clear();
	fname.sendKeys(f_nam);
	lname.clear();
	lname.sendKeys(l_nam);
	Actions act=new Actions(driver);
	act.moveToElement(option);
	email.sendKeys(emai);
	companyname.sendKeys(cmpny_nam);
	if(!option.isSelected()) {
	option.click();
	}
	Actions acts=new Actions(driver);
	acts.moveToElement(register);
	passwrd.sendKeys(pswd);
	confmpasswrd.sendKeys(pswd);
	register.click();
	}
	
	
	
	
	public void titleVerification() {
		  String expect="nopCommerce";
		  String actual=driver.getCurrentUrl();
		  Assert.assertEquals(actual, expect);
		 }
		 public void currentUrl() {
		  System.out.println(driver.getCurrentUrl());
		 }
		 public void logos() {
		     if (logo.isDisplayed()) {
		               System.out.println("Logo is present on the page.");
		           } else {
		               System.out.println("Logo is NOT present on the page.");
		           }
		 }


}
