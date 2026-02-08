package Test;

import org.testng.annotations.Test;

import Base.Vanforces;
import PageDetails.VanforcesPriceMasterPageDetails;

public class VanforcesPriceMasters extends Vanforces {
	@Test
	public void verifying() throws InterruptedException {
		VanforcesPriceMasterPageDetails vfor=new VanforcesPriceMasterPageDetails(driver);
		Thread.sleep(1000);
				vfor.loginaccont("task01", "anupriya+355@texolworld.com", "Password");
				vfor.productPriceSetUp("1", "60", "120");
				vfor.pricekeySetup("Big Sale Offer", "Big Offer Sale", "1", "Big Sale Offer", "1", "100", "500");
				vfor.customerpriceSetup();
				vfor.routepricekeySetup();
	}

}
