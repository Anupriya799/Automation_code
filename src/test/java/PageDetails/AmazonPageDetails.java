package PageDetails;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPageDetails {
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	@FindBy(id="nav-search-submit-button")
	WebElement searchbtn;
	@FindBy(id="s-all-filters")
	WebElement filter;
	@FindBy(xpath="//*[@id=\"p_n_feature_forty-seven_browse-bin/24677333011\"]/span/a/div/label/i")
	WebElement amazonbrands;
	@FindBy(xpath="//*[@id=\"abe367d2-c8dd-40a5-bdb4-e4e0993c1099\"]/div/div/span/div/div/div[1]/")
	WebElement gallonbag;
	@FindBy(name="0")
	WebElement count;
	@FindBy(id="add-to-cart-button")
	WebElement addtocart;
	
    
	public AmazonPageDetails(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
    }
	public void productordering(String name) throws InterruptedException {
		search.sendKeys(name);
		searchbtn.click();
		JavascriptExecutor ss=(JavascriptExecutor)driver;
	    ss.executeScript("window.scrollBy(0,250)","");
	     
		filter.click();
		Thread.sleep(1000);
		if (!amazonbrands.isSelected()) {
			amazonbrands.click();  
            System.out.println("Checkbox is now selected.");
        } else {
        	amazonbrands.click(); 
            System.out.println("Checkbox is now deselected.");
        }
		Thread.sleep(1000);
		
		 JavascriptExecutor qw=(JavascriptExecutor)driver;
	     qw.executeScript("window.scrollBy(0,250)","");
	     
	     gallonbag.click();
	     count.click();
	     addtocart.click();
	        
	}	
}