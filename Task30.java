package by.ad.les03_2.main;
/*
 * 30. Написать программу, переводящую римские цифры в арабские
 */
public class Task30 {

	public static void main(String[] args) {
		char ch;
		
		ch=8544;
		
		for (int i=1; i<=10; i++) {
			System.out.println(ch+"\t"+(ch-8543));
			ch+=1;
			}
		

	}

}
