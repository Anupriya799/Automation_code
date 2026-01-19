package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NopcommerceUrl {
	public WebDriver driver;
	@BeforeTest
	public void browserSetup() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F\r\n");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

}
