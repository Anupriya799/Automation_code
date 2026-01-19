package PageDetails;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdvantagePageDetails {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"speakersLink\"]")
	WebElement Allspeakers;
	@FindBy(xpath="//*[@id=\"20\"]")
	WebElement speaker;
	@FindBy(name="save_to_cart")
	WebElement addtocart;
	@FindBy(id="menuCart")
	WebElement cart;
	@FindBy(id="checkOutButton")
	WebElement checkout;
	@FindBy(id="registration_btn")
	WebElement registration;
	@FindBy(name="usernameRegisterPage")
	WebElement regusername;
	@FindBy(name="emailRegisterPage")
	WebElement regemail;
	@FindBy(name="passwordRegisterPage")
	WebElement regpassword;
	@FindBy(name="confirm_passwordRegisterPage")
	WebElement regconpass;
	
	
	@FindBy(name="first_nameRegisterPage")
	WebElement firstname;
	@FindBy(name="last_nameRegisterPage")
	WebElement lastname;
	@FindBy(name="phone_numberRegisterPage")
	WebElement phonenum;
	@FindBy(name="countryListboxRegisterPage")
	WebElement country;
	@FindBy(name="cityRegisterPage")
	WebElement cityname;
	@FindBy(name="addressRegisterPage")
	WebElement address;
	@FindBy(name="state_/_province_/_regionRegisterPage")
	WebElement state;
	@FindBy(name="postal_codeRegisterPage")
	WebElement pincode;
	@FindBy(name="i_agree")
	WebElement checkbox;
	@FindBy(xpath="//*[@id=\"register_btn\"]")
	WebElement registerbtn;
	@FindBy(id="next_btn")
	WebElement next;
	@FindBy(name="safepay_username")
	WebElement safepayuser;
	@FindBy(name="safepay_password")
	WebElement safepaypass;
	@FindBy(id="pay_now_btn_SAFEPAY")
	WebElement paybtn;
	
	 public AdvantagePageDetails(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 public void itemSelection(String name,String email,String password,String confirmpass,String fname,String lname,int phno,String countryI,String city,String addreses,String State,int pin) throws InterruptedException {
		 Allspeakers.click();
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,250)","");
	     
		 speaker.click();
		 
		 JavascriptExecutor ss=(JavascriptExecutor)driver;
	     ss.executeScript("window.scrollBy(0,250)","");
	     
	     addtocart.click();
	     Thread.sleep(1000);
	     
	     cart.click();
	     Thread.sleep(1000);
	     
	     checkout.click();
	     Thread.sleep(1000);
	     
	     registration.click();
	     regusername.sendKeys(name);
	     regemail.sendKeys(email);
	     regpassword.sendKeys(password);
	     regconpass.sendKeys(confirmpass);
	     
	     JavascriptExecutor as=(JavascriptExecutor)driver;
	     as.executeScript("window.scrollBy(0,250)","");
	     
	     firstname.sendKeys(fname);
	     lastname.sendKeys(lname);
	     
	     String phnumb=Integer.toString(phno);
	     phonenum.sendKeys(phnumb);
	     
	     Select sel = new Select(country);
	     sel.selectByVisibleText(countryI);
	     
	     cityname.sendKeys(city);
	     address.sendKeys(addreses);
	     state.sendKeys(State);
	     
	     String pincod=Integer.toString(pin);
	     pincode.sendKeys(pincod);
	     
	     checkbox.click();
	     registerbtn.click();
	     next.click();
	 }
	 
	    public void paymentDetails(String safeuser,String safepass) {
	    	
	    
	     JavascriptExecutor rs=(JavascriptExecutor)driver;
	     rs.executeScript("window.scrollBy(0,250)","");
	     
	     safepayuser.sendKeys(safeuser);
	     safepaypass.sendKeys(safepass);
	     paybtn.click();
	     
	    }	 
	 
}
