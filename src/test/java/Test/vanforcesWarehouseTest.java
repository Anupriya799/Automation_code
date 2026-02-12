package Test;

import org.testng.annotations.Test;

import Base.Vanforces;
import PageDetails.vanforcesWarehouseTransactions;

public class vanforcesWarehouseTest extends Vanforces{
	@Test
	public void verifying() throws InterruptedException {
		vanforcesWarehouseTransactions ware=new vanforcesWarehouseTransactions(driver);
		ware.loginaccont("task01", "anupriya+400@texolworld.com", "Password");
		ware.warehouseTransactions("12", "12");
	}

}
