package TestCase;

import static WebDriver.function.Keywords.*;
import static WebDriver.function.PCfunction1.*;
import static WebDriver.function.PCfunction3.TestFunction;
import static WebDriver.function.ReadProp.GetConfig;

import java.util.HashMap;

import com.relevantcodes.extentreports.LogStatus;

public class Test3 {

	public void TestName3(HashMap<String, String> TestData){
		
		String sUserid = GetConfig("Username_SD");
		String sPassword = GetConfig("Password_SD");
		String sOrg = GetConfig("Organization_SD");
		String slink = GetConfig("link");
		String sTitle = "Self Disclosure";
				
		int i;
		
			
	  for (i=1;i<=1;i++){
		  System.out.println("Opening Browser" +i);
		  
		  
		  if(driver != null){
				driver.close();	
			}
	
		  openBrowser();
		  navigate("link");
		  Login_AN (sUserid, sPassword, sOrg, sTitle);
		  //closeBrowser();
		  }
		}
		  //Function1 (i);
		  //Function2 (callbackURL,donationId);}	
		  //Function3 (i,string1);	
	
	 public void Function1(int j){
		  if (j ==1)
				System.out.println("Function Here"+" " +j);}
	 
	 private void Function2(String pStrCallbackURL , String pStrDonationId){
	        System.out.println("Callback url"+ pStrCallbackURL );
	        System.out.println("DonationId "+ pStrDonationId );
	    }
	 
	 private void Function3(int k , String pStrDonationId){
	        System.out.println("Callback url"+ k );
	        System.out.println("DonationId "+ pStrDonationId );
	    }
	 
	 public static void Login_AN(String sUserId, String sPassword, String sOrganization, String sTitle)
	 {
		 		 
		writeInInput("Username_SD", sUserId);
		writeInInput("Password_SD", sPassword);
		writeInInput("Organization_SD", sOrganization);
		clickButton("Submit");
		
		// log the status of previous step
		if (verifyTitle(sTitle)) {
			test.log(LogStatus.PASS, "Login", sTitle);
		} else {
			test.log(LogStatus.FAIL, "Login", sTitle);
			}
		
	 }
}
