package TestCase;

import static WebDriver.function.Keywords.*;
import static WebDriver.function.PCfunction1.*;

import java.util.HashMap;
import java.util.List;

import com.relevantcodes.extentreports.LogStatus;

//Header
public class UISmoke {
	
//TestCase Starting	

	public void CheckLogin(HashMap<String, String> TestData){
		Login(TestData.get("USERTYPE"),TestData.get("PASSWORD"));	
	}
	
	public void AgreementLink(HashMap<String, String> TestData){
		Navigate("AGREEMENTS","");
		FilterTable("AGREEMENTS");
		if (TableCount("AgreeTableCount")!=0){
			test.log(LogStatus.PASS, "Agreement Table", "Data is populated on the Agreement table on the right panel");
		}else{
			test.log(LogStatus.FAIL, "Agreement Table", "Data is not populated on the Agreement table");
		}
		
	}
	
	public void PortfolioLink(HashMap<String, String> TestData){
		Navigate("PORTFOLIOS","");
		FilterTable("PORTFOLIO");
		
		if (TableCount("PortfolioTableCount")!=0){
			test.log(LogStatus.PASS, "Portfolio Table", "Data is populated on the Portfolio table on the right panel");
		}else{
			test.log(LogStatus.FAIL, "Portfolio Table", "Data is not populated on the Portfolio table");
		}
	}
	
	public void MarginLink(HashMap<String, String> TestData){
		Navigate("MARGIN CALLS","");
		FilterTable("MARGIN");
		if (TableCount("MarginTableCount")!=0){
			test.log(LogStatus.PASS, "Margin Table", "Data is populated on the Margin table on the right panel");
		}else{
			test.log(LogStatus.FAIL, "Margin Table", "Data is not populated on the Margin table");
		}
	}
	
	public void OrderLink(HashMap<String, String> TestData){
		Navigate("ORDERS","");
		if (TableCount("OrderTableCount")!=0){
			test.log(LogStatus.PASS, "Order Table", "Data is populated on the Order table on the right panel");
		}else{
			test.log(LogStatus.FAIL, "Order Table", "Data is not populated on the Order table");
		}
	}
		
	public void AuditLink(HashMap<String, String> TestData){
		Navigate("ADMINISTRATION","Audit");
		if (TableCount("AdminTableCount")!=0){
			test.log(LogStatus.PASS, "Audit Table", "Data is populated on the Audit table on the right panel");
		}else{
			test.log(LogStatus.FAIL, "Audit Table", "Data is not populated on the Audit table");
		}
	}
	
}
