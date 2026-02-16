package PageDetails;

import org.openqa.selenium.JavascriptExecutor;
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
	    
	    
	    //Pending Quotation
	    
	    @FindBy(id="rc-menu-uuid-54925-1-/pending-quotations")
	    WebElement pendingquotation;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[9]/button")
	    WebElement viewdetails;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div/div[3]/div/button")
	    WebElement qpconfirm;
	    
	    
	    //Salesman Damage
	    
	    @FindBy(id="rc-menu-uuid-54925-1-/salesman-damage")
	    WebElement salesmandamage;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[1]/div/div[1]/button")
	    WebElement damageadd;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/form/div/div[2]/table/tbody/tr[1]/td/span/div/div/span/span[1]/input")
	    WebElement sdroute;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div/div/button")
	    WebElement sdaddproduct;
	    
	    @FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/button")
	    WebElement sdproduct;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[3]/div")
	    WebElement sdquantity;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div[3]/div/button")
	    WebElement sdconfirm;
	    
	    //Salesman Damage Settlement
	    
	    @FindBy(id="rc-menu-uuid-54925-1-/salesman-damage-settlement-summary")
	    WebElement salesmandamagesettlement;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[1]/div/div[1]/button")
	    WebElement addsettlement;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/form/div/div[2]/table/tbody/tr[1]/td/span/div/div/span/span[1]/input")
	    WebElement stroute;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/form/div/div[2]/table/tbody/tr[5]/td/span/div/div/span/span[1]/input")
	    WebElement stsalesman;
	    
	    @FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div/div/div/table/tbody/tr[2]/td[8]/div/input")
	    WebElement settleamount;
	    
	    @FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[1]/div/div[3]/button[2]")
	    WebElement stsubmit;
	    
	    @FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[1]/div/button")
	    WebElement printclose;
	    
	    //Load
	    
	    @FindBy(id="rc-menu-uuid-54925-1-/load-summary")
	    WebElement load;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[1]/button")
	    WebElement addload;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/form/div/div[2]/table/tbody/tr[1]/td/span/div/div/span/span[1]/input")
	    WebElement ldwarehouse;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/form/div/div[2]/table/tbody/tr[4]/td/span/div/div/span/span[1]/input")
	    WebElement ldroute;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div/div/button")
	    WebElement ldaddproduct;
	    
	    @FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/button")
	    WebElement ldproduct;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div[3]/div/button")
	    WebElement ldconfirm;
	    
	    //Suggested Load
	    
	    @FindBy(id="rc-menu-uuid-54925-1-/suggested-loadSummary")
	    WebElement suggestedload;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[1]/button")
	    WebElement newsuggestedload;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/form/div/div[2]/table/tbody/tr[1]/td/span/div/div/span/span[1]/input")
	    WebElement suggwarehouse;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/form/div/div[2]/table/tbody/tr[7]/td/span/div/div/span/span[1]/input")
	    WebElement suggroute;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div/main/div/div/div/button")
	    WebElement suggaddproduct;
	    
	    @FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/button")
	    WebElement suggproduct;
	    
	    @FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/button")
	    WebElement suggconfirm;
	    
	   // UnLoad
	    
	    @FindBy(id="rc-menu-uuid-62952-1-/unload-summary")
	    WebElement unload;
	    
	    @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[2]/div/div[1]/button")
	    WebElement newunload;
	    
	    @FindBy(className="ant-select-selection-search-input")
	    WebElement unwarehouse;
	    
	    @FindBy(className="ant-select-selection-search-input")
	    WebElement unroute;
	    
	    @FindBy(className="ant-btn css-geihnj ant-btn-default ant-btn-color-default ant-btn-variant-outlined ant-btn-sm ant-btn-block")
	    WebElement unaddproduct;
	    
	    @FindBy(className="ant-btn css-geihnj ant-btn-primary ant-btn-color-primary ant-btn-variant-solid ant-btn-sm")
	    WebElement unproduct;
	    
	    @FindBy(className="editable-cell-value-wrap")
	    WebElement unquantity;
	    
	    @FindBy(className="ant-btn css-geihnj ant-btn-primary ant-btn-color-primary ant-btn-variant-solid")
	    WebElement unconfirm;
	    
	    //Advance Collection
	    
	    @FindBy(id="rc-menu-uuid-62952-1-/advance-collections")
	    WebElement advancecollection;
	    
	    @FindBy(className="ant-row ant-row-space-between ant-row-middle css-geihnj")
	    WebElement addnewadvcnecollection;
	    
	    @FindBy(className="ant-select-selection-search-input")
	    WebElement advcustomer;
	    
	    @FindBy(className="ant-select-selection-search-input")
	    WebElement advroute;
	    
	    @FindBy(id="collection-form_amount")
	    WebElement advamount;
	    
	    @FindBy(className="ant-btn css-geihnj ant-btn-primary ant-btn-color-primary ant-btn-variant-solid")
	    WebElement advsubmit;
	    
	    //Credit Debit Note
	    
	    @FindBy(id="rc-menu-uuid-62952-1-/credit-debit-notes")
	    WebElement creditdebitnote;
	    
	    @FindBy(className="ant-btn css-geihnj ant-btn-primary ant-btn-color-primary ant-btn-variant-solid")
	    WebElement addnote;
	    
	    @FindBy(id="collection-form_customer")
	    WebElement crcustomer;
	    
	    @FindBy(id="collection-form_cost_centre")
	    WebElement crcostcentre;
	    
	    @FindBy(id="collection-form_cash_amount")
	    WebElement cramount;
	    
	    @FindBy(id="collection-form_reference_no")
	    WebElement referencenumber;
	    
	    @FindBy(className="ant-space css-geihnj ant-space-horizontal ant-space-align-center")
	    WebElement craddnote;
	    
	    //Settlement
	    
	    @FindBy(id="rc-menu-uuid-62952-1-/settlements")
	    WebElement settlement;
	    
	    @FindBy(className="ant-btn css-geihnj ant-btn-primary ant-btn-color-primary ant-btn-variant-solid")
	    WebElement addsalesmansettlement;
	    
	    @FindBy(id="settlement-form_route_id")
	    WebElement settleroute;
	    
	    @FindBy(id="settlement-form_salesman_id")
	    WebElement settlesalesman;
	    
	    @FindBy(id="settlement-form_payment_type")
	    WebElement settletransactiontype;
	    
	    @FindBy(id="settlement-form_collector")
	    WebElement settlecollector;
	    
	    @FindBy(id="settlement-form_total_settled")
	    WebElement ssettleamount;
	    
	    @FindBy(className="ant-btn css-geihnj ant-btn-primary ant-btn-color-primary ant-btn-variant-solid ant-btn-block")
	    WebElement submitsettlement;
	    
	    
	    
	    
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
	    //Pending Quotation
	    
	    public void pendingquotationSetUp() throws InterruptedException {
	    	pendingquotation.click();
	    	Thread.sleep(1000);
	    	viewdetails.click();
	    	
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			 
			 qpconfirm.click();
			 Thread.sleep(1000);
	    }
	    
	    //Salesman Damage
	    
	    public void addingsalesmanDamage(String qnum) throws InterruptedException {
	    	salesmandamage.click();
	    	Thread.sleep(1000);
	    	damageadd.click();
	    	
	    	Select sd=new Select(sdroute);
	    	sd.selectByVisibleText("route 1");
	    	
	    	sdaddproduct.click();
	    	sdproduct.click();
	    	sdquantity.clear();
	    	sdquantity.click();
	    	sdquantity.sendKeys("qnum");
	    	sdconfirm.click();
	    	Thread.sleep(1000);
	    }
	    
	    //Salesman Damage Settlement
	    
	    public void salesmandamageSettlement(String stnum) throws InterruptedException {
	    	salesmandamagesettlement.click();
	    	Thread.sleep(1000);
	    	addsettlement.click();
	    	
	    	Select st=new Select(stroute);
	    	st.selectByVisibleText("Route 1");
	    	
	    	Select sts=new Select(stsalesman);
	    	sts.selectByVisibleText("Head Salesman 1");
	    	
	    	settleamount.click();
	    	settleamount.sendKeys("stnum");
	    	
	    	stsubmit.click();
	    	Thread.sleep(2000);
	    	printclose.click();
	    	Thread.sleep(1000);
	    	
	    }
	    
	    //Load
	    
	    public void loadTransaction() {
	    	load.click();
	    	addload.click();
	    	Select ld=new Select(ldwarehouse);
	    	ld.selectByVisibleText("Warehouse 1");
	    	
	    	Select lds=new Select(ldroute);
	    	lds.selectByVisibleText("Route 1");
	    	
	    	//Pop up message box closing
	    	driver.switchTo().alert().accept();
	    	
	    	ldaddproduct.click();
	    	ldproduct.click();
	    	ldconfirm.click();
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    	
	    	}
	    
	    //Suggetsed Load
	    
	    public void suggestedLoad() {
	    	suggestedload.click();
	    	newsuggestedload.click();
	    	Select sug=new Select(suggwarehouse);
	    	sug.selectByVisibleText("Warehouse 1");
	    	
	    	Select sugg=new Select(suggroute);
	    	sugg.selectByVisibleText("Route 1");
	    	
	    	suggaddproduct.click();
	    	suggproduct.click();
	    	suggconfirm.click();
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	    
	    //Unload
	    
	    public void unloadSetUp(String qnum) {
	    	unload.click();
	    	newunload.click();
	    	
	    	Select unw=new Select(unwarehouse);
	    	unw.selectByVisibleText("warehouse 1");
	    	
	    	Select unr=new Select(unroute);
	    	unr.deselectByVisibleText("Route 1");
	    	
	    	unaddproduct.click();
	    	unproduct.click();
	    	unquantity.clear();
	    	unquantity.click();
	    	unquantity.sendKeys(qnum);
	    	unconfirm.click();
	    
	    }
	    
	    //Advance Collection
	    
	    public void advanceCollection(String aamount) {
	    	advancecollection.click();
	    	addnewadvcnecollection.click();
	    	
	    	Select advc=new Select(advcustomer);
	    	advc.selectByVisibleText("Customer 1");
	    	
	    	Select advr=new Select(advroute);
	    	advr.selectByVisibleText("Route 1");
	    	
	    	advamount.click();
	    	advamount.sendKeys(aamount);
	    	advsubmit.click();
	    }
	    
	    //Credit Debit Note
	    
	    public void creditdebitNote(String crdtamount,String refnum) {
	    	creditdebitnote.click();
	    	addnote.click();
	    	crcustomer.click();
	    	
	    	Select cr=new Select(crcostcentre);
	    	cr.selectByVisibleText("Customer 1");
	    	
	    	Select crd=new Select(crcostcentre);
	    	crd.selectByVisibleText("CS001");
	    	
	    	cramount.sendKeys(crdtamount);
	    	referencenumber.sendKeys(refnum);
	    	craddnote.click();
	    	
	    }
	    
	    //Settlement
	    
	    public void settlementSetup(String Samnt) {
	    	settlement.click();
	    	addsalesmansettlement.click();
	    	
	    	Select stl=new Select(settleroute);
	    	stl.selectByVisibleText("Route 1");
	    	
	    	Select stls=new Select(settlesalesman);
	    	stls.selectByVisibleText("Head Salesman 1");
	    	
	    	Select stlt=new Select(settletransactiontype);
	    	stlt.selectByVisibleText("Cash");
	    	
	    	Select stlc=new Select(settlecollector);
	    	stlc.selectByVisibleText("Vanforces");
	    	
	    	ssettleamount.click();
	    	ssettleamount.sendKeys(Samnt);
	    	
	    	submitsettlement.click();
	    }
}
