package Test;

import org.testng.annotations.Test;

import Base.AmazonBaseDetails;
import PageDetails.AdvantagePageDetails;
import PageDetails.AmazonPageDetails;

public class AmazonTestDetails extends AmazonBaseDetails {
	@Test
	public void execution() throws InterruptedException
	{
		AmazonPageDetails obj= new AmazonPageDetails(driver);
		obj.productordering("Amazon Basics");
	}
}
