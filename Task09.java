package by.ad.les03_2.main;
/*
 * 9. Найти сумму квадратов первых ста чисел.
 */
public class Task09 {

	public static void main(String[] args) {
		int sum;
		sum=0;
		
		for(int i=1;i<=100; i++) {
			sum+=i*i;
			System.out.println(sum);
		}

	}

}
