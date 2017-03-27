package until;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.XMLConfiguration;

// �����ļ���ȡ ������
public class ConfigUntil {
	
	// ��ȡxml�����ļ�
	public Configuration getXMLFile(String filepath){// ��Ŀ��src�µ�·�����ļ���
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
	
	public Configuration getPropertiesFile(String filepath){ // ��Ŀ��src�µ�·�����ļ���
		
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
