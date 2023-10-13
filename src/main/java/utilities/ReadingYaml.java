package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.yaml.snakeyaml.Yaml;

public class ReadingYaml{

	static Properties prop;
	
//	public ReadingYaml(Properties propFromBaseClass) throws IOException {
//		this.prop = propFromBaseClass;
//	}
	public static String readPropertyFile(String propName ) {
		return prop.getProperty(propName);
		
	}
	
	public static void main(String[] args) throws IOException {
		
		try {
			
			File file = new File(
				"C:\\Users\\rohit.bhargava\\eclipse-workspace\\Learning1\\Confugration\\config.properties");
			
				FileInputStream fip = new FileInputStream(file);
				prop = new Properties();
				prop.load(fip);
			
			FileInputStream inputStream = new FileInputStream(new File(readPropertyFile("YMLFile")));
			
			Yaml yaml = new Yaml();
			Map<String, Object> data = yaml.load(inputStream);
			System.out.println(data+"\n");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		}
}
