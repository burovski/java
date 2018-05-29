import java.io.*;
import java.util.*;
public class Lesson5 {
    public static void main(String[] args) {
        start();
    }	
	public static void start () {
        System.out.println("������� �����������: ");
        Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		System.out.println("������� ����� ��� ������: ");
		String r = sc.nextLine();
		System.out.println("����� �����������: " + mess(t, r));
		start();						
	} 
	private static int mess(String message, String word) {
        message = message.toLowerCase();
        word = word.toLowerCase();
        int i = message.indexOf(word);
        int count = 0;
        while (i >= 0) {
            count++;
            i = message.indexOf(word, i + 1);
        }
        return count;
	}
}