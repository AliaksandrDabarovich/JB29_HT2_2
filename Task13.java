package by.ad.les03_2.main;
/*
 * 13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.
 */
public class Task13 {

	public static void main(String[] args) {
		
		double x;
		double y;
		System.out.println("x"+"\t"+"y"+"\n");
		for (x=-5; x<=5; x+=0.5) {
			y=5-x*x/2;
			System.out.println(x+"\t"+y);
		}
		

	}

}
