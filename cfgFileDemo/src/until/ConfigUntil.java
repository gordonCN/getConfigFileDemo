package until;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.XMLConfiguration;

// 配置文件获取 工具类
public class ConfigUntil {
	
	// 获取xml配置文件
	public Configuration getXMLFile(String filepath){// 项目下src下的路径与文件名
		Configuration config = null;
		try {
			 config = new XMLConfiguration (filepath);
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("!!!!!!!!!!!!! Can't ConfigurationUntil Class happened Exception !!!!!!!!!!!!! ");
		}
		
		return config;
	}
	
	public Configuration getPropertiesFile(String filepath){ // 项目下src下的路径与文件名
		
		Configuration config = null;
		try {
			 config = new PropertiesConfiguration (filepath);
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("!!!!!!!!!!!!! Can't ConfigurationUntil Class happened Exception !!!!!!!!!!!!! ");
		}
		
		return config;
	}
	
}
