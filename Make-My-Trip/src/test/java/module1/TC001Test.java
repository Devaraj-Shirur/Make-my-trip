package module1;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomRepo.HomePage;

public class TC001Test extends BaseClass {
	@Test
	public void hubliToBanglore() throws InterruptedException{
		HomePage hp = new HomePage(driver);
		
		// From City Textfield
		
		hp.getWeAreNowAvilableInHindiPopUp().click();
		hp.getAccountButton().click();
		hp.getFromCity().click();
		hp.getFromCityTextfield().sendKeys(FromCity1);
		List<WebElement> Suggestions = hp.getSuggestedCities();
		Thread.sleep(4000);
		for(WebElement sugg : Suggestions) {		// To Print All the Cities that Are Suggested below
			String printSugg = sugg.getText(); 
			Reporter.log(printSugg, true);
	
		}	
		for(WebElement sugg : Suggestions) {		// To Select the Required city
			String printSugg = sugg.getText();
			Reporter.log("Required City : "+printSugg, true);			
			if(printSugg.contains("Mumbai")) {
				sugg.click();
				break;
			}
		}
		
		Reporter.log("-----------------------------------------------------------------------------------------------", true);
		
		// To city TextField 
		hp.getToTextField().clear();
		hp.getToTextField().sendKeys(ToCity1);
		Thread.sleep(3000);
		List<WebElement> toSuggestions = hp.getSuggestedCities();
		for(WebElement toSugg : toSuggestions) {
			String printToSugg = toSugg.getText();
			Reporter.log(printToSugg, true);
		}
		
		for(WebElement tosugg : Suggestions) {
			String printToSugg = tosugg.getText();
			if(printToSugg.contains("Hubli")) {
				tosugg.click();
				break;
			}
		}
		
		hp.getDepartureDate().click();
		hp.getReturnDateCal().click();
		hp.getReturnDate().click();
		hp.getSearchButton().click();
		Thread.sleep(5000);
	}
}
 