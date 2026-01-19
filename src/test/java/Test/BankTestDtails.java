package Test;

import org.testng.annotations.Test;

import Base.BankBaseDetails;
import PageDetails.AdvantagePageDetails;
import PageDetails.BankPageDetails;

public class BankTestDtails extends BankBaseDetails {
	@Test
	public void execution() throws InterruptedException {
		BankPageDetails obj= new BankPageDetails(driver);
		obj.registrationForm("Shahla", "VP", "Tirur", "Malappuram", "Kerala", 676102, 345672899, "Shah", "Sherin90", "ShahlaSherin34", "ShahlaSherin34");
		obj.billPayment("Shahla", "Tirur", "Malappuram", "Kerala", 673611, 799421354, 46458, 46458, 100);
		obj.transferFund(100);
		obj.logOut();
		obj.titleVerification();
		obj.currentUrl();
		obj.pageSource();		
}
}