package by.ad.les03_2.main;
/*
 * 23. Составить программу для вычисления значений функции  
 * F(x) на отрезке [а, b] с шагом h. Результат представить в 
 * виде таблицы, первый столбец которой 
 * – значения  аргумента, второй - соответствующие значения функции:
 */
public class Task23 {

	public static void main(String[] args) {
		
		
		double a;
		double b;
		double x;
		double y;
		double h;
		
		
		
		h=0.02;
		a=-0.98;
		b=0.89;
		System.out.format("y"+"\t"+"\t"+"\t"+"x"+"\n");
		for (x=a; x<=b;x=x+h) {
			y=1/Math.tan(x/3)+1/2*Math.sin(x);
			System.out.format(y+"\t"+x+"\n");
			
			
			 
		}
	}

}
