import java.io.*;
import java.util.*;
public class Lesson9 {
    public static void main(String[] args) {
        start();
    }	
	public static void start () {
        System.out.println("������� ������� ������ ���������: ");
        Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int a = sc.nextInt();
			if (a<=0){
				System.out.println("������������ ������ �����,  ������ ����� �����: ");
			}
			else{
				mas(a);
			}
		}
		else{
			System.out.println("������������ ������ �����,  ������ ����� �����: ");
			start();
		}    
	}
	public static void mas(int a) {
		int[] array = new int[a];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			//System.out.println(array[i]);
		}
		//System.out.println(Arrays.toString(array));
		something(array);
	}
	public static void something(int[] array) {
		int b = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2==0) {
				System.out.println("������ "+ array[i]);
				b+=array[i];
			}
		}
		System.out.println("����� "+ b);
    }	
}