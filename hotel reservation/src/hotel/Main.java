package hotel;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		CustomerManagement cm = new CustomerManagement();
		HotelManagement hm = new HotelManagement();
		
		LinkedList<Customer> list = new LinkedList<Customer>();
		LinkedList<Customer> login = new LinkedList<Customer>();
		List<HotelInfo> list2 = new LinkedList<HotelInfo>();
		
		login=(LinkedList<Customer>)cm.name();
		
		while(true) {
			System.out.println("1. 객실조회  2. 객실예약  3. 내 예약  4. 내 회원정보  5. 종료");
			//3. 예약확인 들어가면 체크인, 체크아웃
			//4. 내회원정보 들어가면 회원정보 수정하거나 삭제할 수 있음
			System.out.print("선택하세요: ");
			String input = sc.nextLine();
			switch(input) {
			case "1": // 객실조회
				list2=hm.info;
				System.out.println(list2.toString());
				break;
			case "2":
				//객실예약
				list2=hm.info;
				
				hm.reserve(list2,login);
				break;
			
			case "3":
				System.out.println("1: 예약정보확인 2: 체크인 3: 체크아웃");
				String input2 = sc.nextLine();
				switch(input2) {
				case "1":
					//예약정보 확인
					hm.reserveAssure();
					break;
				case "2":
					//예약번호를 가지고 객실을 배정
					
					hm.checkin();
					break;
				case "3":
					hm.checkout();
					break;
					
				} 
				
				break;
			case "4":
				System.out.println("1: 회원정보 수정 2: 회원정보 삭제");
				String input3=sc.nextLine();
				if(input3.equals("1")) {
					cm.updateCustomer();
					System.out.println(cm.list.toString());
				} else if(input3.equals("2")) {
					cm.removeCustomer();
					System.out.println(cm.list.toString());
					login.remove();
				}
				
				break;
				
			case "5":
				System.out.println("프로그램 종료");
				return;
			}
		} //while 문
		
	}
}
//	LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,2,3));
//	
//	System.out.println(list.get(0));// 0번쟤 index 출력
//	
//	for(Integer i : list) { //for 문을 통한 전체 출력
//		System.out.println();
//	}
//	
//	Iterator<integer> iter = list.iterator();//Iterator 선언
//	while(iter.hasNext()) {// 다음값이 있는지 체크
//		System.out.println(iter.next());// 값 출력
//	}
//	
//	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
//	System.out.println(list.contains(1)); //list에 1이 있는지 검색: true
//	
//	System.out.println(list.indexOf(1)); // 1이 있는 index 반환 없으면 -1
//
//}
