package PageDetails;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BankPageDetails {
		WebDriver driver;
		
		//Registration form
		
		@FindBy(xpath="//*[@id=\"loginPanel\"]/p[2]/a")
		WebElement register;
		@FindBy(id="customer.firstName")
		WebElement firstname;
		@FindBy(id="customer.lastName")
		WebElement lastname;
		@FindBy(id="customer.address.street")
		WebElement address;
		@FindBy(id="customer.address.city")
		WebElement city;
		@FindBy(id="customer.address.state")
		WebElement state;
		@FindBy(id="customer.address.zipCode")
		WebElement zipcode;
		@FindBy(id="customer.phoneNumber")
		WebElement phonenumb;
		@FindBy(id="customer.ssn")
		WebElement ssn;
		@FindBy(id="customer.username")
		WebElement username;
		@FindBy(id="customer.password")
		WebElement password;
		@FindBy(id="repeatedPassword")
		WebElement confirmpass;
		@FindBy(xpath="//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
		WebElement registerbtn;
		
		//Transfer amount
		
		@FindBy(xpath="//*[@id=\"leftPanel\"]/ul/li[3]/a")
		WebElement transferamount;
		@FindBy(id="amount")
		WebElement fund;
		@FindBy(xpath="//*[@id=\"transferForm\"]/div[2]/input")
		WebElement transfer;
		
		//Bill payment
		
		@FindBy(xpath="//*[@id=\"leftPanel\"]/ul/li[4]/a")
		WebElement billpay;
		@FindBy(name="payee.name")
		WebElement payname;
		@FindBy(name="payee.address.street")
		WebElement payaddress;
		@FindBy(name="payee.address.city")
		WebElement paycity;
		@FindBy(name="payee.address.state")
		WebElement paystate;
		@FindBy(name="payee.address.zipCode")
		WebElement payzipcode;
		@FindBy(name="payee.phoneNumber")
		WebElement payphonenum;
		@FindBy(name="payee.accountNumber")
		WebElement payaccountnum;
		@FindBy(name="verifyAccount")
		WebElement verifyaccount;
		@FindBy(name="amount")
		WebElement payamount;
		@FindBy(xpath="//*[@id=\"billpayForm\"]/form/table/tbody/tr[14]/td[2]/input")
		WebElement sendpaymentbtn;
		
		//transferfund
		
		@FindBy(xpath="//*[@id=\"leftPanel\"]/ul/li[3]/a")
		WebElement fundtransaction;
		@FindBy(name="input")
		WebElement amnt;
		@FindBy(xpath="//*[@id=\"transferForm\"]/div[2]/input")
		WebElement transferf;
		
		
		//Logout
		
		@FindBy(xpath="//*[@id=\"leftPanel\"]/ul/li[8]/a")
		WebElement logout;
		
		
		public BankPageDetails(WebDriver driver) {
			 this.driver = driver;
		     PageFactory.initElements(driver, this);
		}
		public void registrationForm(String Rfirstname,String Rlastname,String Raddress,String Rcity,String Rstate,long Rzipcode,long Rphonenumb,String Rssn,String Rusername,String Rpassword,String Rconfirmpass) throws InterruptedException {
			register.click();
			Thread.sleep(1000);
			
			firstname.sendKeys(Rfirstname);
			Thread.sleep(1000);
			
			lastname.sendKeys(Rlastname);
			Thread.sleep(1000);
			
			address.sendKeys(Raddress);
			Thread.sleep(1000);
			
			city.sendKeys(Rcity);
			Thread.sleep(1000);
			
			state.sendKeys(Rstate);
			Thread.sleep(1000);
			
			String pincode=Long.toString(Rzipcode);
			zipcode.sendKeys(pincode);
			
			String phno=Long.toString(Rphonenumb);
			phonenumb.sendKeys(phno);
			
			ssn.sendKeys(Rssn);
			username.sendKeys(Rusername);
			Thread.sleep(1000);
			
			password.sendKeys(Rpassword);
			confirmpass.sendKeys(Rconfirmpass);
			Thread.sleep(1000);
			
			registerbtn.click();
			Thread.sleep(1000);
		}
		
		public void billPayment(String name,String address,String city,String state,long pcode,long phnom,long accno,long conaccount,long amt) throws InterruptedException {
			billpay.click();
			Thread.sleep(1000);
			
			payname.sendKeys(name);
			payaddress.sendKeys(address);
			paycity.sendKeys(city);
			paystate.sendKeys(state);
			
			String pc=Long.toString(pcode);
			payzipcode.sendKeys(pc);

			
			String ph=Long.toString(phnom);
			payphonenum.sendKeys(ph);
			
			String acc=Long.toString(accno);
			payaccountnum.sendKeys(acc);
			
			String cac=Long.toString(conaccount);
			verifyaccount.sendKeys(cac);
			
			String am=Long.toString(amt);
			payamount.sendKeys(am);
			Thread.sleep(1000);
			
			sendpaymentbtn.click();
			
		}
		
		public void transferFund(long amountt) throws InterruptedException {
			fundtransaction.click();
			String aa=Long.toString(amountt);
			amnt.sendKeys(aa);
			Thread.sleep(1000);
			transferf.click();
		}
		
		public void logOut() throws InterruptedException {
			Thread.sleep(1000);
			logout.click();
				
		}
		 public void titleVerification() {
				String expct ="PARA BANK";
				String act = driver.getTitle();
				Assert.assertEquals(act, expct);
			}
		 public void currentUrl() {
				System.out.println(driver.getCurrentUrl());
			}
		  public void pageSource() {
				String src = driver.getPageSource();
				if(src.contains("ATM Services")) {
					System.out.println("Text is present");
				}
				else {
					System.out.println("Text is not present");
				}
			}				
}
