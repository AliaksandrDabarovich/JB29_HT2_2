package by.ad.les03_2.main;
import java.io.IOException;
import java.util.Scanner;


public class Task27 {

	public static void main(String[] args) 
		throws IOException {
		
		int n;
		int m;
		
		
		
				   
        Scanner in = new Scanner(System.in);
        System.out.print("Input m: ");
        m = in.nextInt();
        System.out.print("Input n: ");
        n = in.nextInt();
        in.close();
		
		
		
		for(int k=m;k<=n;k++) {
			for (int p=2; p<k;p++) {
				if (k%p==0) {System.out.println("Делителем числа "+k+" является число "+p);}
			}
		}
		
		
		
		
		/*Для чисел до 10
		 * do {
		if (i==0) {
		m=(char)System.in.read();
		do {
			ignore=(char)System.in.read();
		} 
		while (ignore !='\n');}
		else {n=(char)System.in.read();
		do {
			ignore=(char)System.in.read();
		} 
		while (ignore !='\n');}
		i++;
		
	}
	while (i<2);
	System.out.println(m+"\t"+n);
	d = Character.getNumericValue(m);
		g = Character.getNumericValue(n);
	*/
				
		
		
	}

}
