package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class PropertiesFileDemo {
	public static void main(String[] args) {
	
		PropertiesFileDemo pfd = new PropertiesFileDemo();		
		pfd.getcfgFromUntilProperties();
	}
	
	public void getcfgFromUntilProperties(){
	//	 PropertiesTest pt = new PropertiesTest();  

	        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("demo/config.properties");  
	        
	        System.out.println("begin!!!");  
	        Properties properties = new Properties();  
	        
	        try{  
	            properties.load(inputStream);  
	            
	            //  properties.load(new FileInputStream("D:\\a.ini")); // 加载硬盘地址配置文件                            
	            
	        }catch (IOException ioE){  
	            ioE.printStackTrace();  
	        }finally{  
	            try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
	        }  
	        System.out.println("name:"+properties.getProperty("name"));  
	    
		
	}
	
	
	
	public void getConfigFromProperties(){
		try {
			
			Configuration cfg = new PropertiesConfiguration("demo/config.properties");
			String name = cfg.getString("name");
			System.out.println("name:"+ name);
			
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
