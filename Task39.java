package by.ad.les03_2.main;

/*
 * 39. В трехзначном числе зачеркнули старшую цифру. 
 * Когда полученное число умножили на 7, то получили исходное число. Найти это число. 
 */
public class Task39 {

	public static void main(String[] args) {
		int a;
		int sec;
		int first;
		
		first=0;
		int x;
		int y;
		int z;
		int num;
		
		x=0;
		y=0;
		z=0;
		
		num=0;
		
		
		for (int j=100; j<=999; j++) {
		a=j;
		
		for (int i=1; i<=3;i++) {
			
			sec=a%10;
			if (i==1) {
				x=sec;
				
			} else if (i==2) {
				y=sec;
			} else if (i==3) {
				z=sec;
			}
			
			if (sec>first) {
				first=sec;
			}
			
			if (x==first) {
				num=z*10+y;
			} else if (y==first) {
				num=z*10+x;
			}else if (z==first) {
				num=y*10+x;
			}
			a/=10;
		}
		if (num*7==j) {
		System.out.println(num);}

	}
	}
}
