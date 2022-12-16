package launchBrowser;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	WebDriver driver;
@Before
	public void init() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe ");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=dashboard/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");

		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='fa fa-university'] ")).click();
	}

}
