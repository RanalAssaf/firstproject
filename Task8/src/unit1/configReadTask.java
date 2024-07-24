package unit1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReadTask {

public static Properties getpropertyopject() throws IOException {
		
		FileInputStream fp= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Task8\\conrfig1\\configprop1");
		
		Properties prop=new Properties();
		
		prop.load(fp);	
		
		return prop;
   }

public static String geturl() throws IOException {
	
	return getpropertyopject().getProperty("url");
}


public static String getusername() throws IOException {
	
	return getpropertyopject().getProperty("username");
}

public static String getpassword() throws IOException {
	
	return getpropertyopject().getProperty("password");
}




public static String getfname() throws IOException {
	
	return getpropertyopject().getProperty("fname");
}


public static String getmname() throws IOException {
	
	return getpropertyopject().getProperty("mname");
}

public static String getlname() throws IOException {
	
	return getpropertyopject().getProperty("lname");
}

public static String getid() throws IOException {
	
	return getpropertyopject().getProperty("id");

}


}
