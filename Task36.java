package by.ad.les03_2.main;

/*
 * 36. Два двузначных числа, записанных одно за другим , 
 * образуют четырёхзначное число, которое делится на 
 * их произведение. Найти эти числа. 
 */
public class Task36 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int num1;
		int num2;
		int sub;

		num1 = 0;
		num2 = 0;

		for (int i = 1000; i <= 9999; i++) {
			b = i;
			for (int j = 1; j <= 2; j++) {

				a = b % 10;

				if (j == 2) {
					num1 = a * 10 + num1;
				} else {
					num1 = a;
				}
				b /= 10;

			}
			/* System.out.println(num1+"\t"+i); */
			for (int k = 1; k <= 2; k++) {

				a = b % 10;

				if (k == 2) {
					num2 = a * 10 + num2;
				} else {
					num2 = a;
				}
				b /= 10;

			}

			/* System.out.println(num2+"\t"+i); */
			sub = num1 * num2;
			/* System.out.println(sub); */

			if (sub != 0 && i % sub == 0) {
				System.out.println(i);
			}
		}

	}

}
