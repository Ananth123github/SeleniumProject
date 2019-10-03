package TestPackage1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectsPackage1.BaseObjects1;
import PageObjectsPackage1.HomePageObjects1;

public class HomePageTest1 {

	HomePageObjects1 homePage;
	BaseObjects1 bp;

	public HomePageTest1() {
		homePage = new HomePageObjects1();
		bp = new BaseObjects1();
		
		
	}

@Test
public void WomenTabPresent()
{
	Assert.assertEquals(true,homePage.IsWomenTabPresent(),"Women Tab is not Present");
	
	}

	
	/*if(homePage.IsWomenTabPresent())
	{
		System.out.println("Women Tab is Present");
	}
	else
	{
		System.out.println("Women Tab is not Present");
	}
	
	}*/
	
	@Test
	public void DressesTabPresent()
	{
		
		Assert.assertEquals(true,homePage.isDressesTabPresent(),"Dress Tab is not Present");
		
		

	}
		/*if(homePage.isDressesTabPresent())
		{
			System.out.println("Dresses Tab is Present");
		}
		else
		{
			System.out.println("Dresses Tab is not Present");
			
		}
}*/
	
	@Test
	public void TShirtsTabPresent()
	{
		Assert.assertEquals(true,homePage.isTShirtsTabPresent(),"T shirts Tab is not Present");
		

	}
		/*if(homePage.isTShirtsTabPresent())
		{
			System.out.println("TShirts Tab is Present");
		}
		else
		{
			System.out.println("TShirts Tab is not Present");
			
		}
	}*/
	
	@Test
	public void navigatedwomantab()
	{
		homePage.clickwomentab();
		Assert.assertEquals(true,homePage.isnavigatedWomentab(),"Not navigated to womantab");
				
	}
	

	
	@Test
	public void navigateddressestab()
	{
		homePage.clickDressestab();
		Assert.assertEquals(true,homePage.isnavigatedDressesTab(),"Not navigated to dressestab");
				
	}
	@Test
	
	public void navigatedtshirtstab()
	{
		homePage.clickTshirtstab();
		Assert.assertEquals(true,homePage.isnavigatedTShirtsTab(),"Not navigated to tshirttab");
				
	}
	@Test
	public void verifynewsletter()
	{
		homePage.enteringvalidmail();
		Assert.assertEquals(true,homePage.issubscriptiontextpresent(),"No newslettertab");
	}
	
}
