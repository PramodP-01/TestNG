package gloabalenvironment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//import org.testng.annotations.Test;

public class filestream {
	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"/home/pramodp/new workspace/TestNG/src/gloabalenvironment/global.properties");
		pro.load(fis);
		System.out.println(pro.getProperty("Browser"));
		System.out.println(pro.getProperty("url"));
		pro.setProperty("Browser", "Chrome");
		System.out.println(pro.setProperty("Browser", "Chrome"));
		FileOutputStream fot = new FileOutputStream(
				"/home/pramodp/new workspace/TestNG/src/gloabalenvironment/global.properties");

		pro.store(fot, null);

	}

}
