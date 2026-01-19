package Test;

import org.testng.annotations.Test;

import Base.BlazeBaseDetails;
import PageDetails.BlazeDemoPagee;


public class BlazeDemoTest extends BlazeBaseDetails{
	@Test
	public void Execution() throws InterruptedException {
	BlazeDemoPagee obj= new BlazeDemoPagee(driver);
	obj.selectCitiesAndSearch("Paris", "Buenos Aires");
	obj.chooseFirstFlight();
	obj.enterPassengerDetails("John Doe", "123 Street", "New York", "10001", "Visa", 1234567890l,11,2022,"John Doe");
	obj.confirmPurchase();
	obj.currentUrl();
	obj.linkCount();
	obj.pageSource();

	
	}
	
}
	     
	 

       
  


