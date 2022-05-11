package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriveManager {
	
	private static WebDriver driver;
	
	public WebDriver AbrirUrl() throws Exception{
		
		if(driver == null) {
			
			System.setProperty("webdriver.chrome.driver", Constantes.PATH_CHROMERDRIVER);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		DriverContext.setDriver(driver);
		return driver;
	}
	

	
}
