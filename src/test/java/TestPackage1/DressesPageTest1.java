package TestPackage1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageObjectsPackage1.BaseObjects1;

public class DressesPageTest1 extends BaseObjects1
{
	@FindBy(xpath="//input[@id='layered_id_attribute_group_1']")
	private WebElement scombo;
	
	@FindBy(xpath="//input[@id='layered_id_attribute_group_2']")
	private WebElement mcombo;
	
	@FindBy(xpath="//input[@id='layered_id_attribute_group_3']")
	private WebElement lcombo;
	
	public void  HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	


}
