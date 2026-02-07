package Test;

import org.testng.annotations.Test;

import Base.Vanforces;
import PageDetails.VanforcesCustomerMasterPageDetails;

public class VanforcesCustomerMasterTest extends Vanforces{
	@Test
	public void verifying() throws InterruptedException {
		VanforcesCustomerMasterPageDetails vanforce=new VanforcesCustomerMasterPageDetails(driver);
		Thread.sleep(1000);
		vanforce.loginaccont("task01", "anupriya+355@texolworld.com", "Password");
		vanforce.customerSetUp("Customer 1", "10000", "1");
	}
}
