package demo1.bean;

import java.io.Serializable;

/**
 * 用户地址bean
 * 该类必须实现serializable接口，不然消费者调用会报错
 * dubbo传输的对象必须序列化！！！
 * @author Administrator
 *
 */
public class UserAddress implements Serializable{
	
	private int userid;
	private String address;
	private String phone;
	
	public UserAddress(int userid, String address, String phone) {
		super();
		this.userid = userid;
		this.address = address;
		this.phone = phone;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
