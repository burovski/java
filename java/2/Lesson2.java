import java.io.*;
import java.util.*;
public class Lesson2 {
    public static void main(String[] args) {
        start();
    }	
	public static void start () {
        System.out.println("������� ��� ����� �����: ");
        Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b+" �����");
			System.out.println(Math.abs(a - b)+" ��������");
			System.out.println(gcd(a,b)+" ���");
			System.out.println(lcm(a,b)+" ���");
		}
		else{
			System.out.println("����� �� �����");
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