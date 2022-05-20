package testing_test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basedriver.BaseLibrary;
import testing_pages.Testing_loginPages;
import testing_pages.Testing_textbox_page;

public class Testing_loginTest extends BaseLibrary
{
	Testing_loginPages ob;
	@BeforeTest
	public void getlaunchTestingbaba() throws InterruptedException
	{
		getlaunch("http://testingbaba.com/");
		ob=new Testing_loginPages();	
	}
	@Test(priority =0,enabled=true) 
	public void gettitle()
	{
		ob.gettitle();
	}
	@Test(priority =1,enabled=true)
	public void closebtn()
	{
		ob.closebtn();
	}
	
	
	
}



	
	
	

