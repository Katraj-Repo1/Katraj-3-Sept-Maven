package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import tests.BaseTest;
import tests.LoginTest;

public class TestListener extends BaseTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			ScreenShot.captureScreen(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}
