package Test;

import org.testng.annotations.Test;

import Base.AdvantageBaseDetails;
import PageDetails.AdvantagePageDetails;
import PageDetails.BlazeDemoPagee;

public class AdvantageTestDetails extends AdvantageBaseDetails {
	@Test
	public void execution() throws InterruptedException {
		AdvantagePageDetails obj= new AdvantagePageDetails(driver);
		obj.itemSelection("AjayKumar", "ajayk@67gmail.com", "AjayKumar@123", "AjayKumar@123", "AjayKumar", "mt", 387667321, "India", "kozhikode", "perambra", "kerala", 6786789);
		obj.paymentDetails("AjayKumar", "AjayKumar123");
	}
	
}
