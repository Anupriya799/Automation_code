package PageDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vanforcesWarehouseTransactions {
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
	    
	    //Warehouse Transactions
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/aside/div/ul/li[11]/div/span[2]")
	    WebElement warehousetransactions;
	    
	    @FindBy(id="rc-menu-uuid-94898-1-/warehouse-management")
	    WebElement warehouseinventory;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[2]/button")
	    WebElement viewtransactions;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[2]/button/span[2]")
	    WebElement addtransactions;
	    
	    @FindBy(id="transaction_type")
	    WebElement transactions;
	    
	    @FindBy(id="warehouse")
	    WebElement warehouseselection;
	    
	    @FindBy(id="remarks")
	    WebElement remarks;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div[1]/button/span")
	    WebElement addproduct;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[2]/span/button")
	    WebElement selectproduct;
	    
	    @FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[1]/div/div/div[2]/div[5]/button/span")
	    WebElement product;
	    
	    @FindBy(id="multipack-select-1")
	    WebElement multipack;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[4]/div")
	    WebElement quantity;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div[3]/button/span")
	    WebElement submit;
	    
	    @FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[1]/div/button/span/span/svg")
	    WebElement printclose;
	    
	    
	    //Constructor
	    public vanforcesWarehouseTransactions(WebDriver driver) {
		    	
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
		    public void warehouseTransactions(String rname,String num) throws InterruptedException {
		    	warehousetransactions.click();
		    	warehouseinventory.click();
		    	Thread.sleep(1000);
		    	viewtransactions.click();
		    	Thread.sleep(1000);
		    	addtransactions.click();
		    	Thread.sleep(1000);
		    	transactions.click();
		    	
		    	Select sel=new Select(warehouseselection);
		    	sel.selectByVisibleText("purchase");
		    	
		    	remarks.sendKeys(rname);
		    	addproduct.click();
		    	Thread.sleep(1000);
		    	selectproduct.click();
		    	product.click();
		    	
		    	Select se=new Select(multipack);
		    	se.selectByVisibleText("PIECES");
		    	
		    	quantity.sendKeys(num);
		    	submit.click();
		    	
		    	printclose.click();
		    	Thread.sleep(1000);
		    	
		    }
}
