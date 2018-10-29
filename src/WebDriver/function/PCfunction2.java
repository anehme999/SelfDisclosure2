package WebDriver.function;

import static WebDriver.function.ReadProp.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class PCfunction2 {
	
	public static WebDriver driver;
	
	public static Actions actions;
	
	public static void OpenBrowser(){
		String data = GetConfig("browserType");
		String path = GetConfig("ChromeDriverPath");
		
		// ChromeDriver path
		System.setProperty("webdriver.chrome.driver", path);
		
		if (data.equals("Mozilla"))
			driver = new FirefoxDriver();
		else if (data.equals("IE"))
			driver = new InternetExplorerDriver();
		else if (data.equals("Chrome"))
			driver = new ChromeDriver();
		
		driver.get("https://newqa.acadiasoft.net/selfdisclosureui/");
		
		driver.manage().window().maximize();
		long implicitWaitTime = Long.parseLong(GetConfig("implicitwait"));
		driver.manage().timeouts()
				.implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		actions = new Actions(driver);
		
	}
	
	public static void LoginSite(){
		String username_input = GetLocator("Username_SD");
		String password_input = GetLocator("Password_SD");
		String organization_input = GetLocator("Organization_SD");
		String submit_input = GetLocator("Submit");
		
		String username = GetConfig("Username_SD");
		String password = GetConfig("Password_SD");
		String organization = GetConfig("Organization_SD");
		
		WebElement username_WE = driver.findElement(By.xpath(username_input));
		username_WE.sendKeys(username);
		
		WebElement password_WE = driver.findElement(By.xpath(password_input));
		password_WE.sendKeys(password);
		
		WebElement organization_WE = driver.findElement(By.xpath(organization_input));
		organization_WE.sendKeys(organization);
		
		WebElement submit = driver.findElement(By.xpath(submit_input));
		submit.click();
	}
	
	public static void AmendEntity(){
		String details = GetLocator("Details");
		String amendEntities = GetLocator("AmendEntities");
		
		WebElement details_WE = driver.findElement(By.xpath(details));
		details_WE.click();
		
		WebElement amendEntities_WE = driver.findElement(By.xpath(amendEntities));
		amendEntities_WE.click();
	}
	
	public static void EnterLegalEntityName(){
		String legalEntityName = GetLocator("LegalEntityName");
		
		WebElement legalEntityName_WE = driver.findElement(By.xpath(legalEntityName));
		String textInsideLegalEntityName = legalEntityName_WE.getAttribute("value");
		
		// to check if legal entity has prefilled text or not
		if (textInsideLegalEntityName.isEmpty() == true){
			// if not, input this
			legalEntityName_WE.sendKeys("temp");
		}
	}
	
	public static void SaveEntity(){
		String saveEntity = GetLocator("SaveEntities");
		
		WebElement saveEntity_WE = driver.findElement(By.xpath(saveEntity));
		saveEntity_WE.click();
	}
	
	public static void Cancel(){
		String cancel = GetLocator("Cancel");
		
		WebElement cancel_WE = driver.findElement(By.xpath(cancel));
		cancel_WE.click();
	}
	
	public static void Logout(){
		String logout = GetLocator("LogOut");
		WebElement logout_WE = driver.findElement(By.xpath(logout));
		logout_WE.click();
		
	}
	
	public static String[] ReadCSV(String file, String[] keys){
		// declare variables
		BufferedReader fileReader = null;
		String row = "";
		final String DELIMITER = ",";
		String[] values = new String[keys.length];
		
		try {
			// create the BufferedReader instance
			
			fileReader = new BufferedReader(new FileReader(file));
			// the parameter is the readAheadLimit
			// it's the limit of the number of characters that may be read but preserving the current mark
			fileReader.mark(1000);
			String[] tokens;
			
			for (int i = 0; i < keys.length; i++){
				while ((row = fileReader.readLine()) != null){
					// tokens contain a string array of each value in the row
					tokens = row.split(DELIMITER);
					// check if the key value equals the token "key column" value
					if (keys[i].equals(tokens[0])){
						// stores the desired values in an array values
						values[i] = tokens[1];
					}
				}
				// reset the filereader pointer
				fileReader.reset();
			}
		}catch (Exception e){
			e.printStackTrace();
		} finally {
			// for debugging
			for (String s: values){
				System.out.println(s);
			}
		}
		return values;
	}
	
}
