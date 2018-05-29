import java.io.*;
import java.util.*;
public class WorkPalindrom {
    public static void main(String[] args) {
        start();
    }	
public static void start () {
            System.out.println("Введите слово для проверки: ");
            Scanner sc = new Scanner(System.in);
			if (sc.hasNext()) {
				String t = sc.nextLine();
				String s = t.toLowerCase();
				palindrom(s);
				start();
				}else{
					System.out.println("Введите корректно слово");
					start();
					}    
 } 
private static void palindrom(String s) {
boolean b = true; 
for (int i = 0; i < s.length() / 2 + 1; i++) {
    // отнимаем 1, т.к. i начинается с ноля
    if (s.toCharArray()[i] != s.toCharArray()[s.length() - i - 1]) {
        b = !b;
        break;
    }
} 
System.out.println(b ? "Слово палиндром " + s : "Слово НЕ палиндром " + s);
}
	}