package PageDetails;

import org.openqa.selenium.JavascriptExecutor;
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
	    
	    //Area
	    @FindBy(id="rc-menu-uuid-18924-1-/area")
	    WebElement area;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[2]/button[2]")
	    WebElement addbtnarea;
	    
	    @FindBy(id="name")
	    WebElement aname;
	    
	    @FindBy(id="prefix")
	    WebElement prefixa;
	    
	    @FindBy(id="manager_id")
	    WebElement amanager;
	    
	    @FindBy(id="region_id")
	    WebElement regionname;
	    
	    @FindBy(xpath="/html/body/div[2]/div/div[3]/div/div[3]/div/button[2]")
	    WebElement aaddbtn;
	    
	   //Branch
	    @FindBy(id="rc-menu-uuid-18924-1-/branch")
	    WebElement branch;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[2]/button[2]")
	    WebElement baddbtn;
	    
	    @FindBy(id="branchName")
	    WebElement branchname;
	    
	    @FindBy(id="area_id")
	    WebElement barea;
	    
	    @FindBy(id="manager_id")
	    WebElement bmanager;
	    
	    @FindBy(id="branchLangauage")
	    WebElement blanguage;
	    
	    @FindBy(xpath="/html/body/div[2]/div/div[3]/div/div[3]/div/button[2]")
	    WebElement bsubmitbtn;
	    
	    //Route
	    
	    @FindBy(id="rc-menu-uuid-18924-1-/route")
	    WebElement route;
	    
	    @FindBy(xpath="rc-menu-uuid-18924-1-/route") 
	    WebElement raddbtn;
	    
	    @FindBy(id="nameRoute")
	    WebElement routename;
	    
	    @FindBy(id="manager_id")
	    WebElement routemanager;
	    
	    @FindBy(id="def_salesman")
	    WebElement defsalesman;
	    
	    @FindBy(id="branch_id")
	    WebElement rbranch;
	    
	    @FindBy(id="def_lang")
	    WebElement deflan;
	    
	    @FindBy(id="currency")
	    WebElement currency;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div/form/div/div[2]/div[1]/div")
	    WebElement visitconfigure;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div/form/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div/div/span/div")
	    WebElement visitdays;
	    
	    @FindBy(id="def_start_day")
	    WebElement defstartday;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div/form/div/div[3]/div[1]/div")
	    WebElement configure;
	    
	    @FindBy(id="allow_online_transactions")
	    WebElement allowsync;
	    
	    @FindBy(id="show_quotation_in_sales")
	    WebElement quotationinsales;
	    
	    @FindBy(id="enable_casual_customer")
	    WebElement enablecasual;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div/form/button")
	    WebElement rsubmit;
	    
	    //Warehouse
	    
	    @FindBy(id="rc-menu-uuid-62538-1-/warehouse")
	    WebElement warehouse;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[2]/button[2]")
	    WebElement waddbtn;
	    
	    @FindBy(id="warehouseName")
	    WebElement warehousename;
	    
	    @FindBy(id="manager_id")
	    WebElement wmanager;
	    
	    @FindBy(id="currency_id")
	    WebElement wcurrency;
	    
	    @FindBy(id="area_id")
	    WebElement warea;
	    
	    @FindBy(id="branch_id")
	    WebElement wbranch;
	    
	    @FindBy(id="warehouse_type")
	    WebElement warehousetype;
	    
	    @FindBy(id="address")
	    WebElement address;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div[3]/div[2]/div/div[1]/div/div[3]/div/button[2]")
	    WebElement wsubmitbtn;
	    

	    //Constructor
	    
	   public VanforcesLocaleMastersSetup(WebDriver driver) {
	    	
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

	  //Locating Locale Masters 
	  //Region
	    
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
	    	Thread.sleep(1000);
	    	
	    }
	    
	    //Area
	    
	    public void areaSetUp(String areaname,String prefixarea) throws InterruptedException {
	    	area.click();
	    	Thread.sleep(1000);
	    	addbtnarea.click();
	    	aname.sendKeys(areaname);
	    	prefixa.sendKeys(prefixarea);
	    	
	    	Select ma=new Select(amanager);
	    	ma.selectByContainsVisibleText("Taskforces");
	    	
	    	Select regionc=new Select(regionname);
	    	regionc.selectByContainsVisibleText("Karnataka");
	    	
	    	aaddbtn.click();
	    	Thread.sleep(1000);
	    }
	    
	    //Branch
	    
	    public void branchSetUp(String bname) throws InterruptedException {
	    	branch.click();
	    	Thread.sleep(1000);
	    	baddbtn.click();
	    	branchname.sendKeys("bname");
	    	
	    	Select a=new Select(barea);
	    	a.selectByContainsVisibleText("kannur");
	    	
	    	Select ma=new Select(amanager);
	    	ma.selectByContainsVisibleText("Taskforces");
	    	
	    	Select lan=new Select(blanguage);
	    	lan.selectByContainsVisibleText("English");
	    	
	    	bsubmitbtn.click();
	    	Thread.sleep(1000);
	    	
	    }
	    public void routeSetUp(String rname) throws InterruptedException {
	    	route.click();
	    	Thread.sleep(1000);
	    	raddbtn.click();
	    	routename.sendKeys(rname);
	    	
	    	Select r=new Select(routemanager);
	    	r.selectByContainsVisibleText("Taskforces");
	    	
	    	Select ds=new Select(defsalesman);
	    	ds.selectByContainsVisibleText("Head Salesman");
	    	
	    	Select rb=new Select(rbranch);
	    	rb.selectByContainsVisibleText("Kozhikode");
	    	
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("window.scrollBy(0,500)");
	    	
	    	Select lan=new Select(blanguage);
	    	lan.selectByContainsVisibleText("English");
	    	
	    	Select cur=new Select(currency);
	    	cur.selectByContainsVisibleText("Indian Rupees INR");
	    	
	    	//Scroll Down
	    	
	    	JavascriptExecutor jm = (JavascriptExecutor) driver;
	    	jm.executeScript("window.scrollBy(0,500)");
	    	
	    	visitconfigure.click();
	    	visitdays.click();
	    	
	    	//Multiple Dropdown options choosing
	    	
	    	Select sl=new Select(visitdays);
	    	sl.selectByContainsVisibleText("monday");
	    	sl.selectByContainsVisibleText("teusday");
	    	sl.selectByContainsVisibleText("wednesday");
	    	sl.selectByContainsVisibleText("thursday");
	    	sl.selectByContainsVisibleText("friday");
	    	sl.selectByContainsVisibleText("saturday");
	    	
	    	defstartday.click();
	    	Select def=new Select(defstartday);
	    	def.selectByContainsVisibleText("monday");
	    	
	    	JavascriptExecutor m = (JavascriptExecutor) driver;
	    	m.executeScript("window.scrollBy(0,500)");
	    	
	    	configure.click();
	    	
	    	//Radial Button Handling
	    	
	    	if(!allowsync.isSelected()) {
	    		allowsync.click();
	    	}
	    	
	    	if(!quotationinsales.isSelected()) {
	    		quotationinsales.click();
	    	}
	    	
	    	if(!enablecasual.isSelected()) {
	    		enablecasual.click();
	    	}
	    	
	    	rsubmit.click();
	    	Thread.sleep(1000);
	    	
	    	
	    }
	    public void warehouseSetUp(String wname,String wtype,String adrs) throws InterruptedException {
	    	warehouse.click();
	    	Thread.sleep(1000);
	    	waddbtn.click();    	
	    	warehousename.sendKeys(wname);
	    	
	    	Select mdropdown=new Select(wmanager);
	    	mdropdown.selectByContainsVisibleText("Taskforces");
	    	
	    	Select cur=new Select(wcurrency);
	    	cur.selectByContainsVisibleText("Indian Rupees INR");
	    	
	    	Select a=new Select(warea);
	    	a.selectByContainsVisibleText("kannur");
	    	
	    	Select am=new Select(wbranch);
	    	am.selectByContainsVisibleText("kannur");
	    	
	    	warehousetype.sendKeys(wtype);
	    	address.sendKeys(adrs);
	    	
	    	wsubmitbtn.click();
	    }
	    
	    
	    	    
}
