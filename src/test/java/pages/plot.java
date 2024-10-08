package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class plot {
	@FindBy(xpath="//a[text()='For Buyers']")
	WebElement forBuyer;
	public void clickForBuyer() {
		forBuyer.click();
	}
	
	@FindBy(xpath="(//span[@class='pageComponent'])[2]")
	WebElement plot;
	public void clickPlot() {
		plot.click();
	}
	@FindBy(xpath="//a[text()='East Facing Plots in Hyderabad']")
	WebElement eastFacing;
	public void clickEastFacing () {
		eastFacing.click();
	}
}
