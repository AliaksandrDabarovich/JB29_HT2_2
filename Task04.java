package by.ad.les03_2.main;
/*
 * 4. С помощью оператора while напишите 
 * программу вывода всех четных чисел в 
 * диапазоне от 2 до 100 включительно. 
 */
public class Task04 {

	public static void main(String[] args) {
		
		int i=2;
		
		while (i<101) {
			
			if(i%2==0) {
			System.out.println(i);}
			i++;
			
		}

	}

}
