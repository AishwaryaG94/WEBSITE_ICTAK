package org.ictkerala.website;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy(xpath="//button[text( ) = ' Get Started ']")
	private WebElement start;
	@FindBy(xpath="//*[@class='btn btn-sm bg-gradient-info mb-0 me-1 mt-2 mt-md-0']")
	private WebElement login;
	@FindBy(xpath="//*[@class='nav-item dropdown dropdown-hover mx-2'][1]")
	private WebElement hm;
	@FindBy(xpath="//*[@class='nav-item dropdown dropdown-hover mx-2'][2]")
	private WebElement abt;
	@FindBy(xpath="//*[@class='nav-item dropdown dropdown-hover mx-2'][3]")
	private WebElement crse;
	@FindBy(xpath="//*[@class='nav-item dropdown dropdown-hover mx-2'][4]")
	private WebElement mem;
	@FindBy(xpath="//*[@class='nav-item dropdown dropdown-hover mx-2'][5]")
	private WebElement evn;
	@FindBy(xpath="//*[@class='nav-item dropdown dropdown-hover mx-2'][6]")
	private WebElement con;
	@FindBy(xpath="//a[@class = \"nav-link pe-1\" and contains(@href,'facebook')]")
	private WebElement fb;
	@FindBy(xpath="//a[@class = \"nav-link pe-1\" and contains(@href,'twitter')]")
	private WebElement twit;
	@FindBy(xpath="//a[@class = \"nav-link pe-1\" and contains(@href,'linkedin')]")
	private WebElement linkdn;
	@FindBy(xpath="//a[@class = \"nav-link pe-1\" and contains(@href,'github')]")
	private WebElement git;
	@FindBy(xpath="//a[@class = \"nav-link pe-1\" and contains(@href,'youtube')]")
	private WebElement yt;
	@FindBy(xpath="//*[@alt ='main_logo']")
	private WebElement footerlogo;
	@FindBy(xpath="//h1[text( ) = 'ICT Academy of Kerala']")
	private WebElement hmtext;
	@FindBy(xpath="//h2[text( ) = 'Our Courses']")
	private WebElement landtext;
	@FindBy(xpath="//h1[text( ) = 'ABOUT US']")
	private WebElement abtext;
	@FindBy(xpath="//*[@id=\"navigation\"]/ul/li[4]/ul/div[2]/div/a[1]")
	private WebElement membtex;
	@FindBy(xpath="//*[@id=\\\"navigation\\\"]/ul/li[5]/ul/div[2]/div[2]/a/h6")
	private WebElement evnttex;
	@FindBy(xpath="//h1[text() = 'Your Connection to ICTAK']")
	private WebElement contex;
	@FindBy(xpath="//*[@placeholder = \"Enter Your Email\"]")
	private WebElement logintex;

	
	
	public Home(WebDriver driver) 
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	public void GS()
	{
		start.click();
	}
	public void hme()
	{
		hm.click();
	}
	public void about()
	{
		abt.click();
	}
	public void Course()
	{
		crse.click();
	}
	public void memb()
	{
		mem.click();
	}
	public void evnt()
	{
		evn.click();
	}
	public void cont()
	{
		con.click();
	}
	public void LI()
	{
		login.click();
	}

	
	public void Footerlogo()
	{
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click();", footerlogo);
        driver.navigate().back();
}
	public void fbook()
	{
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click();", fb);
		
	}
	public void twitter()
	{
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click();", twit);
		}
	public void linkedin()
	{
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click();", linkdn);
		
	}
	public void github()
	{
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click();",git);
		
	}
	public void youtube()
	{
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click();",yt);
		
	}
	public String hometext()
	{
		String actl1 = hmtext.getText();
		return(actl1);
	}
	public String landingtext()
	{
		String actl2 = landtext.getText();
		return(actl2);
	}
	public String abttext()
	{
		String actl4 = abtext.getText();
		return(actl4);
	}
	public String membtext()
	{
		String actl5 = membtex.getTagName();
		return(actl5);
	}
	public String evnttext()
	{
		String actl6 = evnttex.getTagName();
		return(actl6);
	}
	public String context()
	{
		String actl7 = contex.getText();
		return(actl7);
	}
	public String logintext()
	{
		String actl8 = logintex.getTagName();
		return(actl8);
	}


}

