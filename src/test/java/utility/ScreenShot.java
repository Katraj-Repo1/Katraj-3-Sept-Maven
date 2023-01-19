package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	
	public static void captureScreen(WebDriver driver, String name) throws IOException {
		
				//step-1 location to store
		
				String path = System.getProperty("user.dir")+"\\screenshots\\"+name+"_" +getCurrentDate()+".png";
				System.out.println(path);
				//step-2 using take screenshot reference
				TakesScreenshot tss = (TakesScreenshot) driver;
				
				//step-3 
				File sourceFile = tss.getScreenshotAs(OutputType.FILE);
				
				//step-4 Using file object
				File destinationFile = new File (path);
				
				//step-5 Using File handler
				FileHandler.copy(sourceFile, destinationFile);				
		
	}
	
	public static String getCurrentDate() {
		
		  DateFormat date   =new SimpleDateFormat ("yyyy-MM-ddhh-mm");
		  
		  Calendar cal = Calendar.getInstance();
		  
		  String currentDate = date.format(cal.getTime());
		  
		  
		
		return currentDate;
	}
	
	public static void main(String[] args) {
		System.out.println(getCurrentDate());
	}

}
