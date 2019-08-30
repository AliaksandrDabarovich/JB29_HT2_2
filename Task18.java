package by.ad.les03_2.main;
/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
 * модуль которых больше или равен заданному е.
 *  Общий член ряда имеет вид:
 */
public class Task18 {

	public static void main(String[] args) {
		double a;
		double e;
		double sum;
		
		
		e=0.09;
		sum=0;
		
		
		for (double n=1;n<20; n++) {
			a=Math.pow(-1, n-1)/n;
			if (Math.abs(a)>=e) {
				sum+=a;
			}
				
			
		}
		System.out.println(sum);
		

	}

}
