import java.io.*;
import java.util.*;
public class Lesson2 {
    public static void main(String[] args) {
        start();
    }	
	public static void start () {
        System.out.println("Введите два целых числа: ");
        Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b+" Сумма");
			System.out.println(Math.abs(a - b)+" Разность");
			System.out.println(gcd(a,b)+" НОД");
			System.out.println(lcm(a,b)+" НОК");
		}
		else{
			System.out.println("Число не целое");
			start();
		}    
	} 
	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} 
		else {
			return gcd(b, a % b);
		}
	}
	private static int lcm(int a, int b) {	
		return a / gcd(a,b) * b;
	}
}