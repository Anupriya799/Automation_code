package Test;

import org.testng.annotations.Test;

import Base.Vanforces;
import PageDetails.VanforcesProductMasterSetUp;

public class productMasterSetUp extends Vanforces{
	@Test
	public void verifying() throws InterruptedException {
		VanforcesProductMasterSetUp vanf=new VanforcesProductMasterSetUp(driver);
		Thread.sleep(1000);
		vanf.loginaccont("task01", "anupriya+355@texolworld.com", "Password");
		vanf.productMultipack("pieces", "pi");
		vanf.taxcategorySetUp("001", "Value-Added Tax (VAT)", "15");
		vanf.productCategorySetUp("main product category");
		vanf.productsubCategorySetUp("main product subcategory");
		vanf.productSetUp("sample product 1", "AB121");
		
	}

}
