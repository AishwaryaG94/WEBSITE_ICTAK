package org.ictkerala.website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Courses {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//*[@class='nav-item dropdown dropdown-hover mx-2'][1]")
	private WebElement hm;
	@FindBy(xpath="//html/body")
	private WebElement knmr;
	@FindBy(xpath="//*[@class='nav-item dropdown dropdown-hover mx-2'][3]")
	private WebElement crse;
	@FindBy(xpath="//button[text() = ' Apply Now ']")
	private WebElement apnow;
	@FindBy(xpath="//*[@name='name']")
	private WebElement name;
	@FindBy(xpath="//*[@name='email' and @type='email']")
	private WebElement email;
	@FindBy(xpath="//*[@name ='phoneno']")
	private WebElement num;
	@FindBy(xpath="//button[text() = 'Register']")
	private WebElement reg;
	@FindBy(xpath="//*[@id = \"v-pills-home-tab\"]")
	private WebElement abt1;
	@FindBy(xpath="//*[@id = \"v-pills-profile-tab\"]")
	private WebElement agn;
	@FindBy(xpath="//*[@id = \"v-pills-messages-tab\"]")
	private WebElement hghl;
	@FindBy(xpath="//*[@id = \"v-pills-settings-tab\"]")
	private WebElement ent;
	@FindBy(xpath="//*[@href = \"#v-pills-partners\"]")
	private WebElement mod;
	@FindBy(xpath="//*[@href = \"#v-pills-download\"]")
	private WebElement part;
	@FindBy(xpath="/html/body/app-root/app-single-page/body/header/div[1]/div[1]/div/div/h2")
	private WebElement kntex;
	@FindBy(xpath="//p[text()= ' ICT Academy of Kerala offers a wide variety of Specialized Certificate Courses. ']")
	private WebElement abtex;
	@FindBy(xpath="//h3[text()= ' Agenda ']")
	private WebElement agendatex;
	@FindBy(xpath="//h3[text()= ' Course Highlights ']")
	private WebElement highlighttex;
	@FindBy(xpath="//h3[text()= 'Entrance Exam']")
	private WebElement entrancetex;
	@FindBy(xpath="//h5[text()= 'Download Sample Question paper ']")
	private WebElement modeltex;
	@FindBy(xpath="//h6[text() = 'The Executive Partners']")
	private WebElement partnertex;
	
	

public Courses(WebDriver driver) 
{
this.driver = driver;
PageFactory.initElements(driver, this);
}
public void hme()
{
	hm.click();
}
public void Course()
{
	crse.click();
}
public void knowmore()
{
	knmr.click();
}
public void applynow()
{
	apnow.click();
}
public void setname(String nme)
{
	name.clear();
	name.sendKeys(nme);
	

}
public void setemail(String eml)
{
		email.clear();
		email.sendKeys(eml);
}
public void setnum(String number)
{
	num.clear();
	num.sendKeys(number);

}
public void register()
{
	reg.click();
}
public void about1()
{
	abt1.click();
}
public void agenda()
{
	agn.click();
}
public void highlights()
{
	hghl.click();
}
public void entrance()
{
	ent.click();
}
public void models()
{
	mod.click();
}
public void partners()
{
	part.click();
}
public String kntext()
{
	String actlc1 = kntex.getText();
	return(actlc1);
}
public boolean verifyButton()
{
	if(reg.isEnabled())
	{
		return true;
	}
	else
	{
		return false;
	}
	
}
public String abtext()
{
	String actlc2 = abtex.getText();
	return(actlc2);
}
public String agendatext()
{
	String actlc3 = agendatex.getTagName();
	return(actlc3);
}
public String highlighttext()
{
	String actlc4 = highlighttex.getTagName();
	return(actlc4);
}
public String entrancetext()
{
	String actlc5 = entrancetex.getTagName();
	return(actlc5);
}
public String modeltext()
{
	String actlc6 = modeltex.getTagName();
	return(actlc6);
}
public String partnertext()
{
	String actlc6 = partnertex.getTagName();
	return(actlc6);
}


}
