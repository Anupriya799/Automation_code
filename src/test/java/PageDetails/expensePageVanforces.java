package PageDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expensePageVanforces {
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
	    
	    //Expense
	    //Cost Centre
	    
	    @FindBy(xpath="/html/body/div/div/div/aside/div/ul/li[10]/div/span[2]")
	    WebElement expense;
	    
	    @FindBy(id="rc-menu-uuid-94898-1-/cost-centre")
	    WebElement costcentre;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[2]/button")
	    WebElement costaddbtn;
	    
	    @FindBy(id="description")
	    WebElement description;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div[3]/div[2]/div/div[1]/div/div[3]/div/button[2]")
	    WebElement csubmit;
	    
	    //Expense Type
	    
	    @FindBy(id="rc-menu-uuid-94898-1-/expense-type")
	    WebElement expensetype;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[2]/button")
	    WebElement expenseaddbtn;
	    
	    @FindBy(id="visibility")
	    WebElement expensetypevisibility;
	    
	    @FindBy(id="description")
	    WebElement typedescription;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div[3]/div[2]/div/div[1]/div/div[3]/div/button[2]/span")
	    WebElement tsubmit;
	    
	    
	    //Constructor
	    public expensePageVanforces(WebDriver driver) {
	    	
	    	this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    	}
	   
	   //Method
	   
	    public void loginaccont(String organizationcode,String emailid,String pass) {
	    	orgcode.clear();
	    	orgcode.sendKeys(organizationcode);
	    	email.clear();
	    	email.sendKeys(emailid);
	    	password.clear();
	    	password.sendKeys(pass);
	    	loginbtn.click();
	    }
	    //Expense
	    //Cost Centre
	    
	    public void costcentreSetUp(String dname) throws InterruptedException {
	    	expense.click();
	    	costcentre.click();
	    	Thread.sleep(1000);
	    	costaddbtn.click();
	    	Thread.sleep(1000);
	    	description.sendKeys(dname);
	    	Thread.sleep(1000);
	    	csubmit.click();
	    	Thread.sleep(1000);
	    }
	    
	    //Expense Type
	    
	    public void expenseTypeSetUp(String des) throws InterruptedException {
	    	expensetype.click();
	    	Thread.sleep(1000);
	    	expenseaddbtn.click();
	    	Thread.sleep(1000);
	    	
	    	Select sel=new Select(expensetypevisibility);
	    	sel.selectByVisibleText("Both");
	    	
	    	typedescription.sendKeys(des);
	    	tsubmit.click();
	    	
	    }
	

}
