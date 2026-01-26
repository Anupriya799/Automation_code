package Test;

import org.testng.annotations.Test;

import Base.Vanforces;
import PageDetails.VanforcesLocaleMastersSetup;

public class VanforcesLocaleMastersTest extends Vanforces {
	@Test
	public void verifying() throws InterruptedException {
		VanforcesLocaleMastersSetup van =new VanforcesLocaleMastersSetup(driver);
		Thread.sleep(1000);
		van.loginaccont("task01", "anupriya+355@texolworld.com", "Password");
		van.regionsetup("Karnataka");
		van.areaSetUp("Kozhikode", "AR34");
		van.branchSetUp("kozhikode");
		van.routeSetUp("route 1");
		van.warehouseSetUp("warehouse 1", "Main Warehouse", "Calicut , kerala");
	}

}
