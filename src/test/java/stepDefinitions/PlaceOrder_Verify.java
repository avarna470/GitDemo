package stepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import page_Objects.CartPage;
import utils_pack.TestContextSetUp;

public class PlaceOrder_Verify {

	TestContextSetUp tcsu;
	
	public PlaceOrder_Verify(TestContextSetUp tcsu) {
		this.tcsu=tcsu;
	}
	
	@Then("and User Verifies the Apply and place order buttons")
	public void place_order() throws InterruptedException{
		
		CartPage cp=new CartPage(tcsu.driver,tcsu.name);
		cp.placeOrderPage();
		Thread.sleep(10000);
	}


	
}
