package Test;

import org.testng.annotations.Test;

import Base.Vanforces;
import PageDetails.VanforcesUserMasterSetUp;

public class VanforcesUserMasterTest extends Vanforces{
	@Test
	public void verifying() throws InterruptedException {
		VanforcesUserMasterSetUp van=new VanforcesUserMasterSetUp(driver);
		Thread.sleep(1000);
		van.loginaccont("tasko1",  "anupriya+355@texolworld.com", "Password");
		van.userMasters("Head Salesman 1", "100@gmail.com", "123456", "123456", "10000", "10000", "5");
}
}