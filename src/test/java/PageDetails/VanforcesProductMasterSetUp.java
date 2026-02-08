package PageDetails;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VanforcesProductMasterSetUp {
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
	    
	    //Product Multipack
	    
	    @FindBy(id="rc-menu-uuid-45323-1-/product-multipack")
	    WebElement productmultipack;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[2]/button[2]")
	    WebElement maddbtn;
	    
	    @FindBy(id="name")
	    WebElement mname;
	    
	    @FindBy(id="prefix")
	    WebElement prefix;
	    
	    @FindBy(id="base_unit")
	    WebElement baseunit;
	    
	    @FindBy(id="multiplier")
	    WebElement multiplier;
	    
	    @FindBy(xpath="/html/body/div[2]/div/div[3]/div/div[3]/div/button[2]/span")
	    WebElement msubmit;
	    
	    //Tax Category
	    
	    @FindBy(id="rc-menu-uuid-45323-1-/tax-category")
	    WebElement taxcategory;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[2]/button")
	    WebElement taddbtn;
	    
	    @FindBy(id="code")
	    WebElement tcode;
	    
	    @FindBy(id="name")
	    WebElement tname;
	    
	    @FindBy(id="tax_1")
	    WebElement taxpercentage;
	    
	    @FindBy(id="is_default")
	    WebElement defaultt;
	    
	    @FindBy(xpath="/html/body/div[2]/div/div[3]/div/div[3]/div/button[2]")
	    WebElement tsubmit;
	    
	    //Product Category
	    @FindBy(id="rc-menu-uuid-45323-1-/product-category")
	    WebElement productcategory;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[2]/button[2]")
	    WebElement caddbtn;
	    
	    @FindBy(id="name")
	    WebElement categoryname;
	    
	    @FindBy(id="tax_category")
	    WebElement taxcategoryn;
	    
	    @FindBy(xpath="/html/body/div[2]/div/div[3]/div/div[3]/div/button[2]/span")
	    WebElement csubmit;
	    
	    //Product Sub-Category
	    @FindBy(id="rc-menu-uuid-45323-1-/product-subcategory")
	    WebElement psubcategory;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[2]/button[2]/span")
	    WebElement psaddbtn;
	    
	    @FindBy(id="name")
	    WebElement subname;
	    
	    @FindBy(id="category_id")
	    WebElement categorysub;
	    
	    @FindBy(xpath="/html/body/div[2]/div/div[3]/div/div[3]/div/button[2]/span")
	    WebElement subsubmitbtn;
	    
	    //Product
	    
	    @FindBy(id="rc-menu-uuid-45323-1-/product")
	    WebElement product;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[2]/button[2]/span")
	    WebElement productaddbtn;
	    
	    @FindBy(id="name")
	    WebElement productname ;
	    
	    @FindBy(id="manage_customer_inventory")
	    WebElement customerinventory;
	    
	    @FindBy(xpath="/html/body/div[3]/div/div[3]/div/div[2]/form/div[4]/div/div[1]/label/label/span[1]/input")
	    WebElement category;
	    
	    @FindBy(xpath="/html/body/div[3]/div/div[3]/div/div[2]/form/div[4]/div/div[2]/div/div/div/div/span/span[2]")
	    WebElement categorydrp ;
	    
	    @FindBy(id="tax_category")
	    WebElement tax;
	    
	    @FindBy(id="subcategory_id")
	    WebElement subcategory;
	    
	    @FindBy(id="type_id")
	    WebElement producttype;
	    
	    @FindBy(id="base_multipack_id")
	    WebElement basemultipack;
	    
	    @FindBy(xpath="/html/body/div[3]/div/div[3]/div/div[2]/form/div[12]/div/div/div/div/div/button")
	    WebElement barcodebtn;
	    
	    @FindBy(id="barcodes_0_code")
	    WebElement barcodename;
	    
	    @FindBy(id="barcodes_0_multipack_id")
	    WebElement barcodemultipack;
	    
	    @FindBy(xpath="/html/body/div[3]/div/div[3]/div/div[3]/div/button[2]/span")
	    WebElement prsubmit;
	   
	    
	    
	    //Constructor
	    
	   public VanforcesProductMasterSetUp(WebDriver driver) {
	    	
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
	    
	    //Prodcut Multipack 
	    
	    public void productMultipack(String multipackname,String prefixname) throws InterruptedException {
	    	productmultipack.click();
	    	Thread.sleep(1000);
	    	maddbtn.click();
	    	Thread.sleep(1000);
	    	mname.sendKeys(multipackname);
	    	prefix.sendKeys(prefixname);
	    	
	    	if(!baseunit.isSelected()) {
	    		baseunit.click();
	    	}
	    	multiplier.click();
	    	msubmit.click();
	    	Thread.sleep(1000);
	    }
	    
	    //Tax Category
	    
	    public void taxcategorySetUp(String taxcode,String taxname,String taxper) throws InterruptedException {
	    	taxcategory.click();
	    	Thread.sleep(1000);
	    	taddbtn.click();
	    	tcode.sendKeys(taxcode);
	    	tname.sendKeys(taxname);
	    	taxpercentage.sendKeys(taxper);
	    	
	    	if(defaultt.isSelected()) {
	    		defaultt.click();
	    	}
	    	tsubmit.click();
	    	
	    }
	    
	    //Product Category
	    
	    public void productCategorySetUp(String pname) throws InterruptedException {
	    	productcategory.click();
	    	Thread.sleep(1000);
	    	caddbtn.click();
	    	Thread.sleep(1000);
	    	categoryname.sendKeys(pname);
	    	
	    	Select Sel=new Select(taxcategoryn);
	    	Sel.selectByVisibleText("OUTSCOPE: Out of Supply");
	    	csubmit.click();
	    	Thread.sleep(1000);
	    }
	    
	    //Product Sub-Category
	 public void productsubCategorySetUp(String sname) throws InterruptedException {
		 psubcategory.click();
		 Thread.sleep(1000);
		 psaddbtn.click();
		 Thread.sleep(1000);
		 subname.sendKeys(sname);
		 
		 Select sl=new Select(categorysub);
		 sl.selectByVisibleText("Main product category");
		 
		 subsubmitbtn.click();
	 }
	 
	 //Product
	 
	 public void productSetUp(String pname,String bname) throws InterruptedException {
		 product.click();
		 Thread.sleep(1000);
		 productaddbtn.click();
		 Thread.sleep(1000);
		 productname.sendKeys(pname);
		 
		 if(!customerinventory.isSelected()) {
			 customerinventory.click();
		 }
		 if(!category.isSelected()) {
			 category.click();
		 }
		 Select se=new Select(category);
		 se.selectByVisibleText("main product category");
		 
		 Select s=new Select(tax);
		 s.selectByVisibleText("tax");
		 
		 Select sel=new Select(subcategory);
		 sel.selectByVisibleText("main product subcategory");
		 
		 Select sle=new Select(producttype);
		 sle.selectByVisibleText("goods");
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
		 	
		 Select as=new Select(basemultipack);
		 sel.selectByVisibleText("Pieces");
		 
		 barcodebtn.click();
		 barcodename.sendKeys(bname);
		 
		 Select sa=new Select(barcodemultipack);
		 sa.selectByVisibleText("pieces");
		 
		 prsubmit.click();
		 Thread.sleep(1000);
	 }
}
