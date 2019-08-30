package by.ad.les03_2.main;

/*
 * 8. Вычислить значения функции на отрезке [а,b] c шагом h: 
 */
public class Task08 {

	public static void main(String[] args) {
		int x;
		int y;
		int a=-6;
		int b=50;
		int c=3;
		int h;
		h=3;
		
		
		
		
			for (x=a; x<=b; x+=h) {
				
				if(x==15) {
					y=(x+c)*2;
					System.out.println("y=(x+c)*2 равно: "+y);
				} else {
					y=(x-c)+6;
					System.out.println("y=(x-c)+6 равно: "+y);
				}
				
				}

	}

}
