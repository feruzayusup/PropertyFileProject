package my_maven_project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CongigReader {
	private static Properties prop;
		static {
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream("config1.properties");
			prop.load(fis);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static String getMyValue(String key) {

		String value = prop.getProperty(key);

		return value;

	}

}
