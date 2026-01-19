package PageDetails;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoffeePageDetails {
	WebDriver driver;
	 @FindBy(xpath="//*[@id=\"app\"]/div[2]/ul/li[1]")
     WebElement espressoAddButton;
	
	 @FindBy(xpath="//*[@id=\"app\"]/div[2]/div[1]/button")
	 WebElement total;

     @FindBy(name="name")
     WebElement nameField;

     @FindBy(name="email")
     WebElement emailField;
     
     @FindBy(id="promotion")
     WebElement checkbox;

     @FindBy(id="submit-payment")
     WebElement submitButton;
     
     public CoffeePageDetails(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
     public void detailsEnter(String name,String email) throws InterruptedException{
    	 espressoAddButton.click();
    	 Thread.sleep(1000);
    	 total.click();
    	 Thread.sleep(1000);
    	 nameField.sendKeys(name);
    	 Thread.sleep(1000);
    	 emailField.sendKeys(email);
    	 Thread.sleep(1000);
    	 
    	  }
     public void checkBoxHandling() throws InterruptedException {
    	  if (!checkbox.isSelected()) {
              checkbox.click();  // Click to tick the checkbox
              System.out.println("Checkbox is now selected.");
              Thread.sleep(1000);
          } else {
              System.out.println("Checkbox was already selected.");
          }
     }
     public void restOfTheWrk() {
    	 submitButton.click();
     }
}
