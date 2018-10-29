package WebDriver.function;

import static WebDriver.function.ReadProp.GetConfig;
import static WebDriver.function.ReadProp.GetLocator;
import static WebDriver.function.Keywords.*;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.*;

import com.relevantcodes.extentreports.*;

import static WebDriver.function.Config.CMDCommand;

public class PCfunction1 {

	public static WebElement fluentWait(String sLocator) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(ExpectedConditions
				.presenceOfElementLocated((By) getwebLocator(sLocator)));
		return foo;

	}

	public static WebElement getWhenVisible(String string, int timeout) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated((By) getwebLocator(string)));
		return element;
	}

	public static void Login(String sUserId, String sPassword) {
		if (sLogin == "YES") {
			Logout();
		} else {
			openBrowser();
			navigate("link");
		}
		writeInInput("loginID", sUserId);
		writeInInput("password", sPassword);
		clickButton("LoginButton");

		if (verifyTitle("Protocoll UI")) {
			test.log(LogStatus.PASS, "Login", "ProtoColl UI Title Verified");
		} else {
			test.log(LogStatus.FAIL, "Login", "ProtoColl UI Title Not Found");
		}

		if (verifyLinkText("LegalOption", "Legal Information")) {
			test.log(LogStatus.PASS, "Login", "Legal Information Link Verified");
		} else {
			test.log(LogStatus.FAIL, "Login",
					"Legal Information Link Not Found");
		}

		if (verifyLinkText("DTCCurl", "DTCC.com")) {
			test.log(LogStatus.PASS, "Login", "DTCC.com Link Verified");
		} else {
			test.log(LogStatus.FAIL, "Login", "DTCC.com Link Not Found");
		}

		if (verifyText("UserName", sUserId)) {
			test.log(LogStatus.PASS, "Login",
					"User ID in the application Matches with " + sUserId);
		} else {
			test.log(LogStatus.FAIL, "Login",
					"User ID does not match expected result");
		}

		if (verifyText("DashboardLink", "DASHBOARD")
				&& exist("Dashboard.Listbar")) {
			test.log(LogStatus.PASS, "Login",
					"Dashboard is present on the Homepage");
		} else {
			test.log(LogStatus.FAIL, "Login",
					"Dashboard is NOT present on Homepage");
		}

	}

	public static void Logout() {

		click("OptionIcon");
		click("Logout");
		if (exist("loginID") && exist("password")) {
			test.log(LogStatus.INFO, "Logout",
					"Application Logged out Successfull");
		} else {
			test.log(LogStatus.FAIL, "Logout", "Application Log out Failed");
		}

	}

	/*
	 * this Function Invokes the TAB from the navigation pane to be tested see
	 * the example below. String NavigationPane: ADMINISTRATION String Tabs:
	 * Audit
	 */
	public static void Navigate(String NavigationPane, String Tabs) {

		NavigationPane = NavigationPane.toUpperCase();
		boolean bFlag = false;
		HashMap<String, String> Invoke = new HashMap<String, String>();
		Invoke.put("DASHBOARD", "DashboardLink#DashboardTab");
		Invoke.put("AGREEMENTS", "AgreementLink#AgreementTab");
		Invoke.put("PORTFOLIOS", "PortfolioLink#PortfolioTab");
		Invoke.put("MARGIN CALLS", "MarginLink#MarginTab");
		Invoke.put("ORDERS", "OrderLink#OrderTab");
		Invoke.put("INSTRUCTIONS", "InstructionLink#InstructionTab");
		Invoke.put("INTERESTS", "IntrestLink#IntrestTab");
		Invoke.put("INTEGRATED SERVICES",
				"IntegratedServicesLink#IntegratedServicesTab");
		Invoke.put("ADMINISTRATION", "AdministrationLink#AdministrationTab");

		try {
			String[] InvokedWindow = Invoke.get(NavigationPane).split("#");

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("scroll(0, 200)");

			click(InvokedWindow[0].toString());

			if (Tabs != null && Tabs != "") {
				String sLocator = GetLocator(InvokedWindow[1].toString());
				String sCountLocator = sLocator.replace("[change]/a/span", "");
				int Count = driver.findElements(By.xpath(sCountLocator)).size();
				for (int i = 1; i <= Count; i++) {
					String sTabLocator = sLocator
							.replace("change", "" + i + "");
					if (driver.findElement(By.xpath(sTabLocator)).getText()
							.contains(Tabs)) {
						driver.findElement(By.xpath(sTabLocator)).click();
						bFlag = true;
					}
				}
				if (!bFlag) {
					test.log(LogStatus.FAIL, "", "Not able to locate " + Tabs
							+ " in " + NavigationPane + " Navigation Pane");

				}
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "", "Not able to locate " + Tabs + " in "
					+ e.getMessage() + " Navigation Pane");
		}

	}

	// Table Functionality

	static String MARGIN = "ID#Work Group#Principal Code#Agreement Code#Call Type#Counterparty Code#Valuation Date#Proposed Transfer Amount#Valuation Currency#Process Step";
	static String PORTFOLIO = "ID#Work Group#Process Step#Work Item ID#Agreement Code#Agreement Type#Valuation Date#Base Currency#Threshold#Total Transfer";
	static String AGREEMENTS = "Agreement Code#Agreement Name#Principal Code#Workgroup Code#Agreement Scope#Agreement Type#Agreement Mutualilty";

	static Integer Row_count, Col_count;
	@SuppressWarnings("rawtypes")
	static HashMap<Integer, HashMap> TableMap = new HashMap<Integer, HashMap>();
	static String TableName;

	public static void GetTableData(String TableName) {
		HashMap<String, String> RowMaps = new HashMap<String, String>();

		String first_part = null, second_part = null, third_part = null;
		String h_First_part = null, h_second_part = null;

		String TableName1 = TableName.toUpperCase();
		String Table_data = null, Header_Name = null;

		driver.manage().window().setSize(new Dimension(200, 200));
		driver.manage().window().maximize();
		switch (TableName1) {

		case "MARGIN":
			TableMap.clear();
			// Row_count =
			// driver.findElements(By.xpath(".//*[@id='marginsDiv']/div[2]/div/div/div[4]/div[2]/div/div")).size();
			Row_count = Integer
					.parseInt(driver
							.findElement(
									By.xpath("//*[@id='marginsDiv']/div[2]/div/div/div[4]/div[3]/div[1]/div[1]/span[1]/strong"))
							.getText());
			Col_count = driver
					.findElements(
							By.xpath(".//*[@id='marginsDiv']/div[2]/div/div/div[4]/div[2]/div/div[1]/div"))
					.size();
			first_part = ".//*[@id='marginsDiv']/div[2]/div/div/div[4]/div[2]/div/div[";
			second_part = "]/div[";
			third_part = "]/div";
			h_First_part = ".//*[@id='marginsDiv']/div[2]/div/div/div[4]/div[1]/div[2]/div/div[";
			h_second_part = "]/div/div[1]/div[1]";
			break;

		case "PORTFOLIO":
			TableMap.clear();
			Row_count = driver
					.findElements(
							By.xpath(".//*[@id='portfoliosDiv']/div[2]/div/div/div[4]/div[2]/div/div"))
					.size();
			Col_count = driver
					.findElements(
							By.xpath(".//*[@id='portfoliosDiv']/div[2]/div/div/div[4]/div[2]/div/div[1]/div"))
					.size();
			first_part = ".//*[@id='portfoliosDiv']/div[2]/div/div/div[4]/div[2]/div/div[";
			second_part = "]/div[";
			third_part = "]/div";
			h_First_part = ".//*[@id='portfoliosDiv']/div[2]/div/div/div[4]/div[1]/div[2]/div/div[";
			h_second_part = "]/div/div[1]/div[1]";
			break;

		default:

			test.log(LogStatus.ERROR, "Get Table Data", "No Table found as "
					+ TableName1);
			break;
		}
		// Used for loop for number of rows.
		for (int i = 1; i <= Row_count; i++) {
			// Used for loop for number of columns.
			for (int j = 1; j <= Col_count; j++) {
				// Prepared final xpath of specific cell as per values of i and
				// j.
				String final_xpath = first_part + i + second_part + j
						+ third_part;
				String final_header = h_First_part + j + h_second_part;
				int flag = 0;
				do {
					try {
						Table_data = driver.findElement(By.xpath(final_xpath))
								.getText();
						Header_Name = driver
								.findElement(By.xpath(final_header)).getText();
						flag = 1;
						// Header_Name=
						// driver.findElement(By.xpath(final_header)).getText();
						// RowMaps.put(Header_Name, Table_data);
					} catch (Throwable e) {
						// scrolling the grid using the grid's xpath
						int k = i - 1;
						driver.findElement(
								By.xpath(first_part + k + second_part + "1"
										+ third_part)).click();
						driver.findElement(
								By.xpath(first_part + k + second_part + "1"
										+ third_part))
								.sendKeys(Keys.ARROW_DOWN);
						// Thread.sleep(3000);
					}
				} while (flag == 0);
				RowMaps.put(Header_Name, Table_data);
				// System.out.print(Table_data +" ");
			}
			TableMap.put(i, RowMaps);
			RowMaps.clear();
			// System.out.println("");
			// System.out.println("");
		}

	}

	public static void FilterTable(String TableName) {
		String[] CheckBoxData = null;
		String TableName1 = TableName.toUpperCase();

		switch (TableName1) {
		case "AGREEMENTS":
			CheckBoxData = AGREEMENTS.split("#");
			break;
		case "MARGIN":
			CheckBoxData = MARGIN.split("#");
			break;

		case "PORTFOLIO":
			CheckBoxData = PORTFOLIO.split("#");
			break;

		default:

			test.log(LogStatus.ERROR, "Get Table Data", "No Table found as "
					+ TableName1);
			break;
		}
		// Arrays.asList(CheckBoxData).contains();
		driver.findElement(By.xpath(".//*[@class='ngHeaderButtonArrow']"))
				.click();
		List<WebElement> CHECKBOXlist = driver.findElements(By
				.cssSelector(".ngColListCheckbox"));
		List<WebElement> CHECKBOXName = driver.findElements(By
				.xpath(".//*[@class='ngColList']/li/label"));

		for (int i = 0; i < CHECKBOXlist.size(); i++) {
			if (Arrays.asList(CheckBoxData).contains(
					CHECKBOXName.get(i).getText())) {
				if (CHECKBOXlist.get(i).isSelected() == false) {
					CHECKBOXlist.get(i).click();
				}

			} else {
				if (CHECKBOXlist.get(i).isSelected() == true) {
					CHECKBOXlist.get(i).click();
				}
			}

		}

		actions.moveByOffset(0, 0);
	}

	public static void FilterTable(String TableName, String ColumnToKeep,
			ExtentTest test) {
		String[] CheckBoxData = null;
		CheckBoxData = ColumnToKeep.split("#");

		driver.findElement(By.xpath(".//*[@class='ngHeaderButtonArrow']"))
				.click();
		List<WebElement> CHECKBOXlist = driver.findElements(By
				.cssSelector(".ngColListCheckbox"));
		List<WebElement> CHECKBOXName = driver.findElements(By
				.xpath(".//*[@class='ngColList']/li/label"));

		for (int i = 0; i < CHECKBOXlist.size(); i++) {
			if (Arrays.asList(CheckBoxData).contains(
					CHECKBOXName.get(i).getText())) {
				if (CHECKBOXlist.get(i).isSelected() == false) {
					CHECKBOXlist.get(i).click();
				}
			} else {
				if (CHECKBOXlist.get(i).isSelected() == true) {
					CHECKBOXlist.get(i).click();
				}
			}
		}
		actions.moveByOffset(0, 0);
	}

	public static Integer TableCount(String object){
		Integer iCount = 0;
		try{
			Thread.sleep(2000);
            iCount=Integer.parseInt(getwebLocator(GetLocator(object)).getText());
           }
		catch(Exception e){
			iCount=0;
     	   test.log(LogStatus.FAIL, "Table count", "No records were fetched "+e.getMessage()); 
        }
		return iCount;


		
	}

	public static void CreatePermission(String PermissionName,
			String Permissions) {
		Navigate("ADMINISTRATION", "Permission Sets");
		// String
		// Permission="ACADIAADAPTER.READ#AGREEMENT.READ#AUDIT.READ#INSTRUCTION.READ#INSTRUCTION.WORKFLOW#INTERESTSTATEMENT.READ#INTERESTSTATEMENT.WORKFLOW#JOBS.READ#JOBS.WRITE#MARGIN.READ#MARGIN.WORKFLOW#ORDER.READ#ORDER.WORKFLOW#PORTFOLIO.READ#PORTFOLIO.WORKFLOW#REFERENCE.READ#SCHEDULES.READ#SCHEDULES.WRITE#SECURITY.READ#SECURITY.WRITE#SECURITY.WRITE#SUPPORT.READ#TRIOPTIMAADAPTER.READ#USERS.READ#USERS.WRITE";
		String Permission;
		if (Permissions.toUpperCase().contains("ALL")) {
			Permission = "AGREEMENT.APPROVE#AGREEMENT.READ#AGREEMENT.WRITE#APPLICATION.READ#INSTRUCTION.READ#INTRESTSTATEMENT.READ#JOBS.READ#JOBS.WRITE#MARGIN.ADMIN#MARGIN.APPROVE#MARGIN.READ#MARGIN.WRITE#ORDER.READ#ORDER.WORKFLOW#PORTFOLIO.READ#REFERENCE.READ#SCHEDULES.READ#SCHEDULES.WRITE#SECURITY.READ#SECURITY.WRITE#SUPPORT.READ#USERS.READ#USERS.WRITE";
		} else {
			Permission = Permissions;
		}
		String[] PermissionSet = Permission.split("#");
		click("Create_permission");
		writeInInput("Create_per_SetName", PermissionName);
		for (int i = 0; i < PermissionSet.length; i++) {
			checkCheckBox(PermissionSet[i]);
		}
		click("PERMISSION.SUBMIT");

		writeInInput("AdminTableColumn2", PermissionName);

		if (verifyText("AdminfirstRowColumn2", PermissionName)) {
			test.log(LogStatus.PASS, "", "Permission Set is created with name "
					+ PermissionName);
		} else {
			test.log(LogStatus.FAIL, "",
					"Permission Set is not created with name " + PermissionName);
		}
	}

	public static void CreateRole(String RoleName, String PermissionSet) {
		String[] PermissionList = PermissionSet.split("#");
		Navigate("ADMINISTRATION", "Roles");
		click("Create_Roles");
		writeInInput("Role_Name", RoleName);

		for (int i = 0; i < PermissionList.length; i++) {
			writeInInput("Avaliable_Permission_Search", PermissionList[i]);
			if (verifyText("Avaliable_permission", PermissionList[i])) {
				doubleClick("Avaliable_permission");
			} else {
				test.log(LogStatus.FAIL, "",
						"Permission Set is not avaliable with name "
								+ PermissionList[i]);
			}
			clearInputText("Avaliable_Permission_Search");
		}
		click("ROLE.NEXT");
		List<WebElement> PermissionSelectAll = driver.findElements(By
				.xpath(GetLocator("Permission_Select_All")));
		for (int i = 0; i < PermissionSelectAll.size(); i++) {
			if (PermissionSelectAll.get(i).isSelected() == false) {
				PermissionSelectAll.get(i).click();
			} else {
				PermissionSelectAll.get(i).click();
			}
		}

		click("ASSIGN.ROLE.SAVE");

		writeInInput("AdminTableColumn2", RoleName);
		if (verifyText("AdminfirstRowColumn2", RoleName)) {
			test.log(LogStatus.PASS, "", "Role is created with name "
					+ RoleName);
		} else {
			test.log(LogStatus.FAIL, "", "Role is not created with name "
					+ RoleName);
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static String GetNewDownload() {

		File dir = new File(GetConfig("DownloadPath"));
		File[] files = dir.listFiles();
		Arrays.sort(files, new Comparator() {
			public int compare(Object o1, Object o2) {
				return compare((File) o1, (File) o2);
			}

			private int compare(File f1, File f2) {
				long result = f2.lastModified() - f1.lastModified();
				if (result > 0) {
					return 1;
				} else if (result < 0) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		String fileName = files[0].toString();
		return fileName;

	}

	public static void ProcessFTP(String sFile) {
		try {
			File file = new File(GetConfig("Ftp_tempFile"));

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("open " + GetConfig("Ftp_Server"));
			bw.newLine();
			bw.write(GetConfig("Ftp_user"));
			bw.newLine();
			bw.write(GetConfig("Ftp_pass"));
			bw.newLine();
			bw.write("cd " + GetConfig("Ftp_Remote_location"));
			bw.newLine();
			bw.write("put " + sFile);
			bw.newLine();
			bw.write("quit");
			bw.newLine();
			bw.write("disconnect");
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		CMDCommand("ftp -s:" + GetConfig("Ftp_tempFile"));
	}

	public static ArrayList<String> DBCommand(String sCommand) {
		ArrayList<String> lsList = new ArrayList<String>();
		Connection conn = null;

		try {
			DriverManager
					.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
			String dbURL =GetConfig("dbURL");
			String user  =GetConfig("dbUser");
			String pass  =GetConfig("dbPass");
			conn = DriverManager.getConnection(dbURL, user, pass);
			// conn = DriverManager.getConnection(u);
			if (conn != null) {
				DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
				System.out.println("Driver name: " + dm.getDriverName());
				System.out.println("Driver version: " + dm.getDriverVersion());
				System.out.println("Product name: "
						+ dm.getDatabaseProductName());
				System.out.println("Product version: "
						+ dm.getDatabaseProductVersion());
			}
			Statement stmt = conn.createStatement();
			if (sCommand.toUpperCase().matches(".*UPDATE.*")){
				stmt.executeUpdate(sCommand);	
			}
			else{
				ResultSet rs = stmt.executeQuery(sCommand);
				while(rs.next()) {
					lsList.add(rs.getString(1));
		        }
			}
			

		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return lsList;
	}

	public static void DBCleanup(String sWorkGroup){
		DBCommand("update adbValuation..tWorkItem set processStep ='ended' where busObjAlias='Order' and processStep !='ended' and domainCode ='"+sWorkGroup+"'");
		DBCommand( "update adbValuation..tWorkItem set processStep ='expected' where busObjAlias='Call' and processStep !='noCall' and domainCode = '"+sWorkGroup+"'");
		DBCommand("update adbValuation..tWorkItem set processStep ='empty' where processStep='checkDiary' or processStep='uncalculated' or processStep='agmtProcessFork' or processStep='maybeGenerateCalls' or processStep='generateCalls' or processStep='Failed' and domainCode = '"+sWorkGroup+"'");
		DBCommand("update adbValuation..tWorkItem set processStep ='empty' where processStep like 'calc%' and domainCode = '"+sWorkGroup+"'");
	}
	
	public static String RandomChars() {
		String candidateChars="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		int length=5;
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < length; i++) {
	        sb.append(candidateChars.charAt(random.nextInt(candidateChars
	                .length())));
	    }

	    return sb.toString();
	}
}
