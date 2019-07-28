package testpack;

import org.testng.annotations.Test;

import library.ValidationScripts;
import repository.ObjectRepository;
import testdata.NewTours;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DemoTestNG {
	WebDriver driver;
	ObjectRepository or;
	ValidationScripts vs;
	
  @Test(dataProvider = "dp",dataProviderClass = NewTours.class)
  public void f(String un, String pwd, String tType) {
	  	
	  	vs.typeTextByName(or.Txtusrname, un);
	  	vs.typeTextByName(or.Txtpwd, pwd);
	  	vs.clickByName(or.BtnLogin);
	  	vs.radioSelectByName(or.radTripType, tType);
	  	vs.clickByLinkText(or.lnkSignOff);
	  }

  @BeforeMethod
  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mittu\\Desktop\\JarFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		vs = new ValidationScripts(driver);
  }

  @AfterMethod
  public void afterMethod() {
		driver.close();
  }

}
