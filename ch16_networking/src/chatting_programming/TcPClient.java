package chatting_programming;

import java.util.Scanner;

import com.framework.TcpApplication;

public class TcPClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		showMenu();
		
		System.out.printf("             >");
		int select =sc.nextInt();
		
		switch (select) {
		case 1:
			System.out.printf("           1 -> start                   \n");
			System.out.println();
			
		case 0:
			System.out.println(" ");
			System.exit(0);
		}
		/*
		 *  create TCP/ IP application
		 */

		TcpApplication app = new AppServer();
		
		// server init
		app.init();
		
		// server start
		app.start();
		
		sc.close();
	}
	
	    public static void showMenu() {
	        System.out.printf("                                      \n");
	        System.out.printf("          ■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
	        System.out.printf("                                      \n");
	        System.out.printf("            [SERVER version 1.0.1®]   \n");
	        System.out.printf("                                      \n");
	        System.out.printf("          ■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
	        System.out.printf("                                      \n");
	        System.out.printf("                                      \n");
	        System.out.printf("                                      \n");
	        
	        System.out.printf("          1 → Start                   \n");
	        System.out.printf("          0 → End                     \n");
	        System.out.printf("                                      \n");
	        System.out.printf("                                      \n");
	    }

	}

