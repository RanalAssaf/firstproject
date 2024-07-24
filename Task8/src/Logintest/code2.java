package Logintest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import unit1.configReadTask;

public class code2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 configReadTask crt=new configReadTask();

	        try {
	        	driver.manage().window().maximize();
	        	driver.get(crt.geturl());
//	        	Thread.sleep(10000);
	        	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	       
	        	
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")))
	        	.sendKeys(crt.getusername());
	        
	        	WebElement password=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	            password.sendKeys(crt.getpassword());
	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")))
	        	.click();
	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")))
	        	.click();
	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")))
	        	.click();
	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")))
	        	.sendKeys(crt.getid());
	            //save button
	            WebElement fname=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input"));
	               fname.sendKeys(crt.getfname());
	               
	               
	               WebElement mname=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input"));
	               mname.sendKeys(crt.getmname());
	               
	               WebElement lname=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input"));
	               lname.sendKeys(crt.getlname());
	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")))
	        	.click();
	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")))
	        	.click();
	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")))
	        	.sendKeys(crt.getfname()+" "+crt.getmname()+" "+crt.getlname());
	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")))
	        	.click();
	            
	            /**/
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")));

	            WebElement RecordFound=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span"));
	        	String Found = RecordFound.getText();
	        	if(!(Found.contains("(0)"))) {
	        		System.out.println("Passed");
	        	}
	        	else {
	        		System.out.println("Failed");
	        	
	        	}
	            /**/
	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span")))
	        	.click();
	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")))
	        	.click();
	            
	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")))
	        	.click();
	     //*************************************************************************************************
	        	//1-WebElement username=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	        	//username.sendKeys(crt.getusername());
	            
	            //2-WebElement password=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	            //password.sendKeys(crt.getpassword());
	            
//	            3-WebElement login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//	            login.click();
	            //Thread.sleep(5000);
	            
//	        	4-WebElement pim=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
//               pim.click();
               //Thread.sleep(5000);
               
//	        	5-WebElement addnewemp=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a"));
//	        	addnewemp.click();
	        	//Thread.sleep(5000);
	        	
//	        	WebElement fname=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input"));
//               fname.sendKeys(crt.getfname());
//               
//               
//               WebElement mname=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input"));
//               mname.sendKeys(crt.getmname());
//               
//               WebElement lname=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input"));
//               lname.sendKeys(crt.getlname());
               
//              6- WebElement id=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
//               id.sendKeys(crt.getid());
               //Thread.sleep(5000);

               
//              7- WebElement save=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
//	            save.click();
	            //Thread.sleep(10000);
	            
//	           8- WebElement list=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a"));
//	            list.click();
	            //Thread.sleep(5000);
	            
//	            9-WebElement search=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
//	            search.sendKeys(crt.getfname()+" "+crt.getmname()+" "+crt.getlname());
	            //Thread.sleep(5000);
	            
//	            10-WebElement bsearch=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
//	            bsearch.click();
	            //Thread.sleep(5000);
	            ///html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span
//	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")));
//
//	            WebElement RecordFound=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span"));
//	        	String Found = RecordFound.getText();
//	        	if(!(Found.contains("(0)"))) {
//	        		System.out.println("Passed");
//	        	}
//	        	else {
//	        		System.out.println("Failed");
//	        	
//	        	}
	        	//Thread.sleep(5000);
               
//	            11-WebElement home=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span"));
//	            home.click();
	            //Thread.sleep(5000);
	            
//	           12- WebElement l=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
//	            l.click();
	            //Thread.sleep(5000);
	            
//	            13-WebElement logout=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
//	            logout.click();
	            //Thread.sleep(5000);
               
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }

	}

}
