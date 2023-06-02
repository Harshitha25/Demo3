package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PS2Test {
	WebDriver driver;
	@Test
public void practice(){
		String BROWSER = System.getProperty("browser");
		String URL= System.getProperty("url");
		 if(BROWSER.equalsIgnoreCase("chrome"))
		 { WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();}
		 if(BROWSER.equalsIgnoreCase("firefox"))
		 { WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();}
		 
	System.out.println("Hello");
	System.out.println("Poll scm success");
}
}
