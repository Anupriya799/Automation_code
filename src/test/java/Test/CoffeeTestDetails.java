package Test;

import org.testng.annotations.Test;

import Base.CoffeeBaseDetails;
import PageDetails.BlazeDemoPagee;
import PageDetails.CoffeePageDetails;

public class CoffeeTestDetails extends CoffeeBaseDetails {
	@Test
	public void Execution() throws InterruptedException {
		CoffeePageDetails obj= new CoffeePageDetails(driver);
		obj.detailsEnter("Hemlin", "hemlin@gmail.com");
		obj.checkBoxHandling();
		obj.restOfTheWrk();
	}

}
