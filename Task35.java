package by.ad.les03_2.main;
/*
 * 35. Найдите количество четных цифр данного натурального числа.
 */
public class Task35 {

	public static void main(String[] args) {
		int a;
		int vrem;
		int sum;
		sum=0;
		a=1264;
		while (a>0) {
			vrem=a%10;
			if (vrem%2==0) {sum++;}
			a/=10;
		}
		System.out.println("Количество чётных чисел: "+sum);

	}

}
