package practice;
//CrudPractice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Model 부분(주요 기능, 데이터 저장, 가공, 로직 구현)
public class Dmo2 {
	
	Scanner sc = new Scanner(System.in);
	
	List<Dco> dcoArr = new LinkedList<>();

	//변수 선언
	private int page;
	private String check;
	private String inputPageNum;
	
	//생성자
	public Dmo2() {
	}

	public void insert() {
		System.out.println();
		
		//데이터 입력 부분 (이름, 나이, 성별, 생년월일, 사는곳)
		//최초에 next로 입력을 받았지만, 개행문자 때문에  다음 case문으로 넘어가는 현상이 발생하여 nextLine으로 변경
		System.out.print("이름을 입력해 주세요. >>");
		String name = sc.nextLine();
		
		System.out.print("나이을 입력해 주세요. >>");
		String age = sc.nextLine();
		
		System.out.print("성별을 입력해 주세요. >>");
		String sex = sc.nextLine();
		
		System.out.print("생년월일을 입력해 주세요. >>");
		String birth = sc.nextLine();

		System.out.print("사는 곳(도시명만) 입력해 주세요. >>");
		String city = sc.nextLine();
		
		page++; // 페이지번호 기입
		dcoArr.add(new Dco(page, name, age, sex, birth, city));
		System.out.println("\n"+page+"번째 페이지가 작성 완료 되었습니다.");
		
	} //insert 메서드 끝
	
	public void search() {
		System.out.println();
		System.out.println("검색하고 싶은 페이지를 입력해 주세요. >>");
		inputPageNum = sc.nextLine();
		page = Integer.parseInt(inputPageNum);
		
		//페이지 출력
		System.out.println(page+"번 페이지의 내용입니다.");
		System.out.println(dcoArr.get(page-1).toString());
	} // search 메서드 끝
	
	public void update() {
		System.out.println();
		System.out.println("수정하고 싶으신 페이지를 입력해 주세요. >>");
		inputPageNum = sc.nextLine();
		page = Integer.parseInt(inputPageNum);
		
		System.out.println("선택된 "+page+"페이지의 내용 입니다.");
		System.out.println(dcoArr.get(page-1).toString());
		
		//수정 여부 체크 후 다시 입력
		while(true) {
		System.out.println("페이지를 수정하고 싶으시면 'Y' 를 아니면 'N'을 입력해 주세요.");
		// next로 처리하면 개행문자가 저장되어 이름 입력 후 바로 나이입력해달라는 문구가 작동됨
		// 또한 nextLine으로 바꿈으로서 90라인쯤 pageNum입력 받는 nextInt를 사용하지 못하게 되어 부득이하게 nextLine으로 받은 후 parseInt 처리함
		check = sc.nextLine();
		
		if(check.equalsIgnoreCase("y")) { //대소문자 구분 없이 입력 가능하게 함

			System.out.print("이름을 입력해 주세요. >>");
			String name = sc.nextLine();
			
			System.out.print("나이을 입력해 주세요. >>");
			String age = sc.nextLine();
			
			System.out.print("성별을 입력해 주세요. >>");
			String sex = sc.nextLine();
			
			System.out.print("생년월일을 입력해 주세요. >>");
			String birth = sc.nextLine();

			System.out.print("사는 곳(도시명만) 입력해 주세요. >>");
			String city = sc.nextLine();
			
			dcoArr.add(new Dco(page, name, age, sex, birth, city));
			System.out.println("\n 페이지가 수정 되었습니다.");
			break;
		} else if(check.equalsIgnoreCase("n")) {
			System.out.println("\n 페이지를 수정하지 않습니다.");
			break;
		} else {
			System.out.println("\n 입력 오류입니다. 다시 입력해 주세요.");
			continue;
			}
		}
	} //update 메소드 끝
	
	public void delete() {
		System.out.println("\n 삭제하고 싶은 페이지를 입력 해 주세요");
		inputPageNum = sc.nextLine();
		page = Integer.parseInt(inputPageNum);
		
		System.out.println("\n 삭제하고 싶으신 "+page+"페이지의 내용입니다.");
		System.out.println(dcoArr.get(page-1).toString());
		//삭제 여부 체크
		while(true) {
		System.out.println("해당 페이지를 삭제 하고 싶으시면 'Y'를, 아니면 'N'을 입력 해 주십시오.");
		check = sc.nextLine();
		
		//삭제 여부 체크
		if(check.equalsIgnoreCase("y")) {
			dcoArr.removeAll(dcoArr);
			System.out.println("\n 페이지가 삭제 되었습니다.");
			break;
		}else if(check.equalsIgnoreCase("n")) {
			System.out.println("페이지 삭제를 취소 합니다.");
			break;
		} else {
			System.out.println("\n 입력 오류입니다. 다시 입력해 주세요.");
			continue;
			}
		}
	}// delete 메소드 끝
}