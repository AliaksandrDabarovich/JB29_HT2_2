package by.ad.les03_2.main;

import java.util.Random;
import java.util.Scanner;

/*
 * 31. Компьютер генерирует пять чисел в диапазоне 
 * от 1 до 15 включительно. Человек пытается их угадать. 
 * Программа должна выводить угаданные и неугаданные 
 * числа из тех, что сгенерировала программа, а также ошибочные числа пользователя. 
 */
public class Task31 {

	public static void main(String[] args) {
		int a;
		int b;
		Random random = new Random();

		for (int i = 1; i <= 5; i++) {
			b = random.nextInt(15);
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите " + i + " число >");
			while (sc.hasNextInt() == false) {
				sc.next();
				System.out.println("Введите " + i + " число >");
			}

			a = sc.nextInt();
			if (a == b) {
				System.out.println("Случайное число: "+b+"\n"+"Выбранное число: "+a+"\n"+
			"Вы угадали "+ i + " число");
			} else {System.out.println("Случайное число: "+b+"\n"+"Выбранное число: "+a+"\n"+
				"Не угадано "+ i + " число");}

		}
	}

}
