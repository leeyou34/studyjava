package hotel;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerManagement {

	Scanner sc = new Scanner(System.in);
	LinkedList<Customer>list = new LinkedList<Customer>();
	LinkedList<Customer>login= new LinkedList<Customer>();
	
	public void newCustomer() {//회원 가입
		
		//고객 리스트
		
		System.out.print("id:");
		String id=sc.nextLine();
		System.out.print("비밀번호: ");
		String pwd=sc.nextLine();
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo=sc.nextLine();
		System.out.print("카드번호: ");
		String cardNo=sc.nextLine();
	
	
	list.add(new Customer(id, pwd, name, phoneNo, cardNo));
	
	
	}
	
	public List<Customer> name() {
	
	int a =-1;
	
	while (a==-1 || login.isEmpty()) {
		System.out.print("1: 회원가입   2: 로그인 >> ");
		String input = sc.nextLine();
		if(input.equals("1")) {
			newCustomer();
		} else if (input.equals("2")) {
			login = (LinkedList<Customer>) login();
			a=1;
		}
	}
	return login;
	}
	
	public List<Customer>login() {
		LinkedList<Customer>list2 = new LinkedList<Customer>();
		
		String id;
		String pwd;
		
		
		for(int i=0; i<list.size(); i++) {
			
			do {
				System.out.println("id: ");
				id=sc.nextLine();
				System.out.println("비밀번호: ");
				pwd=sc.nextLine();
				
				if(!(list.get(i).getId().equals(id))||!(list.get(i).getPwd().equals(pwd))){
					System.out.println("다시 입력하세요.");
				}
				
			}while (!(list.get(i).getId().equals(id))||!(list.get(i).getPwd().equals(pwd)));
			
			list2.add(0, new Customer(list.get(i).getId(), list.get(i).getPwd(), list.get(i).getName(), list.get(i).getPhoneNo(), list.get(i).getIden()));
			
			System.out.println(list.get(i).getName()+ "님 반갑습니다.");
		
		
		}return list2;
	}
	
	public void updateCustomer() { // 회원정보 수정
		System.out.print("id: ");
		String id= sc.nextLine();
		System.out.print("비밀번호: ");
		String pwd= sc.nextLine();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId().equals(id)&& list.get(i).getPwd().equals(pwd)) {
				//로그인 성공
				System.out.print("이름: ");
				String name=sc.nextLine();
				System.out.print("전화번호: ");
				String phoneNo=sc.nextLine();
				System.out.print("주민등록번호: ");
				String iden=sc.nextLine();
				
				list.remove(i);
				list.add(i, new Customer(id,pwd, name, phoneNo, iden));
				}
			}
		}	// 업데이트 메소드 완성
	
	public void removeCustomer() {
		System.out.print("id: ");
		String id= sc.nextLine();
		System.out.print("비밀번호: ");
		String pwd= sc.nextLine();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId().equals(id)&& list.get(i).getPwd().equals(pwd)) {
				//로그인 성공
				System.out.print("정말로 탈퇴하시겠습니까? (1:예   2:아니오) >>");
				String input =sc.nextLine();
				if(input.contentEquals("1")) {
					list.remove(i);
				}
				else return;
			}
		}
	}//remove 메소드 종료
}
