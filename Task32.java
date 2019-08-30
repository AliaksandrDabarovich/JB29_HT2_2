package by.ad.les03_2.main;
import java.util.Scanner;
/*
 * 32. Проверить введенную пользователем строку на 
 * наличие недопустимых символов. В качестве первого 
 * символа допустимы только буквы и знак 
 * подчеркивания. Остальные символы могут быть буквами, 
 * цифрами и знаком подчеркивания.
 */
public class Task32 {

	public static void main(String[] args) {
		int per;
		char pr;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Введите строку > ");
		
		String ch1 = in.nextLine();
        per=(int)ch1.charAt(0);
		System.out.println(ch1+"\n");
        for (int i=48;i<=57;i++) {
        	if (per==i) {
        		pr=(char)per;
                System.out.println("Введён недопустимый символ "+pr);}
        	
        }
        
        
        
		
		
	}

}
