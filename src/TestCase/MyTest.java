package TestCase;

//import static WebDriver.function.Keywords.*;
import static WebDriver.function.SD_Test_Function.*;

import java.util.HashMap;

public class MyTest {
	
	public void CheckLogin(HashMap<String, String> TestData){
		Login(TestData.get("USERNAME"),TestData.get("PASSWORD"), TestData.get("ORGANIZATION"));	
	}
	
	public void CheckSampleTest(HashMap<String, String> TestData){
		SampleTest(TestData.get("USERNAME"),TestData.get("PASSWORD"), TestData.get("ORGANIZATION"));	
	}
	
	
	
	//TestData.get("USERNAME"),TestData.get("PASSWORD"), TestData.get("ORGANIZATION")
	/*
	public static void start(){
		OpenBrowser();
		Login();
		try {
			Thread.sleep(1000);
		} catch (Exception e){
			e.printStackTrace();
		}
		AmendEntity();
		try {
			Thread.sleep(1000);
		} catch (Exception e){
			e.printStackTrace();
		}
		EnterLegalEntityName();
		CloseBrowser();
	}
	*/
}
