package PageDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VanforcesLocaleMastersSetup {

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
	    
	    //Locating Locale Masters 
	    @FindBy(id="rc-menu-uuid-18924-1-2")
	    WebElement localemaster;
	    
	    //Region
	    @FindBy(id="rc-menu-uuid-18924-1-/region")
	    WebElement region;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[2]/button[2]")
	    WebElement addbtn;
	    
	    @FindBy(id="name")
	    WebElement rname;
	    
	    @FindBy(id="country_id")
	    WebElement countrydrp;
	    
	    @FindBy(id="manager")
	    WebElement rmanager;
	    
	    @FindBy(xpath="/html/body/div[2]/div/div[3]/div/div[3]/div/button[2]")
	    WebElement submitbtn;
	    
	   
	    
	    
	   public VanforcesLocaleMastersSetup(WebDriver driver) {
	    	
	    	this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    	}
	    public void loginaccont(String organizationcode,String emailid,String pass) {
	    	orgcode.clear();
	    	orgcode.sendKeys(organizationcode);
	    	email.clear();
	    	email.sendKeys(emailid);
	    	password.clear();
	    	password.sendKeys(pass);
	    	loginbtn.click();
	    }

	  //Locating Locale Masters and Region
	    
	    public void regionsetup(String regionname) throws InterruptedException{
	    	localemaster.click();
	    	region.click();
	    	Thread.sleep(1000);
	    	addbtn.click();
	    	rname.sendKeys(regionname);
	    	
	    	//Dropdown Hnadling Text Dropdown
	    	Select dropdown=new Select(countrydrp);
	    	dropdown.selectByContainsVisibleText("India");
	    	
	    	Select mdropdown=new Select(rmanager);
	    	mdropdown.selectByContainsVisibleText("Taskforces");
	    	
	    	submitbtn.click();
	    	
	   	
	    }
	    
	    

}
