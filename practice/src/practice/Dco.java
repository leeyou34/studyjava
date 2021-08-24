package practice;
//CrudPractice;

//Controller 부분 (데이터 입력시 model 부분 변경, get/set을 통한 데이터 제어)
public class Dco {

	//변수 생성
	private String name;
	private String age;
	private String sex;
	private String birth;
	private String city;
	private int pageNum;
	
	//생성자
	public Dco() {
		
	}
	public Dco(int pageNum, String name, String age, String sex, String birth, String city) {
		this.pageNum = pageNum;
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.birth=birth;
		this.city=city;
	}
	
	//Getter, Setter 메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPageNum(int pageNum) {
		this.pageNum=pageNum;
	}
	public int getPageNum() {
		return pageNum;
	}
	
	@Override
	public String toString() {
		return "Dco [pageNum = "+pageNum+", name= "+name+", age= "+age+", sex="+sex+", birth="+birth+", city="+city+"]";
	}
	

	
	
	
	
}
