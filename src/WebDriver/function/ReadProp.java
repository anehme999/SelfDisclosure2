package WebDriver.function;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProp {

	public static String GetLocator(String key) {
		Properties prop = new Properties();
		InputStream input = null;
		String Locator = null;
		try {
			input = new FileInputStream("src\\WebDriver\\Config\\locator.properties");
			// load a properties file
			prop.load(input);
			// get the property value and print it out
			Locator = prop.getProperty(key);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return Locator;
	}

	public static String GetConfig(String key) {
		Properties prop = new Properties();
		InputStream input = null;
		String Locator = null;
		try {
			input = new FileInputStream("src\\WebDriver\\Config\\Config.properties");
			// load a properties file
			prop.load(input);
			// get the property value and print it out
			Locator = prop.getProperty(key);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return Locator;
	}

	public static String GetProperty(String key, String file) {
		Properties prop = new Properties();
		InputStream input = null;
		String Locator = null;
		try {
			input = new FileInputStream(file);
			// load a properties file
			prop.load(input);
			// get the property value and print it out
			Locator = prop.getProperty(key);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return Locator;
	}

}
