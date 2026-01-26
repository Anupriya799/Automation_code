package Test;

import org.testng.annotations.Test;

import Base.Vanforces;
import PageDetails.VanforcesPageDetails;

public class VanforcesTest extends Vanforces{
	@Test
	public void verifying() throws InterruptedException {
	VanforcesPageDetails vanforces=new VanforcesPageDetails(driver);
	Thread.sleep(2000);
	vanforces.loginaccont("task01", "anupriya+355@texolworld.com", "Password");
	
	}
}
