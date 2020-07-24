import sun.security.krb5.KdcComm;

/*
	조건문 제작하는 방법
	
	if(조건문) : 결과값이 무조건 true / false
		==> 필요한 경우에만 문장을 수행 : 조건이 true일 때만
			false일 경우에는 건너뜀(문장을 수행하지 못한다)
 */
public class 자바단일조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 알파벳을 저장 ==> 대문자, 소문자
		char alpha= 'n';
		if(alpha>='A' && alpha<='Z')
			System.out.println(alpha+"는(은) 대문자이다");
		if (alpha>='a' && alpha<='z')
			System.out.println(alpha+"는(은) 소문자이다");
		if(alpha>='0' && alpha<='9')
			System.out.println(alpha+"는(은) 숫자이다");
		if(alpha>='가' && alpha<='힣')
			System.out.println(alpha+"는(은) 한글이다");
		
		// 특수문자
		if (alpha =='\t' || alpha=='\n')
			System.out.println("특수문자입니다");
	}

}
