import java.io.*;
import java.util.*;
public class WorkEvenSimple {
    public static void main(String[] args) {
        start();
    }	
public static void start () {
            System.out.println("Введите целое число: ");
            Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				int k = sc.nextInt();
				evenNotEven(k);
				System.out.println(simple(k));
				}else{
					System.out.println("Число не целое");
					start();
					}    
 } 
public static void evenNotEven (int a) {
if (a == 0){
	System.out.println("Вы ввели цифру 0");
	}
	else if (a%2>0) {
	System.out.println("Не четное");
	} 
	else {
		System.out.println("Четное");
	}
 } 
public static String simple (int a) {
        if (a < 2){
			return "Введенная цифра не относится не к простым не к составным\nВаше число:"+a;
			}		
        for (int i = 2; i*i <= a; i++){
            if (a%i == 0) {
			return "Составное\nВаше число:"+a;  
			}    		
		}
		return "Простое\nВаше число:"+a;
	}
}