package com.timemanager.shared.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	public PropertiesReader(String file) {
		Properties prop = new Properties();

		try {
			prop.load(new FileInputStream(file)); 
		} catch (IOException ex) {
			ex.printStackTrace();
		} 
	}

	public static PropertiesReader prop = new PropertiesReader("db.properties");

	public static String getProperty(String s) {
		return prop.prop.getProperty(s);
	}
}
