package by.ad.les03_2.main;

/*
 * 38. Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию. 
 * Предполагается, что в числе не менее трёх цифр. Например: 1357, 963
 */
public class Task38 {

	public static void main(String[] args) {
		
		int[] myArray; 
		myArray = new int[10];
		int a;
		int b;
		int b1;
		
		int d;
		int e;
		e=0;
		d=0;
		b1=0;
		a= 2458;
		boolean boo;
		boo=true;
		for (int i=0; a>0; i++) {
			
			b=a%10;
			
			if (i>0) {
				e=b-b1;
				myArray[i-1]=e;
				
			}
			b1=b;
			
			a/=10;
			
			d=i;
			
		}
		
		for (int j=0;j<d-1; j++) {
			if (myArray[j]==myArray[j+1]) {
				boo=true;
			} else {boo=false;}
			
			
		}
		if (boo==true) {System.out.println("цифры образуют арифметическую прогрессию");}
		else {System.out.println("цифры НЕ образуют арифметическую прогрессию");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * int a; int b; int c; int k; int k2; a = 12356; b = 0; c = 0; k2 = 0; k = 0;
		 * int i;
		 * 
		 * for (i = 1; a > 0; i++) {
		 * 
		 * if (i == 1) { b = a % 10;
		 * 
		 * c = b;
		 * 
		 * a /= 10; } else if (i ==2) {
		 * 
		 * b = a % 10;
		 * 
		 * k = c - b; c = b;
		 * 
		 * k2 = k;} else if (i>2) { b = a % 10;
		 * 
		 * k = c - b; c = b; if (k2 != k) {
		 * System.out.println("число не образует арифметическую прогрессию");
		 * 
		 * } k2 = k; }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
				

			

		}

	}


