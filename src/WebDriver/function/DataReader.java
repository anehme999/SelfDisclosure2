package WebDriver.function;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class DataReader {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList<HashMap> readCSVdata(String fileName) {
		ArrayList<HashMap> DataHolder = new ArrayList();
		// Input file which needs to be parsed
		String fileToParse = fileName;
		BufferedReader fileReader = null;
		final String DELIMITER = ",";
		try {
			String line = "";
			// Create the file reader
			fileReader = new BufferedReader(new FileReader(fileToParse));

			line = fileReader.readLine();

			String[] tokens = line.split(DELIMITER);
			// Read the file line by line

			while ((line = fileReader.readLine()) != null) {
				HashMap<String, String> mMap = new HashMap();
				mMap.clear();
				// Get all tokens available in line
				String[] tokens1 = line.split(DELIMITER);

				for (int i = 0; i < tokens.length; i++) {
					// Print all tokens
					if (tokens1.length < i + 1) {
						mMap.put(
								tokens[i].replaceAll("\\s+", "").toUpperCase(),
								"");
					} else {
						mMap.put(
								tokens[i].replaceAll("\\s+", "").toUpperCase(),
								tokens1[i]);
					}
				}
				DataHolder.add(mMap);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(DataHolder);
		return DataHolder;
	}

}
