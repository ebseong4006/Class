package operator;

public class Exx {

	public static void main(String[] args) {
		/*
		 * 산술연산자(+,-,*,/,%)
		 * - 일반적인 사칙연산과 동일
		 * - % 연산자 : 나머지 연산자 (또는 퍼센트 연산자)라고 하며,
		 * 나눗셈 결과에 대한 나머지를 계산하는 연산자
		 * (/연산자는 나눗셈 결과에 대한 몫을 계산하는 연산자)
		 * 
		 */

		// 출력문에 연산식을 기술하면 연산 결과를 출력
		System.out.println(10 + 2); //12
		System.out.println(10 - 2); //8
		System.out.println(10 * 2);//20
		System.out.println(10 / 2);//5(몫)
		System.out.println(10 % 2);//0(나머지)
		
		System.out.println("--------------");
		
		//int형 변수 a 에 10을 저장하고, b에 2를 저장
		int a = 10, b = 2;
		System.out.println(a +b); //12
		System.out.println(a -b); //8
		System.out.println(a *b); //20
		System.out.println(a /b); //5
		System.out.println(a %b); //0
		
		System.out.println("--------------------");
		
		//연산 결과를 변수에 저장 후 출력
		int c; // 연산 결과를 저장할 변수 c 선언
		
		//a와 b 의 덧셈 결과를 변수 c 에 저장
		c = a + b; //연산자 우선순위에 따라 + 먼저, 그다음 =.
		System.out.println(a + " +" + b + " =" + c); //까만 연산자+ 방향은 --->. 둘 중 하나가 문자열이라면 결합연산자+를 사용
		System.out.printf("%d + %d = %d\n",a,b,c); //a b c 에 대입한 값이 %d에 들어감(줄바꿈하기위해 역슬래시n넣기)
		
		c = a - b; //뺄셈
		System.out.println(a+ " - " + b + " = " + c); //8
		System.out.printf("%d - %d = %d\n", a, b, c); //8
		
		c = a * b;
		System.out.println(a+ " * " + b + " = " + c); //20
		
		c = a / b; //나눗셈(몫)
		System.out.println(a+ " / " + b + " = " + c); //5
		
		c = a % b; //나눗셈(나머지)
		System.out.println(a+ " % " + b + " = " + c); //0
	}

}
