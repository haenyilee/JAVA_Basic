/*
 	변수 : 필요 => 변경해서 사용할 수 있는 메모리 기억공간
 	상수 : 변경할 수 없는 값
 	
 	변수의 종류
 	========
 	1) 한개의 데이터 공간 ------------> 변수
 	2) 같은 타입 여러개를 저장하는 공간 --> 배열(연속적으로 메모리에 저장 => 인덱스)
 	3) 다른 타입 여러개를 저장하는 공간 --> 클래스
 		= 변수로만 사용하는 방법(사용자 정의 데이터형) : 데이터형 클래스
 		= 기능만 설정하는 방법 => 액션클래스 		
 		
 	*** 변수 -> 메모리에 저장 -> 프로그램이 종료하면 자동으로 메모리에서 사라진다
 	
 	변수를 사용하려면...
 	===============
 		메모리에 저장 => 메모리 크기 , 사용범위 => {}안에서만 사용이 가능
 		public class A
 		{
 			========================================
 			변수 => 클래스 전체에서 사용 가능(전역변수) => 조립
 			========================================
 			
 			public static void main(String[] arg)
 			{
 				=== 지역변수
 				변수 => main안에서 사용 가능
 				
 				if(조건문)
 				{
 					변수 => if 에서만 사용 가능(지역변수)
 				}
 			}
 		}
 		
 	변수의 용도
 	========
 		프로그램(변경되는 데이터)
 		
 	
 	변수명을 만드는 방법 
  	===============
 		=> 메모리는 주소(0~~~~메모리크기)
 		=> 4byte씩 분할 -> 정수 한 개를 저장하는 공간이 4byte이기 때문에 -> 디폴트는 int
 		=> 주소로 저장되기 때문에 -> 저장된 위치 확인 불가 => 그래서 별칭부여한 것이 변수! => 저장된 데이터 찾기
 		=> 식별자
 		 
 	변수 종류
 	=======
 		=> 기본형(자바에서 제공하는 메모리 크기를 알고 있어야 함)
 		=> 정수(int => 일반 프로그램, long => 빅데이터)
 	 	=> 실수(double)
 	 	=> true/false(boolean) : 존재 여부 확인 / while문 안에서 종료할 때
 	 	=> 문자를 여러개 저장 => String
 	 	
 	 변수 선언 방식
 	===========
 	 	데이터형 변수명;
 	 	ex. 
 	 	정수 선언
 	 	-------
 	 	int a;
 	 	long a;
 	 	
 	 	문자열 선언
 	 	--------
 	 	String s;
 	 	
 	 	논리선언
 	 	------
 	 	boolean b;
 	 	
 	 	실수 선언
 	 	-------
 	 	double a;
 	 	
 	 변수의 초기화
 	==========
 	 	변수명=값;
		==> int a=10; long a=10(10L); double d=10.5(10,'A',10.5F); boolen b=true/false; String s="Hello Java..."
 	 
 */
public class 변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10개의 데이터 필요 (정수를 저장할 수 있는 공간) => 배열
		// 두 개의 정수 => 일반 int
		// 문자를 열개 저장 => char[]보다는 String[]!
		// true/false => boolean
		int[] com=new int[10]; // 숫자를 저장 1~10 => 중복 안되게 저장(임의로 추출)
		
		// 10개 데이터에 초기값 주입
		/*
		for(int i=0;i<10;i++)
		{
			com[i]=(int)(Math.random()*10)+1;
		}
		
		// 확인 => 출력
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		*/
		
		int su=0; // 난수값 저장
		// 중복이 없으면 => 저장
		// 중복이 있으면 => 난수 다시 발생
		boolean bCheck=false;
		// 경우의 수
		// 로그인 => 경우의 수 3개 => 2개 일땐 boolean => String , int , char
		// 왜 경우의 3개냐? -> ID틀린경우, pwd틀린 경우, login됐을 경우
		for(int i=0;i<10;i++)
		{
			// 중복여부 확인 , 중복이 되면 ==> 다시 난수 발생
			bCheck=true;
			while (bCheck) 
			{
				// 난수 발생
				su=(int)(Math.random()*10)+1;
				// 종료 확인
				bCheck=false;
				// 비교 => 같은 수가 저장이 되었는지 확인
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
				
			}// while문이 종료되는 경우, bCheck가 false되는 경우?
			com[i]=su;
		}
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		
		
		
		
		

	}

}
