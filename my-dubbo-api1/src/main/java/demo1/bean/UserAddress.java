package demo1.bean;

import java.io.Serializable;

/**
 * �û���ַbean
 * �������ʵ��serializable�ӿڣ���Ȼ�����ߵ��ûᱨ��
 * dubbo����Ķ���������л�������
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
