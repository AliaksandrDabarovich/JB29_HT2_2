package by.ad.les03_2.main;

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {

		int X;
		int Y;
		int Z;
		int per;
		int per2;
		Z=0;
		char exit;
		
		
		
		for (;;) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input sign: ");
		
        String ch1 = in.nextLine();
        per=(int)ch1.charAt(0);
        
        System.out.print("Input X: ");
        X = in.nextInt();
        System.out.print("Input Y: ");
        Y = in.nextInt();
        //in.close();
        
		
         if (per==43) {
        	System.out.println(Z=X+Y);
        } else if (per==45) {
        	System.out.println(Z=X-Y);
        	
        } else if (per==42) {
        	System.out.println(Z=X*Y);
        } else if (per==47) {
        	if(Y==0) {System.out.println("Y can not be 0");}
        	else {System.out.println(Z=X/Y);}
        }  else if (per!=43||per!=45||per!=42||per!=47) {
        	System.out.println("You have entered incorrect sign");
        }
         
         System.out.print("Do you want exit? Type q: ");
         String ch2 = in.next();
         per2=(int)ch2.charAt(0);
         if (per2==113) {
         	break;}
        
		}
		System.out.println("End of operation");
		
		
		/*System.out.print("If you want proceed press 1. If you want stop press 0 ");
	    String choice = in.nextLine();
	    if ((int)choice.charAt(0)==48) {
        	break;
        } else {}*/
        
        
	}

}
