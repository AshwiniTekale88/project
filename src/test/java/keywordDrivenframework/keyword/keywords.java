package keywordDrivenframework.keyword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keywords {
	private static WebDriver driver;
	public void openBrowser(String browserName) {
	switch(browserName) {
	case "Chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
	case "Firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
	default:
		System.out.println("invalid browser");
		
	
	}
	
	}
	
	

}
