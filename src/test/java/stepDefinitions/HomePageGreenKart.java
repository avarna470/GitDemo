package stepDefinitions;

import io.cucumber.java.en.When;
import page_Objects.HomePage;
import utils_pack.TestContextSetUp;

public class HomePageGreenKart {
	
	TestContextSetUp tcsu;
	
	public HomePageGreenKart(TestContextSetUp tcsu) {
		this.tcsu=tcsu;
	}
		
	
	@When("^User searched with shortname like (.+) and actual product item is displayed$")
	public void search_HomePage(String shortname) throws InterruptedException {
		
		HomePage hp=new HomePage(tcsu.driver);
		hp.searchItem(shortname);
	    
		Thread.sleep(2000);
	    
	    String product=hp.getProductName().split("-")[0].trim();
	    tcsu.homeProductName=product;
	    System.out.println(product);
  
	}
	
}
