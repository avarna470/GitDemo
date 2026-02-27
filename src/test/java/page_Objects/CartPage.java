package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	WebDriver driver;
	String name;
	public CartPage(WebDriver driver, String name) {
		this.driver = driver;
		this.name=name;
	}
	
	
	By cartBag=By.xpath("//a[@class='cart-icon']");
	By checkoutButton=By.xpath("//div[@class='action-block']/button[text()='PROCEED TO CHECKOUT']");
	By verifyItemName=By.cssSelector("p.product-name");
	By promoButton=By.xpath("//button[@class='promoBtn']");
	By place=By.xpath("//button[text()='Place Order']");
	
	
	public void addToCartPage(int NumofItems) {
		
		for(int i=1;i<=NumofItems;i++) {
			driver.findElement(By.xpath("//h4[text()='"+name+"']/following-sibling::div[1]/a[@class='increment']")).click();
		}
		driver.findElement(By.xpath("//h4[text()='"+name+"']/following-sibling::div[2]/button[text()='ADD TO CART']")).click();
	}

	public String checkoutPage() {

		driver.findElement(cartBag).click();
		driver.findElement(checkoutButton).click();
		return driver.findElement(verifyItemName).getText();
	}
	
	public void placeOrderPage() {
		
		driver.findElement(promoButton).isDisplayed();
		driver.findElement(place).isDisplayed();
	}

}
