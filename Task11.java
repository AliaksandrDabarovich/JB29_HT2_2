package by.ad.les03_2.main;
/*
 * 11. Составить программу нахождения разности кубов первых двухсот чисел 
 */
public class Task11 {

	public static void main(String[] args) {
		long sub;
		sub=0;
		
		for(int i=1;i<=100; i++) {
			sub-=i*i*i;
			System.out.println(sub);
		}

	}

}
