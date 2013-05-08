/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbinstaller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author msushil
 */
public class FileLoader {
    
    public static String getString(String fileName) throws IOException {
        
        StringBuilder sqlFile = new StringBuilder();
        
        try 
        {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String str;
            while ((str = in.readLine()) != null) {
                sqlFile.append(str);
            }
            in.close();
        } catch (IOException e) {
            throw(e);
        }
        
        return sqlFile.toString();
    }
    
        public static String getStringWithLineFeeds(String fileName) throws IOException {
        
        StringBuilder sqlFile = new StringBuilder();
        
        try 
        {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String str;
            while ((str = in.readLine()) != null) {
                sqlFile.append(str + "\n");
            }
            in.close();
        } catch (IOException e) {
            throw(e);
        }
        
        return sqlFile.toString();
    }
}
