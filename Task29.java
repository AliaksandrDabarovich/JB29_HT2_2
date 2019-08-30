package by.ad.les03_2.main;
/*
 * 29. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. 
 */
public class Task29 {

	public static void main(String[] args) {
		int a;
		int b;
		
		a=253;
		b=6789;
		while (a>0) {
			System.out.println(a%10+" цифра числа a");
			a/=10;
		}
		System.out.println("--------------------");
		while (b>0) {
			System.out.println(b%10+" цифра числа b");
			b/=10;
		}
		
	}

}
