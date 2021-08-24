package hotel;

import java.util.ArrayList;
import java.util.List;

public class ReserveInfo {
	private HotelInfo h;
	private Customer c;
	private String date; // 사용날짜
	private int period; //숙박기간
	private int reserveNo; // 예약번호
	private int reservecount; //예약수
	private int rOwnNum; // 객실
	private int total;
	
	public ReserveInfo(HotelInfo h, Customer c, String date, int period, int reserveNo, int reservecount) {
		super();
		this.h = h;
		this.c = c;
		this.date = date;
		this.period = period;
		this.reserveNo = reserveNo;
		this.reservecount = reservecount;
		
	}
	
	public ReserveInfo(HotelInfo h, Customer c, String date, int period, int reserveNo, int reservecount, int rOwnNum, int total) {
		super();
		this.h = h;
		this.c = c;
		this.date = date;
		this.period = period;
		this.reserveNo = reserveNo;
		this.reservecount = reservecount;
		this.rOwnNum = rOwnNum;
		this.total = total;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getrOwnNum() {
		return rOwnNum;
	}
	public void setrOwnNum(int rOwnNum) {
		this.rOwnNum = rOwnNum;
	}
	
	
	public Customer getC() {
		return c;
	}
	public int getReservecount() {
		return reservecount;
	}
	public void setReservecount(int reservecount) {
		this.reservecount = reservecount;
	}
	
	public ReserveInfo() {}
	public HotelInfo getH() {
		return h;
	}
	public void setH(HotelInfo h) {
		this.h=h;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period =period;
	}
	public int getReserveNo() {
		return reserveNo;
	}
	public void setReserveNo(int reserveNo) {
		this.reserveNo = reserveNo;
	}
	
	@Override
	public String toString() {
		return "ReserveInfo [h = " + h + ", c = " + c + ", date = " + date + ", period = " + period + ", reserveNo = " +reserveNo + "]";
	}

}
