package Test;

import org.testng.annotations.Test;

import Base.Vanforces;
import PageDetails.expensePageVanforces;

public class expenseVanforces extends Vanforces{
	@Test
	public void verifying() throws InterruptedException {
		expensePageVanforces ex=new expensePageVanforces(driver);
		Thread.sleep(1000);
		ex.loginaccont("task01", "anupriya+355@texolworld.com", "Password");
		ex.costcentreSetUp("Main Cost Centre");
		ex.expenseTypeSetUp("Main Expense Type");
	}

}
