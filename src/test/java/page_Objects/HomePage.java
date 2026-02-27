package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By search = By.cssSelector("input.search-keyword");
	By productName = By.xpath("//h4[@class='product-name']");
	By topDeals=By.linkText("Top Deals");
	
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}

	public String getProductName() {

		return	driver.findElement(productName).getText();
	}
	
	public void topDealsPage() {
		driver.findElement(topDeals).click();
	}

}
