package PageDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vanforceTransactions {
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
	    
	    //Transactions
	    //Sale
	    
	    @FindBy(id="rc-menu-uuid-10399-1-11")
	    WebElement transactions;
	    
	    @FindBy(id="rc-menu-uuid-10399-1-/sales-summary")
	    WebElement sale;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[1]/div/div[1]/button")
	    WebElement newsale;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/form/div/div[1]/div[2]/table/tbody/tr[1]/td/span/div/div/span/span[1]/input")
	    WebElement customer;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/form/div/div[1]/div[2]/table/tbody/tr[4]/td/span/div/div/span/span[1]/input")
	    WebElement route;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/form/div/div[1]/div[2]/table/tbody/tr[7]/td/span/div/div/span/span[2]")
	    WebElement transactiontype;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/form/div/div[2]/button/span")
	    WebElement confirmandproceed;
	    
	    @FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/button/span")
	    WebElement product;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[4]/div")
	    WebElement quantity;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div[3]/div/div/button/span")
	    WebElement confirm;
	    
	    
	   //Collection
	    
	    @FindBy(id="rc-menu-uuid-10399-1-/collections-summary")
	    WebElement collection;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[1]/div/div[1]/button/span")
	    WebElement addnewcollection;
	    
	    @FindBy(id="collection-form_customer")
	    WebElement ccustomer;
	    
	    @FindBy(id="collection-form_route")
	    WebElement croute;
	    
	    @FindBy(id="/html/body/div[1]/div/div/main/div/form/div/div/table/tbody/tr[7]/th/span/div/div/button/span")
	    WebElement selectinvoice;
	    
	    @FindBy(xpath="/html/body/div[6]/div/div[2]/div/div[1]/div/div[2]/div/div[3]/div/div/div/div/div/table/tbody/tr/td[1]/label/span/input")
	    WebElement invoicechecking;
	    
	    @FindBy(xpath="/html/body/div[6]/div/div[2]/div/div[1]/div/div[3]/button[2]/span")
	    WebElement ok;
	    
	    @FindBy(id="collection-form_collections_0_paymentType")
	    WebElement paymenttype;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/form/div/div/table/tbody/tr[9]/td/span/div[1]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/input")
	    WebElement amount;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div/div/button/span")
	    WebElement add;
	    
	    //Quotation
	    
	    @FindBy(id="rc-menu-uuid-10399-1-/quotations-summary")
	    WebElement quotation;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[1]/div/div[1]/button")
	    WebElement addnewquotation;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div/form/div/div[2]/table/tbody/tr[1]/td/span/div/div/input")
	    WebElement calender;
	    
	    @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div[2]/table/tbody/tr[2]/td[5]/div")
	    WebElement date;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/form/div/div[2]/table/tbody/tr[4]/td/span/div/div/span/span[1]/input")
	    WebElement qroute;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/form/div/div[2]/table/tbody/tr[7]/td/span/div/div/span/span[1]/input")
	    WebElement qcustomer;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div/div/div/button/span")
	    WebElement addproduct;
	    
	    @FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/button")
	    WebElement qproduct;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div[3]/div/button/span")
	    WebElement qconfirm;
	    
	    //Constructor
	    public vanforceTransactions(WebDriver driver) {
	    	
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
	    
	    //Transactions
	    //Sale
	    
	    public void saleTransaction(String qnum) throws InterruptedException {
	    	transactions.click();
	    	sale.click();
	    	Thread.sleep(1000);
	    	newsale.click();
	    	
	    	Select sel=new Select(customer);
	    	sel.selectByVisibleText("Customer 1");
	    	
	    	Select se=new Select(route);
	    	se.selectByVisibleText("Route 1");
	    	
	    	Select te=new Select(transactiontype);
	    	te.selectByVisibleText("Credit");
	    	
	    	confirmandproceed.click();
	    	Thread.sleep(1000);
	    	product.click();
	    	quantity.sendKeys(qnum);
	    	confirm.click();
	    	Thread.sleep(1000);
	    	
	    }
	    
	    //Collection
	    
	    public void collectionTransaction(String amountnum) {
	    	collection.click();
	    	addnewcollection.click();
	    	
	    	Select cu=new Select(ccustomer);
	    	cu.selectByVisibleText("Customer 1");
	    	
	    	Select ro=new Select(croute);
	    	ro.selectByVisibleText("Route 1");
	    	
	    	selectinvoice.click();
	    	
	    	if(!invoicechecking.isSelected()) {
	    		invoicechecking.click();
	    	}
	    	ok.click();
	    	
	    	Select pay=new Select(paymenttype);
	    	pay.selectByVisibleText("Cash");
	    	
	    	amount.sendKeys(amountnum);
	    	add.click();
	    }
	    
	    //Quotation
	    
	    public void quotationTransaction() {
	    	quotation.click();
	    	addnewquotation.click();
	    	calender.click();
	    	date.click();
	    	
	    	Select rq=new Select(qroute);
	    	rq.selectByVisibleText("route 1");
	    	
	    	Select qc=new Select(qcustomer);
	    	qc.selectByVisibleText("Customer 1");
	    	
	    	addproduct.click();
	    	qproduct.click();
	    	qconfirm.click();
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	    	
	    }

}
