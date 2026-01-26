package Base;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Vanforces {
 public WebDriver driver;
 	@BeforeTest
 	public void browserSetUp() {
 		driver= new ChromeDriver();
 		driver.get("https://admin.dev.vanforces.com/login");
 		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
 	}
 	
}
