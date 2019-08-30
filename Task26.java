package by.ad.les03_2.main;
/*
 * 26. Вывести на экран соответствий между символами 
 * и их численными обозначениями в памяти компьютера 
 * (Таблицу ASCII).
 */
public class Task26 {

	public static void main(String[] args) {
		char k;
		
		for (int i=0; i<=65535; i++) {
			k=(char)i;
			System.out.println(i+"\t"+k);
		}
		
		
		
	}

}
