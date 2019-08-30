package by.ad.les03_2.main;
/*
 * 12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу нахождения произведения первых 10 членов этой последовательности. 
  */
public class Task12 {

	public static void main(String[] args) {
		int a;
		long mult;
		
		mult=1;
		a=1;
		
		for (int i=1; i<11;i++) {
			a+=6;
			mult*=a;
			System.out.println(mult);
		}

	}

}
