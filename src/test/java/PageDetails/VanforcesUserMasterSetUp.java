package PageDetails;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VanforcesUserMasterSetUp {
	WebDriver driver;
	WebDriverWait wait;
	
	 @FindBy(id="normal_login_organization_code")
	    WebElement orgcode;
	    
	    @FindBy(id="normal_login_email")
	    WebElement email;
	    
	    @FindBy(id="normal_login_password")
	    WebElement password;
	    
	    @FindBy(xpath="//*[@id=\"normal_login\"]/div[5]/div/div/div/div/button")
	    WebElement loginbtn;
	    
	    //Locating UserMasters
	    //Users
	    
	    @FindBy(id="rc-menu-uuid-03066-1-3")
	    WebElement usermaster;
	    
	    @FindBy(id="rc-menu-uuid-03066-1-/users")
	    WebElement user;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[3]/button")
	    WebElement useradd;
	    
	    @FindBy(id="name")
	    WebElement username;
	    
	    @FindBy(id="email")
	    WebElement useremail;
	    
	    @FindBy(id="password")
	    WebElement userpassword;
	    
	    @FindBy(id="confirm_password")
	    WebElement confirmpass;
	    
	    @FindBy(id="user_type")
	    WebElement usertype;
	    
	    @FindBy(id="collector")
	    WebElement iscollector;
	    
	    @FindBy(id="allow_mobile_transactions")
	    WebElement allowmobiletransaction;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div/main/div/div/form/div[2]/div[5]")
	    WebElement transactions;
	    
	    @FindBy(id="credit_given")
	    WebElement creditgiven;
	    
	    @FindBy(id="cash_in_hand")
	    WebElement cashinhand;
	    
	    @FindBy(id="max_discount_perc")
	    WebElement maxalloweddiscount;
	    
	    @FindBy(xpath="//*[@id=\"discount_in_collection\"]/span")
	    WebElement collectiondiscount;
	    
	    @FindBy(xpath="//*[@id=\"discount_in_amount\"]/span")
	    WebElement discountinamount;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div/form/div[2]/div[5]/div[2]/div[11]/div[2]/div/div/div/div/div/button/span")
	    WebElement selectioninvoiceincollection;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div/form/div[3]/button")
	    WebElement submitbtnuser;
	    
	    
	    
	    //Constructor
	    public VanforcesUserMasterSetUp(WebDriver driver) {
		    	
		    	this.driver=driver;
		    	PageFactory.initElements(driver, this);
		    	}
		   
		   //Method
		   
		    public void loginaccont(String organizationcode,String emailid,String pass) throws InterruptedException {
		    	orgcode.clear();
		    	orgcode.sendKeys(organizationcode);
		    	email.clear();
		    	email.sendKeys(emailid);
		    	password.clear();
		    	password.sendKeys(pass);
		    	loginbtn.click();
		    	Thread.sleep(1000);
		    }
		    
		    //Method
		    public void userMasters(String uname,String uemail,String upass,String uconfirmpass,String creditamount,String cashhand,String discount) throws InterruptedException {
		    	usermaster.click();
		    	Thread.sleep(1000);
		    	user.click();
		    	Thread.sleep(1000);
		    	useradd.click();
		    	Thread.sleep(1000);
		    	username.sendKeys(uname);
		    	useremail.sendKeys(uemail);
		    	userpassword.sendKeys(upass);
		    	confirmpass.sendKeys(uconfirmpass);
		    	
		    	Select dropdown=new Select(usertype);
		    	dropdown.selectByContainsVisibleText("salesman");
		    	
		    	//CheckBox Handling
		    	if (!iscollector.isSelected()) {
		    		iscollector.click();	
		    									}
		    	if (!allowmobiletransaction.isSelected()) {
		    		allowmobiletransaction.click();	
		    									}
		    	//Screen scrolling
		    	JavascriptExecutor js = (JavascriptExecutor) driver;
		    	js.executeScript("window.scrollBy(0,500)");
		    	
		    	transactions.click();
		    	Thread.sleep(1000);
		    	creditgiven.sendKeys(creditamount);
		    	cashinhand.sendKeys(cashhand);
		    	maxalloweddiscount.sendKeys(discount);
		    	
		    	//Radial Button
		    	if(!collectiondiscount.isSelected()) {
		    		collectiondiscount.click();
		    	}
		    	if(!collectiondiscount.isSelected()) {
		    		collectiondiscount.click();
		    	}
		    	if(!discountinamount.isSelected()) {
		    		discountinamount.click();
		    	}
		    	if(!selectioninvoiceincollection.isSelected()) {
		    		selectioninvoiceincollection.click();
		    	}
		    	submitbtnuser.click();
		    	Thread.sleep(1000);
		 
		    	}
	}
