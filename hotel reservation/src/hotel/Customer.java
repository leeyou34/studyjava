package hotel;

public class Customer {
	// 기존 고객, 신규고객의 정보
	private String id;
	private String pwd;
	private String name;
	private String phoneNo;
	private String iden;
	
	public Customer(String id, String pwd, String name, String phoneNo, String iden) {
		super();
		this.id=id;
		this.pwd=pwd;
		this.name=name;
		this.phoneNo=phoneNo;
		this.iden=iden;
	}
	
	public Customer() {}
	
	public String getId() {
		return id;
	} 
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	} 
	public String getIden() {
		return iden;
	}
	public void setIden(String iden) {
		this.iden =iden;
	}
	@Override
	public String toString() {
		return "Customer [id =" + id + ", pwd = " + pwd + ", name = " + name + ", phoneNo = " + phoneNo + ", iden = " +iden + "]";
	}
	
}
