package WebDriver.function;

import java.io.*;
import java.sql.Timestamp;
import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import static WebDriver.function.ReadProp.*;
import com.relevantcodes.extentreports.ExtentReports;

public class Config {
	
	public static void LoadConfig(String documentTitle, String reportName,
			String reportHeadline, ExtentReports extent) {
		String filepath = GetConfig("ResultConfig");
		try {

			DocumentBuilderFactory docFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(filepath);

			// Get the configuration element by tag name directly
			Node ExtentConfig = doc.getElementsByTagName("configuration").item(
					0);

			// update configuration attribute

			NodeList list = ExtentConfig.getChildNodes();

			for (int i = 0; i < list.getLength(); i++) {

				Node node = list.item(i);

				// get the documentTitle element, and update the value
				if ("documentTitle".equals(node.getNodeName())) {
					node.setTextContent(documentTitle);
				}

				// get the reportName element, and update the value
				if ("reportName".equals(node.getNodeName())) {
					node.setTextContent(reportName);
				}
				// get the reportHeadline element, and update the value
				if ("reportHeadline".equals(node.getNodeName())) {
					node.setTextContent(reportHeadline);
				}

			}
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(filepath));
			transformer.transform(source, result);

			System.out.println("Done");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (SAXException sae) {
			sae.printStackTrace();
		}

		// Load the configuration
		extent.loadConfig(new File(filepath));
	}

	public static String CreateResult(String fileName) {
		try {
			String sPath = GetConfig("ResultPath") + GetConfig("ProtocollRelease") + "\\";
			File Dir = new File(sPath);
			
			if (!Dir.exists()) {
				if (Dir.mkdir()) {
					System.out.println("Directory is created!");
				} else {
					System.out.println("Failed to create directory!");
				}
			}
			sPath = sPath+ "b_"+GetConfig("ProtoCollBuild") + "\\";
			Dir = new File(sPath);
			if (!Dir.exists()) {
				if (Dir.mkdir()) {
					System.out.println("Directory is created!");
				} else {
					System.out.println("Failed to create directory!");
				}
			}
			sPath = sPath + fileName + "\\";
			Dir = new File(sPath);
			if (!Dir.exists()) {
				if (Dir.mkdir()) {
					System.out.println("Directory is created!");
				} else {
					System.out.println("Failed to create directory!");
				}
			}
			Date date = new Date();
			fileName = sPath + fileName + " " + new Timestamp(date.getTime());
			System.out.println(fileName);
			fileName = fileName.replace(":", ".");
			fileName = fileName + ".html";
			File file = new File(fileName);

			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileName;
	}

	public static ArrayList<String> CMDCommand(String Command) {
		ArrayList<String> lsList = new ArrayList<String>();
		try {
			Process p = Runtime.getRuntime().exec(Command);

			p.waitFor(10, TimeUnit.SECONDS);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			String line = reader.readLine();


			while (line != null) {
				System.out.println(line);
				if (line != null) {
					try {
						lsList.add(line);

					} catch (Exception exe) {
						System.out.println(exe.getMessage());
					}
				}
				line = reader.readLine();
			}
		} catch (IOException e1) {
			System.out.println("Error while executing Command");
		} catch (InterruptedException e2) {
			System.out.println("Error while executing Command");
		}
		return lsList;

	}

	public static void SettingGroovy() {

		CMDCommand("setx GROOVY_HOME \"" + GetConfig("GroovyHome") + "\"");

		CMDCommand("setx JAVA_HOME \"" + GetConfig("JavaHome") + "\"");

		CMDCommand("setx PATH \"%GROOVY_HOME%\\bin;%PATH%\"");

	}

}
