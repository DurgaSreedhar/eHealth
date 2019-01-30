package Action_Config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class Action_Keywords {
	public static WebDriver driver;

	public static void openBrowser(){ 
		switch ("Firefox"){
		case "Chrome":
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "Firefox":
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		case "IE":
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\IEDriverServer_Win32_3.13.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;				
		}

		driver.get("http://staticice.com.au");
		driver.manage().window().maximize();		
		Assert.assertTrue(true, "Browser Opened successfully");	
	}

	public static void navigateURL(){ 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://staticice.com.au");
	}

	public static void clickonTextField(){
		driver.findElement(By.xpath(".//*[@id='q'")).click();
	}

	public static void inputShoppingfor(){
		driver.findElement(By.xpath(".//*[@id='q'")).sendKeys("HP Elitebook 840 G5");
	}

	public static void clickonSearchButton(){
		driver.findElement(By.xpath(".//*[@value=' Search '")).click();
	}

	public static void verifySearchResultsPage(){
		/* 
			 Verify does search results page open successfully and it should contains list of results
			  Else stop execution 		   
		 */

	}

	public static void getDescriptionofSearchResult(){
		/* 
			Get the list of all descriptions from search results and store in an array		   
		 */
	}

	public static void getTopthreeMatchingResult(){
		/* 
			 Get the top three matching results which description contains "HP Elitebook 840 G5"
			 Else stop execution 			   
		 */
	}

	public static void getPricevalue(){
		/* 
			 Get the price values for each description matching links			   
		 */
	}

	public static void clickonLowestpricelink(){
		/* 
			 click on lowest price value link from an array.			   
		 */
	}

	public static void activateControltoNewURL(){
		/* 
			 On selecting lowest price value, should redirect to new URL.
			 Move control to new page			   
		 */
	}

	public static void verifyStockAvailability(){
		/* 
			 Verify if quantity field exist 
			 else if page contains sold out 
			 close page and click on 2nd lowest price link
			 else if page contains sold out
			 close page and click on 3rd lowest price link
			 else stop execution			   
		 */
	}

	public static void selectStock(){
		/* 
			 Select the quantity
		 */
	}

	public static void clickonAddtoCart(){
		/* 
			 Click on Add to cart button
		 */
	}

	public static void setBillingInformation(){
		/* 
			 Enter all the necessary billing information, pass data from Test Data file
		 */
	}

	public static void getPaypal(){
		/* 
			 Verify does Paypal exist else
			 close page and start from "clickonLowestpricelink" method
		 */
	}

	public static void clickonPaypal(){
		/*
			click on Paypal payment method
		 */
	}

	public static void comparePriceValue(){
		/* Verify does any increase or decrease in payment
			 	if increase in payment go back to "clickonLowestpricelink" method
		 */
	}

	public static void comparePaypalwithOtherPaymentmethods(){
		/* Verify does Paypal price with other payment options
			 	if increase in payment go back to "clickonLowestpricelink" method
		 */
	}

	public static void clickCompleteOrder(){
		/*Click on Complete order*/
	}

	public static void verifyPayPalpage(){
		/*Page should redirect to Paypal page*/
	}

	public static void setPaypaldetails(){
		/*Enter the valid Paypal details and complete the paypal transaction*/
	}

	public static void getInvoiceNumber(){
		/*Get the invoice number from Paypal*/
	}

	public static void getOrderNumber(){
		/*Get the Billing Order Number and verify the sucessful transaction information*/
	}

	public static void tearDown(){
		driver.quit();
	}
}
