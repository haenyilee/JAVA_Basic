/*
	연산자 => 데이터 가공
	================
	= 연산시 데이터형이 동일해야 -> 연산이 된다(데이터형을 같게 만든 다음에 연산)
		===> 형변환
				1) 자동 => 작은거를 큰거로
				2) 강제 => 큰거를 작은거로
				*** int 이하는 연산이 되면 int로 결과값이 나온다
	= char는 모든 연산시에 정수로 변경된다.
	= 연산자 => 약간의 우선순의
		=> 산술에서 많이 나오는 것들(더하기 빼기보단 곱하기 나누기가 먼저)
	= 연산자의 종류
		단독 사용 : 산술연산자, 증감연산자. 대입연산자
		조건 사용 : 비교연산자, 논리연산자, 부정연산자(****)
				=============================
				1) if문, for문, while문
				
		변수+연산자+제어문(기능 : 라이브러리로 제공)
		==============
	
 */
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=10;
		byte b2=20;
		int b3=b1+b2; // byte+byte=int
		
		int a=10;
		long b=20L;
		double d=10.5;
		
		double r=a+b+d;
		// String이 가장 큰 데이터형... string이 붙으면 무조건 string으로 통합 연산됨
		
		

	}
}
