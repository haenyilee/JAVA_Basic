// 사용자가 입력(정수) ==> 2진법 출력
// bit => 16bit ==> 32676
// 17의 변수 => 01(16)
// 0000 0000 0000 1010  10 => 배열

/*
	노래제목,가수명,앨범명,포스터,순위
	
	=> 50곡=========50*(노래제목,가수명,앨범명,포스터,순위)=250개의 변수 필요함
 */


/*
	사용법
		제어문
			조건
			반복
				= for (횟수가 지정 => 자동 종료)
				= while (종료시점 => 반드시 입력 필요)
				
 */
import java.util.*;
public class 자바배열_용도3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary=new int[16];
		// 0,1만 저장
		// 사용자가 요청한 정수
		int user=0;
		
		int index=15; // 뒤에서부터 출력 => 배열제어
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력(0~32767) : ");
		user=scan.nextInt();
		
		System.out.println("===== Lib이용 =====");
		System.out.println(Integer.toBinaryString(user));
		
		
		while(true) {	// 종료시점이 언젠지 잘 확인해서 break줘서 빠져나가야함 => 아니면 무한loop
			binary[index]=user%2;
			user=user/2;
			if (user==0) {
				break;
			}
			index--;
		}
		
		System.out.println();
		// 결과 출력
		for(int i=0;i<16;i++) {
			if(i%4==0 && i!=0)
				System.out.print(" ");
				System.out.print(binary[i]);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
