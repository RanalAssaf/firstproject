package Logintest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import unit1.configReadTask;


public class codeTask8 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 configReadTask crt=new configReadTask();

	        try {
	        	driver.manage().window().maximize();
	        	driver.get(crt.geturl());
	        	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        	Thread.sleep(10000);
	        
	        	WebElement username=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	        	username.sendKeys(crt.getusername());
	            
	            WebElement password=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	            password.sendKeys(crt.getpassword());
	            
	            WebElement login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	            login.click();
	            Thread.sleep(5000);
	            
	        	WebElement pim=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
                pim.click();
                Thread.sleep(5000);
                
	        	WebElement addnewemp=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a"));
	        	addnewemp.click();
	        	Thread.sleep(5000);
	        	
	        	WebElement fname=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input"));
                fname.sendKeys(crt.getfname());
                
                
                WebElement mname=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input"));
                mname.sendKeys(crt.getmname());
                
                WebElement lname=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input"));
                lname.sendKeys(crt.getlname());
                
                WebElement id=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
                id.sendKeys(crt.getid());
                Thread.sleep(5000);

                
                WebElement save=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
	            save.click();
	            Thread.sleep(10000);
	            
	            WebElement list=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a"));
	            list.click();
	            Thread.sleep(5000);
	            
	            WebElement search=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
	            search.sendKeys(crt.getfname()+" "+crt.getmname()+" "+crt.getlname());
	            Thread.sleep(5000);
	            
	            WebElement bsearch=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
	            bsearch.click();
	            Thread.sleep(5000);
	            
	            WebElement RecordFound=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span"));
	        	String Found = RecordFound.getText();
	        	if(!(Found.contains("(0)"))) {
	        		System.out.println("Passed");
	        	}
	        	else {
	        		System.out.println("Failed");
	        	
	        	}
	        	Thread.sleep(5000);
                
	            WebElement home=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span"));
	            home.click();
	            Thread.sleep(5000);
	            
	            WebElement l=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
	            l.click();
	            Thread.sleep(5000);
	            
	            WebElement logout=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
	            logout.click();
	            Thread.sleep(5000);
                
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }

	}

}
