/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbinstaller;

import javax.swing.JTable;
import javax.swing.JTextArea;

/**
 *
 * @author msushil
 */
public class DBInstaller {
    
    public static void ExecuteScripts(JTable tblScripts, DBConnectionInfo dbInfo, JTextArea outputLog) {         
        String command;
        SystemCommandExecutor cmdExecutor;
        Integer exitStatus = 0;
            
        for (int i=0;i<tblScripts.getRowCount();i++){
            //determine Windows or Linux/Unix OS 
            if (System.getProperty("os.name").toLowerCase().contains("windows"))
            {
                command = "cmd /c \"mysql " +
                    "--user=" + dbInfo.getUsername() + " " +
                    "--password=" + dbInfo.getPassword() + " " +
                    "< \"" + tblScripts.getValueAt(i,0).toString() + "\"\"";
            }
            else
            {
                command = "xterm -e \"mysql " +
                    "--user=" + dbInfo.getUsername() + " " +
                    "--password=" + dbInfo.getPassword() + " " +
                    "< \"" + tblScripts.getValueAt(i,0).toString() + "\"\"";        
            }
            
            try
            {
		cmdExecutor = new SystemCommandExecutor(); 		
		exitStatus = cmdExecutor.runCommand(command);
                
                if (exitStatus == 0) 
                {
                    tblScripts.setValueAt("\u2714", i, 1); 
                    outputLog.append("successfully executed - " + tblScripts.getValueAt(i, 0).toString() + "\n");                
                }
                else
                {
                    tblScripts.setValueAt("\u2716" , i, 1); 
                    outputLog.append(cmdExecutor.getCommandError());
		    outputLog.append(cmdExecutor.getCommandOutput());                    
                }
            }
            catch (Exception ex)
            {
                outputLog.append(exitStatus.toString() + ex.getMessage());
            }
        }
    }    
}
