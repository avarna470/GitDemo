package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils_pack.TestContextSetUp;

public class Hooks {
	
	TestContextSetUp tcsu;
	
	public Hooks(TestContextSetUp tcsu) {
		this.tcsu=tcsu;
	}

	@After
	public void browserClose() {
		
		tcsu.driver.quit();
	}
	
	@AfterStep
	public void addScreenshot(Scenario sc) throws IOException {
		
		WebDriver driver=tcsu.driver;
		
		if(sc.isFailed()) {
			File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent=FileUtils.readFileToByteArray(sourcePath);
			sc.attach(fileContent, "png", "scrnsht_image");
		}
		
	}
	
	
}
