package by.ad.les03_2.main;
/*
 * 15. Вычислить : 1+2+4+8+...+ 2 в 10 степени. 
 */
public class Task15 {

	public static void main(String[] args) {
		int n;
		n=10;
		double sum;
		sum=0;
		
		for (double i=0; i<=n; i++) {
			sum=sum+Math.pow(2, i);
			
		}
		System.out.println(sum);

	}

}
