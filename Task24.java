package by.ad.les03_2.main;
/*
 * 24. Вводится натуральное число. Найти сумму четных 
 * цифр, входящих в его состав. Преобразовать его в другое число, цифры которого 
 * будут следовать в обратном порядке по сравнению с введенным числом. 
 */
public class Task24 {

	public static void main(String[] args) {
		int n;
		int r;
		int an;
		int sum;
		r=0;
		sum=0;
		n=0;
		an=0;
		
		
		n=135678;
		r=n%10;
		
		
		while (r>0) {
			if (r%2==0) {
				sum+=r;
			}
			an*=10;
			an+=r;
			n/=10;
			r=n%10;
			
			
		}
		
		System.out.println("Сумма чётных: "+sum+"\n"+"Число с обратным порядком цифр: "+an);
		
	}

}
