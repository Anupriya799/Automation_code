package PageDetails;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class BlazeDemoPagee {
	
	    WebDriver driver;

	    // Locators
	    
	    @FindBy(name="fromPort")
	    WebElement fromCity;
	    @FindBy(name="toPort")
	    WebElement toCity;
	    @FindBy(xpath="//input[@value='Find Flights']")
	    WebElement findFlightsBtn;
	    @FindBy(xpath="//input[@value='Choose This Flight']")
	    WebElement chooseFlightBtn;
	    @FindBy(id="inputName")
	    WebElement nameField;
	    @FindBy(id="address")
	    WebElement addressField;
	    @FindBy(id="city")
	    WebElement cityField;
	    @FindBy(id="state")
	    WebElement stateField;
	    @FindBy(id="zipCode")
	    WebElement zipCodeField;
	    @FindBy(name="cardType")
	    WebElement cardtypebtn;
	    @FindBy(id="creditCardNumber")
	    WebElement creditcardNum;
	    @FindBy(id="creditCardMonth")
	    WebElement month;
	    @FindBy(id="creditCardYear")
	    WebElement year;
	    @FindBy(id="nameOnCard")
	    WebElement nameonCard;
	    @FindBy(xpath="//input[@value='Purchase Flight']")
	    WebElement purchaseFlightBtn;
	    @FindBy(xpath="//td[text()='Id']/following-sibling::td")
	    WebElement confirmationId;
	    

	    // Constructor
	    
	    public BlazeDemoPagee(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Select cities and search for flights
	    
	    public void selectCitiesAndSearch(String from, String to) throws InterruptedException {
	        Select fromDropdown = new Select(fromCity);
	        fromDropdown.selectByVisibleText(from);

	        Select toDropdown = new Select(toCity);
	        toDropdown.selectByVisibleText(to);

	        findFlightsBtn.click();
	        Thread.sleep(1000);
	    }

	    // Choose the first available flight
	    
	    public void chooseFirstFlight() throws InterruptedException {
	        chooseFlightBtn.click();
	        Thread.sleep(1000);
	    }

	    // Fill passenger details
	    
	    public void enterPassengerDetails(String name, String address, String city, String zipCode,String cardty, long creditcardnumb,int cardmonth,int cardyr,String cardHolderName) throws InterruptedException {
	       nameField.sendKeys(name);
	       addressField.sendKeys(address);
	       cityField.sendKeys(city);
	       zipCodeField.sendKeys(zipCode);
	       Thread.sleep(1000);
	       JavascriptExecutor js=(JavascriptExecutor)driver;
	       js.executeScript("window.scrollBy(0,250)","");
	       
	       Select sel = new Select(cardtypebtn);
	       sel.selectByVisibleText(cardty);
	       String card=Long.toString(creditcardnumb);
	       creditcardNum.sendKeys(card);
	       String cardm=Integer.toString(cardmonth);
	       month.sendKeys(cardm);
	       String cardy=Integer.toString(cardyr);
	       year.sendKeys(cardy);
	       nameonCard.sendKeys(cardHolderName);
	       Thread.sleep(1000);
	    }
	    
	    // Confirm the purchase
	    
	    public void confirmPurchase() throws InterruptedException {
	        purchaseFlightBtn.click();
	    }
	    
	    //Title Verification
	    
	    public void titleVerification() {
			String expct ="blazedemo";
			String act = driver.getTitle();
			Assert.assertEquals(act, expct);
		}
	    
	    //get current URL
	    
	    public void currentUrl() {
			System.out.println(driver.getCurrentUrl());
		}
	    public void pageSource() {
			String src = driver.getPageSource();
			if(src.contains("Travel The World")) {
				System.out.println("Text is present");
			}
			else {
				System.out.println("Text is not present");
			}
		}
	    
	    //Total link count
	    
	    public void linkCount() {
			List<WebElement> li = driver.findElements(By.tagName("a"));
			System.out.println("Total Size "+li.size());
			
			for(int i=0;i<li.size();i++) {
				WebElement e = li.get(i);
				String u = e.getAttribute("href");
				verify(u);
			}
		}
			
				
				private void verify(String u) {
					try {
					URL ul=new URL(u);
					HttpURLConnection con = (HttpURLConnection)ul.openConnection();
					con.setConnectTimeout(3000);
					con.connect();
					if(con.getResponseCode()==200) {
						System.out.println("Valid   :  "+u);
					}
					else if(con.getResponseCode()==404) {
						System.out.println("Invalid   :  "+u);
					}
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
						
				
					}
				}	
  		}

	  



