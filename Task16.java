package by.ad.les03_2.main;
/*
 * 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10). 
 */
public class Task16 {

	public static void main(String[] args) {
		int n;
		int k;
		int sum;
		int d;
		
		
		sum=0;
		d=1;
		n=10;
		k=0;
		
		for (int i=1;i<=n;i++) {
			
			sum=sum+i;
			k=sum*d;
			d=sum;
			
			
		}
		System.out.println(k);

	}

}
