package WebDriver.function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.*;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static WebDriver.function.GetOSName.*;
import static WebDriver.function.ReadProp.*;
import static WebDriver.main.TestRunner.*;
import static WebDriver.function.Config.LoadConfig;

@SuppressWarnings("static-access")
public class Keywords {

	public static String sLogin = "NO";

	public static WebDriver driver;

	public static Actions actions;

	public static ExtentTest test;

	public static ExtentReports extent;

	public static void openBrowser() {
		String Data = GetConfig("browserType");
		// Chrome Driver Path
		System.setProperty("webdriver.chrome.driver",
				"ChromeDriver//chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver",
				"FirefoxDriver//geckodriver.exe");
		
		// settings for Chrome
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		//chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs
				.put("download.default_directory", GetConfig("DownloadPath"));
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		// settings for IE
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("ignoreZoomSetting", true);
		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		/*
		caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING,false);
		caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
		caps.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true); 
		caps.setJavascriptEnabled(true);
		*/
		
		// Internet Explorer Path
		if (isWindows()) {
			File file = new File("IEDriver//IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		}

		// //APP_LOGS.debug("Opening browser");
		if (Data.equals("Mozilla"))
			driver = new FirefoxDriver();
		else if (Data.equals("IE"))
			driver = new InternetExplorerDriver(caps);
		else if (Data.equals("Chrome"))
			driver = new ChromeDriver(cap);

		driver.manage().window().maximize();
		long implicitWaitTime = Long.parseLong(GetConfig("implicitwait"));
		driver.manage().timeouts()
				.implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		actions = new Actions(driver);
		//actions.sendKeys(Keys.F11).perform();

	}

	public static WebElement getwebLocator(String actualLocator) {
		WebElement element = null;
		try {
			element = driver.findElement(By.id(actualLocator));
		} catch (Exception e) {
			try {
				element = driver.findElement(By.xpath(actualLocator));
			} catch (Exception e1) {
				try {
					element = driver.findElement(By.id(actualLocator));
				} catch (Exception e2) {
					try {
						element = driver.findElement(By
								.className(actualLocator));
					} catch (Exception e3) {
						try {
							element = driver.findElement(By
									.cssSelector(actualLocator));
						} catch (Exception e4) {
							try {
								element = driver.findElement(By
										.tagName(actualLocator));
							} catch (Exception e5) {
								try {
									element = driver.findElement(By
											.linkText(actualLocator));
								} catch (Exception e6) {
									try {
										element = driver
												.findElement(By
														.partialLinkText(actualLocator));
									} catch (Exception e7) {

										test.log(LogStatus.FAIL,
												"Cant locate the element",
												e7.getMessage());
										extent.endTest(test);
										LoadConfig(sheetname, sheetname,
												" Result", extent);
										extent.flush();

									}
								}
							}
						}
					}
				}
			}
		}
		return element;
	}
	
	public static boolean writeInInput(String object, String data) {
		// //APP_LOGS.debug("Writing in text box");

		try {
			getwebLocator(GetLocator(object)).sendKeys(data);
			return true;
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "writeInInput", "Unable to write "
					+ e.getMessage());
		}
		return false;
	}

	public static void navigate(String data) {
		// Navigating to URL LOG
		try {
			driver.navigate().to(GetConfig(data));

		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL.FAIL, "Navigate",
					"Cant Navigated To Url " + e.getMessage());
		}
	}

	public static void clickLink(String object) {
		// //APP_LOGS.debug("Clicking on link ");
		try {
			getwebLocator(GetLocator(object)).click();
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL.FAIL, "clickLink",
					"Could not find the link" + e.getMessage());
		}

