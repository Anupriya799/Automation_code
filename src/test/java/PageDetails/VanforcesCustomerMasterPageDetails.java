package PageDetails;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VanforcesCustomerMasterPageDetails {
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
	    
	    //Customer Masters
	    //Customer Type Adding
	    
	    @FindBy(id="rc-menu-uuid-03066-1-4")
	    WebElement customermasters;
	    
	    @FindBy(id="rc-menu-uuid-03066-1-/customer")
	    WebElement customer;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div[1]/div[2]/div/div[2]/button[2]")
	    WebElement customeraddbtn;
	    
	    @FindBy(id="name")
	    WebElement customername;
	    
	    @FindBy(id="customer_type_id")
	    WebElement customertype;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div/form/div/div[1]/div[2]/div[5]/div/div/div/div/label/span[1]/input")
	    WebElement isheadoffice;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div/form/div/div[2]/div[1]")
	    WebElement locationdetails;
	    
	    @FindBy(id="country_id")
	    WebElement country;
	    
	    @FindBy(id="region_id")
	    WebElement region;
	    
	    @FindBy(id="area_id")
	    WebElement area;
	    
	    @FindBy(id="route")
	    WebElement route;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div/form/div/div[3]/div[1]/div/div[1]/div")
	    WebElement transactiondetails;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div/form/div/div[3]/div[2]/div[1]/div/div[2]/div/div/div/div/span/div")
	    WebElement transactionoption;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div/main/div/div/form/div/div[3]/div[2]/div[2]/div/div[2]/div/div/div/div/span/span[2]")
	    WebElement transactionpriority;
	    
	    @FindBy(id="credit_limit_amt")
	    WebElement creditamount;
	    
	    @FindBy(id="credit_limit_days")
	    WebElement creditlimitdays;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div/form/button/span")
	    WebElement cbtn;
	    
	    //Customer Type
	    @FindBy(id="rc-menu-uuid-03066-1-/customer-types")
    	WebElement customertype1;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div[1]/div[2]/div/div[2]/button")
	    WebElement typeadd;
	    
	    @FindBy(id="name")
	    WebElement typename;
	    
	    @FindBy(xpath="/html/body/div[4]/div/div[3]/div/div[3]/div/button[2]/span")
	    WebElement typesubmit;
	    
	    
	    
	    //Constructor
	    public VanforcesCustomerMasterPageDetails(WebDriver driver) {
	    	
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
	    
	    public void customerSetUp(String cname,String camount,String cdays) throws InterruptedException {
	    	customermasters.click();
	    	customer.click();
	    	Thread.sleep(1000);
	    	customeraddbtn.click();
	    	Thread.sleep(1000);
	    	customername.sendKeys(cname);
	    	
	    	Select sel=new Select(customertype);
	    	sel.selectByContainsVisibleText("Retailer");
	    	
	    	if(isheadoffice.isSelected()) {
	    		isheadoffice.click();
	    	}
	    	
	    	//Scrolling
	    	JavascriptExecutor m= (JavascriptExecutor)driver;
	    	m.executeAsyncScript("window.ScrollBy, (0,100)");
	    	
	    	locationdetails.click();
	    	
	    	Select s=new Select(country);
	    	s.selectByVisibleText("India");
	    	
	    	Select e=new Select(region);
	    	e.selectByVisibleText("kerala");
	    	
	    	Select l=new Select(area);
	    	l.selectByVisibleText("Kozhikode");
	    	
	    	Select n=new Select(route);
	    	n.selectByVisibleText("route 1");
	    	
	    	JavascriptExecutor n1=(JavascriptExecutor)driver;
	    	n1.executeAsyncScript("window.ScrollBy, (0,100)");
	    	
	    	transactiondetails.click();
	    	transactionoption.click();
	    	Select se=new Select(transactionoption);
	    	se.selectByVisibleText("cash");
	    	se.selectByVisibleText("credit");
	    	Thread.sleep(1000);
	    	
	    	transactionpriority.click();
	    	Select le=new Select(transactionpriority);
	    	le.selectByVisibleText("Cash");
	    	
	    	creditamount.sendKeys(camount);
	    	creditlimitdays.sendKeys(cdays);
	    	
	    	cbtn.click();
	    	Thread.sleep(1000);
	    	
	    }
	    public void customerType(String tname) throws InterruptedException {
	    	customertype1.click();
	    	Thread.sleep(1000);
	    	typeadd.click();
	    	typename.sendKeys(tname);
	    	typesubmit.click();
	    	Thread.sleep(1000);
	    		
	    }
	    
}
