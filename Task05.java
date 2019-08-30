package by.ad.les03_2.main;
/*
 * 5. С помощью оператора while напишите программу определения суммы всех 
 * нечетных чисел в диапазоне от 1 до 99 включительно. 
 */
public class Task05 {

	public static void main(String[] args) {
		int i=1;
		int k=0;
		while (i<100) {
			if (i%2!=0) {
			k+=i;
			}
			
			i++;
		}
		System.out.println("Сумма всех нечётных чисел: " +k);
		

	}

}
