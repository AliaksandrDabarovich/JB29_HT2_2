package by.ad.les03_2.main;
/*
 * 33. Найдите наибольшую цифру данного натурального числа.
 */
public class Task33 {

	public static void main(String[] args) {
		int a;
		int sec;
		int first;
		a=2539;
		first=0;
		
		while (a>0) {
			
			sec=a%10;
			if (sec>first) {
				first=sec;
			}
			
			a/=10;
		}
		System.out.println(first);

	}

}
