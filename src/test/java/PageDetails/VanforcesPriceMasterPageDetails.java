package PageDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VanforcesPriceMasterPageDetails {
	WebDriver driver;
	WebDriverWait wait;
	
	 //login 
    
    @FindBy(id="normal_login_organization_code")
    WebElement orgcode;
    
    @FindBy(id="normal_login_email")
    WebElement email;
    
    @FindBy(id="normal_login_password")
    WebElement password;
    
    @FindBy(xpath="//*[@id=\"normal_login\"]/div[5]/div/div/div/div/button")
    WebElement loginbtn;

    @FindBy(id="rc-menu-uuid-45323-1-6")
    WebElement productmaster;
	
    //Price Master
    //Product Price
    
    @FindBy(xpath="/html/body/div/div/div/aside/div/ul/li[8]/div")
    WebElement pricemaster;
    
    @FindBy(id="rc-menu-uuid-76257-1-/product-price")
    WebElement productprice;
    
    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[2]/button[2]/span")
    WebElement praddbtn;
    
    @FindBy(id="product_id")
    WebElement product;
    
    @FindBy(id="quantity")
    WebElement quantity;
    
    @FindBy(id="currency_id")
    WebElement currency;
    
    @FindBy(id="cost_price")
    WebElement costprice;
    
    @FindBy(id="sales")
    WebElement saleprice;
    
    @FindBy(xpath="/html/body/div[1]/div/div/main/div[3]/div[2]/div/div[1]/div/div[3]/div/button[2]/span")
    WebElement prsubmit;
    
    //Pricekey Creation
    
    @FindBy(id="rc-menu-uuid-76257-1-/price-key-group")
    WebElement pricekey;
    
    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/button[1]/span")
    WebElement pricekeyaddbtn;
    
    @FindBy(id="name")
    WebElement pricekeyname;
    
    @FindBy(id="description")
    WebElement pricekeydescription;
    
    @FindBy(xpath="/html/body/div[2]/div/div[3]/div/div[2]/form/div[4]/div/div[2]/div/div/div/div[1]/input")
    WebElement startdate;
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/div/div[2]/table/tbody/tr[2]/td[2]")
    WebElement feb;
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[6]")
    WebElement march;
    
    @FindBy(id="priority")
    WebElement priority;
    
    @FindBy(xpath="/html/body/div[2]/div/div[3]/div/div[3]/div/button[2]/span")
    WebElement submit;
    
    @FindBy(xpath="/html/body/div[1]/div/div/main/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[9]/div/div[1]/button/span")
    WebElement viewpricekey;
    
    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div/button[3]/span")
    WebElement addbtn;
    
    @FindBy(id="description")
    WebElement description;
    
    @FindBy(id="product_id")
    WebElement productname;
    
    @FindBy(id="multipack_id")
    WebElement multipackname;
    
    @FindBy(id="from_quantity")
    WebElement fromq;
    
    @FindBy(id="to_quantity")
    WebElement toq;
    
    @FindBy(id="sales")
    WebElement psaleprice;
    
    @FindBy(xpath="/html/body/div[1]/div/div/main/div[3]/div[2]/div/div[1]/div/div[3]/div/button[2]/span")
    WebElement psubmit;
    
    //Customer pricekey creation
    
    @FindBy(xpath="/html/body/div[1]/div/div/aside/div/ul/li[8]/ul/li[2]/span/a")
    WebElement customerprice;
    
    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/button[1]/span")
    WebElement caddbtn;
    
    @FindBy(xpath="/html/body/div[1]/div/div/main/div[2]/div[2]/div/div[1]/div/div[2]/form/div[1]/div/div[2]/div/div/div/div/span/div")
    WebElement customerselection;
    
    @FindBy(id="price_key_group_id")
    WebElement pricekeyassign;
    
    @FindBy(xpath="/html/body/div[1]/div/div/main/div[2]/div[2]/div/div[1]/div/div[3]/div/button[2]/span")
    WebElement csubmit;
    
    //Route Pricekey Creation
    
    @FindBy(xpath="/html/body/div/div/div/aside/div/ul/li[8]/ul/li[3]/span/a")
    WebElement routepricekey;
    
    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/button[2]/span")
    WebElement routepricekeyaddbtn;
    
    @FindBy(xpath="/html/body/div[1]/div/div/main/div[2]/div[2]/div/div[1]/div/div[2]/form/div[1]/div/div[2]/div/div/div/div/span/div")
    WebElement route;
    
    @FindBy(id="price_key_group_id")
    WebElement pricekeyassigntoroute;
    
    @FindBy(xpath="/html/body/div[1]/div/div/main/div[2]/div[2]/div/div[1]/div/div[3]/div/button[2]")
    WebElement rsubmit;
    
    
    //Constructor
    
	   public VanforcesPriceMasterPageDetails(WebDriver driver) {
	    	
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
	    
	    //Product price adding 
	    //Its the deafult price of the produtc if no price key exist for any date 
	    
	    public void productPriceSetUp(String qn,String cprice,String sprice) throws InterruptedException {
	    	pricemaster.click();
	    	productprice.click();
	    	Thread.sleep(1000);
	    	praddbtn.click();
	    	Thread.sleep(1000);
	    	
	    	Select sel=new Select(product);
	    	sel.selectByVisibleText("sample product 1");
	    	
	    	quantity.sendKeys(qn);
	    	
	    	Select se=new Select(currency);
	    	se.selectByVisibleText("INR");
	    	
	    	costprice.sendKeys(cprice);
	    	saleprice.sendKeys(sprice);
	    	
	    	prsubmit.click();
	    	Thread.sleep(1000);
	    }
	    
	    //Pricekey Creation
	    
	    public void pricekeySetup(String pname,String dname,String prioritynumber,String desname,String q1,String t1,String newprice) throws InterruptedException {
	    	pricekey.click();
	    	Thread.sleep(1000);
	    	pricekeyaddbtn.click();
	    	Thread.sleep(1000);
	    	pricekeyname.sendKeys(pname);
	    	pricekeydescription.sendKeys(dname);
	    	startdate.click();
	    	feb.click();
	    	march.click();
	    	priority.sendKeys(prioritynumber);
	    	submit.click();
	    	Thread.sleep(1000);
	    	
	    	//Adding product into pricekey
	    	
	    	viewpricekey.click();
	    	Thread.sleep(1000);
	    	addbtn.sendKeys(desname);
	    	
	    	Select sel=new Select(productname);
	    	sel.selectByVisibleText("sample product 1");
	    	
	    	Select sl=new Select(multipackname);
	    	sl.selectByVisibleText("pieces");
	    	
	    	fromq.sendKeys(q1);
	    	toq.sendKeys(t1);
	    	
	    	psaleprice.clear();
	    	psaleprice.sendKeys(newprice);
	    	Thread.sleep(1000);
	    	
	    	psubmit.click();Thread.sleep(1000);
	    	
	    	//Navigation to back screen
	    	
	    	driver.navigate().back();
	    }
	    
	    //Customer Pricekey
	    
	    public void customerpriceSetup() throws InterruptedException {
	    	customerprice.click();
	    	Thread.sleep(1000);
	    	caddbtn.click();
	    	Thread.sleep(1000);
	    	
	    	Select s=new Select(customerselection);
	    	s.selectByVisibleText("Customer 1");
	    	
	    	Select sz=new Select(pricekeyassign);
	    	sz.selectByVisibleText("Big Sale Offer");
	    	
	    	csubmit.click();
	    	Thread.sleep(1000);
	    }
	    
	    //Route pricekey 
	    
	    public void routepricekeySetup() throws InterruptedException {
	    	routepricekey.click();
	    	Thread.sleep(1000);
	    	routepricekeyaddbtn.click();
	    	Thread.sleep(1000);
	    	
	    	Select qs=new Select(pricekeyassigntoroute);
	    	qs.selectByVisibleText("Route 1");
	    	
	    	Select ws=new Select(pricekeyassigntoroute);
	    	ws.selectByVisibleText("Big Sale Offer");
	    	
	    	rsubmit.click();
	    	Thread.sleep(1000);
	    }
}
