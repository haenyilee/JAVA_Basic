/*
 	
 	
	문자를 입력을 받아서 char ch
		1) 숫자 입력 ch>='0' && ch<='9'
		2) 알파벳 입력 ch>='A' && ch<='Z' || ch>='a' && ch<='z'
		3) 한글 ch>='가' && ch<='힣'
		4) 특수문자
		
 */
import java.util.*;

public class 다중조건문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		char ch;
		
		// 문자입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요:");
		ch=scan.next().charAt(0);
		
		// 다중조건문
		if (ch>='0' && ch<='9')
			System.out.println(ch+"는 숫자입니다.");
		else if (ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			System.out.println(ch+"는 알파벳입니다.");		
		else if ( ch>='가' && ch<='힣')
			System.out.println(ch+"는 한글입니다.");		
		
		// 예외처리
		else
			System.out.println(ch+"는 특수문자입니다.");		
		
		

	}

}
