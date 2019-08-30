package by.ad.les03_2.main;
/*
 * 10. Составить программу нахождения произведения квадратов первых двухсот чисел. 
 */
public class Task10 {

	public static void main(String[] args) {
		double mult;
		mult=1;
		
		for(int i=1;i<=200; i++) {
			mult*=i*i;
			System.out.println(mult);
		}

	}

}
