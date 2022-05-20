package testing_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basedriver.BaseLibrary;

public class Testing_loginPages extends BaseLibrary
{
	//this statement to create a memory of current page of Web element (Constructor) 
	//at the time of compile time
 public Testing_loginPages() 
 {
	PageFactory.initElements(driver, this);
 }
	
	@FindBy(xpath = "//*[text()='×']")
	private WebElement closebtn; //this is a encapsulation example
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement Practiceform;
	
	public void gettitle()
	{
		String title=driver.getTitle();
		System.out.println("Title is"+title);
		}
	public void closebtn()
	{
		closebtn.click();	
		Practiceform.click();
	}
	
	public static void main(String[] args)
	{
          
		
	}
	
	
	
}
