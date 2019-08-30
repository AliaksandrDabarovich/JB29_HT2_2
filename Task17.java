package by.ad.les03_2.main;
/*17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1
 * 
 */
public class Task17 {

	public static void main(String[] args) {
		int n;
		int a;
		int k;
		int sum;
		int d;
		
		
		sum=0;
		k=0;
		a=3;
		n=10;
		d=1;
		
		for (int i=0;i<n;i++) {
			
			sum=a+i;
			k=sum*d;
			d=sum;
			
			
		}
		System.out.println(k);

	}

}
