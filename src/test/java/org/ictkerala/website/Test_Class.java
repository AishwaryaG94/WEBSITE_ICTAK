package org.ictkerala.website;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Class extends Test_Base {
 Home ictobj;

//Check the loading of the ICTAK web-site
@Test(priority=1)
	public void TC_H11()
	{
		ictobj = new Home(driver);
		String expectedhome = "ICT Academy of Kerala";
		String actualres1 = ictobj.hometext();
		Assert.assertEquals(actualres1,expectedhome);
	}

//Check the GET STARTED button in the Home Page
@Test(priority=2)
	public void TC_H21()
	{	
		ictobj = new Home(driver);
		ictobj.GS();
		String explanding = "Our Courses";
		String actualres2 = ictobj.landingtext();
		Assert.assertEquals(actualres2,explanding);
	}

//Check the HOME option from the drop-down menu in the Home Page
 @Test(priority=3)
	public void TC_H31()
	{
		ictobj = new Home(driver);
		ictobj.hme();
		String expectedhome = "ICT Academy of Kerala";
		String actualres3 = ictobj.hometext();
		Assert.assertEquals(actualres3,expectedhome);
		
		
	}
 
//Check the ABOUT option from the drop-down menu in the Home Page
 @Test(priority=4)
	public void TC_H32()
	{
		ictobj = new Home(driver);
		ictobj.about();
		String expabt = "ABOUT US";
		String actualres4 = ictobj.abttext();
		Assert.assertEquals(actualres4,expabt);
	} 
 
//Check the COURSES option from the drop-down menu in the Home Page
	@Test(priority=5)
	public void TC_H33()
	{	
		ictobj = new Home(driver);
		ictobj.Course();
		String explanding = "Our Courses";
		String actualres5 = ictobj.landingtext();
		Assert.assertEquals(actualres5,explanding);

	}
	
	//Check the MEMBERSHIP option from the drop-down menu in the Home Page
	@Test(priority=6)
	public void TC_H34()
	{	
		ictobj = new Home(driver);
		ictobj.memb();
		String expmemb = "a";
		String actualres6 = ictobj.membtext();
		Assert.assertEquals(actualres6,expmemb);

	}
	
	//Check the EVENTS option from the drop-down menu in the Home Page
	@Test(priority=7)
	public void TC_H35()
	{	
		ictobj = new Home(driver);
		ictobj.evnt();
		String expevnt = "a";
		String actualres7 = ictobj.membtext();
		Assert.assertEquals(actualres7,expevnt);
	}
	
	//Check the CONTACT US option from the drop-down menu in the Home Page
	@Test(priority=8)
	public void TC_H36()
	{	
		ictobj = new Home(driver);
		ictobj.cont();
		String expcont = "Your Connection to ICTAK";
		String actualres8 = ictobj.context();
		Assert.assertEquals(actualres8,expcont);

	}

	//Check whether the Footer Logo when clicked redirects to home page
	@Test(priority=9)
	public void TC_H41()
	{	
		ictobj = new Home(driver);
		ictobj.hme();
		ictobj.Footerlogo();
		String expectedhome = "ICT Academy of Kerala";
	    String actualres9 = ictobj.hometext();
		Assert.assertEquals(actualres9,expectedhome);
		
	}
	
	//Check the FACEBOOK button present at the bottom of the Home Page
	@Test(priority=10)
	public void TC_H51()
	{	
		ictobj = new Home(driver);
		ictobj.fbook();
		
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		
		Iterator<String>I1 = s.iterator();
				
		while(I1.hasNext())
		{
			String child_window=I1.next();
			
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				driver.manage().window().maximize();
				String expectedURL = "https://www.facebook.com/ictkerala/";
				String redirectURL = driver.getCurrentUrl();
				Assert.assertEquals(expectedURL, redirectURL);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.close();
				break;
		
			}
		}
		driver.switchTo().window(parent);
	}
	
	//Check the TWITTER button present at the bottom of the Home Page
	@Test(priority=11)
	public void TC_H52()
	{	
		ictobj = new Home(driver);
		ictobj.twitter();
		
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		
		Iterator<String>I1 = s.iterator();
				
		while(I1.hasNext())
		{
			String child_window=I1.next();
			
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				driver.manage().window().maximize();
				String expectedURL = "https://twitter.com/ictakerala/status/580323324766502912";
				String redirectURL = driver.getCurrentUrl();
				Assert.assertEquals(expectedURL, redirectURL);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.close();
				break;
		
			}
		}
		driver.switchTo().window(parent);
	}
	
	//Check the LINKEDIN button present at the bottom of the Home Page
	@Test(priority=12)
	public void TC_H53()
	{	
		ictobj = new Home(driver);
		ictobj.linkedin();
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		
		Iterator<String>I1 = s.iterator();
				
		while(I1.hasNext())
		{
			String child_window=I1.next();
			
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				driver.manage().window().maximize();
				String expectedURL = "https://www.linkedin.com/uas/login?session_redirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2Fictak%2Fabout%2F";
				String redirectURL = driver.getCurrentUrl();
				Assert.assertEquals(expectedURL, redirectURL);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.close();
				break;
		
			}
		}
		driver.switchTo().window(parent);
		
	}
	
	//Check the GITHUB button present at the bottom of the Home Page
	@Test(priority=13)
	public void TC_H54()
	{	
		ictobj = new Home(driver);
		ictobj.github();
		
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		
		Iterator<String>I1 = s.iterator();
				
		while(I1.hasNext())
		{
			String child_window=I1.next();
			
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				driver.manage().window().maximize();
				String expectedURL = "https://github.com/zandeepsanand";
				String redirectURL = driver.getCurrentUrl();
				Assert.assertEquals(expectedURL, redirectURL);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.close();
				break;
		
			}
		}
		driver.switchTo().window(parent);
	}
	
	//Check the YOUTUBE button present at the bottom of the Home Page
	@Test(priority=14)
	public void TC_H55()
	{	
		ictobj = new Home(driver);
		ictobj.youtube();
		
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		
		Iterator<String>I1 = s.iterator();
				
		while(I1.hasNext())
		{
			String child_window=I1.next();
			
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				driver.manage().window().maximize();
				String expectedURL = "https://www.youtube.com/channel/UCFRoEEgl_pBGtREE-Qp9zAg";
				String redirectURL = driver.getCurrentUrl();
				Assert.assertEquals(expectedURL, redirectURL);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.close();
				break;
		
			}
		}
		driver.switchTo().window(parent);
	}
	
	//Check the LOGIN button present at the top of the Home Page
@Test(priority=15)
	public void TC_LG()
	{	
		ictobj = new Home(driver);
		ictobj.hme();
		ictobj.LI();
		String explogin = "input";
		String actualres10 = ictobj.logintext();
		Assert.assertEquals(actualres10,explogin);
	}

 
}
