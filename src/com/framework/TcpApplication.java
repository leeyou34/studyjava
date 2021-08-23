package com.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public abstract class TcpApplication {
	
	public static String IP;
	public static int PORT;
	public static String CONFIG = "config/applicationcontext.ini";
	
	public void init() {
		
		Properties settings = new Properties();
	try {
		settings.load(new FileInputStream(CONFIG));
		
		IP =settings.getProperty("IP");
		PORT = Integer.parseInt(settings.getProperty("PORT"));
		
		System.out.println("IPAddress : " + IP);
		System.out.println("Port : " + PORT);
		
		System.out.println(TcpApplication.timeStamp());
		
	} catch (IOException e) {
		System.out.println("config file (applicationcontext.ini) can't be found.");
		System.out.println("Program is closing...");
		System.exit(0);
		}
	}
	
	public abstract void start();
	
	
	
	public static String timeStamp() {
		SimpleDateFormat format =new SimpleDateFormat("[hh:mm:ss]");
		return format.format(new Date());
	}
}
