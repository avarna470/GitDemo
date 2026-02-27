package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import utils_pack.TestContextSetUp;

public class BrowserLaunch {

	TestContextSetUp tcsu;
	
	public BrowserLaunch(TestContextSetUp tcsu) {
		this.tcsu=tcsu;
	}
	
	@Given("User is on Greenkart Landing Page")
	public void greenkart_landing_page() throws IOException {
	    
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources_file\\global_Inputs.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("Url");
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			tcsu.driver=new ChromeDriver();
		}
		
		tcsu.driver.get(url);
	}
	
}
