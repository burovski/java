import java.io.*;
import java.util.*;
public class WorkEvenSimple {
    public static void main(String[] args) {
        start();
    }	
public static void start () {
            System.out.println("������� ����� �����: ");
            Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				int k = sc.nextInt();
				evenNotEven(k);
				System.out.println(simple(k));
				}else{
					System.out.println("����� �� �����");
					start();
					}    
 } 
public static void evenNotEven (int a) {
if (a == 0){
	System.out.println("�� ����� ����� 0");
	}
	else if (a%2>0) {
	System.out.println("�� ������");
	} 
	else {
		System.out.println("������");
	}
 } 
public static String simple (int a) {
        if (a < 2){
			return "��������� ����� �� ��������� �� � ������� �� � ���������\n���� �����:"+a;
			}		
        for (int i = 2; i*i <= a; i++){
            if (a%i == 0) {
			return "���������\n���� �����:"+a;  
			}    		
		}
		return "�������\n���� �����:"+a;
	}
}