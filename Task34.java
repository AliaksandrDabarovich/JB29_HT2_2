package by.ad.les03_2.main;
/*
 * 34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
 */
public class Task34 {

	public static void main(String[] args) {
		int a;
		int b;
		int sum;
		
		a=0;
		
		
		for (int i=1000; i<=9999; i++) {
				b=i;
				sum=0;
			for (int j=1; j<=4; j++) {
				
				a=b%10;
				sum+=a;
				b/=10;
				
			}
			if (sum==15) {System.out.println(i);}
			
		}

	}

}
