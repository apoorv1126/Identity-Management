/*package in.dod.iamcore.logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class IamLog {
	
	private static final String lineSeparator = System.getProperty("line.separator");
	
	String loggingEntity;
	FileWriter writer;
	
	
	public IamLog(String loggingEntity){
		//File creation
		File file = new File("C:/Logs/iamcore.log");
		if (file.exists()){
			try {
				
				writer = new FileWriter(file);
				writer.write("Beginning of the log file "+lineSeparator);
				writer.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.loggingEntity = loggingEntity;
	}
	
	public void log(String message){
		Date date = new Date();
		try {
			writer.write(this.loggingEntity + " : " + date + " " + message + lineSeparator);
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(this.loggingEntity + " : " + date + " " + message);
	}
	
	
	public void log(String message, String level){
		log("["+level+"] - " + message);
	}



}
*/