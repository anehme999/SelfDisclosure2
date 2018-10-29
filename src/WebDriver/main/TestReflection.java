package WebDriver.main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

import com.relevantcodes.extentreports.LogStatus;

import static WebDriver.main.TestRunner.*;
import static WebDriver.function.Config.LoadConfig;
import static WebDriver.function.ReadProp.GetConfig;
import static WebDriver.function.Keywords.*;


public class TestReflection {

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void RunTest(String TestClass,String TestName,HashMap<String, String> TestData){
		
		
		String PackageName=GetConfig("TestPackage");
		
		try{
			if (TestName.toUpperCase().replaceAll("\\s+","").contains("END")){
				//closeBrowser();
				driver=null;
				LoadConfig(sheetname,sheetname," Result",extent);
				extent.flush();
				System.out.println("End");
				return;
				}
			// the following line is important...why?
			int intIndex = TestName.indexOf("//");
			if(intIndex == - 1){
				
		    	Class cls = Class.forName(PackageName+"."+TestClass);
		  		Object obj = cls.newInstance();
		  		//call the testcase at runtime
		  		Method method = cls.getDeclaredMethod(TestName, HashMap.class);
		  		test = extent.startTest(TestData.get("TESTCASEID"), TestData.get("DESCRIPTION")+" ");
		  		//Calling Clean up  
				cleanup(TestData);
				method.invoke(obj, TestData);
		  		extent.endTest(test);
		  		
	  		
	      }else{
	    	  	//Skipping a test case
		  		test = extent.startTest(TestName, "Test Case Skipped");
				test.log(LogStatus.SKIP, "The Test Case "+TestName+" is Skipped");
				extent.endTest(test);
	      }
	}catch (NoSuchMethodException | IllegalArgumentException | InvocationTargetException ex) {
		try{
	        //load the testClass at runtime
			
			test = extent.startTest(TestName, "Test Case Not Present");
			test.log(LogStatus.UNKNOWN, "The Test Case "+TestName+" is Not Present in "+sheetname+" Script" + ex.getMessage());
			extent.endTest(test);
			}catch(Exception ex1){
				
				ex1.printStackTrace();
			}
		
	}
		catch(ClassNotFoundException | InstantiationException | IllegalAccessException ex){
			test = extent.startTest(sheetname, "Script File Not Present");
			test.log(LogStatus.FAIL, "No Script of this name <b>"+sheetname+".java</b> is found in this <b>TESTCASE</b> folder");
			extent.endTest(test);
			LoadConfig(sheetname,sheetname," Result",extent);
			extent.flush();
			return;
	}
	
   }

	public static void cleanup(HashMap<String,String> TestData){
		if (TestData.get("CLEANUP").toUpperCase().contains("YES"))
		{	// If Cleanup is YES close the Browser and login again	
			if(driver != null){
				driver.close();	
			}
			openBrowser();
			navigate("link");
			// log in
			writeInInput("Username_SD", GetConfig("Username_SD"));
			writeInInput("Password_SD", GetConfig("Password_SD"));
			writeInInput("Organization_SD", GetConfig("Organization_SD"));
			clickButton("Submit");
			if(verifyTitle("Self Disclosure") && verifyLinkText("LegalOption","Legal Information")){
				test.log(LogStatus.INFO, "", "Login through Cleanup");
			}
			sLogin="YES";
		}
		if(driver == null)
		{	//Invoke Browser if not Present
			//openBrowser();

		}
		
		
	}


}