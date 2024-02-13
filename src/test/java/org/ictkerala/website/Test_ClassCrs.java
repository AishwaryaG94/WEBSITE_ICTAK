package org.ictkerala.website;
import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_ClassCrs extends Test_Base {
	Courses crsobj;
	String expknmre = "SoftwareTesting";
	String expabout = "ICT Academy of Kerala offers a wide variety of Specialized Certificate Courses.";
	String expagenda = "h3";
	String exphighlight = "h3";
	String expentrance = "h3";
	String expmodel = "h5";
	String exppartner = "h6";
	
	//Test Case to check the functionality of KNOW MORE button
@Test(priority=1)
public void  TC_C61()
{	
	crsobj = new Courses(driver);
	crsobj.hme();
	crsobj.Course();
	crsobj.knowmore();
	String actualreslt1 = crsobj.kntext();
	Assert.assertEquals(actualreslt1,expknmre);
}

	//Test Case to check the Student registration form with all fields blank
@Test(priority=2)
public void  TC_C71() throws AWTException
{	
	crsobj = new Courses(driver);
	crsobj.applynow();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	crsobj.setname("");
	crsobj.setemail("");
	crsobj.setnum("");
	Assert.assertEquals(crsobj.verifyButton(),false);
	System.out.println("Registeration unsuccessful as Register button is inactive due to all blank fields");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	Actions actions = new Actions(driver);
	Robot robot = new Robot();
	robot.mouseMove(50,50);
	actions.click().build().perform();

}

//Test Case to check the Student registration form with name and number fields blank
@Test(priority=3)
public void  TC_C72() throws AWTException
{	
	crsobj = new Courses(driver);
	crsobj.applynow();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	crsobj.setname("");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	crsobj.setemail("aish123@gmail.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	crsobj.setnum("");
	Assert.assertEquals(crsobj.verifyButton(),false);
	System.out.println("Registeration unsuccessful as Register button is inactive due to blank name and number fields");
	Actions actions = new Actions(driver);
	Robot robot = new Robot();
	robot.mouseMove(50, 50);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	actions.click().build().perform();

}

//Test Case to check the Student registration form with email and number fields blank
@Test(priority=4)
public void  TC_C73() throws AWTException
{	
	crsobj = new Courses(driver);
	crsobj.applynow();
	crsobj.setname("Aishwarya G.");
	crsobj.setemail("");
	crsobj.setnum("");
	Assert.assertEquals(crsobj.verifyButton(),false);
	System.out.println("Registeration unsuccessful as Register button is inactive due to blank email and number fields");
	Actions actions = new Actions(driver);
	Robot robot = new Robot();
	robot.mouseMove(50, 50);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	actions.click().build().perform();
}

//Test Case to check the Student registration form with number field blank
@Test(priority=5)
public void  TC_C74() throws AWTException{
	crsobj = new Courses(driver);
	crsobj.applynow();
	crsobj.setname("Aishwarya");
	crsobj.setemail("aishu123@gmail.com");
	crsobj.setnum("");
	Assert.assertEquals(crsobj.verifyButton(),false);
	System.out.println("Registeration unsuccessful as Register button is inactive due to blank number field");
	Actions actions = new Actions(driver);
	Robot robot = new Robot();
	robot.mouseMove(50, 50);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	actions.click().build().perform();

}

//Test Case to check the Student registration form with all valid inputs
@Test(priority=6)
public void  TC_C75()
{	
	crsobj = new Courses(driver);
	crsobj.applynow();
	crsobj.setname("Aishwarya G");
	crsobj.setemail("aishu123@gmail.com");
	crsobj.setnum("9955664422");
	crsobj.register();
	Alert alert = driver.switchTo().alert();
	String alertMsg = driver.switchTo().alert().getText();
	String msg = "Registration Successfull";
	Assert.assertEquals(alertMsg,msg);
	System.out.println(alertMsg);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	alert.accept();
}

//Check the About option from the left-hand side menu in the course section
@Test(priority=8)
public void  TC_C81() throws InterruptedException

{	
	crsobj = new Courses(driver);
	crsobj.hme();
	crsobj.Course();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	crsobj.knowmore();
	crsobj.about1();
	String actualreslt2 = crsobj.abtext();
	Assert.assertEquals(actualreslt2,expabout);

}

//Check the Agenda option from the left-hand side menu in the course section
@Test(priority=9)
public void  TC_C82()
{	
	crsobj = new Courses(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	crsobj.agenda();
	String actualreslt3 = crsobj.agendatext();
	Assert.assertEquals(actualreslt3,expagenda);
}

//Check the Highlights option from the left-hand side menu in the course section
@Test(priority=10)
public void  TC_C83()
{	
	crsobj = new Courses(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	crsobj.highlights();
	String actualreslt4 = crsobj.agendatext();
	Assert.assertEquals(actualreslt4,exphighlight);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)");
}

//Check the Entrance option from the left-hand side menu in the course section
@Test(priority=11)
public void  TC_C84()
{	
	crsobj = new Courses(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	crsobj.entrance();
	String actualreslt5 = crsobj.entrancetext();
	Assert.assertEquals(actualreslt5,expentrance);
}

//Check the Models option from the left-hand side menu in the course section
@Test(priority=12)
public void  TC_C85() 
{	
	crsobj = new Courses(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	crsobj.models();
	String actualreslt6 = crsobj.modeltext();
	Assert.assertEquals(actualreslt6,expmodel);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
}

//Check the Partners option from the left-hand side menu in the course section
@Test(priority=13)
public void  TC_C86()
{	
	crsobj = new Courses(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	crsobj.partners();
	String actualreslt7 = crsobj.partnertext();
	Assert.assertEquals(actualreslt7,exppartner);
}


}