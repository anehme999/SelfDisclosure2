package TestCase;

//import static WebDriver.function.Keywords.*;
import static WebDriver.function.SD_Test_Function.*;
import static WebDriver.function.ReadProp.GetConfig;
import static WebDriver.function.ReadProp.GetLocator;

import java.util.HashMap;

public class Test {
	
	public void Test1(HashMap<String, String> TestData){
		TestFunction(GetConfig("Username_SD"),GetConfig("Password_SD"), GetConfig("Organization_SD"), TestData);	
	}
	public void Test2(HashMap<String, String> TestData){
		TestFunction(GetConfig("Username_SD"),GetConfig("Password_SD"), GetConfig("Organization_SD"), TestData);	
	}
	public void Test3(HashMap<String, String> TestData){
		TestFunction(GetConfig("Username_SD"),GetConfig("Password_SD"), GetConfig("Organization_SD"), TestData);	
	}
	public void Test4(HashMap<String, String> TestData){
		TestFunction(GetConfig("Username_SD"),GetConfig("Password_SD"), GetConfig("Organization_SD"), TestData);	
	}
	public void Test5(HashMap<String, String> TestData){
		TestFunction(GetConfig("Username_SD"),GetConfig("Password_SD"), GetConfig("Organization_SD"), TestData);	
	}
}
