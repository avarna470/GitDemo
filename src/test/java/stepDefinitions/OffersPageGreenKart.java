package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import page_Objects.HomePage;
import page_Objects.OffersPage;
import utils_pack.TestContextSetUp;

public class OffersPageGreenKart {

	TestContextSetUp tcsu;
	
	public OffersPageGreenKart(TestContextSetUp tcsu) {
		this.tcsu=tcsu;
	}
	
	@Then("^User searches the same (.+) shortname in offers page to check if the product exist$")
	public void search_OffersPage(String var) throws InterruptedException {
		
		switchToTab();
		
		OffersPage op=new OffersPage(tcsu.driver);
		op.searchItem(var);
		
		Thread.sleep(2000);
		
		String productName=op.getProductName();
		System.out.println(productName);
		
		Assert.assertEquals(tcsu.homeProductName, productName);
		
	}
	
	public void switchToTab() {
		
		HomePage hp=new HomePage(tcsu.driver);
		hp.topDealsPage();
		
		Set<String> tabs=tcsu.driver.getWindowHandles();
		Iterator<String> it=tabs.iterator();
		String parentID=it.next();
		String childID=it.next();
		
		System.out.println(parentID);
		tcsu.driver.switchTo().window(childID);
	}
	
}
