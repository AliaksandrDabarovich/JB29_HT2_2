package by.ad.les03_2.main;
/*
 * 40. Получить все числа, не превышающие заданного числа N, 
 * которые делятся без остатка на все свои цифры.  
 
 */
public class Task40 {

	public static void main(String[] args) {
		int N;
		int a;
		int b;
		int c;
		N=555;
		boolean per;
		
		
		
		for (int i=1;i<=N;i++) {
			a=i;
			per=true;
			while (a>0) {
				b=a%10;
				a/=10;
				
				if (b!=0 && i%b!=0) {
					per=false;
					}
				
				
				}
			if (per!=false) {System.out.println(i);}
			
		}
		

	}

}
