package ch02_2_primitive;

public class EscapeExample {

	public static void main(String[] args) {
		// 여기서 \역슬래쉬는 이스케이프 문자라고 한다. 이 역슬래쉬를 이용해서 문자열 내부에 특정 문자를 포함할 수 있다.
		System.out.println("번호\t이름\t직업"); // 여기서 \역슬래쉬와 같이 사용된 t 는 탭이고. 문자열과 문자열 사이에 공간을 넣어준다.
		System.out.println("행 단위 출력\n"); // \역 슬래쉬 사용후 n을 이용해 출력후 줄 바꿈 한다.
		System.out.println("행 단위 출력\n");
		System.out.println("우리는 \"개발자\"입니다"); //역 슬래쉬 사용후 "쌍 따옴표를 써서 특정문자를 표시한다. 단 쌍 따옴표는 역슬래쉬 다음에 나와야지 적용된다
		System.out.println("봄\\여름\\가을\\겨울"); //역 슬래쉬 사용후 역 슬래쉬를 표현 하고 싶으면. \\ 사용.
	
	
		System.out.println("번호\t이름\t직업"); // 여기서 \역슬래쉬는 이스케이프 문자라고 한다. 이 역슬래쉬를 이용해서 문자열 내부에 특정 문자를 포함할 수 있다.
		System.out.println("행 단위 출력\n");
		System.out.println("행 단위 출력\n");
		System.out.println("우리는\"개발자\"입니다.");
		System.out.println("봄\\여름\\가을\\겨울");
	}

}

	
		
	