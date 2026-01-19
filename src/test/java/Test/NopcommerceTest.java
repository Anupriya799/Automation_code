package Test;

import org.testng.annotations.Test;

import Base.NopcommerceUrl;
import PageDetails.NopcommercePage;

public class NopcommerceTest extends NopcommerceUrl {
	@Test
	public void verifying() throws InterruptedException {
		NopcommercePage commerce=new NopcommercePage(driver);
		Thread.sleep(2000);
		commerce.registration("Anu", "Sharma", "anu123@gmail.com", "Ansh pvt ltd", "As@123456");
		Thread.sleep(3000);
		commerce.logos();
		commerce.titleVerification();
		
		
	}

}
