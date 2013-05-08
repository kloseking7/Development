/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbinstaller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author msushil
 */
public class ConfigLoader {
  
    public static String getProperty(String propertyName, String configFileName) throws IOException {
        String propertyValue, path;
        Properties prop = new Properties();
        
        path = System.getProperty("user.dir");
        prop.loadFromXML(new FileInputStream(path + "\\src\\config\\" + configFileName)); 
        propertyValue = prop.getProperty(propertyName);
        
        return propertyValue;      
    }    
}
