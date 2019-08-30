package by.ad.les03_2.main;
/*
 * 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n. 
 */
public class Task14 {

	public static void main(String[] args) {
		int n;
		double sum;
		n=10;
		sum=0;
				
		for (double i=1; i<=n; i++) {
			sum=sum+1/i;
			System.out.println(sum);
		}

	}

}
