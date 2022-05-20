package testing_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basedriver.BaseLibrary;
import testing_pages.Testing_textbox_page;

public class Testing_textbox_test extends BaseLibrary
{

	Testing_textbox_page ob;
	@BeforeTest
	public void getlaunchTestingbaba() throws InterruptedException
	{
	getlaunch("http://testingbaba.com/");
	ob=new Testing_textbox_page();
	ob.closebtn();
	}
	@Test(priority=1)
	public void clickonElements()
	{
		ob.clickonElements();
	}
	@Test(priority=2)
	public void clickontextbox()
	{
		ob.clickontextbox();
	}
	@Test(priority = 3)
	public void filldetails()
	{
		ob.filldetails();
	}
	@Test(priority = 4)
	public void getverifytextboxData()
	{
		ob.getverifytextboxData();
	}
	 
	
}


