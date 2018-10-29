package WebDriver.main;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import com.relevantcodes.extentreports.ExtentReports;

import static WebDriver.function.DataReader.*;
import static WebDriver.main.TestReflection.*;
import static WebDriver.function.ReadProp.*;
import static WebDriver.function.Config.*;
import static WebDriver.function.Keywords.extent;



public class TestRunner {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static String sheetname;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]) throws IOException {
		//SettingGroovy();
		
		String FilePath = GetConfig("ModuleNamePath")+GetConfig("TestSuitName");
		String ModuleFilePath=GetConfig("ModuleDataPath");
		String TestCaseName;
		 
		ArrayList MName=readCSVdata(FilePath);
		
		for (int j=0; j<MName.size();j++ ){
			
			HashMap<String,String> Module=(HashMap) MName.get(j); 
		     if(Module.get("RUN").equals("YES")){
		    	 String key =Module.get("MODULENAME");
		    	 extent=new ExtentReports(CreateResult(key), true);
		         try{
		                 ArrayList dataHolder =readCSVdata(ModuleFilePath + key +".csv");

		          for (int i = 0; i < dataHolder.size(); i++) {
			        	HashMap<String, String> TestData = (HashMap) dataHolder.get(i);
		        	  //List<String> TestData = (ArrayList) dataHolder.get(i);
		                  TestCaseName=TestData.get("TESTCASEID");
		                  sheetname=key;
		                  //Calling the Class
		                  RunTest(key, TestCaseName, TestData);
		                 }
		         }
		         catch(Exception e1)
		         {
		             System.out.println("Kindly Check if the file is avalabile in the following Location and is in .CSV format");
		             System.out.println(ModuleFilePath + key +".csv");
		             
		         }
		    	 //System.out.println("Yes");
		     }else{
		    	//System.out .println("No");
		      }
		}
		System.exit(0);
	}

}
