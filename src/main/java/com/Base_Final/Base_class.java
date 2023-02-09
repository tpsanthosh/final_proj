package com.Base_Final;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_class {

	
	
public static WebDriver driver;
	
	public static WebDriver get_Driver() {
	
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+ "\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static void inputvalues(WebElement element, String value) { //----sendkeys
		   element.sendKeys(value);
			  
			  
		}
			
		  public static void clickonelement(WebElement element) {  //----click
			  element.click();

		}
		  
			public static void geturl(String url) {  //---geturl
				driver.get(url);
				
			}
			
			 public static void close() {   //---close
				 driver.close();
			 }
			 
			 public static void waitForSeconds(int a) {    //-----wait
		      driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
		      
			}
			
			 public static void actionsmethods(WebElement move) {  //----action
				 Actions act= new Actions(driver);
				 act.moveToElement(move).build().perform();
				 
			}
			 
			 public static void frame_Into(WebElement frame) { //---frame into
				 driver.switchTo().frame(frame);
				 
			}
			
			 public static void frame_out() {		//---defaultcontent frame
				 driver.switchTo().defaultContent();
				 
			}
			 
			 
			 public static void sleep(int a) throws InterruptedException  {  //----sleep
				 Thread.sleep(a);

			}
			
			 public static void dropdown(WebElement element, String type) { //---dropdown
				 Select s=new Select(element);
				 element.sendKeys(type);
			}
			 
			 public static void screenshot(String file) throws Exception{   //---screenshot
				 TakesScreenshot shot=(TakesScreenshot) driver;
				 File sou = shot.getScreenshotAs(OutputType.FILE);
				 File des = new File(System.getProperty("user.dir")+ "\\Screenshot\\" + file);
				 FileUtils.copyFile(sou, des);
			}
			 
			 public static void Scroll_Down() {
				 JavascriptExecutor js= (JavascriptExecutor) driver;  //--- scrolldown
				 js.executeScript("window.scroll(0, 500)", "");
				 
			}	
		
			 
			
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

