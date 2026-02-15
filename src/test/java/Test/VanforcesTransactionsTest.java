package Test;

import org.testng.annotations.Test;

import Base.Vanforces;
import PageDetails.vanforceTransactions;

public class VanforcesTransactionsTest extends Vanforces{
		@Test
		public void verifying() throws InterruptedException {
			vanforceTransactions tran=new vanforceTransactions(driver);
			Thread.sleep(1000);
			tran.loginaccont("tasko1",  "anupriya+355@texolworld.com", "Password");
			tran.saleTransaction("10");
			tran.collectionTransaction("172");
			tran.quotationTransaction();
			tran.pendingquotationSetUp();
			tran.addingsalesmanDamage("1000");
			tran.salesmandamageSettlement("500");
			
		}
}
