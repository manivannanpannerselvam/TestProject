package Testproject.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANIVANNAN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		String url=System.getProperty("url");
		
		System.out.println("Url name on the list" +url);
		
		String name=System.getProperty("name");
		
		System.out.println("welcome to india ---> my name is ----> " +name);
		
		
		driver.get(url);
		
		System.out.println("welcomejj");
		
		System.out.println("welcome to india");
	}

}
