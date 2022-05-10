package pomRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='langCardClose']")
	private WebElement weAreNowAvilableInHindiPopUp;
	
	@FindBy(xpath = "//ul[@class='userSection pushRight']/..//li[@data-cy='account']")
	private WebElement accountButton;

	@FindBy(id = "fromCity")
	private WebElement fromCity;
	
	@FindBy(xpath = "//input[@placeholder='From']")
	private WebElement fromCityTextfield;
	
	@FindAll(@FindBy(xpath = "//p[@class='font14 appendBottom5 blackText']"))
	private List<WebElement> suggestedCities;
	
	@FindBy(xpath = "//input[@placeholder='To']")
	private WebElement toTextField;
	
	@FindBy(xpath = "//span[text()='To']")
	private WebElement toCity;
	
	@FindBy(xpath = "//div[@aria-label='Sun Apr 17 2022']")
	private WebElement departureDate;
	
	@FindBy(xpath = "//a[text()='Search']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//div[@aria-label='Sat Apr 30 2022']")
	private WebElement returnDate;
	
	@FindBy(xpath = "//span[text()='RETURN']")
	private WebElement returnDateCal;

	public WebElement getReturnDateCal() {
		return returnDateCal;
	}

	public WebElement getReturnDate() {
		return returnDate;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getDepartureDate() {
		return departureDate;
	}

	public WebElement getToCity() {
		return toCity;
	}

	public WebElement getWeAreNowAvilableInHindiPopUp() {
		return weAreNowAvilableInHindiPopUp;
	}
	
	public WebElement getAccountButton() {
		return accountButton;
	}

	public WebElement getFromCity() {
		return fromCity;
	}

	public WebElement getFromCityTextfield() {
		return fromCityTextfield;
	}

	public List<WebElement> getSuggestedCities() {
		return suggestedCities;
	}

	public WebElement getToTextField() {
		return toTextField;
	}
}
