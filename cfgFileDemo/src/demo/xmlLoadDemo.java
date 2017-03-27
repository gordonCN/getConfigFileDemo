package demo;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;


public class xmlLoadDemo {
	public static void main(String[] args){
		
	
			try {
				Configuration cfg = new XMLConfiguration("demo/config.xml");// ÎÄ¼þÂ·¾¶
				String name = cfg.getString("Account.name");
				System.out.println("name:"+ name);
			} catch (ConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	
			
			
	}
}
