package testing_pages;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import basedriver.BaseLibrary;
import propertyutility.Propertyutility;

public class Testing_textbox_page extends BaseLibrary
{
	
	public Testing_textbox_page() 
	{
		PageFactory.initElements(driver, this);
		
	}
    @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
    private WebElement elements;
    @FindBy(xpath = "//*[text()='text box']")
    private WebElement textbox;
    @FindBy(xpath ="//*[@id=\"fullname1\"]")
    private WebElement fullname;
    @FindBy(xpath = "//*[@id=\"fullemail1\"]")
    private WebElement fullmail;
    @FindBy(xpath = "//*[@id=\"fulladdresh1\"]")
    private WebElement fulladdress;
    @FindBy(xpath = "//*[@id=\"paddresh1\"]")
    private WebElement paddress;
    @FindBy(xpath = "//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")
    private WebElement submitbtn;
    @FindBy(xpath = "//*[text()='×']")
	private WebElement closebtn; //this is a encapsulation example
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement Practiceform;
	@FindBy(xpath = "//*[@class=\"col-md-6 mt-5\"]/label")
	private List<WebElement> textboxdata;
	private SoftAssert SoftAssert;
	
    
	public void closebtn()
	{
		closebtn.click();	
		Practiceform.click();
	}
	public void clickonElements()
	{
		elements.click();
	}
    public void clickontextbox()
    {
    	textbox.click();
    }
    public void filldetails()
    {
    	fullname.sendKeys(Propertyutility.getReaddata("name"));
    	fullmail.sendKeys(Propertyutility.getReaddata("email"));
    	fulladdress.sendKeys(Propertyutility.getReaddata("caddress"));
    	paddress.sendKeys(Propertyutility.getReaddata("paddress"));
    	submitbtn.click();
    }
   public void getverifytextboxData() 
    {
    	ArrayList<String>actualdata=new ArrayList<>();
    	ArrayList<String>Expecteddata=new ArrayList<>();
    	Expecteddata.add(Propertyutility.getReaddata("name"));
    	Expecteddata.add(Propertyutility.getReaddata("email"));
    	Expecteddata.add(Propertyutility.getReaddata("caddress"));
    	Expecteddata.add(Propertyutility.getReaddata("paddress"));
    	actualdata.add(textboxdata.get(1).getText());
    	actualdata.add(textboxdata.get(3).getText());
    	actualdata.add(textboxdata.get(5).getText());
    	actualdata.add(textboxdata.get(7).getText());
//    	SoftAssert asert=new SoftAssert();    //soft assert from a
    	for(String dd:Expecteddata)
  
    	{
    		for(String dd1:actualdata) 
    		{
    	    Assert.assertEquals(dd, dd1);	//hard assert from A 
    		actualdata.remove(dd1);
    		break;
    		}
//    	Assert.assertAll();
    		
    		
    		
    	}
    	
    	}
	
    }

