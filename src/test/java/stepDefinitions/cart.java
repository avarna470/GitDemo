package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.CartPage;
import page_Objects.HomePage;
import utils_pack.TestContextSetUp;

public class cart {
	
	WebDriver driver;
	
	TestContextSetUp tcsu;
	
	public cart(TestContextSetUp tcsu) {
		this.tcsu=tcsu;
	}
		
	@When("^User adds (.+) items of the selected product (.+) to the cart$")
	public void items_to_cart(int NumofItems, String itemName) throws InterruptedException {
		
		HomePage hp=new HomePage(tcsu.driver);
		tcsu.name=hp.getProductName();
		
		CartPage cp=new CartPage(tcsu.driver,tcsu.name);
		cp.addToCartPage(NumofItems);
				
	}
	
}
