package library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ValidationScripts {

	WebDriver driver;
	
	public ValidationScripts(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	//type text by using name
	public void typeTextByName(String objectName, String tData )
	{
		if(driver.findElements(By.name(objectName)).size() ==1)
		{
			driver.findElement(By.name(objectName)).sendKeys(tData);
			
		}else
		{
			//fail the test case
			Assert.fail(objectName +"-is Not Available");
		}
	}

	//click object by using name
	public void clickByName(String objectName)
	{
		if(driver.findElements(By.name(objectName)).size() ==1)
		{
			driver.findElement(By.name(objectName)).click();
			
		}else
		{
			//fail the test case
			Assert.fail(objectName +"-is Not Available");
		}
	}

	//Click object by using link text
	public void clickByLinkText(String objectName)
	{
		if(driver.findElements(By.linkText(objectName)).size() ==1)
		{
			driver.findElement(By.linkText(objectName)).click();
			
		}else
		{
			//fail the test case
			Assert.fail(objectName +"-is Not Available");
		}
	}
	
	//Select Radio option by using Name
	public void radioSelectByName(String ObjectName, String tData)
	{
		if(driver.findElements(By.name(ObjectName)).size() > 1)
		{
			List<WebElement> tripTypes = driver.findElements(By.name(ObjectName));
			for(WebElement tripType:tripTypes)
			{
				if(tripType.getAttribute("value").equals(tData))
				{
					tripType.click();
				}
			}

		}else
		{
			Assert.fail(ObjectName +"-is Not Available");
		}
		
		
		

	}
}
