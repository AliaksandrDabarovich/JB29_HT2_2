package by.ad.les03_2.main;
/*
 * 25. Требуется определить факториал числа, которое ввел пользователь
 */
public class Task25 {

	public static void main(String[] args) {
		int n;
		int fact;
		n=9;
		fact=1;
		
		for (int i=1; i<=n; i++) {
			fact*=i;
			
		}
		System.out.println(fact);

	}

}
