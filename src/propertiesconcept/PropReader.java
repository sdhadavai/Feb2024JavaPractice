package propertiesconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReader {
	
	private final String CONFIG_FILE_PATH = "./src/propertiesconcept/config.properties";
	private Properties prop;
	
	public Properties initProperteis() {
		try {
			FileInputStream fip = new FileInputStream(CONFIG_FILE_PATH);
			prop = new Properties();
			prop.load(fip);
		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
