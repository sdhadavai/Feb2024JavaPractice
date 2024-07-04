package propertiesconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public final static String CONFIG_FILE_PATH = "./src/propertiesconcept/config.properties";
	static Properties prop;
	public static void main(String[] args) {
		
		

		try {
			FileInputStream fip = new FileInputStream(CONFIG_FILE_PATH);
			prop = new Properties();
			prop.load(fip);
		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		String url = prop.getProperty("url");
		System.out.println(url);
		
		String s = prop.getProperty("sri");
		System.out.println(s);//null
		
		prop.setProperty("browser","firefox" );
		browser = prop.getProperty("browser");
		System.out.println(browser);
		
		prop.setProperty("version","99.00" );
		browser = prop.getProperty("version");
		System.out.println(browser);
		
		System.out.println(prop.size());
		
	}

}
