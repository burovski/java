import java.io.*;
import java.util.*;
public class Lesson7 {
    public static void main(String[] args) {
        start();
    }	
	public static void start () {
        System.out.println("Введите кол-во двухзначных цифр в массиве: ");
        Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int a = sc.nextInt();
			mas(a);
		}
		else{
			System.out.println("Неправильный формат ввода,  ввеите целое число: ");
			start();
		}    
	}
	private static void mas(int a) {
		int[] array = new int[a];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*90+10);
				//System.out.println(array[i]);
		}
		System.out.println(Arrays.toString(array));
		maxmin(array);
	}
	private static void maxmin(int[] array) {
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if(array[i] > max) 
				max = array[i];
			if(array[i] < min) 
				min = array[i];
		}
		System.out.println("MAX: " + max);
		System.out.println("MIN: " + min); 
	}	
}