		test.log(LogStatus.INFO, "clickLink", "Clicked on Link");
	}

	public static boolean verifyLinkText(String object, String data) {
		try {
			String actual = getwebLocator(GetLocator(object)).getText();
			String expected = data;

			if (actual.equals(expected)) {
				// test.log(LogStatus.PASS, "verifyLinkText",
				// "Link text verified");
				return true;
			} else {
				test.log(LogStatus.FAIL, "verifyLinkText",
						"Link text not verified");
				return false;
			}

		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL.FAIL, "verifyLinkText",
					"Link text not verified" + e.getMessage());

		}
		return false;

	}

	public static void clickButton(String object) {
		// //APP_LOGS.debug("Clicking on Button");
		try {
			getwebLocator(GetLocator(object)).click();
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL.FAIL, "clickButton",
					"Button Not Clicked" + e.getMessage());
		}
		// test.log(LogStatus.INFO, "clickButton", "Button Clicked");
	}

	public static boolean verifyButtonText(String object, String data) {
		// //APP_LOGS.debug("Verifying the button text");
		try {
			String actual = getwebLocator(GetLocator(object)).getText();
			String expected = data;

			if (actual.equals(expected))
				//test.log(LogStatus.PASS, "verifyButtonText",
					//	"Button Text Verified");
				return true;
			else
				//test.log(LogStatus.FAIL, "verifyButtonText",
				//		"Button Text Not Verified " + actual + " -- "
				//				+ expected);
				return false;
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL.FAIL, "verifyButtonText",
					"Button Not Clicked" + e.getMessage());
		}
		return false;

	}

	public static void selectList(String object, String data) {
		try {
			String sLocator = GetLocator(object);
			// sLocator=GetDialogLocator(sLocator);

			Select dropdown = new Select(driver.findElement(By.xpath(sLocator)));
			dropdown.selectByVisibleText(data);

		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL.FAIL, "selectList", "List Not Found"
					+ e.getMessage());
		}

		// test.log(LogStatus.INFO, "selectList", "Selected Form List");
	}

	public static void verifyAllListElements(String object, String data) {
		test.log(LogStatus.INFO, "Verifying all the list elements");

		try {
			WebElement droplist = driver.findElement(By
					.xpath(GetLocator(object)));
			List<WebElement> droplist_cotents = droplist.findElements(By
					.tagName("option"));

			// extract the expected values from OR. properties
			String temp = data;
			String allElements[] = temp.split(",");
			// check if size of array == size if list
			if (allElements.length != droplist_cotents.size())
				test.log(LogStatus.FAIL, "verifyAllListElements",
						"size of lists do not match");

			for (int i = 0; i < droplist_cotents.size(); i++) {
				if (!allElements[i].equals(droplist_cotents.get(i).getText())) {
					test.log(LogStatus.FAIL, "verifyAllListElements",
							"Element not found - " + allElements[i]);
				}
			}
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL.FAIL, "verifyAllListElements",
					"Could not select from list. " + e.getMessage());

		}

		test.log(LogStatus.PASS, "verifyAllListElements",
				"Element Found and verified");
	}

	public static void verifyListSelection(String object, String data) {
		test.log(LogStatus.INFO, "Verifying the selection of the list");
		// //APP_LOGS.debug("Verifying all the list elements");
		try {
			String expectedVal = data;
			// System.out.println(driver.findElement(By.xpath(GetLocator(object))).getText());
			WebElement droplist = driver.findElement(By
					.xpath(GetLocator(object)));
			List<WebElement> droplist_cotents = droplist.findElements(By
					.tagName("option"));
			String actualVal = null;
			for (int i = 0; i < droplist_cotents.size(); i++) {
				String selected_status = droplist_cotents.get(i).getAttribute(
						"selected");
				if (selected_status != null)
					actualVal = droplist_cotents.get(i).getText();
			}

			if (!actualVal.equals(expectedVal))
				test.log(LogStatus.FAIL, "verifyListSelection",
						"Value not in list - " + expectedVal);

		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "verifyListSelection",
					"Could not find list. " + e.getMessage());

		}
		test.log(LogStatus.PASS, "verifyListSelection",
				"Element Found and verified");

	}

	public static boolean checkCheckBox(String object) {
		try {
			// true or null
			String checked = driver.findElement(By.xpath(GetLocator(object)))
					.getAttribute("checked");
			if (checked == null) {// checkbox is unchecked
				driver.findElement(By.xpath(GetLocator(object))).click();
				return true;
			}else
				return false;
			
		} catch (Exception e) {
			return false;
			//test.log(LogStatus.ERROR.FAIL, "checkCheckBox",
			//		"Could not find CheckBox" + e.getMessage());
		}
		// test.log(LogStatus.INFO, "checkCheckBox", "CheckBox Checked");

	}

	public static void unCheckCheckBox(String object) {
		// //APP_LOGS.debug("Unchecking checkBox");
		try {
			String checked = driver.findElement(By.xpath(GetLocator(object)))
					.getAttribute("checked");
			if (checked != null)
				driver.findElement(By.xpath(GetLocator(object))).click();
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "unCheckCheckBox",
					"Could not find CheckBox" + e.getMessage());
		}
		test.log(LogStatus.INFO, "unCheckCheckBox", "CheckBox UnChecked");

	}

	public static boolean verifyCheckBoxSelected(String object) {
		// //APP_LOGS.debug("Verifying checkbox selected");
		try {
			String checked = driver.findElement(By.xpath(GetLocator(object)))
					.getAttribute("checked");
			if (checked != null)
				//test.log(LogStatus.PASS, "verifyCheckBoxSelected",
				//		"CheckBox Checked Verified");
				return true;
			else
				//test.log(LogStatus.FAIL, "verifyCheckBoxSelected",
				//		"CheckBox not selected");
				return false;

		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "verifyCheckBoxSelected",
					"Could not find CheckBox" + e.getMessage());

		}
		return false;

	}

	public static String GetText(String object) {
		// //APP_LOGS.debug("Verifying the text");
		try {
			String actual = getwebLocator(GetLocator(object)).getText();
			return actual;
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "verifyText", "Object not found "
					+ e.getMessage());
			return null;
		}

	}

	public static boolean verifyText(String object, String data) {
		// //APP_LOGS.debug("Verifying the text");
		try {
			String actual = getwebLocator(GetLocator(object)).getText();
			String expected = data;

			if (actual.equals(expected)) {
				// test.log(LogStatus.PASS, "verifyText", "Text Verified");
				return true;
			} else {
				//test.log(LogStatus.FAIL, "verifyText", "text not verified "
				//		+ actual + " -- " + expected);
				return false;
			}
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "verifyText", "Object not found "
					+ e.getMessage());
		}
		return false;

	}

	public static void verifyTextinInput(String object, String data) {
		// //APP_LOGS.debug("Verifying the text in input box");
		try {
			String actual = driver.findElement(By.xpath(GetLocator(object)))
					.getAttribute("value");
			String expected = data;

			if (actual.equals(expected)) {
				test.log(LogStatus.PASS, "verifyTextinInput",
						"input Text verified");
			} else {
				test.log(LogStatus.FAIL, "verifyTextinInput", "Not matching ");
			}

		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "writeInInput",
					"Unable to find input box " + e.getMessage());

		}
	}

	public static void clickImage() {
		// //APP_LOGS.debug("Clicking the image");

		test.log(LogStatus.PASS, "clickImage", "image Clicked");
	}

	public static void verifyFileName() {
		// //APP_LOGS.debug("Verifying inage filename");

		test.log(LogStatus.PASS, "verifyFileName", "File name Verified");
	}

	public static boolean verifyTitle(String data) {

		try {
			String actualTitle = driver.getTitle();
			String expectedTitle = data;
			if (actualTitle.equals(expectedTitle)) {
				// test.log(LogStatus.PASS, "verifyTitle", "Title verified");
				return true;
			} else {
				test.log(LogStatus.FAIL, "verifyTitle", "Title not verified "
						+ expectedTitle + " -- " + actualTitle);
				return false;
			}
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "verifyTitle",
					"Error in retrieving title " + e.getMessage());
		}
		return false;
	}

	public static boolean exist(String object) {
		// //APP_LOGS.debug("Checking existance of element");
		if (getwebLocator(GetLocator(object)) == null) {
			test.log(LogStatus.ERROR.FAIL, "exist", "Object doest not exist ");
			return false;
		}
		;
		return true;
	}

	public static boolean click(String object) {
		try {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			getwebLocator(GetLocator(object)).click();
			return true;
		} catch (Exception e) {
			//test.log(LogStatus.ERROR.FAIL, "click",
			//		"Not able to click" + e.getMessage());
			return false;
		}
	}

	public static void synchronize() {
		// //APP_LOGS.debug("Waiting for page to load");
		((JavascriptExecutor) driver)
				.executeScript("function pageloadingtime()" + "{"
						+ "return 'Page has completely loaded'" + "}"
						+ "return (window.onload=pageloadingtime());");

		// test.log(LogStatus.INFO, "synchronize",
		// "Page has completely loaded");
	}

	public static void waitForElementVisibility(String object, String data) {
		// //APP_LOGS.debug("Waiting for an element to be visible");
		int start = 0;
		int time = (int) Double.parseDouble(data);
		try {
			while (time == start) {
				if (driver.findElements(By.xpath(GetLocator(object))).size() == 0) {
					Thread.sleep(1000L);
					start++;
				} else {
					break;
				}
			}
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "waitForElementVisibility",
					"Unable to Find Element" + e.getMessage());
		}
		test.log(LogStatus.INFO, "waitForElementVisibility", "Element Found");
	}

	public static void closeBrowser() {
		// //APP_LOGS.debug("Closing the browser");

		try {
			actions = new Actions(driver);
			actions.sendKeys(Keys.F11).perform();
			driver.quit();
		} catch (Exception e) {
			test.log(
					LogStatus.ERROR.FAIL,
					"closeBrowser",
					"Unable to close browser. Check if its open"
							+ e.getMessage());
		}
		test.log(LogStatus.INFO, "closeBrowser", "Browser closed");

	}

	public static void deleteAllCookies() {
		// //APP_LOGS.debug("Deleting all the Browser cookies");
		try {
			driver.manage().deleteAllCookies();
			driver.navigate().refresh();
		} catch (Exception e) {
			test.log(
					LogStatus.ERROR.FAIL,
					"deleteAllCookies",
					"Unable delete all the cookies from Browser"
							+ e.getMessage());
		}
		test.log(LogStatus.INFO, "deleteAllCookies", "Cookies Deleted");

	}

	public static void quitBrowser() {
		// //APP_LOGS.debug("Closing the browser");
		try {
			driver.quit();
		} catch (Exception e) {
			test.log(
					LogStatus.ERROR.FAIL,
					"quitBrowser",
					"Unable to close browser. Check if its open"
							+ e.getMessage());
		}
		test.log(LogStatus.INFO, "quitBrowser", "Quit Browser");

	}

	public static void pause(String object) throws NumberFormatException,
			InterruptedException {
		long time = (long) Double.parseDouble(object);
		Thread.sleep(time * 1000L);
		test.log(LogStatus.INFO, "pause", "Pausing");
	}

	public static void enter(String object, String data) {
		// //APP_LOGS.debug("Going back one page");
		try {
			driver.findElement(By.xpath(GetLocator(object))).sendKeys(
					Keys.ENTER);
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "enter",
					"Unable to enter" + e.getMessage());
		}
		test.log(LogStatus.INFO, "enter", "Entered");

	}

	public static void tab(String object, String data) {
		// //APP_LOGS.debug("Going back one page");
		try {
			driver.findElement(By.xpath(GetLocator(object))).sendKeys(Keys.TAB);
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "tab",
					"Unable to Click Tab" + e.getMessage());
		}
		test.log(LogStatus.INFO, "tab", "Tab Clicked");

	}

	public static void enterCss(String object, String data) {
		// //APP_LOGS.debug("Going back one page");
		try {
			driver.findElement(By.cssSelector(GetLocator(object))).sendKeys(
					Keys.ENTER);
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "enter",
					"Unable to enter" + e.getMessage());
		}
		test.log(LogStatus.INFO, "enter", "Entered");

	}

	public static void windowHandler(String object, String data) {
		// //APP_LOGS.debug("Handling multiple windows");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		try {
			String mainWindowHandle = driver.getWindowHandle();
			driver.findElement(By.xpath(GetLocator(object))).click();
			Set<String> window = driver.getWindowHandles();
			Iterator<String> iterator = window.iterator();

			while (iterator.hasNext()) {
				String popupHandle = iterator.next().toString();
				if (!popupHandle.contains(mainWindowHandle)) {
					driver.switchTo().window(popupHandle);
				}
			}

			// Back to main window
			// driver.switchTo().window(mainWindowHandle);

		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "windowHandler",
					"Unable to handle windows," + e.getMessage());
		}
		test.log(LogStatus.INFO, "windowHandler", " Windows handle");

	}

	// << Go back one page
	public static void goBack(String object, String data) {
		// //APP_LOGS.debug("Going back one page");
		try {
			driver.navigate().back();
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "goBack",
					"Unable to go Back, Check if its open" + e.getMessage());
		}
		test.log(LogStatus.INFO, "goBack", "Went Back");

	}

	// >> Go to forward one page

	public static void goForward(String object, String data) {
		// //APP_LOGS.debug("Going back one page");
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "goForward",
					"Unable to go Forward, Check if its open" + e.getMessage());
		}
		test.log(LogStatus.INFO, "goForward", "Went Forward");

	}

	public static void clearInputText(String object) {
		// //APP_LOGS.debug("Clearing input text box");

		try {
			driver.findElement(By.xpath(GetLocator(object))).clear();
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "clearInputText",
					"Unable to clear input text " + e.getMessage());

		}
		test.log(LogStatus.INFO, "clearInputText", "Input Text cleared");

	}

	public static void clearInputText_css(String object, String data) {
		// //APP_LOGS.debug("Clearing input text box");

		try {
			driver.findElement(By.cssSelector(GetLocator(object))).clear();
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "clearInputText_css",
					"Unable to clear input text " + e.getMessage());

		}
		test.log(LogStatus.INFO, "clearInputText_css", "Input Text cleared");

	}

	public static void mouseHover(String object, String data) {
		// //APP_LOGS.debug("Mouse Hovering to the element");
		try {

			Thread.sleep(3000L);
			WebElement menu = driver.findElement(By.xpath(GetLocator(object)));
			Actions builder = new Actions(driver);
			builder.moveToElement(menu).build().perform();

		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "mouseHover",
					"Unable to mouse hover" + e.getMessage());
		}
		test.log(LogStatus.INFO, "mouseHover", "mouse hovering");

	}

	public static void mouseHoverCss(String object, String data) {
		// //APP_LOGS.debug("Mouse Hovering to the element");
		try {

			Thread.sleep(3000L);
			WebElement menu = driver.findElement(By
					.cssSelector(GetLocator(object)));
			Actions builder = new Actions(driver);
			builder.moveToElement(menu).build().perform();

		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "mouseHoverCss",
					"Unable to mouse hover" + e.getMessage());
		}
		test.log(LogStatus.INFO, "mouseHover", "mouse hovering");

	}

	public static void doubleClick(String object) {
		// //APP_LOGS.debug("Mouse Hovering to the element");
		try {

			Thread.sleep(3000L);
			WebElement menu = driver.findElement(By.xpath(GetLocator(object)));
			Actions builder = new Actions(driver);
			builder.doubleClick(menu).build().perform();

		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "doubleClick",
					"Unable to Double Click" + e.getMessage());
		}
		// test.log(LogStatus.INFO, "doubleClick", "Double Click");

	}

	public static String captureScreenshot(String filename,
			String keyword_execution_result) throws IOException {
		// take screen shots
		String file = GetConfig("ProjectPath") + "\\screenshots\\" + filename
				+ ".jpg";
		if (GetConfig("screenshot_everystep").equals("Y")) {
			// capturescreen

			File scrFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(file));

		} else if (keyword_execution_result.startsWith("FAIL")
				&& GetConfig("screenshot_error").equals("Y")) {
			// capture screenshot
			File scrFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(file));
		}
		return file;
	}

	
}
