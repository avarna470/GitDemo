package stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import page_Objects.CartPage;
import utils_pack.TestContextSetUp;

public class Checkout {

	TestContextSetUp tcsu;
	
	public Checkout(TestContextSetUp tcsu) {
		this.tcsu=tcsu;
	}

	@Then("^User proceeds to checkout page and verifies the product (.+) details$")
	public void checkout_page(String itemName) throws InterruptedException {
		
		CartPage cp=new CartPage(tcsu.driver,tcsu.name);
		String prod=cp.checkoutPage();
		
		Assert.assertEquals(tcsu.name, prod);
		Thread.sleep(5000);
	}
	
}
