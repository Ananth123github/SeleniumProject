package PageObjectsPackage1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects1 extends BaseObjects1 {

	
	@FindBy(xpath = "//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='Women']")
	private WebElement Womentab;

	@FindBy(xpath = "//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='Dresses']")
	private WebElement Dressestab;
	
	@FindBy(xpath = "//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='T-shirts']")
	private WebElement Tshirtstab;
	
	@FindBy(xpath = "//*[@id='center_column']/*/*//span[contains(text(),'Women')]")
	private WebElement navigatedWomentab;
	

	
	@FindBy(xpath = "//*//div[@id='center_column']/*/*//Span[contains(text(),'Dresses')]")
	private WebElement navigatedtodresses;
	
	@FindBy(xpath = "//*//div[@id='center_column']/*/*//Span[contains(text(),'T-shirts')]")
	private WebElement navigatedtotshirts;
	
	@FindBy(xpath = "//*[@id='newsletter-input']")
	private WebElement newsletter;
				
	@FindBy(xpath = "//*[@id='newsletter_block_left']/*//button[@type='submit']")
	private WebElement newlettersubmit;



	
	public HomePageObjects1() {
		PageFactory.initElements(driver, this);
	}

	public boolean IsWomenTabPresent()
	{
		return elementFound(Womentab);
	}
	public boolean isDressesTabPresent()
	{
		return elementFound(Dressestab);
	}
	
	public boolean isTShirtsTabPresent()
	{
		return elementFound(Tshirtstab);
	}
	
	public void clickwomentab()
	{
		Womentab.click();
	}
	public boolean isnavigatedWomentab()
	{
		return elementFound(navigatedWomentab);
	}
	
	public void clickDressestab()
	{
		Dressestab.click();
	}
	public boolean isnavigatedDressesTab()
	{
		return elementFound(navigatedtodresses);
	}
	
	public void clickTshirtstab()
	{
		Tshirtstab.click();
	}
	public boolean isnavigatedTShirtsTab()
	{
		return elementFound(navigatedtotshirts);
	}
	
	public boolean issubscriptiontextpresent()		
	{
		return elementFound(newsletter);
	}
	
	public void enteringvalidmail()
	{
		newsletter.click();
		newsletter.sendKeys("v.ananth28@gmail.com");
		newlettersubmit.click();

	
	
	
	}
		}
	
	
	

	