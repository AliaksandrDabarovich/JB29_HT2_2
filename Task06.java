package by.ad.les03_2.main;
/*
 * 6. Напишите программу, где пользователь вводит любое целое положительное число. 
 * А программа суммирует все числа от 1 до введенного пользователем числа. 
 */
public class Task06 {

	public static void main(String[] args) {
		int sum;
		int k;
		
		k=4;
		sum=0;
		
		for (int i=1; i<k; i++) {
			sum+=i;
		}
		System.out.println(sum);

	}

}
