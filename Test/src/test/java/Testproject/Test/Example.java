package Testproject.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Example 
{
	//ExtentReports extent;
	
	@Test
	public void testd()
	{
		
		String Path="C:\\Users\\MANIVANNAN\\Desktop\\cucumber_project\\TestResult3.html";
		
		//extent = new ExtentReports(Path, false);
		
		//extent.addSystemInfo("Platform", "Windows");
		
		WebDriver driver=new FirefoxDriver();
		
		String url=System.getProperty("url");
		
		System.out.println("Url name on the list" +url);
		
		
		driver.get("https://akt-on.com/aml2/Account/Login?ReturnUrl=%2Faml2%2FChallenge%2FBoard");
		
		
	}

}
